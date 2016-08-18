package net.wudi.core.security;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.CredentialsException;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import net.wudi.core.domain.User;
import net.wudi.core.service.UserService;

public class ShiroDbRealm implements Realm {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String getName(){		
		return this.getClass().getName();
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		return true;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		User user = userService.getUserByAccount(upToken.getUsername());
		if (user == null)
			throw new AccountException("can not find user");
		if (!user.getPassword().equals(String.valueOf(upToken.getPassword()))) {
			throw new CredentialsException("password is not right");
		}
		return new SimpleAccount(new ShiroUser(user.getId(), user.getAccount()),upToken.getCredentials(),getName());
	}


}
