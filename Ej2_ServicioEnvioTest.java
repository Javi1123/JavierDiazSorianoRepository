package tema3_ejerciciosIntegracion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Ej2_ServicioEnvioTest {
	
	@Test
	public void TestCrearYEnviarPedido() {
		Ej2_ServicioEnvio se = new Ej2_ServicioEnvio();
		Ej2_ServicioPedido sp = new Ej2_ServicioPedido(se);
		String pedido = "Botellas";
		
		sp.crearYEnviarPedido(pedido);
		assertTrue(se.enviarPedido(pedido));
	}
}
