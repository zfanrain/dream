package net.wudi.core.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import net.wudi.core.domain.Node;

public interface NodeQueryService {
	List<Node> findList(Integer parentId, Sort sort);
}
