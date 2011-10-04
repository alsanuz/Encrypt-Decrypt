import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class prueba {

	private JFrame frame;
	private JTextField keyText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
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
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 121, 95, 205, 94, 96, 138, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 46, 0, 0, 171, 44, -7, 169, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblMtodo = new JLabel("M\u00E9todo:");
		GridBagConstraints gbc_lblMtodo = new GridBagConstraints();
		gbc_lblMtodo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMtodo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtodo.gridx = 1;
		gbc_lblMtodo.gridy = 1;
		frame.getContentPane().add(lblMtodo, gbc_lblMtodo);
		
		JLabel lblClave = new JLabel("Clave:");
		GridBagConstraints gbc_lblClave = new GridBagConstraints();
		gbc_lblClave.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblClave.insets = new Insets(0, 0, 5, 5);
		gbc_lblClave.gridx = 3;
		gbc_lblClave.gridy = 1;
		frame.getContentPane().add(lblClave, gbc_lblClave);
		
		final JComboBox comboBoxMetodo = new JComboBox();
		comboBoxMetodo.setModel(new DefaultComboBoxModel(Method.values()));
		GridBagConstraints gbc_comboBoxMetodo = new GridBagConstraints();
		gbc_comboBoxMetodo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMetodo.anchor = GridBagConstraints.NORTH;
		gbc_comboBoxMetodo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMetodo.gridx = 1;
		gbc_comboBoxMetodo.gridy = 2;
		frame.getContentPane().add(comboBoxMetodo, gbc_comboBoxMetodo);
		
		keyText = new JTextField();
		GridBagConstraints gbc_keyText = new GridBagConstraints();
		gbc_keyText.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyText.anchor = GridBagConstraints.NORTH;
		gbc_keyText.insets = new Insets(0, 0, 5, 5);
		gbc_keyText.gridx = 3;
		gbc_keyText.gridy = 2;
		frame.getContentPane().add(keyText, gbc_keyText);
		keyText.setColumns(10);		
		
		JButton btnDescifrar = new JButton("Descifrar");
		GridBagConstraints gbc_btnDescifrar = new GridBagConstraints();
		gbc_btnDescifrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDescifrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnDescifrar.gridx = 5;
		gbc_btnDescifrar.gridy = 2;
		frame.getContentPane().add(btnDescifrar, gbc_btnDescifrar);
		
		JLabel lblTextEntrada = new JLabel("Texto de entrada:");
		GridBagConstraints gbc_lblTextEntrada = new GridBagConstraints();
		gbc_lblTextEntrada.anchor = GridBagConstraints.WEST;
		gbc_lblTextEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextEntrada.gridx = 1;
		gbc_lblTextEntrada.gridy = 4;
		frame.getContentPane().add(lblTextEntrada, gbc_lblTextEntrada);
		
		JScrollPane scrollPaneInput = new JScrollPane();
		scrollPaneInput.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneInput = new GridBagConstraints();
		gbc_scrollPaneInput.gridwidth = 6;
		gbc_scrollPaneInput.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneInput.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneInput.gridx = 1;
		gbc_scrollPaneInput.gridy = 5;
		frame.getContentPane().add(scrollPaneInput, gbc_scrollPaneInput);
		
		final JTextArea textAreaInput = new JTextArea();
		scrollPaneInput.setViewportView(textAreaInput);
		
		JButton btnImportar = new JButton("Importar");
		GridBagConstraints gbc_btnImportar = new GridBagConstraints();
		gbc_btnImportar.insets = new Insets(0, 0, 5, 5);
		gbc_btnImportar.gridx = 8;
		gbc_btnImportar.gridy = 5;
		frame.getContentPane().add(btnImportar, gbc_btnImportar);
		
		JLabel lblTextoDeSalida = new JLabel("Texto de salida:");
		GridBagConstraints gbc_lblTextoDeSalida = new GridBagConstraints();
		gbc_lblTextoDeSalida.anchor = GridBagConstraints.WEST;
		gbc_lblTextoDeSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextoDeSalida.gridx = 1;
		gbc_lblTextoDeSalida.gridy = 7;
		frame.getContentPane().add(lblTextoDeSalida, gbc_lblTextoDeSalida);
		
		JScrollPane scrollPaneOutput = new JScrollPane();
		scrollPaneOutput.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneOutput = new GridBagConstraints();
		gbc_scrollPaneOutput.gridwidth = 6;
		gbc_scrollPaneOutput.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneOutput.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneOutput.gridx = 1;
		gbc_scrollPaneOutput.gridy = 8;
		frame.getContentPane().add(scrollPaneOutput, gbc_scrollPaneOutput);
		
		JTextArea textAreaOutput = new JTextArea();
		scrollPaneOutput.setViewportView(textAreaOutput);
		
		JButton btnExportar = new JButton("Exportar");
		GridBagConstraints gbc_btnExportar = new GridBagConstraints();
		gbc_btnExportar.insets = new Insets(0, 0, 5, 5);
		gbc_btnExportar.gridx = 8;
		gbc_btnExportar.gridy = 8;
		frame.getContentPane().add(btnExportar, gbc_btnExportar);
		
		JButton btnCifrar = new JButton("Cifrar");
		btnCifrar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				Method method = (Method) comboBoxMetodo.getSelectedItem();
				int key = Integer.parseInt(keyText.getText()); // FALTA COMPROBAR
				String input = textAreaInput.getText();
				
				State s = State.getInstance();
				s.setInput(input);
				s.setKey(key);
				s.setMethod(method);			
				
				CommandEncrypt ce = new CommandEncrypt();
				ce.execute();
			}
		});
		GridBagConstraints gbc_btnCifrar = new GridBagConstraints();
		gbc_btnCifrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCifrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCifrar.gridx = 5;
		gbc_btnCifrar.gridy = 1;
		frame.getContentPane().add(btnCifrar, gbc_btnCifrar);
		
	}

}
