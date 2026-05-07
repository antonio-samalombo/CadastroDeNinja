package dev.samalombo.CadastroDeNinja.Ninjas;

import dev.samalombo.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    // Coloca a coluna email como UNIQUE
    @Column(unique = true)
    private String email;

    @Column(name = "img_Url")
    private String imUrl;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne um ninja - tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

}