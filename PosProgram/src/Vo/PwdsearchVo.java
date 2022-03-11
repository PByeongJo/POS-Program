package Vo;

public class PwdsearchVo {
	private String id;
	private String pwd;
	private int num;
	
	public PwdsearchVo(String id, String pwd, int num) {
		this.id = id;
		this.pwd = pwd;
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public int getNum() {
		return num;
	}
}
