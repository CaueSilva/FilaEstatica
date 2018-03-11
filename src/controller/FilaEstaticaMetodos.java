package controller;

public class FilaEstaticaMetodos {
	private int dados[];
	private int tamanho;

	public FilaEstaticaMetodos (int c) {
        dados = new int [c];
        tamanho = 0;
    }

	public void adiciona(int e) {
		if (tamanho == dados.length) {
			System.out.println("Erro! Lista cheia.");
		} else {
			dados[tamanho] = e;
			tamanho++;
		}
	}

	public int removeInicio() {
		int r = -1;
		if (tamanho == 0) {
			System.out.println("Erro! Lista vazia.");
		} else {
			r = dados[0];
			for (int i = 1; i < tamanho; i++) {
				dados[i - 1] = dados[i];
			}
			tamanho--;
			System.out.println("Item " + r + " removido.");
		}
		return r;
	}

	public String toString() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + " " + dados[i];
		}
		return r;
	}

}
