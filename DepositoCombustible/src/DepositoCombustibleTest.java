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
	}
	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(30.0,20.0);
		tank.consumir(20.0);
		assertEquals(true, tank.estaVacio());		
		// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}
	@Test
	void testFill() {
		DepositoCombustible tank = new DepositoCombustible(10.0,0.0);
		tank.fill(10.0);
		assertEquals(10.0, tank.getDepositoNivel());
		// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}
	@Test
	void testGetDepositoMax() {		
	DepositoCombustible tank = new DepositoCombustible(30.0,0.0);
	assertEquals(30.0, tank.getDepositoMax());
	// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}


}
