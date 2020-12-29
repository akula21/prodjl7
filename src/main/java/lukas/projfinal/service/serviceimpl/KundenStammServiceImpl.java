package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.KundenStammEntity;
import lukas.projfinal.repository.KundenStammRepository;
import lukas.projfinal.service.KundenStammService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundenStammServiceImpl implements KundenStammService {

    @Autowired
    private KundenStammRepository kundenStammRepository;

    @Override
    public List<KundenStammEntity> getKundens() {
        return kundenStammRepository.findAll();
    }

    @Override
    public void createKunden(KundenStammEntity kundenStamm) {
        kundenStammRepository.save(kundenStamm);
    }

    @Override
    public KundenStammEntity getKunden(Long id){
        return kundenStammRepository.getOne(id);
    }

    @Override
    public void updateKunden(KundenStammEntity kundenStamm){
        kundenStammRepository.save(kundenStamm);
    }

    @Override
    public void deleteKunden(Long id){
        kundenStammRepository.deleteById(id);
    }
}
