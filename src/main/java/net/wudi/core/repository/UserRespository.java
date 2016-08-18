package net.wudi.core.repository;

import net.wudi.common.data.repository.BaseRepository;
import net.wudi.core.domain.User;
public interface UserRespository extends BaseRepository<User, Integer> {
	User getByAccount(String account);
	User getById(Integer id);
}
