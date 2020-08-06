package github.lightningcreations.lccc.markers;

@LangItemInject("removed_since")
public @interface RemovedIn {
	JavaVersion version();
	String message() default "{item} is unavailable in the {version}";
}
