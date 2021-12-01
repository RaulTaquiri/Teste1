package persistencia;

import java.util.ArrayList;

import model.FuncionarioCredenciado;


public class BDCredencial {
	
	private static BDCredencial INSTANCE;
	FuncionarioCredenciado funcRH;
	FuncionarioCredenciado funcEstacionamento;
	FuncionarioCredenciado funcGestor;
	
	private BDCredencial() {
		this.funcRH = new FuncionarioCredenciado("José", "Recursos Humanos", "Raulrh", "Raulrh");
		this.funcGestor = new FuncionarioCredenciado("Josias", "Gestor do Estacionamento", "Raulg", "Raulg");
		this.funcEstacionamento = new FuncionarioCredenciado("João", "Operador do Estacionamento", "Raulf", "Raulf");
	}
	
	public static BDCredencial getInstance() {
		
		if(INSTANCE == null) {
			INSTANCE = new BDCredencial();
		}
		
		return INSTANCE;
	}
	
	public boolean verificacaoGeral(String login, String senha) {
		
		if (login.equals(funcEstacionamento.getLogin()) && senha.equals(funcEstacionamento.getSenha())){
			return true;
		}
		else if (login.equals(funcRH.getLogin()) && senha.equals(funcRH.getSenha())){
			return true;
		}
		else if (login.equals(funcGestor.getLogin()) && senha.equals(funcGestor.getSenha())){
			return true;
		}
		return false;
	}

	
	public boolean verificacaoRH(String login, String senha) {
			
			if (login.equals(funcRH.getLogin()) && senha.equals(funcRH.getSenha())){
				return true;
			}
			return false;
		}

	
	public boolean verificacaoGestor(String login, String senha) {
		
		if (login.equals(funcGestor.getLogin()) && senha.equals(funcGestor.getSenha())){
			return true;
		}
		return false;
	}

	public boolean verificacaoEstac(String login, String senha) {
		
		if (login.equals(funcEstacionamento.getLogin()) && senha.equals(funcEstacionamento.getSenha())){
			return true;
		}
		return false;
	}
}
