package github.lightningcreations.lccc.markers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that a given constructor should not be written to the class bytecode.
 * This redudant for anything other than the default constructor, or where a non-deleted constructor exists.
 * If a Removed constructor is called either from source code, or binary code, the behavior is undefined.
 */
@Target(ElementType.CONSTRUCTOR)
public @interface RemoveConstructor {
}
