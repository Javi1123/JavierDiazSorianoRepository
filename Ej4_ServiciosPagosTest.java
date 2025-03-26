package tema3_ejerciciosIntegracion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class Ej4_ServiciosPagosTest {
	
	@Test
	public void LimiteMenorA0Test() {
		Ej4_ServicioPagos sp = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes so = new Ej4_ServicioOrdenes(sp);
		double monton = -13.3;
		
		assertFalse(so.procesarOrden(monton));
	}
	
	@Test
	public void ErrorPagoTest() {
		Ej4_ServicioPagos sp = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes so = new Ej4_ServicioOrdenes(sp);
		double monton = 1001.0;
		
		assertFalse(so.procesarOrden(monton));
	}
	
	@Test
	public void ProcesarOrdenTest() {
		Ej4_ServicioPagos sp = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes so = new Ej4_ServicioOrdenes(sp);
		double monton = 34.0;
		
		sp.procesarPago(monton);
		assertTrue(so.procesarOrden(monton));
	}	
}