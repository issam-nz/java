package tablaAjedrez;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class tablaAjedrez {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		Color siguienteColor = Color.WHITE;
		
		p.setLayout(new GridLayout(8, 8));
		JLabel etiquetas[] = new JLabel[64];
		
		for (int i = 0; i < etiquetas.length; i++) {
			etiquetas[i] = new JLabel(String.valueOf(i+1), SwingConstants.CENTER);
			etiquetas[i].setForeground(Color.RED);
			
			if (i % 8 != 0) {
				if (siguienteColor == Color.WHITE) {
					siguienteColor = Color.BLACK;
				} else {
					siguienteColor = Color.WHITE;
				}
			}
			etiquetas[i].setBackground(siguienteColor);
			etiquetas[i].setOpaque(true);
			
			
			p.add(etiquetas[i]);
		}
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}
------------------------------------------
import java.awt.FlowLayout; //para usar el flow layout.


import javax.swing.*;
 
public class calsesNuevasVentanas_etc {

	public static void main(String[] args) {
		
		//Declarar
		
		JFrame f;
		JPanel p;
		JButton but1,but2,but3,but4,but5,but6;
		
		//el nuevo layout se puede usar de varias formas
		//o creando un objeto o haciendo esto --> p.setLayout(new FlowLayout);
		
		
		//Crear
		
		f = new JFrame();
		p = new JPanel();
		but1 = new JButton("Prueba1");
		but2 = new JButton("Prueba2");
		but3 = new JButton("Prueba3");
		but4 = new JButton("Prueba4");
		but5 = new JButton("Prueba5");
		but6 = new JButton("Prueba6");
		
		//Añadir
		
		f.add(p);
		p.add(but1);
		p.add(but2);
		p.add(but3);
		p.add(but4);
		p.add(but5);
		p.add(but6);
		
		//Dispo
		p.setLayout(new FlowLayout());;
		
		
	
		//Visualizar
		
		f.setSize(400, 400);
		f.setVisible(true);

	}

}
-----------------------------------------
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	
	public class calsesNuevasVentanas_etc2 {

		public static void main(String[] args) {
			
		
			
			//Declarar
			
			JFrame f;
			JPanel p;
			JButton but1,but2,but3,but4,but5;
			
			//el nuevo layout se puede usar de varias formas
			//o creando un objeto o haciendo esto --> p.setLayout(new FlowLayout);
			
			
			//Crear
			
			f = new JFrame();
			p = new JPanel();
			but1 = new JButton("Prueba1");
			but2 = new JButton("Prueba2");
			but3 = new JButton("Prueba3");
			but4 = new JButton("Prueba4");
			but5 = new JButton("Prueba5");
			
			//Si se usa este layout crear siempre antes de añadir.
			
			p.setLayout(new BorderLayout());
			
			f.add(p);
			p.add(but1,BorderLayout.NORTH);
			p.add(but2,BorderLayout.SOUTH);
			p.add(but3,BorderLayout.WEST);
			p.add(but4,BorderLayout.EAST);
			p.add(but5,BorderLayout.CENTER);
		
			
			
			
		
			//Visualizar
			
			f.setSize(400, 400);
			f.setVisible(true);
		}
	}

---------------------------
  

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class calsesNuevasVentanas_etc3 {
	public static void main(String[] args) {
		
		
		
		//Declarar
		
		JFrame f;
		JPanel p;
		JButton but1,but2,but3,but4,but5;
		
		//el nuevo layout se puede usar de varias formas
		//o creando un objeto o haciendo esto --> p.setLayout(new FlowLayout);
		
		
		//Crear
		
		f = new JFrame();
		p = new JPanel();
		but1 = new JButton("Prueba1");
		but2 = new JButton("Prueba2");
		but3 = new JButton("Prueba3");
		but4 = new JButton("Prueba4");
		but5 = new JButton("Prueba5");
		
		//En este layout se utilizan filas y columnas, primero filas y luego columnas.
		
		p.setLayout(new GridLayout(2,0));
		
		f.add(p);
		p.add(but1);
		p.add(but2);
		p.add(but3);
		p.add(but4);
		p.add(but5);
	
		
		
		
	
		//Visualizar
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

}

  
