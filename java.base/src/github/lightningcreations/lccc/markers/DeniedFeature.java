package github.lightningcreations.lccc.markers;

/**
 * Indicates that a given method should trigger a compile error if the feature is disabled by
 * 	-l:deny or -l:deny="feature". Denied features can be reenabled by @{@link Allow}, or with `-l:allow="feature".
 * @author chorm
 */
@LangItemInject("deny")
public @interface DeniedFeature {
	/**
	 * The name of the feature required by either @{@link Allow} or -l:allow.
	 */
	String value();
	/**
	 * Whether or not errors are raised by default. 
	 * For compatibility, anything in the jrt should not set enable.
	 */
	boolean enable() default false;
}
