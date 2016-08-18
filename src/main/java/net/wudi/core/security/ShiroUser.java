package net.wudi.core.security;

import java.io.Serializable;

public class ShiroUser implements Serializable {
	private static final long serialVersionUID = 1L;
	public Integer id;
	public String username;

	public ShiroUser(Integer id, String username) {
		this.id = id;
		this.username = username;
	}

	@Override
	public String toString() {
		return username;
	}
}