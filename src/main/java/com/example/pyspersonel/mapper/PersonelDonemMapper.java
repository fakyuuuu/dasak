package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.PersonelDonem;
import com.example.pyspersonel.dto.PersonelDonemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelDonemMapper {
    PersonelDonemMapper INSTANCE = Mappers.getMapper(PersonelDonemMapper.class);

    @org.mapstruct.Mapping(target = "persId", source = "personel.persId")
    PersonelDonemDTO toDto(PersonelDonem entity);

    @org.mapstruct.Mapping(target = "personel", source = "persId", qualifiedByName = "toPersonel")
    PersonelDonem toEntity(PersonelDonemDTO dto);

    void updateEntityFromDto(PersonelDonemDTO dto, @MappingTarget PersonelDonem entity);

    @org.mapstruct.Named("toPersonel")
    public static com.example.pyspersonel.entity.Personel toPersonel(Integer persId) {
        if (persId == null) return null;
        com.example.pyspersonel.entity.Personel p = new com.example.pyspersonel.entity.Personel();
        p.setPersId(persId);
        return p;
    }
}
