package acc.br.desafiotres.entity;

//import java.util.Date;
//import java.util.List;
//import java.util.Objects;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
public class EstudanteEntity {
	
	@Id
	private Integer id;
	
//	@Column(nullable = false, unique = true)
	private String nome;
	
//	@Column(nullable = false)
	private String dataNascimento;
//	@Column(nullable = false)
	private String cep;
//	@Column(nullable = false)
	private String cidade;
//	@Column(nullable = false)
	private String curso;
	
	
	

	
	public EstudanteEntity(String nome, String date, String cep, String cidade, String curso) {
		super();
		this.nome = nome;
		this.dataNascimento = date;
		this.cep = cep;
		this.cidade = cidade;
		this.curso = curso;
	}
	
	
	
	
	public EstudanteEntity(EstudanteEntity estudante) {
		// TODO Auto-generated constructor stub
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	



	
	

}
