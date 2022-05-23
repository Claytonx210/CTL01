package interestcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitTesting {

	@Test
	void testMain() {
		System.out.println("Simple Interest");
		simpleinterest s = new simpleinterest();
		s.setPrincipalamt(1000);
		s.setRateofinterest(10);
		s.setYears(20);
		System.out.println("Principal Amount - "+s.getPrincipalamt() );
		System.out.println("Rate Of Interest - "+s.getRateofinterest() );
		System.out.println("Number Of Years - "+s.getYears() );
		s.SI();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		
		System.out.println("Compound Interest");
		compoundinterest c = new compoundinterest();
		c.setPrincipal(100);
		c.setNumberofinterestcompounded(10);
		c.setInterestrate(20);
		c.setTime(10);
		System.out.println("Principal - "+c.getPrincipal() );
		System.out.println("Number Of Times Interest Compounded - "+c.getNumberofinterestcompounded() );
		System.out.println("Rate Of Interest - "+c.getInterestrate() );
		System.out.println("Time(In Years) - "+c.getTime() );
		c.CI();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		
		System.out.println("Average Of 5 Numbers");
		averagenumbers a = new averagenumbers();
		a.setNum1(11);
		a.setNum2(12);
		a.setNum3(13);
		a.setNum4(14);
		a.setNum5(15);
		System.out.println("Number 1 -  "+a.getNum1());
		System.out.println("Number 2 -  "+a.getNum2());
		System.out.println("Number 3 -  "+a.getNum3());
		System.out.println("Number 4 -  "+a.getNum4());
		System.out.println("Number 5 -  "+a.getNum5());
		a.average();
	}

}
