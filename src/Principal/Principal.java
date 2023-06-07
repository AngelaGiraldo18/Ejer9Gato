package Principal;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import Contructor.Constructor;

public class Principal {

	public static void main(String[] args) {
		HashMap<Integer, Constructor> objetoGato = new HashMap<Integer, Constructor>();
		
		//metoco el 9 osea el gato
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("INgrese el numero de gatos"));
		Constructor gato = new Constructor();
		for (int i = 0; i < n; i++) {
			gato.Pedir();
			objetoGato.put(gato.getIdentidad(), gato);
		}
		
		int menuGato;
		do {
			String menu = JOptionPane.showInputDialog("MENU GATO \n"+
					"1.consulatar solo un gato \n"+
					"2.consultar todos los gatos \n"+
					"3.Jugar con el gato \n"+
					"4.salir");
			menuGato = Integer.parseInt(menu);
			switch (menuGato) {
			case 1:
				consultarGato(objetoGato);
				break;
			case 2:
				consultarGatos(objetoGato);
				break;
			case 3:
				gato.acciones();
				break;
			default:
				break;
			}
			
			
		} while (menuGato != 4);

	}
	
	public static void consultarGato (HashMap<Integer, Constructor> objetoGato){
		int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la identificacion de su gato"));
		
		Constructor gato = objetoGato.get(identificacion);
		
		if (gato != null) {
			gato.imprimir();
		}else {
			JOptionPane.showMessageDialog(null, "la identificacion del gato no es correcta");
		}
	}
	
	public static void consultarGatos (HashMap<Integer, Constructor> objetoGato) {
		StringBuilder tGatos = new StringBuilder("Todos los gatos: \n");
		
	for (Entry<Integer, Constructor> entry : objetoGato.entrySet()) {
		Constructor gato = entry.getValue();
		tGatos.append("ID: ").append(entry.getKey()).append("\n")
        .append("Raza: ").append(gato .getRaza()).append("\n")
        .append("Color: ").append(gato .getColor()).append("\n")
        .append("Peso: ").append(gato .getPeso()).append("\n")
        .append("Edad: ").append(gato .getEdad()).append("\n")
        .append("---------------------\n");
	}
	JOptionPane.showMessageDialog(null, tGatos.toString());
	}

}
