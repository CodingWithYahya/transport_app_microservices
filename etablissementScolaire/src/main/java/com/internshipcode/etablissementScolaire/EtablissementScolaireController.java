package com.internshipcode.etablissementScolaire;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/etablissementScolaires")
public class EtablissementScolaireController {
    private final EtablissementScolaireService etablissementScolaireService;
    public EtablissementScolaireController(EtablissementScolaireService etablissementScolaireService){
        this.etablissementScolaireService = etablissementScolaireService;
    }
    @PostMapping(path = "{etudiantId}")
    public EtablissementScolaireResponse est_prive(@PathVariable("etudiantId") Integer etudiantID) {

    }

}
