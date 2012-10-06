package org.wicket.quickstart.page;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.wicket.quickstart.template.CommonTemplate;

@AuthorizeInstantiation("ADMIN")
public class IndexPage extends CommonTemplate {

	private static final long serialVersionUID = 3370669009278218633L;

	public IndexPage() {

	}
}
