package interestcalculator;

public class simpleinterest 
{
	int principalamt,rateofinterest,years;

public simpleinterest()
{
	this.principalamt = principalamt;
	this.rateofinterest = rateofinterest;
	this.years = years;
}

public int getPrincipalamt() {
	return principalamt;
}

public void setPrincipalamt(int principalamt) {
	this.principalamt = principalamt;
}

public int getRateofinterest() {
	return rateofinterest;
}

public void setRateofinterest(int rateofinterest) {
	this.rateofinterest = rateofinterest;
}

public int getYears() {
	return years;
}

public void setYears(int years) {
	this.years = years;
}

public double SI()
{
	double SI;
	SI = (principalamt * rateofinterest * years)/100;
	System.out.println("the simple interest is "+SI);
	return SI;
			
}

}