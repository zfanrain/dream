package net.wudi.test.node;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.wudi.core.domain.Node;
import net.wudi.core.repository.NodeRepository;
import net.wudi.core.service.NodeQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NodeTest {
	@Autowired
	NodeRepository repository;
	@Autowired
	NodeQueryService nodeQueryService;
	@Test
	public void testAdd(){
		repository.save(new Node());
	}
	
	@Test
	public void testFindAll(){
		Pageable pg = new PageRequest(1,20);
		nodeQueryService.findList(1, pg.getSort());
	}
}
