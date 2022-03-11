package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import DAO.BakeryDAO;
import Vo.BakeryVo;
import Vo.InvenVo;

public class MainUI {

	BakeryVo bk1 = null;
	BakeryVo bk2 = null;
	BakeryVo bk3 = null;
	BakeryVo bk4 = null;
	BakeryVo bk5 = null;
	BakeryVo bk6 = null;
	BakeryVo bk7 = null;
	BakeryVo bk8 = null;
	BakeryVo bk9 = null;

	BakeryDAO dao = new BakeryDAO();
	InvenVo c = new InvenVo();

	int a1 = dao.search().getB1();
	int a2 = dao.search().getB2();
	int a3 = dao.search().getB3();
	int a4 = dao.search().getB4();
	int a5 = dao.search().getB5();
	int a6 = dao.search().getB6();
	int a7 = dao.search().getB7();
	int a8 = dao.search().getB8();
	int a9 = dao.search().getB9();

	private JFrame f;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private Button cancle, c1, c2, c3, c4, c5, c6, c7, c8, c9;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, tt1;

	private JPanel p, p3;
	int sum = 0;
	int cnt = 1;
	int num1, num2, num3, num4, num5, num6, num7, num8, num9 = 0;
	int cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8, cnt9 = 0;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.f.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainUI() {
		GUI();
	}

