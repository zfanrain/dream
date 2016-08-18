package net.wudi.core.web.back;

public abstract class View {
	public static final String DEFAULT_PERFIX = "core";
	public static final String PERFIX = DEFAULT_PERFIX;
	public static final String SUFFIX = "";

	/** 登录 **/
	public class LoginViewer {
		public static final String PERFIX = View.PERFIX + "/";
		public static final String LOGIN = PERFIX + "login" + SUFFIX;
	}
}
