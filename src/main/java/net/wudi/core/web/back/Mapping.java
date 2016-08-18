package net.wudi.core.web.back;

/**
 * 后端request映射
 * 
 * @author sadtear
 *
 */
public abstract class Mapping{
	/**因为SpringMVC的前缀要加上DispatcherServlet拦截的路径**/
	public static final String PERFIX = "";
	public static final String SUFFIX = ".do";

	/** 登录 **/
	public class LoginMapping {
		public static final String LOGIN = PERFIX + "login" + SUFFIX;
	}
}
