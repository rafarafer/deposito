import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		//System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
	   // System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters."); 
	    assertEquals(20.0, tank.getDepositoNivel());
	}
	 
}
