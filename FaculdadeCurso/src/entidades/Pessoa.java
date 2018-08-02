package entidades;

public class Pessoa {
	
	private int id;
	private String nome;
	private int rg;
	private int cpf;
	private char sexo;
	private String dataNascimento;
	private String email;
	private int cursoId;
	private int faculdadeId;
	
	
	
	public Pessoa(int id, String nome, int rg, int cpf, char sexo, String dataNascimento, String email, int cursoId,
			int faculdadeId) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.cursoId = cursoId;
		this.faculdadeId = faculdadeId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getCursoId() {
		return cursoId;
	}



	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}



	public int getFaculdadeId() {
		return faculdadeId;
	}



	public void setFaculdadeId(int faculdadeId) {
		this.faculdadeId = faculdadeId;
	}
	
	
	

}
