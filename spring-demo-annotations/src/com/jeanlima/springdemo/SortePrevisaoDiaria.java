package com.jeanlima.springdemo;

import org.springframework.stereotype.Component;

@Component //bean
public class SortePrevisaoDiaria implements PrevisaoDiaria {

	@Override
	public String getPrevisao() {
		return "Hoje é seu dia de sorte! Pra cima!";
	}

}
