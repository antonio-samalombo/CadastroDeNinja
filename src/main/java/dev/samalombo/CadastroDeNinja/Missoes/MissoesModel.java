package dev.samalombo.CadastroDeNinja.Missoes;

import dev.samalombo.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    private NinjaModel ninja;

}
