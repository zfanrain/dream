package net.wudi.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wudi.core.domain.User;
import net.wudi.core.repository.UserRespository;
import net.wudi.core.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	private UserRespository userRepository;
	
	@Autowired
	public void setUserRepository(UserRespository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserByAccount(String account) {
		return userRepository.getByAccount(account);
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.getById(id);
	}
	
}
