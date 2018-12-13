package com.example.beer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.beer.entities.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository <Beer, Long>{

	Beer findBeerByName(String name);

}
