package java.lang;

public abstract class Number {
    public Number(){}

    public abstract int intValue();
    public abstract long longValue();
    public abstract float floatValue();
    public abstract double doubleValue();
    public short shortValue(){
        return (short)this.intValue();
    }
    public byte byteValue(){
        return (byte)this.intValue();
    }
}
