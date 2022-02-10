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

}