	public void GUI() {

		bk1 = new BakeryVo();
		bk2 = new BakeryVo();
		bk3 = new BakeryVo();
		bk4 = new BakeryVo();
		bk5 = new BakeryVo();
		bk6 = new BakeryVo();
		bk7 = new BakeryVo();
		bk8 = new BakeryVo();
		bk9 = new BakeryVo();
		dao = new BakeryDAO();

		f = new JFrame("ÆÇ¸Å");
		f.setBackground(Color.WHITE);
		f.getContentPane().setBackground(SystemColor.control);
		f.setBounds(500, 150, 950, 750);
		f.getContentPane().setLayout(null);
		f.getContentPane().setLayout(null);

		p = new JPanel();
		p.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(160, 160, 160)),
				"\uD310\uB9E4 \uBAA9\uB85D", TitledBorder.CENTER, TitledBorder.TOP, null, SystemColor.controlText));
		p.setBounds(0, 0, 350, 550);
		p.setLayout(null);
		p.setBackground(SystemColor.scrollbar);

		p3 = new JPanel();
		p3.setBounds(350, 550, 587, 161);
		p3.setLayout(null);
		p3.setBackground(SystemColor.scrollbar);

		l1 = new JLabel("¼Òº¸·Î»§");
		l1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l1.setBounds(50, 30, 90, 25);
		l2 = new JLabel("´ÜÆÏ»§");
		l2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l2.setBounds(50, 80, 90, 25);
		l3 = new JLabel("½´Å©¸²»§");
		l3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l3.setBounds(50, 130, 90, 25);
		l4 = new JLabel("¿¡±×Å¸¸£Æ®");
		l4.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l4.setBounds(50, 180, 90, 25);
		l5 = new JLabel("Å©·Î¿Í»ó");
		l5.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l5.setBounds(50, 230, 90, 25);
		l6 = new JLabel("°í·ÎÄÉ");
		l6.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l6.setBounds(50, 280, 90, 25);
		l7 = new JLabel("½Ä»§");
		l7.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l7.setBounds(50, 330, 90, 25);
		l8 = new JLabel("¹Ù°ÔÆ®");
		l8.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l8.setBounds(50, 380, 90, 25);
		l9 = new JLabel("·ÑÄÉÀÌÅ©");
		l9.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 16));
		l9.setBounds(50, 430, 90, 25);

		l10 = new JLabel("0");
		l10.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l10.setBounds(180, 30, 30, 25);
		l11 = new JLabel("0");
		l11.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l11.setBounds(180, 80, 30, 25);
		l12 = new JLabel("0");
		l12.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l12.setBounds(180, 130, 30, 25);
		l13 = new JLabel("0");
		l13.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l13.setBounds(180, 180, 30, 25);
		l14 = new JLabel("0");
		l14.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l14.setBounds(180, 230, 30, 25);
		l15 = new JLabel("0");
		l15.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l15.setBounds(180, 280, 30, 25);
		l16 = new JLabel("0");
		l16.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l16.setBounds(180, 330, 30, 25);
		l17 = new JLabel("0");
		l17.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l17.setBounds(180, 380, 30, 25);
		l18 = new JLabel("0");
		l18.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		l18.setBounds(180, 430, 30, 25);

		b1 = new JButton("¼Òº¸·Î»§");
		b1.setBackground(SystemColor.inactiveCaption);
		b1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b1.setBounds(400, 30, 130, 130);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk1.setName("¼Òº¸·Î»§");
				if (dao.search().getB1() <= cnt1) {
					JOptionPane.showMessageDialog(f, bk1.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num1++;
					cnt1++;
					bk1.setCount(cnt1);
					bk1.setPrice(1500 * num1);
					l10.setText(String.valueOf(num1));
					sum += 1500;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b2 = new JButton("´ÜÆÏ»§");
		b2.setBackground(SystemColor.inactiveCaption);
		b2.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b2.setBounds(580, 30, 130, 130);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk2.setName("´ÜÆÏ»§");
				if (dao.search().getB2() <= cnt2) {
					JOptionPane.showMessageDialog(f, bk2.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num2++;
					cnt2++;
					bk2.setCount(cnt2);
					bk2.setPrice(1700 * num2);
					l11.setText(String.valueOf(num2));
					sum += 1700;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b3 = new JButton("½´Å©¸²»§");
		b3.setBackground(SystemColor.inactiveCaption);
		b3.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b3.setBounds(760, 30, 130, 130);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk3.setName("½´Å©¸²»§");
				if (dao.search().getB3() <= cnt3) {
					JOptionPane.showMessageDialog(f, bk3.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num3++;
					cnt3++;
					bk3.setCount(cnt3);
					bk3.setPrice(1800 * num3);
					l12.setText(String.valueOf(num3));
					sum += 1800;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b4 = new JButton("¿¡±×Å¸¸£Æ®");
		b4.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b4.setBackground(SystemColor.inactiveCaption);
		b4.setBounds(400, 200, 130, 130);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk4.setName("¿¡±×Å¸¸£Æ®");
				if (dao.search().getB4() <= cnt4) {
					JOptionPane.showMessageDialog(f, bk4.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num4++;
					cnt4++;
					bk4.setCount(cnt4);
					bk4.setPrice(2000 * num4);
					l13.setText(String.valueOf(num4));
					sum += 2000;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b5 = new JButton("Å©·Î¿Í»ó");
		b5.setBackground(SystemColor.inactiveCaption);
		b5.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b5.setBounds(580, 200, 130, 130);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk5.setName("Å©·Î¿Í»ó");
				if (dao.search().getB5() <= cnt5) {
					JOptionPane.showMessageDialog(f, bk5.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num5++;
					cnt5++;
					bk5.setCount(cnt5);
					bk5.setPrice(2200 * num5);
					l14.setText(String.valueOf(num5));
					sum += 2200;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}

			}
		});
		b6 = new JButton("°í·ÎÄÉ");
		b6.setBackground(SystemColor.inactiveCaption);
		b6.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b6.setBounds(760, 200, 130, 130);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk6.setName("°í·ÎÄÉ");
				if (dao.search().getB6() <= cnt6) {
					JOptionPane.showMessageDialog(f, bk6.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num6++;
					cnt6++;
					bk6.setCount(cnt6);
					bk6.setPrice(2300 * num6);
					l15.setText(String.valueOf(num6));
					sum += 2300;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b7 = new JButton("½Ä»§");
		b7.setBackground(SystemColor.inactiveCaption);
		b7.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b7.setBounds(400, 370, 130, 130);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk7.setName("½Ä»§");
				if (dao.search().getB7() <= cnt7) {
					JOptionPane.showMessageDialog(f, bk7.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num7++;
					cnt7++;
					bk7.setCount(cnt7);
					bk7.setPrice(3000 * num7);
					l16.setText(String.valueOf(num7));
					sum += 3000;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b8 = new JButton("¹Ù°ÔÆ®");
		b8.setBackground(SystemColor.inactiveCaption);
		b8.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b8.setBounds(580, 370, 130, 130);
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk8.setName("¹Ù°ÔÆ®");
				if (dao.search().getB8() <= cnt8) {
					JOptionPane.showMessageDialog(f, bk8.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num8++;
					cnt8++;
					bk8.setCount(cnt8);
					bk8.setPrice(4000 * num8);
					l17.setText(String.valueOf(num8));
					sum += 4000;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});
		b9 = new JButton("·ÑÄÉÀÌÅ©");
		b9.setBackground(SystemColor.inactiveCaption);
		b9.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		b9.setBounds(760, 370, 130, 130);
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bk9.setName("·ÑÄÉÀÌÅ©");
				if (dao.search().getB9() <= cnt9) {
					JOptionPane.showMessageDialog(f, bk9.getName() + "ÀÇ ¼ö·®ÀÌ ºÎÁ·ÇÕ´Ï´Ù", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					num9++;
					cnt9++;
					bk9.setCount(cnt9);
					bk9.setPrice(5000 * num9);
					l18.setText(String.valueOf(num9));
					sum += 5000;
					String s = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + s);
				}
			}
		});

		cancle = new Button("ÀÏ°ýÃë¼Ò");
		cancle.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		cancle.setBackground(UIManager.getColor("Button.background"));
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				l10.setText("0");
				l11.setText("0");
				l12.setText("0");
				l13.setText("0");
				l14.setText("0");
				l15.setText("0");
				l16.setText("0");
				l17.setText("0");
				l18.setText("0");

				tt1.setText("ÃÑ ±Ý ¾× : 0");
				sum = 0;

				num1 = 0;
				num2 = 0;
				num3 = 0;
				num4 = 0;
				num5 = 0;
				num6 = 0;
				num7 = 0;
				num8 = 0;
				num9 = 0;
				cnt1 = 0;
				cnt2 = 0;
				cnt3 = 0;
				cnt4 = 0;
				cnt5 = 0;
				cnt6 = 0;
				cnt7 = 0;
				cnt8 = 0;
				cnt9 = 0;
				bk1.setCount(cnt1);
				bk1.setPrice(1500 * num1);
				bk2.setCount(cnt2);
				bk2.setPrice(1700 * num2);
				bk3.setCount(cnt3);
				bk3.setPrice(1800 * num3);
				bk4.setCount(cnt4);
				bk4.setPrice(2000 * num4);
				bk5.setCount(cnt5);
				bk5.setPrice(2200 * num5);
				bk6.setCount(cnt6);
				bk6.setPrice(2300 * num6);
				bk7.setCount(cnt7);
				bk7.setPrice(3000 * num7);
				bk8.setCount(cnt8);
				bk8.setPrice(4000 * num8);
				bk9.setCount(cnt9);
				bk9.setPrice(5000 * num9);

			}
		});
		cancle.setBounds(192, 489, 148, 51);

		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		p.add(l7);
		p.add(l8);
		p.add(l9);
		p.add(l10);
		p.add(l11);
		p.add(l12);
		p.add(l13);
		p.add(l14);
		p.add(l15);
		p.add(l16);
		p.add(l17);
		p.add(l18);

		p.add(cancle);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);
		f.getContentPane().add(b6);
		f.getContentPane().add(b7);
		f.getContentPane().add(b8);
		f.getContentPane().add(b9);
		f.getContentPane().add(p);
		c1 = new Button("Ãë¼Ò");
		c1.setBackground(SystemColor.inactiveCaption);
		c1.setBounds(250, 30, 50, 25);
		p.add(c1);
		c2 = new Button("Ãë¼Ò");
		c2.setBackground(SystemColor.inactiveCaption);
		c2.setBounds(250, 80, 50, 25);
		p.add(c2);
		c3 = new Button("Ãë¼Ò");
		c3.setBackground(SystemColor.inactiveCaption);
		c3.setBounds(250, 130, 50, 25);
		p.add(c3);
		c4 = new Button("Ãë¼Ò");
		c4.setBackground(SystemColor.inactiveCaption);
		c4.setBounds(250, 180, 50, 25);
		p.add(c4);
		c5 = new Button("Ãë¼Ò");
		c5.setBackground(SystemColor.inactiveCaption);
		c5.setBounds(250, 230, 50, 25);
		p.add(c5);
		c6 = new Button("Ãë¼Ò");
		c6.setBackground(SystemColor.inactiveCaption);
		c6.setBounds(250, 280, 50, 25);
		p.add(c6);
		c7 = new Button("Ãë¼Ò");
		c7.setBackground(SystemColor.inactiveCaption);
		c7.setBounds(250, 330, 50, 25);
		p.add(c7);
		c8 = new Button("Ãë¼Ò");
		c8.setBackground(SystemColor.inactiveCaption);
		c8.setBounds(250, 380, 50, 25);
		p.add(c8);
		c9 = new Button("Ãë¼Ò");
		c9.setBackground(SystemColor.inactiveCaption);
		c9.setBounds(250, 430, 50, 25);
		p.add(c9);

		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 >= 1) {
					num1--;
					if (num1 <= 0) {
						num1 = 0;
					}
					sum -= 1500;
					if (sum <= 0) {
						sum = 0;
					}
					cnt1--;
					if (cnt1 <= 0) {
						cnt1 = 0;
					}
					bk1.setCount(cnt1);
					bk1.setPrice(1500 * num1);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l10.setText(String.valueOf(num1));
				}
			}
		});
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num2 >= 1) {
					num2--;

					if (num2 <= 0) {
						num2 = 0;
					}
					sum -= 1700;
					if (sum <= 0) {
						sum = 0;
					}
					cnt2--;
					if (cnt2 <= 0) {
						cnt2 = 0;
					}
					bk2.setCount(cnt2);
					bk2.setPrice(1700 * num2);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l11.setText(String.valueOf(num2));
				}
			}
		});
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num3 >= 1) {
					num3--;
					if (num3 <= 0) {
						num3 = 0;
					}
					sum -= 1800;
					if (sum <= 0) {
						sum = 0;
					}
					cnt3--;
					if (cnt3 <= 0) {
						cnt3 = 0;
					}
					bk3.setCount(cnt3);
					bk3.setPrice(1800 * num3);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l12.setText(String.valueOf(num3));
				}
			}
		});
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num4 >= 1) {
					num4--;
					if (num4 <= 0) {
						num4 = 0;
					}
					sum -= 2000;
					if (sum <= 0) {
						sum = 0;
					}
					cnt4--;
					if (cnt4 <= 0) {
						cnt4 = 0;
					}
					bk4.setCount(cnt4);
					bk4.setPrice(2000 * num4);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l13.setText(String.valueOf(num4));
				}
			}
		});
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num5 >= 1) {
					num5--;
					if (num5 <= 0) {
						num5 = 0;
					}
					sum -= 2200;
					if (sum <= 0) {
						sum = 0;
					}
					cnt5--;
					if (cnt5 <= 0) {
						cnt5 = 0;
					}
					bk5.setCount(cnt5);
					bk5.setPrice(2200 * num5);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l14.setText(String.valueOf(num5));
				}
			}
		});
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num6 >= 1) {
					num6--;
					if (num6 <= 0) {
						num6 = 0;
					}
					sum -= 2300;
					if (sum <= 0) {
						sum = 0;
					}
					cnt6--;
					if (cnt6 <= 0) {
						cnt6 = 0;
					}
					bk6.setCount(cnt6);
					bk6.setPrice(2300 * num6);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l15.setText(String.valueOf(num6));
				}
			}
		});
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num7 >= 1) {
					num7--;
					if (num7 <= 0) {
						num7 = 0;
					}
					sum -= 3000;
					if (sum <= 0) {
						sum = 0;
					}
					cnt7--;
					if (cnt7 <= 0) {
						cnt7 = 0;
					}
					bk7.setCount(cnt7);
					bk7.setPrice(3000 * num7);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l16.setText(String.valueOf(num7));
				}
			}
		});
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num8 >= 1) {
					num8--;
					if (num8 <= 0) {
						num8 = 0;
					}
					sum -= 4000;
					if (sum <= 0) {
						sum = 0;
					}
					cnt8--;
					if (cnt8 <= 0) {
						cnt8 = 0;
					}
					bk8.setCount(cnt8);
					bk8.setPrice(4000 * num8);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l17.setText(String.valueOf(num8));
				}
			}
		});

		c9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num9 >= 1) {
					num9--;
					if (num9 <= 0) {
						num9 = 0;
					}
					sum -= 5000;
					if (sum <= 0) {
						sum = 0;
					}
					cnt9--;
					if (cnt9 <= 0) {
						cnt9 = 0;
					}
					bk9.setCount(cnt9);
					bk9.setPrice(5000 * num9);
					String str = Integer.toString(sum);
					tt1.setText("ÃÑ ±Ý ¾× : " + str);
					l18.setText(String.valueOf(num9));
				}
			}
		});

		f.getContentPane().add(p3);
		JButton b12 = new JButton("Home");
		b12.setFont(new Font("±¼¸²", Font.BOLD, 17));
		b12.setBounds(50, 20, 120, 120);
		p3.add(b12);

		JButton b10 = new JButton("»õ·Î°íÄ§");
		b10.setFont(new Font("±¼¸²", Font.BOLD, 17));
		b10.setBounds(235, 20, 120, 120);
		p3.add(b10);

		JButton b11 = new JButton("°áÁ¦");
		b11.setFont(new Font("±¼¸²", Font.BOLD, 17));
		b11.setBounds(425, 20, 120, 120);
		p3.add(b11);

		tt1 = new JLabel("ÃÑ ±Ý ¾× : 0");
		tt1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 20));
		tt1.setBounds(58, 605, 200, 40);
		f.getContentPane().add(tt1);

		JPanel panel = new JPanel();
		panel.setBounds(400, 160, 130, 25);
		f.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("\\1500");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel.add(lblNewLabel);

		panel_1 = new JPanel();
		panel_1.setBounds(580, 160, 130, 25);
		f.getContentPane().add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("\\1700");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));

		panel_2 = new JPanel();
		panel_2.setBounds(760, 160, 130, 25);
		f.getContentPane().add(panel_2);

		JLabel lblNewLabel_2 = new JLabel("\\1800");
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3 = new JPanel();
		panel_3.setBounds(400, 330, 130, 25);
		f.getContentPane().add(panel_3);

		lblNewLabel_3 = new JLabel("\\2000");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_3.add(lblNewLabel_3);

		panel_4 = new JPanel();
		panel_4.setBounds(580, 330, 130, 25);
		f.getContentPane().add(panel_4);

		lblNewLabel_4 = new JLabel("\\2200");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_4.add(lblNewLabel_4);

		panel_5 = new JPanel();
		panel_5.setBounds(760, 330, 130, 25);
		f.getContentPane().add(panel_5);

		lblNewLabel_5 = new JLabel("\\2300");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_5.add(lblNewLabel_5);

		panel_6 = new JPanel();
		panel_6.setBounds(400, 500, 130, 25);
		f.getContentPane().add(panel_6);

		lblNewLabel_6 = new JLabel("\\3000");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_6.add(lblNewLabel_6);

		panel_7 = new JPanel();
		panel_7.setBounds(580, 500, 130, 25);
		f.getContentPane().add(panel_7);

		lblNewLabel_7 = new JLabel("\\4000");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_7.add(lblNewLabel_7);

		panel_8 = new JPanel();
		panel_8.setBounds(760, 500, 130, 25);
		f.getContentPane().add(panel_8);

		lblNewLabel_8 = new JLabel("\\5000");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel_8.add(lblNewLabel_8);

		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cnt1 == 0 && cnt2 == 0 && cnt3 == 0 && cnt4 == 0 && cnt5 == 0 && cnt6 == 0 && cnt7 == 0 && cnt8 == 0
						&& cnt9 == 0) {
					JOptionPane.showMessageDialog(f, "Á¦Ç°À» ¼±ÅÃÇØÁÖ¼¼¿ä", "¿À·ù", JOptionPane.WARNING_MESSAGE);
				} else {
					dao.add(bk1);
					dao.add(bk2);
					dao.add(bk3);
					dao.add(bk4);
					dao.add(bk5);
					dao.add(bk6);
					dao.add(bk7);
					dao.add(bk8);
					dao.add(bk9);

					c.setB1(a1 - num1);
					c.setB2(a2 - num2);
					c.setB3(a3 - num3);
					c.setB4(a4 - num4);
					c.setB5(a5 - num5);
					c.setB6(a6 - num6);
					c.setB7(a7 - num7);
					c.setB8(a8 - num8);
					c.setB9(a9 - num9);

					dao.InvenUpdate(c);

					// System.out.println(bakery);

					JOptionPane.showMessageDialog(f, "°áÁ¦ µÇ¾ú½À´Ï´Ù", "È®ÀÎ", JOptionPane.INFORMATION_MESSAGE);
					f.dispose();
					new MainUI();
				}
			}
		});
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new MainUI();
			}
		});
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StartUI();
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}