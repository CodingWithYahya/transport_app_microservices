package com.internshipcode.etudiant;

import org.springframework.stereotype.Service;

@Service
public record EtudiantService(EtudiantRepository etudiantRepository) {
    public void registerEtudiant(EtudiantRegistrationRequest request) {
        Etudiant etudiant = Etudiant.builder()
                .nom(request.nom())
                .prenom(request.prenom())
                .email(request.email())
                .age(request.age())
                .build();
        etudiantRepository.save(etudiant);
    }
}
