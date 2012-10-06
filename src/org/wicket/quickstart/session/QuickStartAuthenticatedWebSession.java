package org.wicket.quickstart.session;

import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

public class QuickStartAuthenticatedWebSession extends AuthenticatedWebSession {

	private static final long serialVersionUID = -7272394264324378565L;

	public static QuickStartAuthenticatedWebSession get() {
		return (QuickStartAuthenticatedWebSession) Session.get();
	}

	public QuickStartAuthenticatedWebSession(final Request request) {
		super(request);
	}

	@Override
	public Roles getRoles() {
		if (isSignedIn()) {
			final Roles roles = new Roles();
			roles.add("ADMIN");
			return roles;
		}
		return null;
	}

	@Override
	public boolean authenticate(final String username, final String password) {
		if ("admin".equals(username) && "admin".equals(password)) {
			return true;
		}
		return false;
	}

}
