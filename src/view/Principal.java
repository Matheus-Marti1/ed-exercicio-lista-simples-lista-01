package view;

import controller.InverterListaController;
import matheus.marti.generic.list.Lista;

public class Principal {

	public static void main(String[] args) {
		int[] valores = { 16, 4, 13, 2, 6, 7, 9, 12, 18, 5, 3 };
		Lista<Integer> lista = new Lista<>();
		InverterListaController inverterController = new InverterListaController();
		int tamanho = valores.length;
		for (int i = 0; i < tamanho; i++) {
			lista.addFirst(valores[i]);
		}
		
		int tamanhoLista = lista.size();
		System.out.println("Lista normal: ");
		for (int i = 0; i < tamanhoLista; i++) {
			try {
				System.out.print(lista.get(i) + " -> ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Lista invertida:");
		inverterController.inverter(lista);
		for (int i = 0; i < tamanhoLista; i++) {
			try {
				System.out.print(lista.get(i) + " -> ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
