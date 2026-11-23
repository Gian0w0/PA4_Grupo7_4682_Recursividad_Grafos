import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Actividad 3 - Modelado del campus mediante grafos (PA4 - Grupo 7)
 * Grafo no dirigido y ponderado representado con lista de adyacencia.
 */
public class GrafoCampus {

    // Arista: ubicación vecina y distancia en metros
    static class Arista {
        int destino;
        int peso;

        Arista(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    // Nodo para A*: f(n) = g(n) + h(n)
    static class Nodo implements Comparable<Nodo> {
        int id;
        double g, h;

        Nodo(int id, double g, double h) {
            this.id = id;
            this.g = g;
            this.h = h;
        }

        public double f() {
            return g + h;
        }

        public int compareTo(Nodo o) {
            return Double.compare(this.f(), o.f());
        }
    }

    int V;
    String[] nombres;
    double[] x, y;                 // coordenadas en el plano (para la heurística)
    LinkedList<Arista>[] adj;

    GrafoCampus(String[] nombres, double[] x, double[] y) {
        this.V = nombres.length;
        this.nombres = nombres;
        this.x = x;
        this.y = y;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // No dirigido: la arista se agrega en ambos sentidos
    void agregarArista(int a, int b, int peso) {
        adj[a].add(new Arista(b, peso));
        adj[b].add(new Arista(a, peso));
    }

    void eliminarArista(int a, int b) {
        quitar(a, b);
        quitar(b, a);
    }

    // Recorre la lista de "origen" y quita la arista que va a "destino"
    void quitar(int origen, int destino) {
        for (int i = 0; i < adj[origen].size(); i++) {
            if (adj[origen].get(i).destino == destino) {
                adj[origen].remove(i);
                return;
            }
        }
    }

    void imprimir() {
        for (int v = 0; v < V; v++) {
            System.out.print(nombres[v] + " -> ");
            for (Arista e : adj[v]) {
                System.out.print(nombres[e.destino] + "(" + e.peso + ") ");
            }
            System.out.println();
        }
    }

    // ---------------- DFS (recursivo) ----------------
    void DFS(int v, boolean[] visitado) {
        visitado[v] = true;
        System.out.print(nombres[v] + " ");
        for (Arista e : adj[v]) {
            if (!visitado[e.destino]) {
                DFS(e.destino, visitado);
            }
        }
    }

    // ---------------- BFS (cola) ----------------
    // Devuelve la ruta con menos tramos entre s y destino
    void BFS(int s, int destino) {
        boolean[] visitado = new boolean[V];
        int[] padre = new int[V];
        LinkedList<Integer> cola = new LinkedList<>();

        visitado[s] = true;
        padre[s] = -1;
        cola.add(s);

        while (!cola.isEmpty()) {
            int nodo = cola.poll();
            for (Arista e : adj[nodo]) {
                if (!visitado[e.destino]) {
                    visitado[e.destino] = true;
                    padre[e.destino] = nodo;
                    cola.add(e.destino);
                }
            }
        }
        imprimirRuta(padre, destino);
    }

    // ---------------- A* ----------------
    double heuristica(int n, int meta) {      // distancia en línea recta
        return Math.sqrt(Math.pow(x[n] - x[meta], 2) + Math.pow(y[n] - y[meta], 2));
    }

    void aEstrella(int inicio, int meta) {
        double[] g = new double[V];
        int[] padre = new int[V];
        boolean[] cerrado = new boolean[V];
        for (int i = 0; i < V; i++) {
            g[i] = Double.MAX_VALUE;
        }

        PriorityQueue<Nodo> abiertos = new PriorityQueue<>();
        g[inicio] = 0;
        padre[inicio] = -1;
        abiertos.add(new Nodo(inicio, 0, heuristica(inicio, meta)));

        while (!abiertos.isEmpty()) {
            Nodo actual = abiertos.poll();          // menor f(n)
            if (cerrado[actual.id]) continue;
            cerrado[actual.id] = true;

            System.out.println("  Expande " + nombres[actual.id]
                    + "  g=" + redondear(actual.g)
                    + "  h=" + redondear(actual.h)
                    + "  f=" + redondear(actual.f()));

            if (actual.id == meta) {
                imprimirRuta(padre, meta);
                return;
            }
            for (Arista e : adj[actual.id]) {
                double nuevoG = g[actual.id] + e.peso;
                if (nuevoG < g[e.destino]) {
                    g[e.destino] = nuevoG;
                    padre[e.destino] = actual.id;
                    abiertos.add(new Nodo(e.destino, nuevoG, heuristica(e.destino, meta)));
                }
            }
        }
    }

    double redondear(double valor) {
        return Math.round(valor * 10) / 10.0;
    }

    void imprimirRuta(int[] padre, int destino) {
        LinkedList<Integer> ruta = new LinkedList<>();
        for (int v = destino; v != -1; v = padre[v]) {
            ruta.addFirst(v);
        }
        int metros = 0;
        for (int i = 0; i < ruta.size() - 1; i++) {
            for (Arista e : adj[ruta.get(i)]) {
                if (e.destino == ruta.get(i + 1)) metros += e.peso;
            }
        }
        for (int v : ruta) System.out.print(nombres[v] + " ");
        System.out.println("| " + (ruta.size() - 1) + " tramos, " + metros + " m");
    }

    // ---------------- Prueba ----------------
    public static void main(String[] args) {
        String[] nombres = {"Puerta", "Patio", "Biblioteca", "EdificioA", "EdificioB",
                "Cafeteria", "Laboratorio", "Auditorio", "Coliseo", "Estacionamiento"};
        double[] x = {0, 60, 60, 120, 120, 20, 180, 180, 90, -40};
        double[] y = {0, 0, 50, 40, -40, -50, 0, 70, -90, 60};

        GrafoCampus g = new GrafoCampus(nombres, x, y);
        g.agregarArista(0, 1, 60);   // Puerta - Patio
        g.agregarArista(0, 5, 55);   // Puerta - Cafeteria
        g.agregarArista(0, 9, 75);   // Puerta - Estacionamiento
        g.agregarArista(9, 2, 105);  // Estacionamiento - Biblioteca
        g.agregarArista(1, 2, 50);   // Patio - Biblioteca
        g.agregarArista(1, 3, 130);  // Patio - EdificioA
        g.agregarArista(1, 4, 75);   // Patio - EdificioB
        g.agregarArista(1, 5, 65);   // Patio - Cafeteria
        g.agregarArista(2, 3, 65);   // Biblioteca - EdificioA
        g.agregarArista(3, 6, 75);   // EdificioA - Laboratorio
        g.agregarArista(3, 7, 70);   // EdificioA - Auditorio
        g.agregarArista(4, 6, 80);   // EdificioB - Laboratorio
        g.agregarArista(4, 8, 60);   // EdificioB - Coliseo
        g.agregarArista(5, 8, 85);   // Cafeteria - Coliseo
        g.agregarArista(6, 7, 70);   // Laboratorio - Auditorio

        System.out.println("== Lista de adyacencia ==");
        g.imprimir();

        System.out.println("\n== DFS desde Puerta ==");
        g.DFS(0, new boolean[g.V]);
        System.out.println();

        System.out.println("\n== DFS tras cerrar Cafeteria-Coliseo y EdificioB-Coliseo ==");
        g.eliminarArista(5, 8);
        g.eliminarArista(4, 8);
        g.DFS(0, new boolean[g.V]);
        System.out.println();
        g.agregarArista(5, 8, 85);   // se restablecen los tramos
        g.agregarArista(4, 8, 60);

        System.out.println("\n== BFS: Puerta -> Auditorio (menos tramos) ==");
        g.BFS(0, 7);

        System.out.println("\n== A*: Puerta -> Auditorio (menor distancia) ==");
        g.aEstrella(0, 7);
    }
}
