package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.KopfteilDetailsEntity;
import lukas.projfinal.repository.KopfteilDetailsRepository;
import lukas.projfinal.service.KopfteilDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KopfteilDetailsServiceImpl implements KopfteilDetailsService {

    @Autowired
    private KopfteilDetailsRepository kopfteilDetailsRepository;

    @Override
    public List<KopfteilDetailsEntity> getKopfteilDetails() {
        return kopfteilDetailsRepository.findAll();
    }

    @Override
    public void createKopfteilDetail(KopfteilDetailsEntity kopfteilDetail) {
        kopfteilDetailsRepository.save(kopfteilDetail);
    }

    @Override
    public KopfteilDetailsEntity getKopfteilDetail(Long id) {
        return kopfteilDetailsRepository.getOne(id);
    }

    @Override
    public void updateKopfteilDetail(KopfteilDetailsEntity kopfteilDetail) {
        kopfteilDetailsRepository.save(kopfteilDetail);
    }

    @Override
    public void deleteKopfteilDetail(Long id) {
        kopfteilDetailsRepository.deleteById(id);
    }
}
