  
package epam;

public class Simci {
	public double SimpleInterest(double p,int t,double r) {
		return p*t*r/100;
	}
	public double CompoundInterest(double p,int t,double r) {
		return p*Math.pow(1+(r/100), t);
	}
}