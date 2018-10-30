import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class grafiquita {

	private JFrame frame;
	private JTextField TxtValor1;
	private JTextField TxtValor2;
	private JTextField Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					grafiquita window = new grafiquita();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public grafiquita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngreseElPrimer = new JLabel("Ingrese el primer valor");
		lblIngreseElPrimer.setBounds(10, 11, 114, 14);
		frame.getContentPane().add(lblIngreseElPrimer);
		
		TxtValor1 = new JTextField();
		TxtValor1.setBounds(177, 8, 86, 20);
		frame.getContentPane().add(TxtValor1);
		TxtValor1.setColumns(10);
		
		JLabel lblIngreseElSegundo = new JLabel("Ingrese el segundo valor");
		lblIngreseElSegundo.setBounds(10, 49, 133, 14);
		frame.getContentPane().add(lblIngreseElSegundo);
		
		TxtValor2 = new JTextField();
		TxtValor2.setColumns(10);
		TxtValor2.setBounds(177, 46, 86, 20);
		frame.getContentPane().add(TxtValor2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int v1 = Integer.parseInt(TxtValor1.getText());
				int v2 = Integer.parseInt(TxtValor2.getText());
				
				int suma = v1+v2;
				
				TxtResultado.setText(String.valueOf(suma));
				
			}
		});
		btnSumar.setBounds(10, 174, 89, 23);
		frame.getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setBounds(109, 174, 89, 23);
		frame.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMultiplicar.setBounds(231, 174, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(330, 174, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		Resultado = new JTextField();
		Resultado.setEditable(false);
		Resultado.setBounds(177, 103, 86, 20);
		frame.getContentPane().add(Resultado);
		Resultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(46, 106, 53, 14);
		frame.getContentPane().add(lblResultado);
	}
}
