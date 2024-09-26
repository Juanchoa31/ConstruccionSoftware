package clubSocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Socios extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Socios frame = new Socios();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public Socios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Volver...");
		btnNewButton.addActionListener((ActionEvent e) -> {
                    menuPrincipal menu = new menuPrincipal();
                    dispose();
                    menu.setVisible(true);
                });
		btnNewButton.setBounds(170, 95, 89, 23);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}

}
