package com.jeanlima.springdemo;

/*
public class FutebolCoach {
	
	public String getTreinoDiario() {
		return "Passar 30 minutos treinando chute de média distância";
	}

}
*/

public class FutebolCoach implements Coach{
	
	//definir campo para dependencia
	private SorteService sorteService;
	
	public FutebolCoach() {
		
	}
	
	/*
	 * INJEÇÃO DE CONSTRUTOR
	 * definir construtor para injeção de dependencia
	*/ 
	public FutebolCoach(SorteService _sorteService) {
		sorteService = _sorteService;
	}
	
	@Override
	public String getTreinoDiario() {
		return "Passar 30 minutos treinando chute de média distância";
	}

	@Override
	public String getSorteDiaria() {
		
		return sorteService.getSorte();
	}
	
	/**
	 * método para iniciar o BEAN
	 */
	public void doMyStartupStuff() {
		System.out.println("FutebolCoach: dentro do metodo para fazer coisas no inicio");
	}
	
	/**
	 * método para destruir o BEAN
	 */
	public void doMyCleanupStuff() {
		System.out.println("FutebolCoach: dentro do metodo para fazer coisas no fim");
	}

}

