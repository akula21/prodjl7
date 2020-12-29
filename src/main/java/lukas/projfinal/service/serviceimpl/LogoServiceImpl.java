package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.LogoEntity;
import lukas.projfinal.repository.LogoRepository;
import lukas.projfinal.service.LogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogoServiceImpl implements LogoService {

    @Autowired
    private LogoRepository logoRepository;

    @Override
    public List<LogoEntity> getLogos() {
        return logoRepository.findAll();
    }

    @Override
    public void createLogo(LogoEntity logo) {
        logoRepository.save(logo);
    }

    @Override
    public LogoEntity getLogo(Long id) {
        return logoRepository.getOne(id);
    }

    @Override
    public void updateLogo(LogoEntity logo) {
        logoRepository.save(logo);
    }

    @Override
    public void deleteLogo(Long id) {
        logoRepository.deleteById(id);
    }
}
