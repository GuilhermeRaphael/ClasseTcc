package AtividadeClasseTCC.AtividadeClasseTcc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Locador")

public class Locador {

    @Column(name = "idLocador")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeLocador")
    private String nome;

    @Column(name = "cpfLocador")
    private String cpf;

    @Column(name = "emailLocador")
    private String email;

    @Column(name = "telefoneLocador")
    private String telefone;

    @Column(name = "senhaLocador")
    private String senha;
}
