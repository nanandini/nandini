package com.xworkz.lombok.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDate createdDate;
	private String UpdateBy;
	private LocalDate updateDate;

}
