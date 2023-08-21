package com.xworkz.datavalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CeoDTO {

	private String name;
	private String compName;
	private int salary;
	private int exp;

}
