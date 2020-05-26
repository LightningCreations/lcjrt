package github.lightningcreations.lccc.markers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface Optimize {
    public String value();
}
