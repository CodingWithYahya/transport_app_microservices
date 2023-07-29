package com.internshipcode.etudiant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    @SequenceGenerator(name = "etudiant_id_sequence" , sequenceName = "etudiant_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "etudiant_id_sequence")
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private int age;
}
