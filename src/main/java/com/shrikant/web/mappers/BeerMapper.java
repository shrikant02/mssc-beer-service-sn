package com.shrikant.web.mappers;

import com.shrikant.domain.Beer;
import com.shrikant.web.model.BeerDto;
import org.mapstruct.Mapper;
@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto asBeerDto(Beer beer);
    Beer asBeer(BeerDto beerDto);
}
