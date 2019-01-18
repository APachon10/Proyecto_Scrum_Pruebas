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
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JMenu;

public class Especificacion6 extends JFrame {

	private JPanel contentPane;
	public Especificacion6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 529);
		
		JDesktopPane Panel = new JDesktopPane();
		Panel.setForeground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Panel, GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Panel, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setVisible(true);
		GroupLayout gl_Panel = new GroupLayout(Panel);
		gl_Panel.setHorizontalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addGap(164)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
		);
		gl_Panel.setVerticalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addGap(146)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(158, Short.MAX_VALUE))
		);
		Panel.setLayout(gl_Panel);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem Proyectos_Bar = new JMenuItem("Proyectos");
		menuBar.add(Proyectos_Bar);
		
		JMenuItem USer_Bar = new JMenuItem("Users");
		menuBar.add(USer_Bar);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Especificacion6();
	}
}
