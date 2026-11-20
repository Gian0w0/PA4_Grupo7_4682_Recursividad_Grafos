import java.util.ArrayList;
import java.util.List;

public class Ubicacion {

    String nombre;
    List<Ubicacion> sububicaciones;

    public Ubicacion(String nombre) {
        this.nombre = nombre;
        this.sububicaciones = new ArrayList<>();
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        sububicaciones.add(ubicacion);
    }


    public boolean buscarAula(String aulaBuscada) {

        System.out.println("Revisando: " + nombre);

        // Caso base: encontramos el aula
        if (nombre.equals(aulaBuscada)) {
            System.out.println("Encontrado: " + nombre);
            return true;
        }

        // Caso recursivo
        for (Ubicacion lugar : sububicaciones) {
            if (lugar.buscarAula(aulaBuscada)) {
                return true;
            }
        }

        // No se encontró en esta ubicación
        return false;
    }

}
