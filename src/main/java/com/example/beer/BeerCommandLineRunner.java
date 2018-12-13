package com.example.beer;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.beer.entities.Beer;
import com.example.beer.repositories.BeerRepository;;

@Component
public class BeerCommandLineRunner implements CommandLineRunner {

	private BeerRepository beerRepository;

	public BeerCommandLineRunner(BeerRepository beerRepository) {
		super();
		this.beerRepository = beerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius", "Budweiser", "Coors Light",
				"PBR").forEach(name -> beerRepository.save(new Beer(name)));
	}

	public BeerRepository getBeerRepository() {
		return beerRepository;
	}

	public void setBeerRepository(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}
}
