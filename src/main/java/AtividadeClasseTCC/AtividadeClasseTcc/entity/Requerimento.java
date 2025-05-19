package AtividadeClasseTCC.AtividadeClasseTcc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Requerimento")


public class Requerimento {

    @Column(name = "idRequisito")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeRequisito")
    private String nome;

    @Column(name = "descRequisito")
    private String descricao;

    @Column(name = "statusRequerimento")
    private String status;

    @ManyToOne
    @JoinColumn(name = "idLocador")
    private Locador locador;

}
