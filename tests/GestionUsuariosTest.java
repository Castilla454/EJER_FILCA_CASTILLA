import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GestionUsuariosTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testRegistrarUsuario() {
        System.out.println("Con un assert deberia devolver un mensaje de usuario registrado con el nombre y correo");
    }

    @Test
    public void testEliminarUsuario() {
        System.out.println("Con un assert deberia devolver un mensaje de usuario eliminado con el id");
    }

    @Test
    public void testAutenticarUsuario() {
        System.out.println("Con un assert deberia devolver un mensaje de usuario autenticado con el correo");
    }
}