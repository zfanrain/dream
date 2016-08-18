package net.wudi.core.support;

import javax.servlet.ServletRequest;

import net.wudi.core.domain.User;

public class RequestContext {
	public static Integer getCurrentUserId(ServletRequest request) {
		User user = getCurrentUser(request);
		return user != null ? user.getId() : null;
	}

	public static User getCurrentUser(ServletRequest request) {
		User user = (User) request.getAttribute(USER_REQUEST_NAME);
		return user;
	}

	public static void setCurrentUser(ServletRequest request, User user) {
		request.setAttribute(USER_REQUEST_NAME, user);
	}

	public static void resetCurrentUser(ServletRequest request) {
		request.removeAttribute(USER_REQUEST_NAME);
	}
	
	private static final String SITE_REQUEST_NAME = "_CMS_SITE_REQUEST";
	private static final String USER_REQUEST_NAME = "_CMS_USER_REQUEST";
	private static final String GROUP_REQUEST_NAME = "_CMS_GROUP_REQUEST";
	private static final String GROUPS_REQUEST_NAME = "_CMS_GROUPS_REQUEST";
	private static final String ORG_REQUEST_NAME = "_CMS_ORG_REQUEST";
	private static final String ORGS_REQUEST_NAME = "_CMS_ORGS_REQUEST";
}
