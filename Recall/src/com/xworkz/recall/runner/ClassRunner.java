package com.xworkz.recall.runner;

import com.xworkz.recall.app.Child;
import com.xworkz.recall.app.GrandParent;
import com.xworkz.recall.app.Parent;
import com.xworkz.recall.app.ParentBrother;

public class ClassRunner {

	public static void main(String[] args) {

		GrandParent grand = new GrandParent(1, 1);
		System.out.println();

		Parent parent = new Parent(2, 1, 1, 2);
		Parent parent2 = new Parent(2, 1, true);
		System.out.println();

		ParentBrother brother = new ParentBrother(2, 0, "GrandParent");
		System.out.println();

		Child child = new Child(2, 1, 1, 2, 3, "male");
		child.printInfo("bnglr");
		child.printInfo(true);

	}

}
