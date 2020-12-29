package lukas.projfinal.service;

import lukas.projfinal.entity.LogoEntity;

import java.util.List;

public interface LogoService {

    List<LogoEntity> getLogos();

    void createLogo(LogoEntity logo);

    LogoEntity getLogo(Long id);

    void updateLogo(LogoEntity logo);

    void deleteLogo(Long id);

    LogoEntity logo = new LogoEntity();
}
