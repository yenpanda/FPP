package Prog4;

public class Invoice implements Payable{

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public String toString(){
		return partNumber+ " " + partDescription+ " " + quantity+ " " +pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
}
