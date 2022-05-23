package interestcalculator;

public class compoundinterest 
{
	int principal,numberofinterestcompounded,interestrate,time;

public compoundinterest()
{
	this.principal = principal;
	this.numberofinterestcompounded = numberofinterestcompounded;
	this.interestrate = interestrate;
	this.time = time;
}

public int getPrincipal() {
	return principal;
}

public void setPrincipal(int principal) {
	this.principal = principal;
}

public int getNumberofinterestcompounded() {
	return numberofinterestcompounded;
}

public void setNumberofinterestcompounded(int numberofinterestcompounded) {
	this.numberofinterestcompounded = numberofinterestcompounded;
}

public int getInterestrate() {
	return interestrate;
}

public void setInterestrate(int interestrate) {
	this.interestrate = interestrate;
}

public int getTime() {
	return time;
}

public void setTime(int time) {
	this.time = time;
}

public double CI()
{
	double amount,CI;
	amount = principal*(1+interestrate/numberofinterestcompounded)/numberofinterestcompounded*time;
	CI = amount - principal;
	System.out.println("the compound interest is "+CI);
	return CI;
}
}

