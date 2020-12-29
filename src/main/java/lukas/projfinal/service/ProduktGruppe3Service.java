package lukas.projfinal.service;

import lukas.projfinal.entity.ProduktGruppe3Entity;

import java.util.List;

public interface ProduktGruppe3Service {

    List<ProduktGruppe3Entity> getProduktGruppe3s();

    void createProduktGruppe3(ProduktGruppe3Entity produktGruppe3);

    ProduktGruppe3Entity getProduktGruppe3(Long id);

    void updateProduktGruppe3(ProduktGruppe3Entity produktGruppe3);

    void deleteProduktGruppe3(Long id);

    ProduktGruppe3Entity produktGruppe3 = new ProduktGruppe3Entity();
}
