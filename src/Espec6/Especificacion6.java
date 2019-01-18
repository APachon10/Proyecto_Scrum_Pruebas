package Espec6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Especificacion6 extends JFrame {

	private JPanel contentPane;
	public Especificacion6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 460);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem Proyectos_Bar = new JMenuItem("Proyectos");
		menuBar.add(Proyectos_Bar);
		
		JMenuItem Users_Bar = new JMenuItem("Users");
		menuBar.add(Users_Bar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JInternalFrame internalFrame = new JInternalFrame("Login");
		internalFrame.setMaximizable(true);
		internalFrame.setClosable(true);
		internalFrame.setVisible(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(130)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(125, Short.MAX_VALUE)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
		);
		
		JLabel label_User = new JLabel("Usuario");
		
		JLabel lblPassword = new JLabel("Password");
		
		JTextArea textArea = new JTextArea();
		
		JTextArea textArea_1 = new JTextArea();
		
		JButton btnConectar = new JButton("Conectar");
		GroupLayout groupLayout = new GroupLayout(internalFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(123)
					.addComponent(btnConectar)
					.addContainerGap(129, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_User)
							.addGap(18)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_User)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(btnConectar)
					.addGap(20))
		);
		internalFrame.getContentPane().setLayout(groupLayout);
		contentPane.setLayout(gl_contentPane);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Especificacion6();
	}
}
