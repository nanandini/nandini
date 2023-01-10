package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createDate;
	private String updatedBy;
	private LocalDateTime updateDate;

	public AbstractAuditDTO() {
		System.out.println("running AbstractAuditDTO");
	}

	public AbstractAuditDTO(String createdBy, LocalDateTime createDate, String updatedBy, LocalDateTime updateDate) {
		super();
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", createDate=" + createDate + ", updatedBy=" + updatedBy
				+ ", updateDate=" + updateDate + ", toString()=" + super.toString() + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

}
