package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DAO.BakeryDAO;
import Vo.BakeryVo;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class SettingUI {
	private JFrame f;
	private JButton b1, b2, b3, b4;

	public SettingUI() {

		BakeryDAO dao = new BakeryDAO();
		Vector<BakeryVo> Data = dao.CountList();

		f = new JFrame();
		f.setTitle("°ü¸®");
		f.getContentPane().setBackground(new Color(204, 255, 255));
		f.setBounds(650, 200, 600, 600);
		f.getContentPane().setLayout(null);

		b1 = new JButton("Àç°í°ü¸®");
		b1.setBackground(SystemColor.inactiveCaption);
		b1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 17));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InvenUIUP();
			}
		});
		b1.setBounds(150, 80, 300, 100);
		b2 = new JButton("ÆÇ¸ÅÇöÈ²");
		b2.setBackground(SystemColor.inactiveCaption);
		b2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 17));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SellListUI();
			}
		});
		b2.setBounds(150, 180, 300, 100);

		int sum = 0;
		for (int i = 0; i < Data.size(); i++) {
			sum += Data.get(i).getPrice2();
		}
		String x = Integer.toString(sum);

		b3 = new JButton("Á¤»ê");
		b3.setBackground(SystemColor.inactiveCaption);
		b3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 17));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDate now = LocalDate.now();
				JOptionPane.showMessageDialog(f, now + " \n" + "Á¤»ê±Ý¾×Àº " + x + "¿øÀÔ´Ï´Ù", "È®ÀÎ",
						JOptionPane.INFORMATION_MESSAGE);
				dao.reset(null);
				f.dispose();
				new SettingUI();
			}
		});
		b3.setBounds(150, 280, 300, 100);
		b4 = new JButton("Home");
		b4.setBackground(SystemColor.inactiveCaption);
		b4.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 17));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new StartUI();
			}
		});
		b4.setBounds(150, 380, 300, 100);
		f.setVisible(true);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);

	}

	public static void main(String[] args) {
		new SettingUI();
	}
}