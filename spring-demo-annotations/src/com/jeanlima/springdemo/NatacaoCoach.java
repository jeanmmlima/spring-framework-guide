package com.jeanlima.springdemo;

public class NatacaoCoach implements Coach {
	
	private PrevisaoDiaria previsaoDiaria;
	
	public NatacaoCoach(PrevisaoDiaria previsaoDiaria) {
		this.previsaoDiaria = previsaoDiaria;
	}

	@Override
	public String getTreinoDiario() {
		return "Praticar nado borboleta";
	}

	@Override
	public String getPrevisaoDiaria() {
		return previsaoDiaria.getPrevisao();
	}

}
