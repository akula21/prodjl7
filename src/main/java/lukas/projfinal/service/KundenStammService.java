package lukas.projfinal.service;

import lukas.projfinal.entity.KundenStammEntity;

import java.util.List;

public interface KundenStammService {

    List<KundenStammEntity> getKundens();

    void createKunden(KundenStammEntity kundenStamm);

    KundenStammEntity getKunden(Long id);

    void updateKunden(KundenStammEntity kundenStamm);

    void deleteKunden(Long id);

    KundenStammEntity kundenStamm = new KundenStammEntity();

}
