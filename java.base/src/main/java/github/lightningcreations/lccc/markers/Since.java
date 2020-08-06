package github.lightningcreations.lccc.markers;

@LangItemInject("since_version")
public @interface Since {
	JavaVersion version();
	String message() default "{item} is unavailable in the {version}";
}
