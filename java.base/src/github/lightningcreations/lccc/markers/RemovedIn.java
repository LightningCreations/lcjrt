package github.lightningcreations.lccc.markers;

@LangItemInject("removed_since")
public @interface RemovedIn {
	JavaVersion version();
	String message() default "{name} is unavailable in the {version}";
}
