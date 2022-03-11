package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import DAO.BakeryDAO;
import Vo.BakeryVo;

public class SellListUI {
	BakeryDAO dao = null;
	Vector<BakeryVo> Data = null;

	Object selllist[] = { "제품", "금액" };
	private JFrame f;
	private JButton b1, b2;
	private JTable t;

	public SellListUI() {

		dao = new BakeryDAO();
		Data = dao.SellList();

		f = new JFrame("판매현황");
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().setBackground(SystemColor.control);
		f.setBounds(600, 300, 400, 350);
		f.getContentPane().setLayout(null);
	//	f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);

		t = new JTable(dao.SellListArr(dao.SellList()), selllist);
		// t.setBounds(40, 20, 500, 200);

		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(40, 10, 300, 200);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		b1 = new JButton("제품별 판매현황");
		b1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		b1.setBackground(SystemColor.inactiveCaption);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CountListUI();
			}
		});
		b1.setBounds(40, 240, 130, 50);

		b2 = new JButton("확인");
		b2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		b2.setBackground(SystemColor.inactiveCaption);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b2.setBounds(210, 240, 130, 50);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(scrollPane);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new SellListUI();
	}
}