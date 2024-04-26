package controller;

import matheus.marti.generic.list.Lista;

public class InverterListaController {

	public InverterListaController() {
		super();
	}
	
	public void inverter(Lista<Integer> lista) {
		Lista<Integer> aux = new Lista<>();
		while (!lista.isEmpty()) {
			try {
				aux.addFirst(lista.get(0));
				lista.removeFirst();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while (!aux.isEmpty()) {
			int tamanho = aux.size();
			try {
				lista.addFirst(aux.get(tamanho - 1));
				aux.removeLast();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
