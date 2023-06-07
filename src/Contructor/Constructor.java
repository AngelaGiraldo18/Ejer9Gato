package Contructor;

import javax.swing.JOptionPane;

public class Constructor {
	private String raza;
	private String color;
	private double peso;
	private int edad;
	private int identidad;
	
	public void setRaza(String raza) {
		this.raza=raza;
	}
	public void setColor(String color) {
		this.color=color;
		}
	public void setPeso(double peso) {
		this.peso=peso;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setIdentificacion(int identidad) {
		this.identidad=identidad;
	}
	public String getRaza() {
		return raza;
	}
	public String getColor() {
		return color;
	}
	public double getPeso() {
		return peso;
	}
	public int getEdad() {
		return edad;
	}
	public int getIdentidad() {
		return identidad;
	}
	
	public void Pedir() {
		raza = JOptionPane.showInputDialog("Ingrese la raza de su gato");
		color= JOptionPane.showInputDialog("Ingresa el color del pelaje de su gato");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de su mascota"));
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de su mascota"));
		identidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la identidad de su mascota"));
	}
	public void imprimir () {
		JOptionPane.showMessageDialog(null, "la raza del gato es: "+raza+"\n"+"el color de el cato es: "+color+"\n"
				+"el peso de tu gato es: "+peso+"\n"+"la edad de tugato es: "+edad+"\n"+"la identificacion de tu gatico es: "+identidad);
	}
	
	public void acciones(){
		int menu;
		do {
			String menuGato= JOptionPane.showInputDialog(
					"ACCIONES DE TU GATO \n"+
					"1. maullido \n"+
					"2.alimentarse \n"+
					"3.lamerse \n"+
					"4.dormir \n"+
					"5.dejar tu gato quieto para que no te aruñe *muy buena opcion*");
			menu = Integer.parseInt(menuGato);
			
			switch (menu) {
			case 1:
				String gatoMaullido =
                "   /\\_/\\\n" +
                " ( o.o )\n" +
                "  > ^ <";

				JOptionPane.showMessageDialog(null, gatoMaullido, "Gato Maullando", JOptionPane.PLAIN_MESSAGE);
				break;
			case 2:
				 String gatoComiendo =
	                "   /\\_/\\\n" +
	                " ( o.o )\n" +
	                "  > ^ <\n" +
	                "Nom nom nom...";

				 JOptionPane.showMessageDialog(null, gatoComiendo, "Gato Comiendo", JOptionPane.PLAIN_MESSAGE);
				break;
			case 3:
				String gatoLamiendose =
                "   /\\_/\\\n" +
                " ( o.o )\n" +
                "  > ^ <\n" +
                "  /\\___/\\ \n" +
                "Lamiendo...";

				JOptionPane.showMessageDialog(null, gatoLamiendose, "Gato Lamiéndose", JOptionPane.PLAIN_MESSAGE);
				break;
			case 4:
				 String gatoDurmiendo =
	                "   /\\_/\\\n" +
	                " ( -.- )\n" +
	                "  > ^ <\n" +
	                "Zzzzzzz...";

				 JOptionPane.showMessageDialog(null, gatoDurmiendo, "Gato Durmiendo", JOptionPane.PLAIN_MESSAGE);
				break;
			case 5:
				 String gatoMolesto =
	                "   /\\_/\\\n" +
	                " ( >_< )\n" +
	                "  > ^ <\n" +
	                "  \\   /\n" +
	                " / | |\\" +
	                "|  |  |\n" +
	                "¡Grrrrr!";

				 JOptionPane.showMessageDialog(null, gatoMolesto, "Gato Molesto", JOptionPane.PLAIN_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "El gato no hace esas acciones");
				break;
			}
			
		} while (menu != 5);
	}
}
