package com.example.pyspersonel.mapper;

import com.example.pyspersonel.dto.PersonelDonemDTO;
import com.example.pyspersonel.entity.Personel;
import com.example.pyspersonel.entity.PersonelDonem;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-25T12:46:30+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class PersonelDonemMapperImpl implements PersonelDonemMapper {

    @Override
    public PersonelDonemDTO toDto(PersonelDonem entity) {
        if ( entity == null ) {
            return null;
        }

        PersonelDonemDTO personelDonemDTO = new PersonelDonemDTO();

        personelDonemDTO.setPersId( entityPersonelPersId( entity ) );
        personelDonemDTO.setPersDonemId( entity.getPersDonemId() );
        personelDonemDTO.setDonemNo( entity.getDonemNo() );
        personelDonemDTO.setPerNo( entity.getPerNo() );
        personelDonemDTO.setAd( entity.getAd() );
        personelDonemDTO.setSoyad( entity.getSoyad() );
        personelDonemDTO.setKimlikNo( entity.getKimlikNo() );
        personelDonemDTO.setEmail( entity.getEmail() );
        personelDonemDTO.setTelIs( entity.getTelIs() );
        personelDonemDTO.setCalTip( entity.getCalTip() );
        personelDonemDTO.setIsGirTarih( entity.getIsGirTarih() );
        personelDonemDTO.setAmirEh( entity.getAmirEh() );
        personelDonemDTO.setIsKod( entity.getIsKod() );
        personelDonemDTO.setIsAd( entity.getIsAd() );
        personelDonemDTO.setPozisyonKod( entity.getPozisyonKod() );
        personelDonemDTO.setPozisyonAd( entity.getPozisyonAd() );
        personelDonemDTO.setPerOrgKod( entity.getPerOrgKod() );
        personelDonemDTO.setPerOrgAd( entity.getPerOrgAd() );
        personelDonemDTO.setUniteOrgKod( entity.getUniteOrgKod() );
        personelDonemDTO.setUniteOrgAd( entity.getUniteOrgAd() );
        personelDonemDTO.setSeviyeKod( entity.getSeviyeKod() );
        personelDonemDTO.setDegDurumu( entity.getDegDurumu() );
        personelDonemDTO.setKayitTipi( entity.getKayitTipi() );
        personelDonemDTO.setGmKod( entity.getGmKod() );
        personelDonemDTO.setGmAd( entity.getGmAd() );
        personelDonemDTO.setGmyKod( entity.getGmyKod() );
        personelDonemDTO.setGmyAd( entity.getGmyAd() );
        personelDonemDTO.setGrpbasKod( entity.getGrpbasKod() );
        personelDonemDTO.setGrpbasAd( entity.getGrpbasAd() );
        personelDonemDTO.setDirKod( entity.getDirKod() );
        personelDonemDTO.setDirAd( entity.getDirAd() );
        personelDonemDTO.setMdrKod( entity.getMdrKod() );
        personelDonemDTO.setMdrAd( entity.getMdrAd() );
        personelDonemDTO.setMdryrdKod( entity.getMdryrdKod() );
        personelDonemDTO.setMdryrdAd( entity.getMdryrdAd() );
        personelDonemDTO.setBassefKod( entity.getBassefKod() );
        personelDonemDTO.setBassefAd( entity.getBassefAd() );
        personelDonemDTO.setAmirlikKod( entity.getAmirlikKod() );
        personelDonemDTO.setAmirlikAd( entity.getAmirlikAd() );
        personelDonemDTO.setPbforKod( entity.getPbforKod() );
        personelDonemDTO.setPbforAd( entity.getPbforAd() );
        personelDonemDTO.setOper( entity.getOper() );
        personelDonemDTO.setOperSaat( entity.getOperSaat() );
        personelDonemDTO.setCalgrupKod( entity.getCalgrupKod() );
        personelDonemDTO.setCalgrupAd( entity.getCalgrupAd() );
        personelDonemDTO.setTelCep( entity.getTelCep() );

        return personelDonemDTO;
    }

    @Override
    public PersonelDonem toEntity(PersonelDonemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PersonelDonem personelDonem = new PersonelDonem();

        personelDonem.setPersonel( PersonelDonemMapper.toPersonel( dto.getPersId() ) );
        personelDonem.setPersDonemId( dto.getPersDonemId() );
        personelDonem.setDonemNo( dto.getDonemNo() );
        personelDonem.setPerNo( dto.getPerNo() );
        personelDonem.setAd( dto.getAd() );
        personelDonem.setSoyad( dto.getSoyad() );
        personelDonem.setKimlikNo( dto.getKimlikNo() );
        personelDonem.setEmail( dto.getEmail() );
        personelDonem.setTelIs( dto.getTelIs() );
        personelDonem.setCalTip( dto.getCalTip() );
        personelDonem.setIsGirTarih( dto.getIsGirTarih() );
        personelDonem.setAmirEh( dto.getAmirEh() );
        personelDonem.setIsKod( dto.getIsKod() );
        personelDonem.setIsAd( dto.getIsAd() );
        personelDonem.setPozisyonKod( dto.getPozisyonKod() );
        personelDonem.setPozisyonAd( dto.getPozisyonAd() );
        personelDonem.setPerOrgKod( dto.getPerOrgKod() );
        personelDonem.setPerOrgAd( dto.getPerOrgAd() );
        personelDonem.setUniteOrgKod( dto.getUniteOrgKod() );
        personelDonem.setUniteOrgAd( dto.getUniteOrgAd() );
        personelDonem.setSeviyeKod( dto.getSeviyeKod() );
        personelDonem.setDegDurumu( dto.getDegDurumu() );
        personelDonem.setKayitTipi( dto.getKayitTipi() );
        personelDonem.setGmKod( dto.getGmKod() );
        personelDonem.setGmAd( dto.getGmAd() );
        personelDonem.setGmyKod( dto.getGmyKod() );
        personelDonem.setGmyAd( dto.getGmyAd() );
        personelDonem.setGrpbasKod( dto.getGrpbasKod() );
        personelDonem.setGrpbasAd( dto.getGrpbasAd() );
        personelDonem.setDirKod( dto.getDirKod() );
        personelDonem.setDirAd( dto.getDirAd() );
        personelDonem.setMdrKod( dto.getMdrKod() );
        personelDonem.setMdrAd( dto.getMdrAd() );
        personelDonem.setMdryrdKod( dto.getMdryrdKod() );
        personelDonem.setMdryrdAd( dto.getMdryrdAd() );
        personelDonem.setBassefKod( dto.getBassefKod() );
        personelDonem.setBassefAd( dto.getBassefAd() );
        personelDonem.setAmirlikKod( dto.getAmirlikKod() );
        personelDonem.setAmirlikAd( dto.getAmirlikAd() );
        personelDonem.setPbforKod( dto.getPbforKod() );
        personelDonem.setPbforAd( dto.getPbforAd() );
        personelDonem.setOper( dto.getOper() );
        personelDonem.setOperSaat( dto.getOperSaat() );
        personelDonem.setCalgrupKod( dto.getCalgrupKod() );
        personelDonem.setCalgrupAd( dto.getCalgrupAd() );
        personelDonem.setTelCep( dto.getTelCep() );

        return personelDonem;
    }

    private Integer entityPersonelPersId(PersonelDonem personelDonem) {
        if ( personelDonem == null ) {
            return null;
        }
        Personel personel = personelDonem.getPersonel();
        if ( personel == null ) {
            return null;
        }
        Integer persId = personel.getPersId();
        if ( persId == null ) {
            return null;
        }
        return persId;
    }
}
