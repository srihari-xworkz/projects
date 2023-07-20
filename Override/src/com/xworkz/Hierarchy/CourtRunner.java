package com.xworkz.Hierarchy;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court = new Court();
		court.justice();
		
		SupremeCourt supreme = new SupremeCourt();
		supreme.importantCase();
		
		Court court2 = new SupremeCourt();
		court2.justice();
		
		System.out.println();
		
		HighCourt high = new HighCourt();
		high.criminalCase();
		high.forgeryCase();
		high.justice();
		high.importantCase();
		
		SupremeCourt supreme2 = new HighCourt();
		supreme2.importantCase();
		supreme2.justice();
		
		Court court3 = new HighCourt();
		court3.justice();
		
		System.out.println();
		
		CivilCourt civil = new CivilCourt();
		civil.propertyCase();
		civil.theftCase();
		civil.criminalCase();
		civil.forgeryCase();
		civil.justice();
		
		Court court4 = new CivilCourt();
		court4.justice();
		
		SupremeCourt supreme3 = new CivilCourt();
		supreme3.justice();
		supreme3.importantCase();
		
		HighCourt high2 = new CivilCourt();
		high2.justice();
		high2.importantCase();
		high2.criminalCase();
		high2.forgeryCase();
		
		System.out.println();
		
		FamilyCourt family = new FamilyCourt();
		family.divorce();
		family.justice();
		family.importantCase();
		family.criminalCase();
		family.forgeryCase();
		family.propertyCase();
		family.theftCase();
		
		Court court5 = new FamilyCourt();
		court5.justice();
		
		SupremeCourt supreme4 = new FamilyCourt();
		supreme4.justice();
		supreme4.importantCase();
		
		HighCourt high3 = new FamilyCourt();
		high3.justice();
		high3.importantCase();
		high3.criminalCase();
		high3.forgeryCase();
		
		CivilCourt civil2 = new FamilyCourt();
		civil2.justice();
		civil2.importantCase();
		civil2.criminalCase();
		civil2.forgeryCase();
		civil.propertyCase();
		civil2.theftCase();
				
	}

}
