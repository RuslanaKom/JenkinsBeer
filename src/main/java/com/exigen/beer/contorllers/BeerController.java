package com.exigen.beer.contorllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.beer.entities.Beer;
import com.exmple.beer.services.BeerService;

@Controller
public class BeerController {

	private BeerService beerService;
	
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	public BeerService getBeerService() {
		return beerService;
	}

	public void setBeerService(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping("/beers")
	public List<Beer> getBeers() {
		return beerService.findAllBeer();
	}


}
