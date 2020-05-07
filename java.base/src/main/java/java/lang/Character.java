 package java.lang;
 
 import jdk.internal.invoke.Stable;
 
 public final class Character{
    private final char value;
    
    @Deprecated(since="9")
    public Character(char value){
        this.value = value;
    }
    
    @Stable
    private static final Character[] asciiCache = new Character[256];
    
    @SuppressWarnings("UnnecessaryBoxing")
    public Character valueOf(char value){
        if(value<256){
            if(asciiCache[value]==null)
                asciiCache[value] = new Character(value);
            return asciiCache[value];
        }
        return new Character(value);
    }
    
    public char charValue(){
        return value;
    }
 }
