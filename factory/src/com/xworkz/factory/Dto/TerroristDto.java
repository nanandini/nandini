package com.xworkz.factory.Dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class TerroristDto extends AbstractAuditDto {

	@NonNull
	@NotNull(message = "terrorist name canot be null")
	@Size(min = 3, max = 20, message = "name is in valide")
	
	private String name;
	@NotNull
	@Min(value = 18)
	@Max(value = 55)
	
	private int age;
	@NonNull
	@NotNull(message = "Country name is not valide")
	@Size(min = 3, max = 20, message = "country length is in valide")
	
	private String Country;
	@NonNull
	@NotNull(message = "organisation name is not valide")
	@Size(min = 2, max = 20, message = "organisation length is in valide")
	
	private String organisation;
	private boolean alive;
	private boolean prison;

}
