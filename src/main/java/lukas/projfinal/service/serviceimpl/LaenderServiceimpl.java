package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.LaenderEntity;
import lukas.projfinal.repository.LaenderRepository;
import lukas.projfinal.service.LaenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaenderServiceimpl implements LaenderService {

    @Autowired
    private LaenderRepository laenderRepository;

    @Override
    public List<LaenderEntity> getLaenders() {
        return laenderRepository.findAll();
    }

    @Override
    public void createLaender(LaenderEntity laender) {
        laenderRepository.save(laender);
    }

    @Override
    public LaenderEntity getLaender(Long id) {
        return laenderRepository.getOne(id);
    }

    @Override
    public void updateLaender(LaenderEntity laender) {
        laenderRepository.save(laender);
    }

    @Override
    public void deleteLaender(Long id) {
        laenderRepository.deleteById(id);
    }
}
