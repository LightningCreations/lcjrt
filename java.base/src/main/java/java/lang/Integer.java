package java.lang;

import github.lightningcreations.lccc.markers.LangItemInject;

@LangItemInject("boxed_int")
public final class Integer extends Number implements Comparable<Integer> {
    private int value;
    @Override
    public int compareTo(Integer integer) {
        return 0;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
