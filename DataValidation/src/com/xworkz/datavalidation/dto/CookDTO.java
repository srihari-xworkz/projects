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
public class CookDTO implements Serializable {
	private String specialItem;
	private String hotelName;
	private String gender;
	private double salary;
}
