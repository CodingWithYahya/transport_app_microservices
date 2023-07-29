package com.internshipcode.etablissementScolaire;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EtablissementScolaire {

    @Id
    @SequenceGenerator(name = "etablissementScolaire_id_sequence" , sequenceName = "etablissementScolaire_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "etablissementScolaire_id_sequence")
    private Integer id;
    private String nom;
    private double longitude;
    private double latitude;

    private Integer etudiant_id;
    private Boolean est_prive;
    private LocalDateTime dateCreation;

}
