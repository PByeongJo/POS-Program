package Vo;

public class LoginVo {
	private String id; 
	private String pwd;
	
	public LoginVo(String id,String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
}
