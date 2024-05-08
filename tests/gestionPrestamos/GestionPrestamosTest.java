package gestionPrestamos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GestionPrestamosTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testRealizarPrestamo() {
        System.out.println("Con un assert deberia devolver un mensaje de prestamo realizado con el id del libro y el id del usuario");
    }

    @Test
    public void testDevolverLibro() {
        System.out.println("Con un assert deberia devolver un mensaje de devolucion de libro con el id del prestamo");
    }

    @Test
    public void testConsultarPrestamosUsuario() {
        System.out.println("Con un assert deberia devolver un mensaje de consulta de prestamos del usuario con el id");
    }
}