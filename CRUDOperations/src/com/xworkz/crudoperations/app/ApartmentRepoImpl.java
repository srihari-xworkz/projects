package com.xworkz.crudoperations.app;

public class ApartmentRepoImpl implements ApartmentRepository {

	private String[] names = new String[TOTAL_COUNT];
	private int index = 0;

	@Override
	public void save(String name) {
		if (index < TOTAL_COUNT) {
			this.names[index] = name;
			System.out.println("name saved at index " + index + " is " + name);
			index++;
			System.out.println("updated index is " + index);
		} else {
			System.err.println("index limit exceeded cannot save more");
		}

	}

	@Override
	public void display() {
		for (int start = 0; start <= TOTAL_COUNT; start++) {
			System.out.println("name at index " + start + " is " + names[start]);
		}

	}

}
