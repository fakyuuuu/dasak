package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.GeriBildirim;
import com.example.pyspersonel.dto.GeriBildirimDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GeriBildirimMapper {
    GeriBildirimMapper INSTANCE = Mappers.getMapper(GeriBildirimMapper.class);

    @org.mapstruct.Mapping(target = "gbAlanPersDonemId", source = "gbAlanPersDonem.persDonemId")
    @org.mapstruct.Mapping(target = "gbVerenPersDonemId", source = "gbVerenPersDonem.persDonemId")
    GeriBildirimDTO toDto(GeriBildirim entity);

    @org.mapstruct.Mapping(target = "gbAlanPersDonem", source = "gbAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "gbVerenPersDonem", source = "gbVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    GeriBildirim toEntity(GeriBildirimDTO dto);

    void updateEntityFromDto(GeriBildirimDTO dto, @MappingTarget GeriBildirim entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.pyspersonel.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.pyspersonel.entity.PersonelDonem pd = new com.example.pyspersonel.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
