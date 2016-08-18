package net.wudi.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 字符串工具类
 * @author sadtear
 *
 */
public abstract class StringUtils {	
	public static boolean isBlank(String s){
		return s==null||s.equals("")?true:false;
	}
	
	public static boolean isNotBlank(String s){
		return !isBlank(s);
	}

	/**
	 * 字符串截断。编码大于127的字符作为占两个位置，否则占一个位置。
	 * 
	 * @param text
	 * @param length
	 * @param append
	 * @return
	 */
	public static String substring(String text, int length, String append) {
		if (StringUtils.isBlank(text) || text.length() < length) {
			return text;
		}
		int num = 0, i = 0, len = text.length();
		StringBuilder sb = new StringBuilder();
		for (; i < len; i++) {
			char c = text.charAt(i);
			if (c > 127) {
				num += 2;
			} else {
				num++;
			}
			if (num <= length * 2) {
				sb.append(c);
			}
			if (num >= length * 2) {
				break;
			}
		}
		if (i + 1 < len && StringUtils.isNotBlank(append)) {
			if (text.charAt(i) > 127) {
				sb.setLength(sb.length() - 1);
			} else {
				sb.setLength(sb.length() - 2);
			}
			sb.append(append);
		}
		return sb.toString();
	}

	public static String substring(String text, int length) {
		return substring(text, length, null);
	}

	public static String urlEncode(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		try {
			return URLEncoder.encode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

	}

	public static String urlDecode(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static void replace(StringBuilder sb, String searchString,
			String replacement) {
		int start = 0;
		int end = sb.indexOf(searchString, start);
		if (end == -1) {
			return;
		}
		int searchLength = searchString.length();
		int replaceLength = replacement.length();
		while (end != -1) {
			sb.replace(end, end + searchLength, replacement);
			start = end + replaceLength;
			end = sb.indexOf(searchString, start);
		}
	}
}
