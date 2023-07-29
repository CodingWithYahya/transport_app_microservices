package com.internshipcode.etudiant;

public record EtudiantRegistrationRequest(
        String nom,
        String prenom,
        String email,
        int age) {

}
