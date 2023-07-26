package com.xworkz.village;
import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.*;
public class VillageRunner {

	public static void main(String[] args) {
		OldVillage old=new OldVillage();
		old.enter();
		
		NewVillage newvillage=new NewVillage();
		newvillage.exit();
		//newVillage.enter();

	}

}