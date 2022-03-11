package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import Vo.BakeryVo;
import Vo.IdsearchVo;
import Vo.InvenVo;
import Vo.LoginVo;
import Vo.PwdsearchVo;

public class BakeryDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##movie";
	String password = "1234";

	private Connection conn = null;

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
			/*
			 * stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			 * ResultSet.CONCUR_UPDATABLE); System.out.println("statement create success.");
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int add(BakeryVo B) {
		int result = -1;

		PreparedStatement pstmt = null;
		// ResultSet rs = null;
		String sql = "insert into bak(name,cnt,price)values(?,?,?)";

		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, B.getName());
			pstmt.setInt(2, B.getCount());
			pstmt.setInt(3, B.getPrice());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public Vector<BakeryVo> SellList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from bak";
		Vector<BakeryVo> list = new Vector<BakeryVo>();

		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BakeryVo B = new BakeryVo();
				B.setName(rs.getString("name"));
				B.setPrice(rs.getInt("price"));

				list.add(B);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Vector<BakeryVo> CountList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select name,sum(cnt),sum(price) from bak group by name";
		Vector<BakeryVo> list = new Vector<BakeryVo>();

		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BakeryVo B = new BakeryVo();
				B.setName(rs.getString("name"));
				B.setCount(rs.getInt("sum(cnt)"));
				B.setPrice2(rs.getInt("sum(price)"));

				list.add(B);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Object[][] SellListArr(Vector<BakeryVo> list) {
		Object[][] arr = new Object[list.size()][2];

		for (int i = 0; i < list.size(); i++) {
			arr[i][0] = list.get(i).getName();
			arr[i][1] = list.get(i).getPrice();
		}
		return arr;
	}

	public Object[][] CountListArr(Vector<BakeryVo> list) {
		Object[][] arr = new Object[list.size()][3];

		for (int i = 0; i < list.size(); i++) {
			arr[i][0] = list.get(i).getName();
			arr[i][1] = list.get(i).getCount();
			arr[i][2] = list.get(i).getPrice2();

		}
		return arr;
	}

	public int InvenUpdate(InvenVo I) {
		int result = 0;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;
		String sql = "update inven set b1 = ? , b2 = ? , b3 = ? , b4 = ? , b5 = ? , b6 = ?, b7 = ? , b8 = ? , b9 = ?";

		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, I.getB1());
			pstmt.setInt(2, I.getB2());
			pstmt.setInt(3, I.getB3());
			pstmt.setInt(4, I.getB4());
			pstmt.setInt(5, I.getB5());
			pstmt.setInt(6, I.getB6());
			pstmt.setInt(7, I.getB7());
			pstmt.setInt(8, I.getB8());
			pstmt.setInt(9, I.getB9());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public InvenVo search() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from inven";
		InvenVo I = null;

		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				I = new InvenVo();
				I.setB1(rs.getInt("b1"));
				I.setB2(rs.getInt("b2"));
				I.setB3(rs.getInt("b3"));
				I.setB4(rs.getInt("b4"));
				I.setB5(rs.getInt("b5"));
				I.setB6(rs.getInt("b6"));
				I.setB7(rs.getInt("b7"));
				I.setB8(rs.getInt("b8"));
				I.setB9(rs.getInt("b9"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return I;
	}
	
	public int reset(BakeryVo B) {
		int result = -1;
		
		PreparedStatement pstmt = null;
	//	ResultSet rs = null;
		String sql = "truncate table bak";
		
		try {
			connDB();

			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

	public ArrayList<LoginVo> loginlist(String pid) {
		ArrayList<LoginVo> loginlist = new ArrayList<LoginVo>();
		String sql = "select * from login";
		Statement stmt;
		ResultSet rs;
		try {
			connDB();

			if (pid != null) {
				sql += " where id='" + pid + "'";
			}
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(sql);
			rs.last();
			rs.previous();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				
				LoginVo Data = new LoginVo(id, pwd);
				loginlist.add(Data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginlist;
	}

	public ArrayList<IdsearchVo> idlist(String pname) {
		ArrayList<IdsearchVo> idlist = new ArrayList<IdsearchVo>();
		String sql = "select * from login";
		Statement stmt;
		ResultSet rs;
		try {
			connDB();

			if (pname != null) {
				sql += " where name='" + pname + "'";
			}
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(sql);
			rs.last();
			rs.previous();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int num = rs.getInt("num");

				IdsearchVo Data = new IdsearchVo(id, name, num);
				idlist.add(Data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return idlist;
	}

	public ArrayList<PwdsearchVo> pwdlist(String pid) {
		ArrayList<PwdsearchVo> pwdlist = new ArrayList<PwdsearchVo>();
		String sql = "select * from login";
		Statement stmt;
		ResultSet rs;
		try {
			connDB();

			if (pid != null) {
				sql += " where id ='" + pid + "'";
			}
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(sql);
			rs.last();
			rs.previous();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int num = rs.getInt("num");

				PwdsearchVo Data = new PwdsearchVo(id, pwd, num);
				pwdlist.add(Data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pwdlist;
	}
}
