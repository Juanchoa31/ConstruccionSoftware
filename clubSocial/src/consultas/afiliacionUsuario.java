package consultas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import clubSocial.menuPrincipal;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import clubSocial.Partner;

public class afiliacionUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdSocio;
	private JTextField txtNombreSocio;

	
	
	
	/**
	 * @param txtIdSocio
	 * @param txtNombreSocio
	 * @throws HeadlessException
	 */
	protected afiliacionUsuario(JTextField txtIdSocio, JTextField txtNombreSocio) throws HeadlessException {
		super();
		this.txtIdSocio = txtIdSocio;
		this.txtNombreSocio = txtNombreSocio;
	}

	/**
	 * Launch the application.
	 */
	ArrayList<Partner> socios = new ArrayList<Partner>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					afiliacionUsuario frame = new afiliacionUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public afiliacionUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\golf.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnAtras = new JButton("");
		btnAtras.setBounds(369, 211, 55, 39);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menuPrincipal menu = new menuPrincipal();
				dispose();
				menu.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtIdSocio.setText("");
				txtNombreSocio.setText("");
				//txtConsumo.setText("");

			}
		});
		btnCancelar.setBounds(367, 146, 57, 41);
		contentPane.add(btnCancelar);
		btnCancelar.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\eraser.png"));
		
		JButton btnAgregar = new JButton("");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Partner socio = new Partner();
				socio.setIdSocio(Integer.parseInt(txtIdSocio.getText().toString()));
				socio.setNombreSocio(txtNombreSocio.getName());
				//txtConsumo.setNombreSocio(txtNombreSocio.getText());
				//txtAutorizados.setNombreSocio(txtNombreSocio.getText());
				socios.add(socio);
				JOptionPane.showMessageDialog(null, "Se agregó");
				
			}
		});
		btnAgregar.setBounds(367, 94, 57, 41);
		contentPane.add(btnAgregar);
		btnAgregar.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\plus.png"));
		
		JPanel panelSocios = new JPanel();
		panelSocios.setBounds(10, 94, 347, 131);
		contentPane.add(panelSocios);
		panelSocios.setLayout(null);
		
		JLabel lblIdSocio = new JLabel("Identificación de socio.");
		lblIdSocio.setBounds(10, 14, 136, 14);
		panelSocios.add(lblIdSocio);
		
		txtIdSocio = new JTextField();
		txtIdSocio.setBounds(171, 11, 166, 20);
		panelSocios.add(txtIdSocio);
		txtIdSocio.setColumns(10);
		
		JLabel lblNombreSocio = new JLabel("Nombre de socio.");
		lblNombreSocio.setBounds(10, 45, 136, 14);
		panelSocios.add(lblNombreSocio);
		
		txtNombreSocio = new JTextField();
		txtNombreSocio.setColumns(10);
		txtNombreSocio.setBounds(171, 42, 166, 20);
		panelSocios.add(txtNombreSocio);
		
		JLabel lblConsumo = new JLabel("Consumo.");
		lblConsumo.setBounds(10, 73, 136, 14);
		panelSocios.add(lblConsumo);
		
		JLabel lblAutorizados = new JLabel("Autorizados.");
		lblAutorizados.setBounds(10, 101, 136, 14);
		panelSocios.add(lblAutorizados);
		
		JButton btnCrearAutorizados = new JButton("Agregar autorizados.");
		btnCrearAutorizados.setBounds(171, 101, 166, 23);
		panelSocios.add(btnCrearAutorizados);
		
		JButton btnAgregarConsumos = new JButton("Agregar consumos.");
		btnAgregarConsumos.setBounds(171, 69, 166, 23);
		panelSocios.add(btnAgregarConsumos);
		
		JLabel lblAfiliados = new JLabel("Afiliación de socio.");
		lblAfiliados.setFont(new Font("TeXGyreAdventor", Font.BOLD, 20));
		lblAfiliados.setBounds(10, 28, 212, 39);
		contentPane.add(lblAfiliados);
		btnAtras.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\left.png"));
		contentPane.add(btnAtras);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\countryLima.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
