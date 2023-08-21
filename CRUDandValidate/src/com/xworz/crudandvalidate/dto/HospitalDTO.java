package com.xworz.crudandvalidate.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HospitalDTO implements Serializable {

	private String name;
	private String speciality;
	private String location;
	private int noOfSurgeons;
}
