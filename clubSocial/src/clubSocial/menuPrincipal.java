package clubSocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        menuPrincipal frame = new menuPrincipal();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public menuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\golf.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnConsumo = new JButton("Consumos");
		btnConsumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consumos consumo = new consumos();
				dispose();
				consumo.setVisible(true);
				
			}
		});
		btnConsumo.setFont(new Font("Arial", Font.BOLD, 15));
		btnConsumo.setBounds(86, 282, 308, 57);
		contentPane.add(btnConsumo);
		
		JButton btnSocios = new JButton("Socios");
		btnSocios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Socios socio = new Socios();
				dispose();
				socio.setVisible(true);
				
			}
		});
		btnSocios.setFont(new Font("Arial", Font.BOLD, 15));
		btnSocios.setBounds(86, 190, 308, 57);
		contentPane.add(btnSocios);
		
		JButton btnClub = new JButton("Club Social");
		btnClub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clubSocial club = new clubSocial();
				dispose();
				club.setVisible(true);
				
			}
		});
		btnClub.setFont(new Font("Arial", Font.BOLD, 15));
		btnClub.setBounds(86, 107, 308, 57);
		contentPane.add(btnClub);
		
		JLabel lblNewLabel_1 = new JLabel("Menú Principal");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("TeXGyreAdventor", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(107, 23, 253, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("P:\\Desktop\\Universidad\\Semestre #2\\Construcción de software 1\\Proyectos en clase\\clubSocial\\Contenido\\countryLima.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 472, 429);
		contentPane.add(lblNewLabel);
	}
}
