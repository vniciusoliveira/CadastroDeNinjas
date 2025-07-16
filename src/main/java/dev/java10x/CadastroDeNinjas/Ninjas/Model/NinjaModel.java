package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

//Entity transforma a classe em uma entidade para trabalharmos com BD

@Entity
@Table(name = "tb_cadastro")
@Data // Cria os getters e setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String  email;

    private int idade;
    // Um ninja pode ter uma unica missão
    @ManyToOne
    @JoinColumn(name = "id_missao") // Foreing Keo - Chave Estrangeira
    private MissoesModel missoes;

}
// JPA = Java Persistence API
