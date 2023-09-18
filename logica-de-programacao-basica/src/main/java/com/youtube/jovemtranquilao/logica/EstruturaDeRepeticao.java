package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
	public static void main(String[] args) {
		//listadePalavras();
		//forClassico();
		//forPuro();
		inverteString();
	}

	private static void listadePalavras() {
		ArrayList<String> palavraList = new ArrayList<>();
		
		palavraList.add("Zumba");
		palavraList.add("Games");
		palavraList.add("Jose");
		palavraList.add("Lucas");
		
		for(String palavra : palavraList) {
			System.out.println(palavra);
		}
		
		palavraList.forEach(palavra -> System.out.println(palavra));
	}
	
	private static void forClassico() {
		ArrayList<String> palavraList = new ArrayList<>();
		
		palavraList.add("Zumba");
		palavraList.add("Games");
		palavraList.add("Jose");
		palavraList.add("Lucas");
		
		for(int posicao = 1; posicao<palavraList.size(); posicao = posicao + 2) {
			System.out.println(palavraList.get(posicao));
		}
		
	}
	
	private static void forPuro() {
		
		for(int posicao = 0; posicao <= 10; posicao = posicao + 1) {
			System.out.println(posicao);
		}
		
	}
	
	private static void inverteString() {
		String normal = "12345";
		
		String invertida = "";
		
		for(int posicao = normal.length() - 1; posicao >= 0 ; posicao = posicao - 1) {
			invertida = invertida + normal.charAt(posicao);
		}
		
		System.out.println(invertida);
		
	}
	
	
}
