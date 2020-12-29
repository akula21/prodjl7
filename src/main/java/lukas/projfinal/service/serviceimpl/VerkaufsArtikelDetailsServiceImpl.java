package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.VerkaufsArtikelDetailsEntity;
import lukas.projfinal.repository.VerkaufsArtikelDetailsRepository;
import lukas.projfinal.service.VerkaufsArtikelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerkaufsArtikelDetailsServiceImpl implements VerkaufsArtikelDetailsService {

    @Autowired
    private VerkaufsArtikelDetailsRepository verkaufsArtikelDetailsRepository;

    @Override
    public List<VerkaufsArtikelDetailsEntity> getVerkaufsArtikelDetails() {
        return verkaufsArtikelDetailsRepository.findAll();
    }

    @Override
    public void createVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail) {
        verkaufsArtikelDetailsRepository.save(verkaufsArtikelDetail);
    }

    @Override
    public VerkaufsArtikelDetailsEntity getVerkaufsArtikelDetail(Long id) {
        return verkaufsArtikelDetailsRepository.getOne(id);
    }

    @Override
    public void updateVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail) {
        verkaufsArtikelDetailsRepository.save(verkaufsArtikelDetail);
    }

    @Override
    public void deleteVerkaufsArtikelDetail(Long id) {
        verkaufsArtikelDetailsRepository.deleteById(id);
    }
}
