package net.wudi.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import net.wudi.jpa.pojo.UserTest;
public interface UserRepository extends CrudRepository<UserTest, Integer>{
	Long countByName(String name);
}
