package controller;

import model.Grupo;
import model.TCC;

public class TCCController {
	
	public void enviarAtividade(Grupo grupo, TCC atividade) {
		System.out.println("Atividade do TCC enviada pelo grupo " + grupo.getTema() + " em " + atividade.getData());
	}
	
	public void verRetorno() {
		System.out.println("Retorno do professor sobre a atividade do TCC");
	}
	
	public void desfazerEnvioAtividade() {
		System.out.println("Envio da atividade do TCC desfeito");
	}
}