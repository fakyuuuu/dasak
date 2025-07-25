package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.Personel;
import com.example.pyspersonel.dto.PersonelDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelMapper {
    PersonelMapper INSTANCE = Mappers.getMapper(PersonelMapper.class);

    PersonelDTO toDto(Personel entity);
    Personel toEntity(PersonelDTO dto);
    void updateEntityFromDto(PersonelDTO dto, @MappingTarget Personel entity);
}
