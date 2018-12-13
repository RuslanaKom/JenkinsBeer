package com.exmple.beer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.beer.entities.Beer;
import com.example.beer.repositories.BeerRepository;

@Service
public class BeerService {

	private BeerRepository beerRepository;
	
	public BeerService(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}
	
	public Beer findBeerByName(String name) {
		return beerRepository.findBeerByName(name);	
	}

	public List<Beer> findAllBeer(){
		return beerRepository.findAll();
	}
	
	public BeerRepository getBeerRepository() {
		return beerRepository;
	}

	public void setBeerRepository(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}
}
