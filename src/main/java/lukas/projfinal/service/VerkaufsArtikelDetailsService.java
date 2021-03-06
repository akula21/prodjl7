package lukas.projfinal.service;

import lukas.projfinal.entity.VerkaufsArtikelDetailsEntity;

import java.util.List;

public interface VerkaufsArtikelDetailsService {

    List<VerkaufsArtikelDetailsEntity> getVerkaufsArtikelDetails();

    void createVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail);

    VerkaufsArtikelDetailsEntity getVerkaufsArtikelDetail(Long id);

    void updateVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail);

    void deleteVerkaufsArtikelDetail(Long id);

    VerkaufsArtikelDetailsEntity verkaufsArtikelDetail = new VerkaufsArtikelDetailsEntity();
}
