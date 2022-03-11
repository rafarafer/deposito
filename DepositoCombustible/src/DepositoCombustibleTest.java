import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testFill() {
		DepositoCombustible tank = new DepositoCombustible(10.0,0.0);
		tank.fill(10.0);
		assertEquals(10.0, tank.getDepositoNivel());
		// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}

}