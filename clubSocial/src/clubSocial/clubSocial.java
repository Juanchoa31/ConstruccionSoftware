package clubSocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import consultas.afiliacionUsuario;

public class clubSocial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clubSocial frame = new clubSocial();
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
	public clubSocial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\golf.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\izquierda.png"));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menuPrincipal menu = new menuPrincipal();
				dispose();
				menu.setVisible(true);
			}
		});
		
		JButton btnConsultarUsuario = new JButton("Check user.");
		btnConsultarUsuario.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\searchUser.png"));
		btnConsultarUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnConsultarUsuario.setBounds(129, 187, 197, 33);
		contentPane.add(btnConsultarUsuario);
		
		JButton btnEliminarUsuario = new JButton("Delete user.");
		btnEliminarUsuario.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\deleteUser.png"));
		btnEliminarUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnEliminarUsuario.setBounds(129, 127, 197, 33);
		contentPane.add(btnEliminarUsuario);
		
		JButton btnAgregarUsuario = new JButton("Affiliate user.");
		btnAgregarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				afiliacionUsuario afiliacion = new afiliacionUsuario();
				dispose();
				afiliacion.setVisible(true);
				
			}
		});
		btnAgregarUsuario.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\addUser.png"));
		btnAgregarUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnAgregarUsuario.setBounds(129, 68, 197, 33);
		contentPane.add(btnAgregarUsuario);
		btnAtras.setBounds(369, 211, 55, 39);
		contentPane.add(btnAtras);
		
		JLabel lblNewLabel = new JLabel("Club Social");
		lblNewLabel.setFont(new Font("TeXGyreAdventor", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 164, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\countryLima.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
		setLocationRelativeTo(null);
	}
}
