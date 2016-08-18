package net.wudi.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_node")
public class Node {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer siteId;
	private Integer parentId;
	private Integer nodeModelId;
	private Integer infoModelId;
	private String number;
	private String name;
	private String treeNumber;
	private Integer treeLevel;
	
	private Boolean isRealNode;
	private Boolean isHidden;
	private String htmlStatus;
	
	private Integer creatorId;
	private Date creationDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getNodeModelId() {
		return nodeModelId;
	}
	public void setNodeModelId(Integer nodeModelId) {
		this.nodeModelId = nodeModelId;
	}
	public Integer getInfoModelId() {
		return infoModelId;
	}
	public void setInfoModelId(Integer infoModelId) {
		this.infoModelId = infoModelId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTreeNumber() {
		return treeNumber;
	}
	public void setTreeNumber(String treeNumber) {
		this.treeNumber = treeNumber;
	}
	public Integer getTreeLevel() {
		return treeLevel;
	}
	public void setTreeLevel(Integer treeLevel) {
		this.treeLevel = treeLevel;
	}
	public Boolean getIsRealNode() {
		return isRealNode;
	}
	public void setIsRealNode(Boolean isRealNode) {
		this.isRealNode = isRealNode;
	}
	public Boolean getIsHidden() {
		return isHidden;
	}
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	public String getHtmlStatus() {
		return htmlStatus;
	}
	public void setHtmlStatus(String htmlStatus) {
		this.htmlStatus = htmlStatus;
	}
	public Integer getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
