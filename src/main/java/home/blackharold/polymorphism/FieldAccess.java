package home.blackharold.polymorphism;

public class FieldAccess {


	public static void main(String[] args) {
		
//		Super super1 = new Super();
//		Sub super2 = new Sub();
		Super super2 = new Sub();
		
//		System.out.println("super field = " + super1.field);
//		System.out.println("super getField = " + super1.getField());
		
		System.out.println("sub field = " + super2.field);
		System.out.println("sub getField = " + super2.getField());
//		System.out.println("sub getSuperField = " + super2.getSuperField());
//		System.out.println("sub getThisField = " + super2.getThisField());

	}

}



class Super {
	int field=0;
	int getField() {
		return field;
	}
}



class Sub extends Super{
	int field = 1;
	
	int getField() {
		return field;
	}
	
	int getSuperField() {
		return super.field;
	}
	
	int getThisField() {
		return this.field;
	}
}
