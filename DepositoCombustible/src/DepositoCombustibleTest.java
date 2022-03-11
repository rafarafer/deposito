import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testGetDepositoMax() {
		
	DepositoCombustible tank = new DepositoCombustible(30.0,0.0);
	assertEquals(30.0, tank.getDepositoMax());
	// System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
    //System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
	}

}
