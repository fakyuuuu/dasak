package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.PersonelDonemSonuc;
import com.example.pyspersonel.dto.PersonelDonemSonucDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelDonemSonucMapper {
    PersonelDonemSonucMapper INSTANCE = Mappers.getMapper(PersonelDonemSonucMapper.class);

    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    PersonelDonemSonucDTO toDto(PersonelDonemSonuc entity);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    PersonelDonemSonuc toEntity(PersonelDonemSonucDTO dto);

    void updateEntityFromDto(PersonelDonemSonucDTO dto, @MappingTarget PersonelDonemSonuc entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.pyspersonel.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.pyspersonel.entity.PersonelDonem pd = new com.example.pyspersonel.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
