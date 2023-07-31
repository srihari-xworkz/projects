package com.xworkz.strings;

public class StringMethods {

	public static void main(String[] args) {

		String example = "xworkz java course java";

		System.out.println(example.charAt(10)); // a

		System.out.println(example.concat(" june")); // xworkz java course june

		System.out.println(example.substring(7)); // java course

		System.out.println(example.substring(7, 12)); // java

		System.out.println(example.indexOf("java")); // 7

		System.out.println(example.indexOf("java", 12)); // 19

		String example2 = "xworkz-java@course-java";
		String exstr[] = example.split("java");
		for (String exs2 : exstr) {
			System.out.print(exs2); // xworkz course
		}
		System.out.println();

		System.out.println(example.equalsIgnoreCase(example2)); // false

		System.out.println(example.equals(example2)); // false

		String example3 = "todays class was of Strings";

		System.out.println(example.compareTo(example2)); // -13

		System.out.println(example.compareToIgnoreCase(example3)); // 4

		String name = "Srihari";
		char n[] = name.toCharArray();
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println(name.toUpperCase()); // SRIHARI

		System.out.println(name.isEmpty()); // false

		System.out.println(name.length()); // 7

		System.out.println(name.startsWith("S")); // true

		System.out.println(name.replace('i', 'e')); // srehare

		System.out.println(example2.replaceAll("@", "-")); // xworkz-java-course-java

//		System.out.println(name.valueOf(true));
	}

}
