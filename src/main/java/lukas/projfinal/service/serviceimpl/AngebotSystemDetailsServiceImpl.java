package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.AngebotSystemDetailsEntity;
import lukas.projfinal.repository.AngebotSystemDetailsRepository;
import lukas.projfinal.service.AngebotSystemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngebotSystemDetailsServiceImpl implements AngebotSystemDetailsService {

    @Autowired
    private AngebotSystemDetailsRepository angebotSystemDetailsRepository;

    @Override
    public List<AngebotSystemDetailsEntity> getAngebotSystemDetails() {
        return angebotSystemDetailsRepository.findAll();
    }

    @Override
    public void createAngebotSystemDetail (AngebotSystemDetailsEntity angebotSystemDetail) {
        angebotSystemDetailsRepository.save(angebotSystemDetail);
    }

    @Override
    public AngebotSystemDetailsEntity getAngebotSystemDetail(Long id){
        return angebotSystemDetailsRepository.getOne(id);
    }

    @Override
    public void updateAngebotSystemDetail(AngebotSystemDetailsEntity angebotSystemDetail){
        angebotSystemDetailsRepository.save(angebotSystemDetail);
    }

    @Override
    public void deleteAngebotSystemDetail(Long id){
        angebotSystemDetailsRepository.deleteById(id);
    }

}
