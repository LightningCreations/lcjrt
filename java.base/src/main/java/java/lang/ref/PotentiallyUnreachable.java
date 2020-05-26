package java.lang.ref;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicated as an Optimization for the compiler and vm, which notes that the value provided here may not be reachable. 
 * This is used in conjunction with jvm calls to produce a weekly-reachable or softly-reachable reference. 
 * It is unsafe to use an {@literal @}PotentiallyUnreachable object, for any reason other than to attempt a conversion to
 * As such, care must be taken to ensure that such objects are not leaked out of this package.
 * @author connor
 *
 */
@Retention(CLASS)
@Target(ElementType.TYPE_USE)
@interface PotentiallyUnreachable {

}
