package com.example.pyspersonel.mapper;

import com.example.pyspersonel.entity.Transfer;
import com.example.pyspersonel.dto.TransferDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    TransferMapper INSTANCE = Mappers.getMapper(TransferMapper.class);

    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    TransferDTO toDto(Transfer entity);
    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    Transfer toEntity(TransferDTO dto);

    void updateEntityFromDto(TransferDTO dto, @MappingTarget Transfer entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.pyspersonel.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.pyspersonel.entity.PersonelDonem pd = new com.example.pyspersonel.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
