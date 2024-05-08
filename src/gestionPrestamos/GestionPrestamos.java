package gestionPrestamos;

public class GestionPrestamos {
    // Método para realizar un préstamo
    public void realizarPrestamo(int idLibro, int idUsuario) {
        // Aquí iría la lógica real para realizar el préstamo en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se realizó el préstamo
        System.out.println("Préstamo realizado del libro con ID " + idLibro + " al usuario con ID " + idUsuario);
    }
    // Método para devolver un libro prestado
    public void devolverLibro(int idPrestamo) {
        // Aquí iría la lógica real para devolver el libro prestado en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se devolvió el libro
        System.out.println("Devolución de libro prestado con ID de préstamo: " + idPrestamo);
    }
    // Método para consultar préstamos de un usuario
    public void consultarPrestamosUsuario(int idUsuario) {
        // Aquí iría la lógica real para consultar los préstamos del usuario en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se consultaron los préstamos
        System.out.println("Consultando préstamos del usuario con ID: " + idUsuario);
    }

}
