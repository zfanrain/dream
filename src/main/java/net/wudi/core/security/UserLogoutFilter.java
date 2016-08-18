package net.wudi.core.security;

import org.apache.shiro.web.filter.authc.LogoutFilter;

import net.wudi.core.support.Constants;

public class UserLogoutFilter extends LogoutFilter{
	private String redirectUrl = Constants.BACK_SUCCESS_URL;

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
}
