package net.wudi.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.wudi.core.domain.Node;
import net.wudi.core.repository.NodeRepository;
import net.wudi.core.service.NodeService;

@Service
@Transactional
public class NodeServiceImpl implements NodeService {
	private NodeRepository nodeRepository;

	@Autowired
	public void setNodeRepository(NodeRepository nodeRepository) {
		this.nodeRepository = nodeRepository;
	}

	@Override
	public Node save(Node been) {
		return nodeRepository.save(been);
	}

	
}
