package home.blackharold.arrays;

import java.util.Date;

/*********************************************************
 DArray<Integer> a = new DArray<Integer>();

 Date start = new Date();
 for(int i=0; i<10; i++)
 a.add(i,i*i);

 for(int i=0; i<10; i++)
 System.out.println(a.get(i));
 *********************************************************/
public class DArray<T> {

    Object[] _arr;

    public DArray(Object[] _arr) {
        this._arr = _arr;
    }

    public DArray(int delta, int delta1) {

    }

    void add(int index, T element) {
        if (_arr == null || _arr.length <= index)
            relocate(index + 1000, index);

        _arr[index] = element;
    }

    private void relocate(int newSize, int index) {
        Object[] tmp = new Object[newSize];

        if (_arr != null)
            for (int i = 0; i < _arr.length; i++)
                if (i < index)
                    tmp[i] = _arr[i];
                else
                    tmp[i + 1] = _arr[i];
        _arr = tmp;
    }


    T get(int index) {
        return (T) _arr[index];
    }

    void set(int index, T element) {
        _arr[index] = element;
    }

    int size() {
        return _arr.length;
    }

    public static void main(String[] args) {
        DArray<Integer> array = new DArray(0,0);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++)
            array.add(i, i);

        for (int i = 0; i < 1000000; i++)
            System.out.println(array.get(i));

        long finish = System.currentTimeMillis();
        System.out.println((finish - start) / 1000.00 + " seconds");
    }


}

