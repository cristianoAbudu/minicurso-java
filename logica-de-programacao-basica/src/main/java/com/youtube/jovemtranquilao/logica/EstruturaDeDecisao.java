package com.youtube.jovemtranquilao.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
    	numeroPar(); // GOTO 16
    	stringIgual();
    	stringInicia();
    	datas();
    }

	private static void numeroPar() {
		Integer numero = 3;
    	
        if(numero % 2 == 0){
            // executo codigo daqui verdadeiro
            System.out.println("par");
        }else{
            // executo aqui quando falso
            System.out.println("impar");
        } // GOTO 10
	}
	
	private static void stringIgual() {
		String frase = "Hoje é segunda feira nove da manha";
		
		if(frase.contains("segunda feira")){
			if(frase.contains("seis da tarde")) {
				System.out.println("hora de alegria");
			}else {
				System.out.println("dia de tristeza");
			}
		}else if(
			frase.contains("sexta feira")
				||
			frase.contains("sábado")
				||
			frase.contains("domingo")
		){
			System.out.println("dia de alegria");
		}else{
			System.out.println("dia normal");
		}
	}
	
	private static void stringInicia() {
		String palavra = "bobeira";
		
		if(palavra.startsWith("a")){
			System.out.println("palavra iniciada em a");
		}else{
			System.out.println("palavra iniciada com outra letra");
		}
	}
	
	private static void datas() throws ParseException {
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2103");
		
		if(!data.before(new Date())){
			System.out.println("esse dia esta por vir");
		}else{
			System.out.println("esse dia já passou");
		}
	}
}
