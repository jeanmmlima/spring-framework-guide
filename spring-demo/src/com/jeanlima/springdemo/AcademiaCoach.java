package com.jeanlima.springdemo;

public class AcademiaCoach implements Coach {

	// definir campo para dependencia
	private SorteService sorteService;

	/*
	 * INJEÇÃO DE CONSTRUTOR
	 * definir construtor para injeção de dependencia
	*/
	public AcademiaCoach(SorteService _sorteService) {
			sorteService = _sorteService;
		}

	@Override
	public String getTreinoDiario() {
		return "Treine peito e depois 20 minutos de cardio";
	}

	@Override
	public String getSorteDiaria() {
		// TODO Auto-generated method stub
		return "Sua sorte é: "+sorteService.getSorte();
	}

}
