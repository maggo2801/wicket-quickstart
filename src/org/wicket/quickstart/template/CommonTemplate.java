package org.wicket.quickstart.template;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.wicket.quickstart.content.css.CSSFile;
import org.wicket.quickstart.content.js.JSFile;
import org.wicket.quickstart.panel.PageHeader;

public abstract class CommonTemplate extends WebPage {

	private static final long serialVersionUID = 2887354262984203911L;

	public CommonTemplate() {
		add(new PageHeader("pageHeader"));
	}

	@Override
	public void renderHead(final IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(CSSFile.LAYOUT));
		response.render(JavaScriptHeaderItem.forReference(JSFile.GENERAL));
	}

}
