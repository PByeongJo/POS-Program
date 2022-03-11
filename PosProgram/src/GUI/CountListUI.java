package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import DAO.BakeryDAO;
import Vo.BakeryVo;

public class CountListUI {
	BakeryDAO dao = null;
	Vector<BakeryVo> Data = null;

	Object countlist[] = { "Á¦Ç°", "°³¼ö", "±Ý¾×" };
	private JFrame f;
	private JTable t;
	private JLabel l1 , l2;
	private JButton b1;

	public CountListUI() {
		dao = new BakeryDAO();
		Data = dao.CountList();

		f = new JFrame("Á¦Ç°º° ÆÇ¸ÅÇöÈ²");
		f.getContentPane().setBackground(SystemColor.control);
		f.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		f.setBounds(1000, 300, 400, 350);
		f.getContentPane().setLayout(null);
	//	f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);

		t = new JTable(dao.CountListArr(dao.CountList()), countlist);
		// t.setBounds(50, 20, 500, 200);

		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(40, 25, 300, 170);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		int sum = 0;
		for (int i = 0; i < Data.size(); i++) {
			sum += Data.get(i).getPrice2();
		}
		l1 = new JLabel();
		l1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		l1.setText("Today : " + Integer.toString(sum) + "¿ø ÀÔ´Ï´Ù");
		l1.setBounds(40, 245, 200, 25);
		
		l2 = new JLabel();
		l2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		LocalDate now = LocalDate.now();
		l2.setText(now+"");
		l2.setBounds(40,220,200,25);
		
		

		b1 = new JButton("È®ÀÎ");
		b1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		b1.setBackground(SystemColor.inactiveCaption);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b1.setBounds(240, 220, 100, 50);

		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(scrollPane);
		f.getContentPane().add(b1);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new CountListUI();
	}
}