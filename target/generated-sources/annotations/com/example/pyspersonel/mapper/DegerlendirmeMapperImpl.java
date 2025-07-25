package com.example.pyspersonel.mapper;

import com.example.pyspersonel.dto.DegerlendirmeDTO;
import com.example.pyspersonel.entity.Degerlendirme;
import com.example.pyspersonel.entity.PersonelDonem;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-25T12:46:30+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class DegerlendirmeMapperImpl implements DegerlendirmeMapper {

    @Override
    public DegerlendirmeDTO toDto(Degerlendirme entity) {
        if ( entity == null ) {
            return null;
        }

        DegerlendirmeDTO degerlendirmeDTO = new DegerlendirmeDTO();

        degerlendirmeDTO.setDegAlanPersDonemId( entityDegAlanPersDonemPersDonemId( entity ) );
        degerlendirmeDTO.setDegVerenPersDonemId( entityDegVerenPersDonemPersDonemId( entity ) );
        degerlendirmeDTO.setDegNo( entity.getDegNo() );
        degerlendirmeDTO.setSoruId( entity.getSoruId() );
        degerlendirmeDTO.setSkalaNo( entity.getSkalaNo() );
        degerlendirmeDTO.setOper( entity.getOper() );
        degerlendirmeDTO.setOperSaat( entity.getOperSaat() );

        return degerlendirmeDTO;
    }

    @Override
    public Degerlendirme toEntity(DegerlendirmeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Degerlendirme degerlendirme = new Degerlendirme();

        degerlendirme.setDegAlanPersDonem( DegerlendirmeMapper.toPersonelDonem( dto.getDegAlanPersDonemId() ) );
        degerlendirme.setDegVerenPersDonem( DegerlendirmeMapper.toPersonelDonem( dto.getDegVerenPersDonemId() ) );
        degerlendirme.setDegNo( dto.getDegNo() );
        degerlendirme.setSoruId( dto.getSoruId() );
        degerlendirme.setSkalaNo( dto.getSkalaNo() );
        degerlendirme.setOper( dto.getOper() );
        degerlendirme.setOperSaat( dto.getOperSaat() );

        return degerlendirme;
    }

    private Integer entityDegAlanPersDonemPersDonemId(Degerlendirme degerlendirme) {
        if ( degerlendirme == null ) {
            return null;
        }
        PersonelDonem degAlanPersDonem = degerlendirme.getDegAlanPersDonem();
        if ( degAlanPersDonem == null ) {
            return null;
        }
        Integer persDonemId = degAlanPersDonem.getPersDonemId();
        if ( persDonemId == null ) {
            return null;
        }
        return persDonemId;
    }

    private Integer entityDegVerenPersDonemPersDonemId(Degerlendirme degerlendirme) {
        if ( degerlendirme == null ) {
            return null;
        }
        PersonelDonem degVerenPersDonem = degerlendirme.getDegVerenPersDonem();
        if ( degVerenPersDonem == null ) {
            return null;
        }
        Integer persDonemId = degVerenPersDonem.getPersDonemId();
        if ( persDonemId == null ) {
            return null;
        }
        return persDonemId;
    }
}
