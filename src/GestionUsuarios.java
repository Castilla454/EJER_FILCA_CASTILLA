public class GestionUsuarios {
    public void registrarUsuario(String nombre, String correo, String contraseña) {
        System.out.println("Usuario registrado: " + nombre + " - " + correo);
    }

    public void eliminarUsuario(int id) {
        System.out.println("Usuario eliminado con ID: " + id);
    }

    public void autenticarUsuario(String correo, String contraseña) {
        System.out.println("Usuario autenticado con correo: " + correo);
    }
}
