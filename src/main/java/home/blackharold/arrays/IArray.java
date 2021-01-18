package home.blackharold.arrays;

public class IArray<T> {

    private DArray<DArray<T>> arr;
    private int delta;

    IArray(int size) {
        delta = size;
        arr = new DArray<DArray<T>>(delta, delta);
        arr.add(0, new DArray<T>(delta, 0));
    }

    T get(int index) {
        int index1 = index / delta;
        int index2 = index % delta;
        return (T) arr.get(index1).get(index2);
    }

    void relocate() {
        arr.add(arr.size(), new DArray<T>(delta, 0));
    }

    void add(int index, T element) {
        if (arr.size()*delta<=index)
            relocate();
        int index1 = index / delta;
        int index2 = index % delta;
        arr.get(index1).add(index2,element);
    }

    void insert(int index, T element) {
     /*
     ... TODO write code
      */
    }
}
