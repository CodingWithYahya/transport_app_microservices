package com.internshipcode.etablissementScolaire;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EtablissementScolaireService {
    private final EtablissementScolaireRepository etablissementScolaireRepository;
    public EtablissementScolaireService(EtablissementScolaireRepository etablissementScolaireRepository){
        this.etablissementScolaireRepository = etablissementScolaireRepository;
    }
    public boolean isChihaja(Integer etudiantId) {
        etablissementScolaireRepository.save(
                EtablissementScolaire.builder()


                        .etudiant_id(etudiantId)
                        .est_prive(false)
                        .dateCreation(LocalDateTime.now())
                        .build()
        )
                return false ;
    }

}
