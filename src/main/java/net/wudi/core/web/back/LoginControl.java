package net.wudi.core.web.back;

import static org.apache.shiro.web.filter.authc.FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME;
import static org.apache.shiro.web.filter.authc.FormAuthenticationFilter.DEFAULT_USERNAME_PARAM;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.CredentialsException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginControl {
	private static final String LOGIN_ERROR_NAME = "loginError";
	
	@RequestMapping(value = Mapping.LoginMapping.LOGIN, method = RequestMethod.GET)
	public String login() {
		if (SecurityUtils.getSubject().isAuthenticated()) {
			SecurityUtils.getSubject().logout();
		}
		return View.LoginViewer.LOGIN;
	}

	@RequestMapping(value = Mapping.LoginMapping.LOGIN, method = RequestMethod.POST)
	public String fail(@RequestParam(DEFAULT_USERNAME_PARAM) String username, HttpServletRequest request,
			RedirectAttributes redirect) {
		Object errorName = request.getAttribute(DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (errorName != null) {
			//redirect.addFlashAttribute(DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, errorName);
			if(AccountException.class.getName().equals(errorName.toString())){
				redirect.addFlashAttribute(LOGIN_ERROR_NAME, "1");
			}else if(CredentialsException.class.getName().equals(errorName.toString())){
				redirect.addFlashAttribute(LOGIN_ERROR_NAME, "2");
			}
		}
		redirect.addFlashAttribute("username", username);
		return "redirect:" + Mapping.LoginMapping.LOGIN;
	}
	
}
