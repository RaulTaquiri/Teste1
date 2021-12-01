package model;

public class FuncionarioCredenciado extends Funcionario{
	
	private String login;
	private String senha;

	public FuncionarioCredenciado(String nome, String cargo, String login, String senha) {
		super(nome, cargo);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
