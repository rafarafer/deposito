import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(30.0,20.0);
		tank.consumir(20.0);
		assertEquals(true, tank.estaVacio());
		// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}

}
