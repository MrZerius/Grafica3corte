import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField pantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 346, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		boton1.setBounds(26, 178, 49, 23);
		frame.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(101, 178, 49, 23);
		frame.getContentPane().add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(179, 178, 49, 23);
		frame.getContentPane().add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(26, 144, 49, 23);
		frame.getContentPane().add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(101, 144, 49, 23);
		frame.getContentPane().add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(179, 144, 49, 23);
		frame.getContentPane().add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setBounds(26, 110, 49, 23);
		frame.getContentPane().add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(101, 110, 49, 23);
		frame.getContentPane().add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(179, 110, 49, 23);
		frame.getContentPane().add(boton9);
		
		pantalla = new JTextField();
		pantalla.setBounds(26, 35, 277, 38);
		frame.getContentPane().add(pantalla);
		pantalla.setColumns(10);
		
		JButton suma = new JButton("+");
		suma.setBounds(254, 110, 49, 23);
		frame.getContentPane().add(suma);
		
		JButton resta = new JButton("-");
		resta.setBounds(254, 144, 49, 23);
		frame.getContentPane().add(resta);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setBounds(254, 178, 49, 23);
		frame.getContentPane().add(multiplicacion);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		division.setBounds(254, 216, 49, 23);
		frame.getContentPane().add(division);
		
		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
			}
		});
		boton0.setBounds(26, 216, 49, 23);
		frame.getContentPane().add(boton0);
		
		JButton igual = new JButton("=");
		igual.setBounds(101, 216, 127, 23);
		frame.getContentPane().add(igual);
	}

}
