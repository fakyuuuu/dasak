package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.Degerlendirme;
import com.example.pyspersonel.dto.DegerlendirmeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DegerlendirmeMapper {
    DegerlendirmeMapper INSTANCE = Mappers.getMapper(DegerlendirmeMapper.class);

    @org.mapstruct.Mapping(target = "degAlanPersDonemId", source = "degAlanPersDonem.persDonemId")
    @org.mapstruct.Mapping(target = "degVerenPersDonemId", source = "degVerenPersDonem.persDonemId")
    DegerlendirmeDTO toDto(Degerlendirme entity);

    @org.mapstruct.Mapping(target = "degAlanPersDonem", source = "degAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "degVerenPersDonem", source = "degVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    Degerlendirme toEntity(DegerlendirmeDTO dto);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.pyspersonel.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.pyspersonel.entity.PersonelDonem pd = new com.example.pyspersonel.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
