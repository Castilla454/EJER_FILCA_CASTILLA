package gestionLibros;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GestionLibrosTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testAgregarLibro() {
        System.out.println("Con un assert deberia devolver un mensaje de libro agregado con el titulo, autor y año");
    }

    @Test
    public void testEliminarLibro() {
        System.out.println("Con un assert deberia devolver un mensaje de libro eliminado con el id");
    }

    @Test
    public void testBuscarLibro() {
        System.out.println("Con un assert deberia devolver un mensaje de libro encontrado con el titulo");
    }
}