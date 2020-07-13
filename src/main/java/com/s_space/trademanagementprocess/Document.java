package com.s_space.trademanagementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Document implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("Type")
	private java.lang.String type;
	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Expiry Date")
	private java.lang.String expiryDate;
	@org.kie.api.definition.type.Label("Created Date")
	private java.lang.String createDate;
	@org.kie.api.definition.type.Label(value = "Uploaded By")
	private java.lang.String uploadedBy;
	public Document() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(java.lang.String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public java.lang.String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(java.lang.String createDate) {
		this.createDate = createDate;
	}

	public java.lang.String getUploadedBy() {
		return this.uploadedBy;
	}

	public void setUploadedBy(java.lang.String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public Document(java.lang.String id, java.lang.String type,
			java.lang.String name, java.lang.String expiryDate,
			java.lang.String createDate, java.lang.String uploadedBy) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.expiryDate = expiryDate;
		this.createDate = createDate;
		this.uploadedBy = uploadedBy;
	}

}