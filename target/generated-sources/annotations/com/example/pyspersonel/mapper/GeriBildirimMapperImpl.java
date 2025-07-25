package com.example.pyspersonel.mapper;

import com.example.pyspersonel.dto.GeriBildirimDTO;
import com.example.pyspersonel.entity.GeriBildirim;
import com.example.pyspersonel.entity.PersonelDonem;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-25T12:46:30+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class GeriBildirimMapperImpl implements GeriBildirimMapper {

    @Override
    public GeriBildirimDTO toDto(GeriBildirim entity) {
        if ( entity == null ) {
            return null;
        }

        GeriBildirimDTO geriBildirimDTO = new GeriBildirimDTO();

        geriBildirimDTO.setGbAlanPersDonemId( entityGbAlanPersDonemPersDonemId( entity ) );
        geriBildirimDTO.setGbVerenPersDonemId( entityGbVerenPersDonemPersDonemId( entity ) );
        geriBildirimDTO.setGbId( entity.getGbId() );
        geriBildirimDTO.setGbTarihi( entity.getGbTarihi() );
        geriBildirimDTO.setGbYer( entity.getGbYer() );
        geriBildirimDTO.setGbAciklama( entity.getGbAciklama() );
        geriBildirimDTO.setOper( entity.getOper() );
        geriBildirimDTO.setOperSaat( entity.getOperSaat() );
        geriBildirimDTO.setGbAlanAciklama( entity.getGbAlanAciklama() );
        geriBildirimDTO.setGbDurum( entity.getGbDurum() );
        geriBildirimDTO.setGbGuncellemeDurum( entity.getGbGuncellemeDurum() );
        geriBildirimDTO.setGbSmsGonderimTarihi( entity.getGbSmsGonderimTarihi() );
        geriBildirimDTO.setGbGuncelAciklamaDurum( entity.getGbGuncelAciklamaDurum() );

        return geriBildirimDTO;
    }

    @Override
    public GeriBildirim toEntity(GeriBildirimDTO dto) {
        if ( dto == null ) {
            return null;
        }

        GeriBildirim geriBildirim = new GeriBildirim();

        geriBildirim.setGbAlanPersDonem( GeriBildirimMapper.toPersonelDonem( dto.getGbAlanPersDonemId() ) );
        geriBildirim.setGbVerenPersDonem( GeriBildirimMapper.toPersonelDonem( dto.getGbVerenPersDonemId() ) );
        geriBildirim.setGbId( dto.getGbId() );
        geriBildirim.setGbTarihi( dto.getGbTarihi() );
        geriBildirim.setGbYer( dto.getGbYer() );
        geriBildirim.setGbAciklama( dto.getGbAciklama() );
        geriBildirim.setOper( dto.getOper() );
        geriBildirim.setOperSaat( dto.getOperSaat() );
        geriBildirim.setGbAlanAciklama( dto.getGbAlanAciklama() );
        geriBildirim.setGbDurum( dto.getGbDurum() );
        geriBildirim.setGbGuncellemeDurum( dto.getGbGuncellemeDurum() );
        geriBildirim.setGbSmsGonderimTarihi( dto.getGbSmsGonderimTarihi() );
        geriBildirim.setGbGuncelAciklamaDurum( dto.getGbGuncelAciklamaDurum() );

        return geriBildirim;
    }

    private Integer entityGbAlanPersDonemPersDonemId(GeriBildirim geriBildirim) {
        if ( geriBildirim == null ) {
            return null;
        }
        PersonelDonem gbAlanPersDonem = geriBildirim.getGbAlanPersDonem();
        if ( gbAlanPersDonem == null ) {
            return null;
        }
        Integer persDonemId = gbAlanPersDonem.getPersDonemId();
        if ( persDonemId == null ) {
            return null;
        }
        return persDonemId;
    }

    private Integer entityGbVerenPersDonemPersDonemId(GeriBildirim geriBildirim) {
        if ( geriBildirim == null ) {
            return null;
        }
        PersonelDonem gbVerenPersDonem = geriBildirim.getGbVerenPersDonem();
        if ( gbVerenPersDonem == null ) {
            return null;
        }
        Integer persDonemId = gbVerenPersDonem.getPersDonemId();
        if ( persDonemId == null ) {
            return null;
        }
        return persDonemId;
    }
}
