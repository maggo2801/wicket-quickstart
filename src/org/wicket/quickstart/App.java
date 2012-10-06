package org.wicket.quickstart;

import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.wicket.quickstart.page.IndexPage;
import org.wicket.quickstart.page.ParameterPage;
import org.wicket.quickstart.page.auth.LoginPage;
import org.wicket.quickstart.session.QuickStartAuthenticatedWebSession;

public class App extends AuthenticatedWebApplication {

	@Override
	public Class<IndexPage> getHomePage() {
		return IndexPage.class;
	}

	@Override
	protected void init() {
		super.init();
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));

		mountPage("/page/parameter", ParameterPage.class);
	}

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
		return QuickStartAuthenticatedWebSession.class;
	}

	@Override
	protected Class<? extends WebPage> getSignInPageClass() {
		return LoginPage.class;
	}

}
