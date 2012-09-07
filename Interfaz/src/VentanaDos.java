import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class VentanaDos extends JFrame  implements ActionListener{
	
	JButton boton;
	JButton boton2;
	JButton boton3;
	
	private Container contenedor;
		
	public VentanaDos(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
		boton =new JButton();
		boton2 = new JButton();
		boton3 =new JButton();
		
		   
		 boton.setText("Escanear");
		 boton.setBounds(50, 100, 200, 50);
		 boton.addActionListener(this);
	        
		 boton2.setText("Guardar Imagen");
		 boton2.setBounds(50, 200, 200, 50);
		 boton2.addActionListener(this);
		 
		 boton3.setText("Salir");
		 boton3.setBounds(50, 300, 200, 50);
		 boton3.addActionListener(this);
		 
	    contenedor.add(boton);
	    contenedor.add(boton2);
	    contenedor.add(boton3);
	    setSize(300,500);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton3)
		{
			System.exit(0);
		}
	}

}
