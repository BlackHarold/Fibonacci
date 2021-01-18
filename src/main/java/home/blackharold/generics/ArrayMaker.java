package home.blackharold.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {

    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
//		Рекомендован для создания массивов обобщения
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
        String[] stringsArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringsArray));
    }
}
