package com.xworkz.validation.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAudioDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate;
	private String updateBy;
	private LocalDateTime updateDate;

	public AbstractAudioDTO() {
		System.out.println("running starting");
	}

	public AbstractAudioDTO(String createdBy, LocalDateTime createdDate, String updateBy, LocalDateTime updateDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

}
