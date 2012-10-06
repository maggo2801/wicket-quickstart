package org.wicket.quickstart.session;

import java.util.ArrayList;

import org.apache.wicket.MetaDataKey;
import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;
import org.wicket.quickstart.session.object.SessionUser;

public class AppSession extends AuthenticatedWebSession {

	private static final long serialVersionUID = -7272394264324378565L;

	public static final MetaDataKey<SessionUser> SESSION_USER_KEY = new MetaDataKey<SessionUser>() {

		private static final long serialVersionUID = 226757619970591381L;
	};

	public static AppSession get() {
		return (AppSession) Session.get();
	}

	public AppSession(final Request request) {
		super(request);
	}

	@Override
	public Roles getRoles() {
		if (isSignedIn()) {
			return new Roles((String[]) getMetaData(SESSION_USER_KEY).getRoles().toArray());
		}
		return null;
	}

	@Override
	public boolean authenticate(final String username, final String password) {
		if ("admin".equals(username) && "admin".equals(password)) {
			final SessionUser user = new SessionUser();
			user.setUserId(1);
			user.setRoles(new ArrayList<String>(1));
			user.getRoles().add("ADMIN");
			setMetaData(SESSION_USER_KEY, user);
			return true;
		}
		return false;
	}
}
