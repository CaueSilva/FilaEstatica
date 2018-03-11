package view;

import controller.FilaEstaticaMetodos;

import javax.swing.JOptionPane;

public class FilaEstaticaPrincipal {

	public static void main(String[] args) {

		FilaEstaticaMetodos f = new FilaEstaticaMetodos(3);
		int opc = 0, element = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog(" 1 - Adiciona " + "\n 2 - Remove " + "\n 3 - Percorre Fila " + "\n 9 - Fim"));
			switch (opc) {
			case 1:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				f.adiciona(element);
				break;
			case 2:
				f.removeInicio();
				break;
			case 3:
				System.out.println(f.toString());
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}

	}

}
