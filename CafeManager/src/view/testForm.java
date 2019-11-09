package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class testForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testForm frame = new testForm();
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
	public testForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 378);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 505, 339);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Doanh thu", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnT = new JTextPane();
		txtpnT.setBackground(UIManager.getColor("Panel.background"));
		txtpnT.setText("Từ");
		txtpnT.setBounds(24, 11, 19, 20);
		panel.add(txtpnT);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(53, 11, 121, 20);
		panel.add(comboBox);
		
		JTextPane txtpnn = new JTextPane();
		txtpnn.setBackground(UIManager.getColor("Panel.background"));
		txtpnn.setText("Đến");
		txtpnn.setBounds(194, 11, 32, 20);
		panel.add(txtpnn);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(239, 11, 121, 20);
		panel.add(comboBox_1);
		
		JButton btnThngK = new JButton("Thống kê");
		btnThngK.setBounds(389, 11, 89, 23);
		panel.add(btnThngK);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Món", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane txtpnMnaThch = new JTextPane();
		txtpnMnaThch.setBackground(UIManager.getColor("Panel.background"));
		txtpnMnaThch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnMnaThch.setEditable(false);
		txtpnMnaThch.setText("Món ưa thích");
		txtpnMnaThch.setBounds(75, 29, 120, 20);
		panel_1.add(txtpnMnaThch);
		
		JTextPane txtpnMntThch = new JTextPane();
		txtpnMntThch.setText("Món ít thích");
		txtpnMntThch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnMntThch.setEditable(false);
		txtpnMntThch.setBackground(SystemColor.menu);
		txtpnMntThch.setBounds(298, 29, 120, 20);
		panel_1.add(txtpnMntThch);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
