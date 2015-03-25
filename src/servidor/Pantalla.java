package servidor;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextPane;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextPane jTextPanePantalla = null;

	/**
	 * This is the default constructor
	 */
	public Pantalla() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(740, 203);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Ardu.jpg")));
		this.setContentPane(getJContentPane());
		this.setTitle("Pantalla");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(0, 102, 0));
			jContentPane.add(getJTextPanePantalla(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextPanePantalla	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	public JTextPane getJTextPanePantalla() {
		if (jTextPanePantalla == null) {
			jTextPanePantalla = new JTextPane();
			jTextPanePantalla.setBounds(new Rectangle(14, 21, 691, 119));
			jTextPanePantalla.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 24));
			jTextPanePantalla.setBackground(new Color(51, 51, 255));
			jTextPanePantalla.setForeground(Color.WHITE);
			jTextPanePantalla.setEditable(false);
		}
		return jTextPanePantalla;
	}
	public void setPantalla(String texto){
		
		jTextPanePantalla.setText(texto);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
