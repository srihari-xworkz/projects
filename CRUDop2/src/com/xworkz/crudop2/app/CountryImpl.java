package com.xworkz.crudop2.app;

import java.util.Arrays;
import java.util.Scanner;

public class CountryImpl implements Country {

	public String[] name = new String[TOTAL];

	int index = 0;
	Scanner sc = new Scanner(System.in);

	@Override
	public void save(String cname) {
		if (index < TOTAL) {
			this.name[index] = cname;
			System.out.println("country name at index " + index + " is " + cname);
			index++;
		} else {
			System.err.println("cannot save more");
		}

	}

	@Override
	public void display() {
		for (int start = 0; start < TOTAL; start++) {
			System.out.println("country name at index " + start + " is " + name[start]);
		}
	}

	@Override
	public boolean isExist(String match) {
		for (int i = 0; i < TOTAL; i++) {
			if (name[i] == match) {
				System.out.println(match + " found at " + i);
				return true;
			}
		}
		return false;
	}

	@Override
	public String findReturnUppercase(String upper) {
		if (isExist(upper)) {
			return upper.toUpperCase();
		}
		return "Not Found";
	}

	@Override
	public String[] findStartsWith(String start) {
		String[] pre = new String[TOTAL];
		int loc = 0;
		for (int i = 0; i < TOTAL; i++) {
			if (name[i].startsWith(start)) {
				pre[loc] = name[i];
				loc++;
			}
		}
		return pre;
	}

	@Override
	public String[] findEndWith(String ends) {
		String[] post = new String[TOTAL];
		int loc = 0;
		for (int i = 0; i < TOTAL; i++) {
			if (name[i].endsWith(ends)) {
				post[loc] = name[i];
				loc++;
			}
		}
		return post;
	}

	@Override
	public String[] findMatching(String matching) {
		String[] matches = new String[TOTAL];
		int location = 0;
		for (int i = 0; i < TOTAL; i++) {
			if (name[i].equals(matching)) {
				matches[location] = matching;
				location++;
			}
		}
		return matches;
	}

	@Override
	public int savedCount() {
		int count = name.length;
		return count;
	}

	@Override
	public String[] orderAscen() {
		for (int i = 0; i < TOTAL; i++) {
			for (int j = i + 1; j < TOTAL; j++) {
				if (name[i].compareTo(name[j]) > 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		return name;
	}

	@Override
	public String[] orderDesc() {
		for (int i = 0; i < TOTAL; i++) {
			for (int j = i + 1; j < TOTAL; j++) {
				if (name[i].compareTo(name[j]) < 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		return name;
	}

}
