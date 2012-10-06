package org.wicket.quickstart;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.wicket.quickstart.page.IndexPage;
import org.wicket.quickstart.page.ParameterPage;

public class App extends WebApplication {

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

}
