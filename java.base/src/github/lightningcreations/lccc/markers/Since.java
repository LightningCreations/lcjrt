package github.lightningcreations.lccc.markers;

@LangItemInject("since_version")
public @interface Since {
	JavaVersion version();
	String message() default "{name} is unavailable in the {version}";
}
