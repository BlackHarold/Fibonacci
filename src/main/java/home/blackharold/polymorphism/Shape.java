package home.blackharold.polymorphism;

public class Shape {
	
	public void draw() {
		System.out.println("draw " + this.getClass().getSimpleName());
	}

	public void erase() {
		System.out.println("erase " + this.getClass().getSimpleName());
	}

}
