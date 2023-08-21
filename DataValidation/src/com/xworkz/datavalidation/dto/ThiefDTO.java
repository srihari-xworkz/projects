package com.xworkz.datavalidation.dto;

import java.io.Serializable;

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
public class ThiefDTO implements Serializable {
	private String specializedIn;
	private double experience;
	private double age;
	private String gangName;
	private int totalCases;
}
