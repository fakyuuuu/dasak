package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.GbOnayDurumu;
import com.example.pyspersonel.dto.GbOnayDurumuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GbOnayDurumuMapper {
    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    GbOnayDurumuDTO toDto(GbOnayDurumu entity);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    GbOnayDurumu toEntity(GbOnayDurumuDTO dto);

    void updateEntityFromDto(GbOnayDurumuDTO dto, @MappingTarget GbOnayDurumu entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.pyspersonel.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.pyspersonel.entity.PersonelDonem pd = new com.example.pyspersonel.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
