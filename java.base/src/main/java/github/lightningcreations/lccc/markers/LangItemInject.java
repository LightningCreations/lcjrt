package github.lightningcreations.lccc.markers;


@LangItemInject("lang")
@DeniedFeature(value="lang_inject",enable=true)
public @interface LangItemInject {
	public String value();
}
