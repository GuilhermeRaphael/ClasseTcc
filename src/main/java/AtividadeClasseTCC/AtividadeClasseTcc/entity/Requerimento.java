package AtividadeClasseTCC.AtividadeClasseTcc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Requerimento")


public class Requerimento {

    @Column(name = "idRequerimento")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeRequerimento")
    private String nome;

    @Column(name = "descRequerimento")
    private String descricao;

    @Column(name = "statusRequerimento")
    private String status;

    @Column(name = "idLocacao")
    private int idLoc;

    @Column(name = "idTipoRequerimento")
    private int TipoRequerimento;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
