package com.example.pyspersonel.mapper;

import com.example.pyspersonel.dto.GbOnayDurumuDTO;
import com.example.pyspersonel.entity.GbOnayDurumu;
import com.example.pyspersonel.entity.PersonelDonem;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-25T12:46:30+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class GbOnayDurumuMapperImpl implements GbOnayDurumuMapper {

    @Override
    public GbOnayDurumuDTO toDto(GbOnayDurumu entity) {
        if ( entity == null ) {
            return null;
        }

        GbOnayDurumuDTO gbOnayDurumuDTO = new GbOnayDurumuDTO();

        gbOnayDurumuDTO.setPersDonemId( entityPersonelDonemPersDonemId( entity ) );
        gbOnayDurumuDTO.setKayitId( entity.getKayitId() );
        gbOnayDurumuDTO.setGbAlmaDurumu( entity.getGbAlmaDurumu() );
        gbOnayDurumuDTO.setOper( entity.getOper() );
        gbOnayDurumuDTO.setOperSaat( entity.getOperSaat() );

        return gbOnayDurumuDTO;
    }

    @Override
    public GbOnayDurumu toEntity(GbOnayDurumuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        GbOnayDurumu gbOnayDurumu = new GbOnayDurumu();

        gbOnayDurumu.setPersonelDonem( GbOnayDurumuMapper.toPersonelDonem( dto.getPersDonemId() ) );
        gbOnayDurumu.setKayitId( dto.getKayitId() );
        gbOnayDurumu.setGbAlmaDurumu( dto.getGbAlmaDurumu() );
        gbOnayDurumu.setOper( dto.getOper() );
        gbOnayDurumu.setOperSaat( dto.getOperSaat() );

        return gbOnayDurumu;
    }

    private Integer entityPersonelDonemPersDonemId(GbOnayDurumu gbOnayDurumu) {
        if ( gbOnayDurumu == null ) {
            return null;
        }
        PersonelDonem personelDonem = gbOnayDurumu.getPersonelDonem();
        if ( personelDonem == null ) {
            return null;
        }
        Integer persDonemId = personelDonem.getPersDonemId();
        if ( persDonemId == null ) {
            return null;
        }
        return persDonemId;
    }
}
