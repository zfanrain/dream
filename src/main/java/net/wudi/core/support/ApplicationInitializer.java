package net.wudi.core.support;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.WebApplicationInitializer;

@WebAppConfiguration
public class ApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		String ctx = servletContext.getContextPath();
		servletContext.setAttribute("ctx", ctx);
		servletContext.setAttribute("backCtx", ctx);
		servletContext.setAttribute("metronicCtx", ctx + "/static/back/metronic");
	}
}
