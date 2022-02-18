package com.jeanlima.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomPrevisaoDiaria implements PrevisaoDiaria {
	
	//array de strings
	private String[] data = {
			"Cuidado com lobo em pele de cordeiro",
			"Diligência é a mãe da boa sorte",
			"A jornada é a recompensa!"
	};
	
	//gerando num aleatorio
	
	private Random mRand = new Random();

	@Override
	public String getPrevisao() {
		
		int index = mRand.nextInt(data.length);
		String previsao = data[index];
		
		return previsao;
	}

}
