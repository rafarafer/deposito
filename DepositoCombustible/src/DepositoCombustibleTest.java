import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(10.0,10.0);
		tank.consumir(10.0);
		assertEquals(0.0, tank.getDepositoNivel());
	}
	@Test
	void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(30.0,20.0);
		tank.fill(10.0);
		assertEquals(true, tank.estaLleno());
		// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}

}
