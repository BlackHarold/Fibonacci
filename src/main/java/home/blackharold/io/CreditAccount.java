package home.blackharold.io;

public class CreditAccount {

	private String settlement;
	private int houseNumber;
	private int flatNumber;
	private double credit;

	public CreditAccount(String settlement, int houseNumber, int flatNumber, double credit) {
		super();
		this.settlement = settlement;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
		this.credit = credit;
	}

	public String getSettlement() {
		return settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

}
