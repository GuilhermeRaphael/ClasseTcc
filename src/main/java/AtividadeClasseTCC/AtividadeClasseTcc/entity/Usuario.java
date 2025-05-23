package AtividadeClasseTCC.AtividadeClasseTcc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Usuario")

public class Usuario {

    @Column(name = "idUsuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emailUsuario")
    private String email;

    @Column(name = "senhaUsuario")
    private String senha;

    @Column(name = "dataCadastroUsuario")
    private Date dtCadastro;

    @Column(name = "statusLogin")
    private String login;

    @Column(name = "TipoUsuario")
    private String TipoUsuario;

}
