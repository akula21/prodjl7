package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.KopfteilEntity;
import lukas.projfinal.repository.KopfteilRepository;
import lukas.projfinal.service.KopfteilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KopfteilServiceImpl implements KopfteilService {

    @Autowired
    private KopfteilRepository kopfteilRepository;

    @Override
    public List<KopfteilEntity> getKopfteils() {
        return kopfteilRepository.findAll();
    }

    @Override
    public void createKopfteil(KopfteilEntity kopfteil) {
        kopfteilRepository.save(kopfteil);
    }

    @Override
    public KopfteilEntity getKopfteil(Long id) {
        return kopfteilRepository.getOne(id);
    }

    @Override
    public void updateKopfteil(KopfteilEntity kopfteil) {
        kopfteilRepository.save(kopfteil);
    }

    @Override
    public void deleteKopfteil(Long id) {
        kopfteilRepository.deleteById(id);
    }
}
