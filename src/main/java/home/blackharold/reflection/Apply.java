package home.blackharold.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Apply {
	public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
		try {
			for (T t : seq)
				f.invoke(t, args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Shape {
	public void rotate() {
		System.out.println(this + " rotate");
	}

	public void resize(int newSize) {
		System.out.println(this + " resize " + newSize);
	}
}

class Square extends Shape {
}

class FilledList<T> extends ArrayList<T> {
	public FilledList(Class<? extends T> type, int size) {
		try {
			for (int i = 0; i < size; i++)
				add(type.newInstance());
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}
