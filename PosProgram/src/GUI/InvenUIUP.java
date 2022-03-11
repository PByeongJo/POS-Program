package GUI;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DAO.BakeryDAO;
import Vo.InvenVo;
import java.awt.Font;
import java.awt.SystemColor;

public class InvenUIUP {
	BakeryDAO dao = new BakeryDAO();
	InvenVo Data = null;
	InvenVo c = null;

	private JFrame f;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
	private JLabel u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18;
	private Label u;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
	private Button c1, c2, c3, c4, c5, c6, c7, c8, c9;
	private JPanel p;
	int num1, num2, num3, num4, num5, num6, num7, num8, num9 = 0;
	int cnt1 = dao.search().getB1();
	int cnt2 = dao.search().getB2();
	int cnt3 = dao.search().getB3();
	int cnt4 = dao.search().getB4();
	int cnt5 = dao.search().getB5();
	int cnt6 = dao.search().getB6();
	int cnt7 = dao.search().getB7();
	int cnt8 = dao.search().getB8();
	int cnt9 = dao.search().getB9();

	public InvenUIUP() {

		dao = new BakeryDAO();
		Data = dao.search();
		c = new InvenVo();

		p = new JPanel();
		p.setBounds(0, 0, 350, 600);
		p.setLayout(null);
		p.setBackground(SystemColor.scrollbar);

		u = new Label("\uC7AC\uACE0");
		u.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		u.setBounds(150, 0, 40, 40);
		u1 = new JLabel("¼Òº¸·Î»§");
		u1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u1.setBounds(70, 50, 100, 50);
		u2 = new JLabel("´ÜÆÏ»§");
		u2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u2.setBounds(70, 100, 100, 50);
		u3 = new JLabel("½´Å©¸²»§");
		u3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u3.setBounds(70, 150, 100, 50);
		u4 = new JLabel("¿¡±×Å¸¸£Æ®");
		u4.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u4.setBounds(70, 200, 100, 50);
		u5 = new JLabel("Å©·Î¿Í»ó");
		u5.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u5.setBounds(70, 250, 100, 50);
		u6 = new JLabel("°í·ÎÄÉ");
		u6.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u6.setBounds(70, 300, 100, 50);
		u7 = new JLabel("½Ä»§");
		u7.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u7.setBounds(70, 350, 100, 50);
		u8 = new JLabel("¹Ù°ÔÆ®");
		u8.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u8.setBounds(70, 400, 100, 50);
		u9 = new JLabel("·ÑÄÉÀÌÅ©");
		u9.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		u9.setBounds(70, 450, 100, 50);
		String a1 = String.valueOf(dao.search().getB1());
		String a2 = String.valueOf(dao.search().getB2());
		String a3 = String.valueOf(dao.search().getB3());
		String a4 = String.valueOf(dao.search().getB4());
		String a5 = String.valueOf(dao.search().getB5());
		String a6 = String.valueOf(dao.search().getB6());
		String a7 = String.valueOf(dao.search().getB7());
		String a8 = String.valueOf(dao.search().getB8());
		String a9 = String.valueOf(dao.search().getB9());

		u10 = new JLabel(a1);
		u10.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u10.setBounds(230, 50, 34, 50);
		u11 = new JLabel(a2);
		u11.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u11.setBounds(230, 100, 34, 50);
		u12 = new JLabel(a3);
		u12.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u12.setBounds(230, 150, 34, 50);
		u13 = new JLabel(a4);
		u13.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u13.setBounds(230, 200, 34, 50);
		u14 = new JLabel(a5);
		u14.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u14.setBounds(230, 250, 34, 50);
		u15 = new JLabel(a6);
		u15.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u15.setBounds(230, 300, 34, 50);
		u16 = new JLabel(a7);
		u16.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u16.setBounds(230, 350, 34, 50);
		u17 = new JLabel(a8);
		u17.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u17.setBounds(230, 400, 34, 50);
		u18 = new JLabel(a9);
		u18.setFont(new Font("±¼¸²", Font.BOLD, 14));
		u18.setBounds(230, 450, 34, 50);

		f = new JFrame("Àç°í°ü¸®");
		f.getContentPane().setBackground(SystemColor.control);
		f.setBounds(480, 200, 1000, 600);
		f.getContentPane().setLayout(null);
		l1 = new JLabel("¼Òº¸·Î»§");
		l1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l1.setBounds(450, 10, 80, 40);
		l2 = new JLabel("´ÜÆÏ»§");
		l2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l2.setBounds(450, 60, 80, 40);
		l3 = new JLabel("½´Å©¸²»§");
		l3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l3.setBounds(450, 110, 80, 40);
		l4 = new JLabel("¿¡±×Å¸¸£Æ®");
		l4.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l4.setBounds(450, 160, 80, 40);
		l5 = new JLabel("Å©·Î¿Í»ó");
		l5.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l5.setBounds(450, 210, 80, 40);
		l6 = new JLabel("°í·ÎÄÉ");
		l6.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l6.setBounds(450, 260, 80, 40);
		l7 = new JLabel("½Ä»§");
		l7.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l7.setBounds(450, 310, 80, 40);
		l8 = new JLabel("¹Ù°ÔÆ®");
		l8.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l8.setBounds(450, 360, 80, 40);
		l9 = new JLabel("·ÑÄÉÀÌÅ©");
		l9.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		l9.setBounds(450, 410, 80, 40);

		l10 = new JLabel("0");
		l10.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l10.setBounds(580, 10, 32, 40);
		l11 = new JLabel("0");
		l11.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l11.setBounds(580, 60, 32, 40);
		l12 = new JLabel("0");
		l12.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l12.setBounds(580, 110, 32, 40);
		l13 = new JLabel("0");
		l13.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l13.setBounds(580, 160, 32, 40);
		l14 = new JLabel("0");
		l14.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l14.setBounds(580, 210, 32, 40);
		l15 = new JLabel("0");
		l15.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l15.setBounds(580, 260, 32, 40);
		l16 = new JLabel("0");
		l16.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l16.setBounds(580, 310, 32, 40);
		l17 = new JLabel("0");
		l17.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l17.setBounds(580, 360, 32, 40);
		l18 = new JLabel("0");
		l18.setFont(new Font("±¼¸²", Font.BOLD, 14));
		l18.setBounds(580, 410, 32, 40);

		b1 = new JButton("+1");
		b1.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt1++;
				num1++;
				l10.setText(String.valueOf(num1));
				// c.setB1(cnt1);
			}
		});
		b1.setBounds(650, 20, 50, 20);
		b2 = new JButton("+1");
		b2.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt2++;
				num2++;
				l11.setText(String.valueOf(num2));
			}
		});
		b2.setBounds(650, 70, 50, 20);
		b3 = new JButton("+1");
		b3.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt3++;
				num3++;
				l12.setText(String.valueOf(num3));
			}
		});
		b3.setBounds(650, 120, 50, 20);
		b4 = new JButton("+1");
		b4.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt4++;
				num4++;
				l13.setText(String.valueOf(num4));
			}
		});
		b4.setBounds(650, 170, 50, 20);
		b5 = new JButton("+1");
		b5.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt5++;
				num5++;
				l14.setText(String.valueOf(num5));
			}
		});
		b5.setBounds(650, 220, 50, 20);
		b6 = new JButton("+1");
		b6.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt6++;
				num6++;
				l15.setText(String.valueOf(num6));
			}
		});
		b6.setBounds(650, 270, 50, 20);
		b7 = new JButton("+1");
		b7.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt7++;
				num7++;
				l16.setText(String.valueOf(num7));
			}
		});
		b7.setBounds(650, 320, 50, 20);
		b8 = new JButton("+1");
		b8.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt8++;
				num8++;
				l17.setText(String.valueOf(num8));
			}
		});
		b8.setBounds(650, 370, 50, 20);
		b9 = new JButton("+1");
		b9.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt9++;
				num9++;
				l18.setText(String.valueOf(num9));
			}
		});
		b9.setBounds(650, 420, 50, 20);
		b10 = new JButton("+5");
		b10.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt1 += 5;
				num1 += 5;
				l10.setText(String.valueOf(num1));
			}
		});
		b10.setBounds(750, 20, 50, 20);
		b11 = new JButton("+5");
		b11.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt2 += 5;
				num2 += 5;
				l11.setText(String.valueOf(num2));
			}
		});
		b11.setBounds(750, 70, 50, 20);
		b12 = new JButton("+5");
		b12.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt3 += 5;
				num3 += 5;
				l12.setText(String.valueOf(num3));
			}
		});
		b12.setBounds(750, 120, 50, 20);
		b13 = new JButton("+5");
		b13.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt4 += 5;
				num4 += 5;
				l13.setText(String.valueOf(num4));
			}
		});
		b13.setBounds(750, 170, 50, 20);
		b14 = new JButton("+5");
		b14.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt5 += 5;
				num5 += 5;
				l14.setText(String.valueOf(num5));
			}
		});
		b14.setBounds(750, 220, 50, 20);
		b15 = new JButton("+5");
		b15.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt6 += 5;
				num6 += 5;
				l15.setText(String.valueOf(num6));
			}
		});
		b15.setBounds(750, 270, 50, 20);
		b16 = new JButton("+5");
		b16.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt7 += 5;
				num7 += 5;
				l16.setText(String.valueOf(num7));
			}
		});
		b16.setBounds(750, 320, 50, 20);
		b17 = new JButton("+5");
		b17.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt8 += 5;
				num8 += 5;
				l17.setText(String.valueOf(num8));
			}
		});
		b17.setBounds(750, 370, 50, 20);
		b18 = new JButton("+5");
		b18.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
		b18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt9 += 5;
				num9 += 5;
				l18.setText(String.valueOf(num9));
			}
		});
		b18.setBounds(750, 420, 50, 20);
		b19 = new JButton("Àç°í Ãß°¡");
		b19.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 13));
		b19.setBackground(SystemColor.inactiveCaption);
		b19.setBounds(640, 480, 234, 50);
		b19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0 && num6 == 0 && num7 == 0 && num8 == 0
						&& num9 == 0) {
					JOptionPane.showMessageDialog(f, "Á¦Ç°À» Ãß°¡ÇØÁÖ¼¼¿ä", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					c.setB1(cnt1);
					c.setB2(cnt2);
					c.setB3(cnt3);
					c.setB4(cnt4);
					c.setB5(cnt5);
					c.setB6(cnt6);
					c.setB7(cnt7);
					c.setB8(cnt8);
					c.setB9(cnt9);

					dao.InvenUpdate(c);

					JOptionPane.showMessageDialog(f, "Ãß°¡µÇ¾ú½À´Ï´Ù", "È®ÀÎ", JOptionPane.INFORMATION_MESSAGE);
					f.dispose();
					new InvenUIUP();
				}

			}
		});

		c1 = new Button("Ãë¼Ò");
		c1.setBackground(SystemColor.inactiveCaption);
		c1.setFont(new Font("ÇÑÄÄ °íµñ", Font.PLAIN, 12));
		c1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				cnt1 = dao.search().getB1();
				l10.setText(String.valueOf(num1));
			}
		});
		c1.setBounds(850, 20, 50, 20);
		c2 = new Button("Ãë¼Ò");
		c2.setBackground(SystemColor.inactiveCaption);
		c2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num2 = 0;
				cnt2 = dao.search().getB2();
				l11.setText(String.valueOf(num2));
			}
		});
		c2.setBounds(850, 70, 50, 20);
		c3 = new Button("Ãë¼Ò");
		c3.setBackground(SystemColor.inactiveCaption);
		c3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num3 = 0;
				cnt3 = dao.search().getB3();
				l12.setText(String.valueOf(num3));
			}
		});
		c3.setBounds(850, 120, 50, 20);
		c4 = new Button("Ãë¼Ò");
		c4.setBackground(SystemColor.inactiveCaption);
		c4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num4 = 0;
				cnt4 = dao.search().getB4();
				l13.setText(String.valueOf(num4));
			}
		});
		c4.setBounds(850, 170, 50, 20);
		c5 = new Button("Ãë¼Ò");
		c5.setBackground(SystemColor.inactiveCaption);
		c5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num5 = 0;
				cnt5 = dao.search().getB5();
				l14.setText(String.valueOf(num5));
			}
		});
		c5.setBounds(850, 220, 50, 20);
		c6 = new Button("Ãë¼Ò");
		c6.setBackground(SystemColor.inactiveCaption);
		c6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num6 = 0;
				cnt6 = dao.search().getB6();
				l15.setText(String.valueOf(num6));
			}
		});
		c6.setBounds(850, 270, 50, 20);
		c7 = new Button("Ãë¼Ò");
		c7.setBackground(SystemColor.inactiveCaption);
		c7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num7 = 0;
				cnt7 = dao.search().getB7();
				l16.setText(String.valueOf(num7));
			}
		});
		c7.setBounds(850, 320, 50, 20);
		c8 = new Button("Ãë¼Ò");
		c8.setBackground(SystemColor.inactiveCaption);
		c8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num8 = 0;
				cnt8 = dao.search().getB8();
				l17.setText(String.valueOf(num8));
			}
		});
		c8.setBounds(850, 370, 50, 20);
		c9 = new Button("Ãë¼Ò");
		c9.setBackground(SystemColor.inactiveCaption);
		c9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num9 = 0;
				cnt9 = dao.search().getB9();
				l18.setText(String.valueOf(num9));
			}
		});
		c9.setBounds(850, 420, 50, 20);
		f.getContentPane().add(p);
		p.add(u);
		p.add(u1);
		p.add(u2);
		p.add(u3);
		p.add(u4);
		p.add(u5);
		p.add(u6);
		p.add(u7);
		p.add(u8);
		p.add(u9);
		p.add(u10);
		p.add(u11);
		p.add(u12);
		p.add(u13);
		p.add(u14);
		p.add(u15);
		p.add(u16);
		p.add(u17);
		p.add(u18);
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);
		f.getContentPane().add(l5);
		f.getContentPane().add(l6);
		f.getContentPane().add(l7);
		f.getContentPane().add(l8);
		f.getContentPane().add(l9);
		f.getContentPane().add(l10);
		f.getContentPane().add(l11);
		f.getContentPane().add(l12);
		f.getContentPane().add(l13);
		f.getContentPane().add(l14);
		f.getContentPane().add(l15);
		f.getContentPane().add(l16);
		f.getContentPane().add(l17);
		f.getContentPane().add(l18);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);
		f.getContentPane().add(b6);
		f.getContentPane().add(b7);
		f.getContentPane().add(b8);
		f.getContentPane().add(b9);
		f.getContentPane().add(b10);
		f.getContentPane().add(b11);
		f.getContentPane().add(b12);
		f.getContentPane().add(b13);
		f.getContentPane().add(b14);
		f.getContentPane().add(b15);
		f.getContentPane().add(b16);
		f.getContentPane().add(b17);
		f.getContentPane().add(b18);
		f.getContentPane().add(b19);
		f.getContentPane().add(c1);
		f.getContentPane().add(c2);
		f.getContentPane().add(c3);
		f.getContentPane().add(c4);
		f.getContentPane().add(c5);
		f.getContentPane().add(c6);
		f.getContentPane().add(c7);
		f.getContentPane().add(c8);
		f.getContentPane().add(c9);

		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 13));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(450, 480, 146, 50);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.getContentPane().add(btnNewButton);

		f.setVisible(true);

	}

	public static void main(String[] args) {
		new InvenUIUP();
	}
}