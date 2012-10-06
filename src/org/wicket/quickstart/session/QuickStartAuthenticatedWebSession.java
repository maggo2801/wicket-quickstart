package org.wicket.quickstart.session;

import java.util.ArrayList;

import org.apache.wicket.MetaDataKey;
import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;
import org.wicket.quickstart.session.object.SessionUser;

public class QuickStartAuthenticatedWebSession extends AuthenticatedWebSession {

	private static final long serialVersionUID = -7272394264324378565L;

	public static final MetaDataKey<SessionUser> SESSION_USER_KEY = new MetaDataKey<SessionUser>() {

		private static final long serialVersionUID = 226757619970591381L;
	};

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
			roles.addAll(get().getMetaData(SESSION_USER_KEY).getRoles());
			return roles;
		}
		return null;
	}

	@Override
	public boolean authenticate(final String username, final String password) {
		if ("admin".equals(username) && "admin".equals(password)) {
			final SessionUser user = new SessionUser();
			user.setUserId(1);
			final ArrayList<String> roles = new ArrayList<String>(1);
			roles.add("ADMIN");
			user.setRoles(roles);
			get().setMetaData(SESSION_USER_KEY, user);
			return true;
		}
		return false;
	}
}
