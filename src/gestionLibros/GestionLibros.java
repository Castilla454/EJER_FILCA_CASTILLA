package gestionLibros;

public class GestionLibros {
    // Método para agregar un libro
    public void agregarLibro(String titulo, String autor, int año) {
        // Aquí iría la lógica real para agregar el libro a una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se agregó el libro
        System.out.println("Libro agregado: " + titulo + " - " + autor + " - " + año);
    }
    // Método para eliminar un libro
    public void eliminarLibro(int id) {
        // Aquí iría la lógica real para eliminar el libro de una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se eliminó el libro
        System.out.println("Libro eliminado con ID: " + id);
    }
    // Método para buscar un libro por título
    public void buscarLibro(String titulo) {
        // Aquí iría la lógica real para buscar el libro en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se encontró el libro
        System.out.println("Libro encontrado: " + titulo);
    }

}
