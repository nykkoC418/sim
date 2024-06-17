package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")
public class aluno {
	public aluno(Object id2, Object nome2, Object cpf2, Object senha2) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "CPF_id", nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "senha")
	private String senha;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSenha() {
		// TODO Auto-generated method stub
		return null;
	}
}
