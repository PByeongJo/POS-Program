package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.BakeryDAO;
import Vo.IdsearchVo;

public class IdsearchUI {
	private JFrame f;
	private JLabel lname, lprinum;
	private JTextField name, prinum;
	private JButton b1, b2;
	private BakeryDAO dao;

	public IdsearchUI() {

		dao = new BakeryDAO();

		f = new JFrame("ID 찾기");
		f.setBounds(760, 360, 400, 200);
		f.getContentPane().setLayout(null);
	//	f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);

		lname = new JLabel("이름");
		lname.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		lname.setBounds(50, 20, 50, 20);
		lprinum = new JLabel("생년월일(8자리)");
		lprinum.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		lprinum.setBounds(50, 80, 100, 20);

		name = new JTextField(20);
		name.setBounds(50, 40, 120, 25);
		prinum = new JTextField(20);
		prinum.setBounds(50, 100, 120, 25);

		b1 = new JButton("찾기");
		b1.setBackground(SystemColor.inactiveCaption);
		b1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		b1.setBounds(250, 40, 70, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (name.getText().equals("")) {
					JOptionPane.showMessageDialog(f, "이름을 입력해주세요", "오류", JOptionPane.WARNING_MESSAGE);
				} else if (prinum.getText().equals("")) {
					JOptionPane.showMessageDialog(f, "생년월일을 입력해주세요", "오류", JOptionPane.WARNING_MESSAGE);
				} else {
					ArrayList<IdsearchVo> idlist = dao.idlist(name.getText());
					if (idlist.size() == 0) {
						JOptionPane.showMessageDialog(f, "이름 또는 생년월일이 잘못되었습니다", "오류", JOptionPane.WARNING_MESSAGE);
					} else {
						IdsearchVo Data = (IdsearchVo) idlist.get(0);
						int snum = Data.getNum();
						if (prinum.getText().equals(String.valueOf(snum))) {
							JOptionPane.showMessageDialog(f, "ID는 " + Data.getId() + " 입니다", "확인",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(f, "이름 또는 생년월일이 잘못되었습니다", "오류", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});

		b2 = new JButton("확인");
		b2.setBackground(SystemColor.inactiveCaption);
		b2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		b2.setBounds(250, 90, 70, 30);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.getContentPane().add(lname);
		f.getContentPane().add(lprinum);
		f.getContentPane().add(name);
		f.getContentPane().add(prinum);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new IdsearchUI();
	}
}