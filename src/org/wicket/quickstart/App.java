package org.wicket.quickstart;

import org.apache.wicket.protocol.http.WebApplication;
import org.wicket.quickstart.page.IndexPage;

public class App extends WebApplication {

	@Override
	public Class<IndexPage> getHomePage() {
		return IndexPage.class;
	}

}
