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
import Vo.PwdsearchVo;

public class PwdsearchUI {
	private JFrame f;
	private JLabel lid, lnum;
	private JTextField id, prinum;
	private JButton b1, b2;
	public BakeryDAO dao;

	public PwdsearchUI() {

		dao = new BakeryDAO();

		f = new JFrame("PWD 찾기");
		f.setBounds(760, 360, 400, 200);
		f.getContentPane().setLayout(null);
	//	f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);

		lid = new JLabel("ID");
		lid.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		lid.setBounds(50, 20, 50, 20);
		lnum = new JLabel("생년월일(8자리)");
		lnum.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		lnum.setBounds(50, 80, 100, 20);

		id = new JTextField(20);
		id.setBounds(50, 40, 120, 25);
		prinum = new JTextField(20);
		prinum.setBounds(50, 100, 120, 25);

		b1 = new JButton("찾기");
		b1.setBackground(SystemColor.inactiveCaption);
		b1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		b1.setBounds(250, 40, 70, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(f, "ID를 입력해주세요", "오류", JOptionPane.WARNING_MESSAGE);
				} else if (prinum.getText().equals("")) {
					JOptionPane.showMessageDialog(f, "생년월일을 입력해주세요", "오류", JOptionPane.WARNING_MESSAGE);
				} else {
					ArrayList<PwdsearchVo> pwdlist = dao.pwdlist(id.getText());
					if (pwdlist.size() == 0) {
						JOptionPane.showMessageDialog(f, "ID 또는 생년월일이 잘못되었습니다", "오류", JOptionPane.WARNING_MESSAGE);
					} else {
						PwdsearchVo Data = (PwdsearchVo) pwdlist.get(0);
						int snum = Data.getNum();
						if (prinum.getText().equals(String.valueOf(snum))) {
							JOptionPane.showMessageDialog(f, "PWD는 " + Data.getPwd() + " 입니다", "확인",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(f, "ID 또는 생년월일이 잘못되었습니다", "오류", JOptionPane.WARNING_MESSAGE);
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

		f.getContentPane().add(lid);
		f.getContentPane().add(lnum);
		f.getContentPane().add(id);
		f.getContentPane().add(prinum);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new PwdsearchUI();
	}

}