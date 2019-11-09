package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame{
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 378);
		this.setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 183, 21);
		contentPane.add(menuBar);
		
		JMenu mnFind = new JMenu("T\u00ECm ki\u1EBFm");
		mnFind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Find find = new Find();
				find.setVisible(true);
			}
		});
		menuBar.add(mnFind);
		
		JMenu mnStat = new JMenu("Th\u1ED1ng k\u00EA");
		mnStat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		menuBar.add(mnStat);
		
		JMenu mnStaff = new JMenu("Nh\u00E2n vi\u00EAn");
		mnStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		menuBar.add(mnStaff);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Panel.background"));
		panel.setBounds(1, 25, 211, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cbCategory = new JComboBox();
		cbCategory.setBounds(78, 11, 114, 20);
		panel.add(cbCategory);
		
		JTextPane txtpnLoi = new JTextPane();
		txtpnLoi.setBounds(10, 11, 58, 20);
		panel.add(txtpnLoi);
		txtpnLoi.setBackground(UIManager.getColor("Panel.background"));
		txtpnLoi.setEditable(false);
		txtpnLoi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLoi.setText("Lo\u1EA1i:");
		
		JTextPane txtpnMn = new JTextPane();
		txtpnMn.setBounds(10, 41, 58, 20);
		panel.add(txtpnMn);
		txtpnMn.setBackground(UIManager.getColor("Panel.background"));
		txtpnMn.setEditable(false);
		txtpnMn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMn.setText("M\u00F3n:");
		
		JComboBox cbFood = new JComboBox();
		cbFood.setBounds(78, 39, 114, 20);
		panel.add(cbFood);
		
		JButton btnThmMn = new JButton("Th\u00EAm m\u00F3n");
		btnThmMn.setBounds(78, 70, 114, 23);
		panel.add(btnThmMn);
		
		JButton btnGimGi = new JButton("Gi\u1EA3m gi\u00E1");
		btnGimGi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnGimGi.setBounds(10, 105, 120, 23);
		panel.add(btnGimGi);
		
		JButton btnChuynnBn = new JButton("Chuy\u1EC3n \u0111\u1EBFn");
		btnChuynnBn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnChuynnBn.setBounds(10, 139, 120, 23);
		panel.add(btnChuynnBn);
		
		JSpinner spDiscount = new JSpinner();
		spDiscount.setBounds(146, 105, 46, 20);
		panel.add(spDiscount);
		
		JComboBox cbSwitchTable = new JComboBox();
		cbSwitchTable.setBounds(140, 139, 52, 20);
		panel.add(cbSwitchTable);
		
		JTextPane txtpnTngTin = new JTextPane();
		txtpnTngTin.setBackground(UIManager.getColor("Panel.background"));
		txtpnTngTin.setEditable(false);
		txtpnTngTin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtpnTngTin.setText("T\u1ED5ng ti\u1EC1n");
		txtpnTngTin.setBounds(53, 176, 88, 28);
		panel.add(txtpnTngTin);
		
		JTextField tfTotal = new JTextField();
		tfTotal.setText("0");
		tfTotal.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tfTotal.setBounds(53, 215, 86, 20);
		panel.add(tfTotal);
		tfTotal.setColumns(10);
		
		JButton btnPayment = new JButton("Thanh to\u00E1n");
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPayment.setBounds(24, 241, 146, 48);
		panel.add(btnPayment);
		
		JSpinner spCount = new JSpinner();
		spCount.setBounds(10, 72, 52, 20);
		panel.add(spCount);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(216, 25, 294, 304);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(516, 25, 253, 304);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTable1 = new JButton("B\u00E0n 1");
		btnTable1.setBounds(10, 11, 76, 59);
		panel_2.add(btnTable1);
		
		JButton btnTable2 = new JButton("B\u00E0n 2");
		btnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTable2.setBounds(90, 11, 76, 59);
		panel_2.add(btnTable2);
		
		JButton btnTable3 = new JButton("B\u00E0n 3");
		btnTable3.setBounds(170, 11, 76, 59);
		panel_2.add(btnTable3);
		
		JButton btnTable6 = new JButton("B\u00E0n 6");
		btnTable6.setBounds(170, 81, 76, 59);
		panel_2.add(btnTable6);
		
		JButton btnTable5 = new JButton("B\u00E0n 5");
		btnTable5.setBounds(90, 81, 76, 59);
		panel_2.add(btnTable5);
		
		JButton btnTable4 = new JButton("B\u00E0n 4");
		btnTable4.setBounds(10, 81, 76, 59);
		panel_2.add(btnTable4);
		
		JButton btnTable9 = new JButton("B\u00E0n 9");
		btnTable9.setBounds(170, 151, 76, 59);
		panel_2.add(btnTable9);
		
		JButton btnTable8 = new JButton("B\u00E0n 8");
		btnTable8.setBounds(90, 151, 76, 59);
		panel_2.add(btnTable8);
		
		JButton btnTable7 = new JButton("B\u00E0n 7");
		btnTable7.setBounds(10, 151, 76, 59);
		panel_2.add(btnTable7);
		
		JButton btnTable12 = new JButton("B\u00E0n 12");
		btnTable12.setBounds(170, 221, 76, 59);
		panel_2.add(btnTable12);
		
		JButton btnTable11 = new JButton("B\u00E0n 11");
		btnTable11.setBounds(90, 221, 76, 59);
		panel_2.add(btnTable11);
		
		JButton btnTable10 = new JButton("B\u00E0n 10");
		btnTable10.setBounds(10, 221, 76, 59);
		panel_2.add(btnTable10);
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
