package com.xworz.crudandvalidate.util;

public class ValidationUtil {

	public static boolean stringValidation(String string) {
		if (string != null && !string.isEmpty() && string.length() >= 3 && string.length() < 30) {
			return true;
		}
		return false;

	}
}
