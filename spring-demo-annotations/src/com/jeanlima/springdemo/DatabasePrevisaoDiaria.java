package com.jeanlima.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabasePrevisaoDiaria implements PrevisaoDiaria {

	@Override
	public String getPrevisao() {
		return "Minha base de dados está cheia de energia hoje!";
	}

}
