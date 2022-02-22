package com.jeanlima.springdemo;

public class SadPrevisaoDiaria implements PrevisaoDiaria {

	@Override
	public String getPrevisao() {
		return "Acho que vai chover hoje! :(";
	}

}
