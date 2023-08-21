package com.shrikant.repositories;

import com.shrikant.domain.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
