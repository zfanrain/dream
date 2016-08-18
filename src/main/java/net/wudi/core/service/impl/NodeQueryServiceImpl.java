package net.wudi.core.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import net.wudi.core.domain.Node;
import net.wudi.core.repository.NodeRepository;
import net.wudi.core.service.NodeQueryService;

@Service
public class NodeQueryServiceImpl implements NodeQueryService {
	private NodeRepository nodeRepository;

	@Autowired
	public void setNodeRepository(NodeRepository nodeRepository) {
		this.nodeRepository = nodeRepository;
	}

	@Override
	public List<Node> findList(Integer parentId, Sort sort) {
		Specification<Node> sp = new Specification<Node>() {
			@Override
			public Predicate toPredicate(Root<Node> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.equal(root.get("parentId"), parentId);
			}
		};
		return nodeRepository.findAll(sp, sort);
	}
}
