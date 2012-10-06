package org.wicket.quickstart.session.object;

import java.io.Serializable;
import java.util.ArrayList;

public class SessionUser implements Serializable {

	private static final long serialVersionUID = -2066603276636381839L;

	private int userId;

	private ArrayList<String> roles;

	public int getUserId() {
		return userId;
	}

	public void setUserId(final int userId) {
		this.userId = userId;
	}

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(final ArrayList<String> roles) {
		this.roles = roles;
	}

}
