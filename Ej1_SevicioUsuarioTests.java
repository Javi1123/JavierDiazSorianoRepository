package tema3_ejerciciosIntegracion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej1_SevicioUsuarioTests {
	
	@Test
	public void AgregarUsuarioTest() {
		Ej1_BaseDeDatos db = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios su = new Ej1_ServicioUsuarios(db);
		String usuario = "Carlos";
		
		su.registrarUsuario(usuario);
		assertTrue(db.verificarUsuario(usuario));
	}
	
	@Test
	public void VerificarYRegistrarUsuarioTest() {
		Ej1_BaseDeDatos db = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios su = new Ej1_ServicioUsuarios(db);
		String usuario = "Carlos";
		
		su.registrarUsuario(usuario);;
		assertTrue(su.usuarioRegistrado(usuario));
	}
}
