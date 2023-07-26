package com.xworkz.association;

public class Franchise {
	String homeGround;
	String ownership;
	int netWorth;
	int noOfPlayers;
	
Franchise(String homeGround, String ownership, int netWorth, int noOfPlayers)
{
	this.homeGround=homeGround;
	this.ownership=ownership;
	this.netWorth=netWorth;
	this.noOfPlayers=noOfPlayers;
}

IplTeam iplteam = new IplTeam("csk", "msd", true, 5);

void printInfo()
{
	System.out.println("printing info of franchise");
	System.out.println(homeGround);
	System.out.println(ownership);
	System.out.println(netWorth);
	System.out.println(noOfPlayers);
	System.out.println();
	this.iplteam.printInfo();
}
}
