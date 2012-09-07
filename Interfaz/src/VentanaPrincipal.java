import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class VentanaPrincipal extends JFrame  implements ActionListener{
	
	ImageIcon Fondo;
	JLabel fondo;
	JButton boton;
	private Container contenedor;
		
	public VentanaPrincipal(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
		boton=new JButton();
		Fondo = new ImageIcon("Imagenes/QR.jpg");
		fondo = new JLabel();
		
		fondo.setIcon(Fondo);
	   	fondo.setBounds(50,100,189,159);
	   	boton.setText("ARte Digital");
	    boton.setBounds(50, 300, 200, 50);
	    boton.addActionListener(this);
	    
	   
	    contenedor.add(boton);
	    contenedor.add(fondo);
	    setSize(300,500);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton)
		{
			VentanaDos ventana2=new VentanaDos();
			ventana2.setVisible(true);
		}
		
	}

}
