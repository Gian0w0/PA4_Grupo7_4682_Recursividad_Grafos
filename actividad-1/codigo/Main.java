public class Main {

    public static void main(String[] args) {

        // Crear el campus y sus edificios
        Ubicacion campus = new Ubicacion("Campus");

        Ubicacion edificioA = new Ubicacion("Edificio A");
        Ubicacion edificioB = new Ubicacion("Edificio B");

        // Crear las aulas
        Ubicacion aulaA101 = new Ubicacion("Aula A101");
        Ubicacion aulaA102 = new Ubicacion("Aula A102");

        Ubicacion aulaB201 = new Ubicacion("Aula B201");
        Ubicacion aulaB202 = new Ubicacion("Aula B202");

        // Agregar las aulas a cada edificio
        edificioA.agregarUbicacion(aulaA101);
        edificioA.agregarUbicacion(aulaA102);

        edificioB.agregarUbicacion(aulaB201);
        edificioB.agregarUbicacion(aulaB202);

        // Agregar edificios al campus
        campus.agregarUbicacion(edificioA);
        campus.agregarUbicacion(edificioB);



        System.out.println("=== PRUEBAS DE RECURSIVIDAD ===");

        String[] aulasBuscadas = {
                "Aula B202",
                "Aula C301",
                "Aula A101",
                "Aula B201"
        };

        for (String aula : aulasBuscadas) {

            System.out.println("----------------------------------------");
            System.out.println("Buscando: " + aula);
            System.out.println("----------------------------------------");

            boolean encontrado = campus.buscarAula(aula);

            System.out.println("Resultado: " + encontrado);
            System.out.println();
        }


    }
}
