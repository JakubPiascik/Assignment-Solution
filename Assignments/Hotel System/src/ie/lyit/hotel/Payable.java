package ie.lyit.hotel;

public interface Payable {
	public abstract double calculatePay(double taxPercentage);
	double incrementSalary(double incrementAmount);
	
}
