package org.wicket.quickstart.panel;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;
import org.wicket.quickstart.session.QuickStartAuthenticatedWebSession;

public class PageHeader extends Panel {

	private static final long serialVersionUID = 597363289869942610L;

	public PageHeader(final String id) {
		super(id);
		add(new Link<Object>("logoutLink") {
			@Override
			public void onClick() {
				QuickStartAuthenticatedWebSession.get().invalidateNow();
			}
		});
	}

}
