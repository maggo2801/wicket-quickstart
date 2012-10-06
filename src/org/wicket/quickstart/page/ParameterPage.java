package org.wicket.quickstart.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ParameterPage extends WebPage {

	private static final long serialVersionUID = -3292460147719702364L;

	public ParameterPage(final PageParameters pageParameters) {
		super(pageParameters);
		System.out.println("ParameterPage");
		System.out.println(getPageParameters().getNamedKeys());
		System.out.println(getPageParameters().get("test").toBoolean());
	}

}
