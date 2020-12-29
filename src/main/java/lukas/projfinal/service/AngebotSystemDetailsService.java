package lukas.projfinal.service;

import lukas.projfinal.entity.AngebotSystemDetailsEntity;

import java.util.List;

public interface AngebotSystemDetailsService {

    List<AngebotSystemDetailsEntity> getAngebotSystemDetails();

    void createAngebotSystemDetail(AngebotSystemDetailsEntity angebotSystemDetail);

    AngebotSystemDetailsEntity getAngebotSystemDetail(Long id);

    void updateAngebotSystemDetail(AngebotSystemDetailsEntity angebotSystemDetail);

    void deleteAngebotSystemDetail(Long id);

    AngebotSystemDetailsEntity angebotSystemDetail = new AngebotSystemDetailsEntity();
}
