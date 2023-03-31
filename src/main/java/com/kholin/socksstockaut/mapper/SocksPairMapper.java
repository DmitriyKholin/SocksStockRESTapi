package com.kholin.socksstockaut.mapper;

import com.kholin.socksstockaut.dto.SocksStockDto;
import com.kholin.socksstockaut.entity.SocksStock;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SocksPairMapper {
    @Mapping(target = "color", source = "color.name")
    SocksStockDto toDto(SocksStock socksStock);
    @Mapping(target = "color.name", source = "color")
    SocksStock toEntity(SocksStockDto socksStockDto);
}
