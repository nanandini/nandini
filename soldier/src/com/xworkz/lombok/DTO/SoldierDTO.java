package com.xworkz.lombok.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class SoldierDTO extends AbstractAuditDTO {

	@NotNull // any NON PRIMITIVE
	@NotBlank // String
	@Size(min = 5, max = 25, message = "soldier name should be within 5 to 25")
	private String name;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "soldier birthPlace should be within 5 to 30")
	private String birthPlace;

	@NotNull
	@Max(value = 20)
	@Min(value = 60)
	private int age;

	@NotNull
	@NotBlank
	@Size(min = 6, max = 28, message = "Soldier battles should be greater than 1 ")
	private String battles;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 20, message = "soldier branch should be within 5 to 20")
	private String branch;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 35, message = "Soldier education should be greater than 5")
	private String education;
	private int yearsOfService;

}
