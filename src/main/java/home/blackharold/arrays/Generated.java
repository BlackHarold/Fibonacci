package home.blackharold.arrays;

import home.blackharold.generics.Generator;

public class Generated {

    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
        T[] a = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }

}

class CollectionData<T> {
    Generator<T> generator;
    T[] a;
    int b;

    public CollectionData(Generator<T> gen, int b) {
        super();
        this.generator = generator;
        this.b = b;
    }

    public T[] toArray(T[] a) {
        return null;
    }
}
