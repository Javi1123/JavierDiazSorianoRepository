package tema3_ejerciciosIntegracion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Ej3_GestorProductosTest {
	
	@Test
	public void AgregarProductoTest() {
		Ej3_BaseDeDatosProductos db = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gp = new Ej3_GestorProductos(db);
		String usuario = "Carlos";
		
		gp.registrarProducto(usuario);
		assertTrue(db.verificarProducto(usuario));
	}
	
	@Test
	public void VerificarYRegistrarProductoTest() {
		Ej3_BaseDeDatosProductos db = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gp = new Ej3_GestorProductos(db);
		String usuario = "Carlos";
		
		gp.registrarProducto(usuario);;
		assertTrue(gp.productoRegistrado(usuario));
	}
}