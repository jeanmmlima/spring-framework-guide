package com.jeanlima.springdemo;

public class CrossfitCoach implements Coach {
	
	//campos para injeção de valores literais
	private String email;
	private String box;
	
	private SorteService sorteService;
	
	//no-arg constructor
	public CrossfitCoach() {
		System.out.println("crossfit coach: no-arg constructor");
	}
	
	/*
	 * INJEÇÃO VIA MÉTODO SETTER
	 * setter para injetar a dependencia
	 */
	
	public void setSorteService(SorteService sorteService) {
		System.out.println("crossfit coach: dentro do método setter");
		this.sorteService = sorteService;
	}
	

	/*
	 * INJEÇÃO DE VALORES LITERAIS VIA SETTER
	 * 
	 */
	public void setEmail(String email) {
		System.out.println("injeção de literal do email");
		this.email = email;
	}

	public void setBox(String box) {
		System.out.println("injeção de literal do box");
		this.box = box;
	}

	public String getEmail() {
		return email;
	}

	public String getBox() {
		return box;
	}

	@Override
	public String getTreinoDiario() {
		return "Wod hoje é o Murph!";
	}

	@Override
	public String getSorteDiaria() {
		return sorteService.getSorte();
	}
	
	

}
