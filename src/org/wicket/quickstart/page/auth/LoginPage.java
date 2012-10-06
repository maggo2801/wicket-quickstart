package org.wicket.quickstart.page.auth;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;

public class LoginPage extends WebPage {

	private static final long serialVersionUID = 4454301614259237633L;

	public LoginPage() {
		final SignInPanel signInPanel = new SignInPanel("signInPanel", true);

		add(signInPanel);
	}

}
