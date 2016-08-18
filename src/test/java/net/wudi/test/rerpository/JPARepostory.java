package net.wudi.test.rerpository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.wudi.jpa.pojo.UserTest;
import net.wudi.jpa.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JPARepostory {
	UserRepository repository;
	
	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}


	@Test
	public void add(){
		UserTest t = new UserTest();
		t.setName("张三");
		repository.save(t);
	}
	
	@Test
	public void transation(){
		repository.countByName("张三");
	}
}
