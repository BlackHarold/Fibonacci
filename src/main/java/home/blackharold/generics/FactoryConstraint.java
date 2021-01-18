package home.blackharold.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FactoryConstraint {

    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.FactoryI());
//		Map<K, V> map;
//		List<E> list = new ArrayList<E>;
    }
}

interface Factory<T> {
    T create();
}

class Foo2<T> {
    private T t;

    public <F extends Factory<T>> Foo2(F factory) {
        t = factory.create();
    }
}

class IntegerFactory implements Factory<Integer> {

    @Override
    public Integer create() {
        return Integer.valueOf(0);
    }
}

class Widget {
    public static class FactoryI implements Factory<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
