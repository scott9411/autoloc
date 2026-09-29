package tn.esprit.autoloc2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.autoloc2.entities.enums.RoleEmploye;

@Entity
@Getter
@Setter
public class Employes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    @ManyToOne
    private Agence agence;
}