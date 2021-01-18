package home.blackharold.reflection;

import java.lang.reflect.Method;

public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}

class Mime {
	public void walkAgainstTheWind() {
	}

	public void sit() {
		System.out.println("Pretending to sit");
	}

	public void pushInvisibleWalls() {
	}

	@Override
	public String toString() {
		return "Mime";
	}
}

class SmartDog {
	public void speak() {
		System.out.println("Woof!");
	}

	public void sit() {
		System.out.println("Sitting");
	}

	public void reproduce() {
	}
}

class CommunicateReflectively {
	public static void perform(Object speaker) {
		Class<?> sprk = speaker.getClass();

		try {
			try {
				Method speak = sprk.getMethod("speak");
				speak.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker + " cannot speak");
			}
			try {
				Method sit = sprk.getMethod("sit");
				sit.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker + " cannot sit");
			}
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}

class Robot implements Perform {

	@Override
	public void speak() {
		System.out.println("Click!");
	}

	@Override
	public void sit() {
		System.out.println("Clank!");
	}

	public void oilChange() {
	}

}

interface Perform {
	void speak();

	void sit();
}