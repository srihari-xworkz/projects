package com.xworkz.association;

public class IplTeam {
	String team;
	String caption;
	boolean won;
	int trophies;
	
IplTeam(String team, String caption, boolean won, int trophies)
{
	this.team=team;
	this.caption=caption;
	this.won=won;
	this.trophies=trophies;
}

void printInfo()
{
	System.out.println("printing info of IplTeam");
	System.out.println(team);
	System.out.println(caption);
	System.out.println(won);
	System.out.println(trophies);
}
}
