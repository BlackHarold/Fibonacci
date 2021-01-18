package home.blackharold.philosophy;

public class DataTypes {

	static int x = 12;
	LeftTank leftTank = new LeftTank();
	
	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();
		dt.leftTank.capacity=10;
		dt.leftTank.toString();
	}
	
	
	
	class LeftTank{
		int capacity;
		
		
		public String toString() {
			System.out.println(capacity);
			return null;
		}

	}
	
}
