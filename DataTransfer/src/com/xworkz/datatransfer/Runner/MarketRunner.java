package com.xworkz.datatransfer.Runner;

import com.xworkz.datatransfer.dto.MarketDTO;
import com.xworkz.datatransfer.repository.MarketRepository;
import com.xworkz.datatransfer.repository.MarketRepositoryImpl;

public class MarketRunner {

	public static void main(String[] args) {

		System.out.println("Main method of MarketRunner");

		MarketDTO marketDTO1 = new MarketDTO("majestic", "gadgets", true, true, false);
		MarketDTO marketDTO2 = new MarketDTO("malleswaram", "flowers", true, true, true);
		MarketDTO marketDTO3 = new MarketDTO("chickpete", "clothing", true, true, true);
		MarketDTO marketDTO4 = new MarketDTO("shivajinagar", "streetshoping", true, false, false);
		MarketDTO marketDTO5 = new MarketDTO("krmarket", "wholesale", false, true, true);

		MarketRepository marketRepository = new MarketRepositoryImpl();
		marketRepository.save(marketDTO1);
		marketRepository.save(marketDTO2);
		marketRepository.save(marketDTO3);
		marketRepository.save(marketDTO4);
		marketRepository.save(marketDTO5);

		System.out.println();

		System.out.println(marketRepository.findByArea("chickpete"));

		System.out.println();

		System.out.println(marketRepository.findByType("flowers"));

		System.out.println();

		MarketDTO[] marketdto = marketRepository.readAll();
		for (int i = 0; i < marketdto.length; i++) {
			if (marketdto != null) {
				System.out.println(marketdto[i]);
			}
		}

	}

}
