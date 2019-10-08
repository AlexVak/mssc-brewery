package com.alexvak.msscbrewery.services;

import com.alexvak.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeer(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Test Beer")
                .beerStyle("Test Style")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("New Beer")
                .beerStyle("New Style")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo implement method
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer...");
    }

}
