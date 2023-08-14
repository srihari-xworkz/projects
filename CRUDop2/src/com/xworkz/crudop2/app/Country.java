package com.xworkz.crudop2.app;

public interface Country {

	int TOTAL = 10;

	void save(String cname);

	void display();

	boolean isExist(String match);

	String findReturnUppercase(String upper);

	String[] findStartsWith(String start);

	String[] findEndWith(String ends);

	String[] findMatching(String matching);

	int savedCount();

	String[] orderAscen();

	String[] orderDesc();

}
