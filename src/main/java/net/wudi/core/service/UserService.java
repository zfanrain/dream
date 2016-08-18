package net.wudi.core.service;

import net.wudi.core.domain.User;

public interface UserService {
	User getUserByAccount(String account);
	User getUserById(Integer id);
}
