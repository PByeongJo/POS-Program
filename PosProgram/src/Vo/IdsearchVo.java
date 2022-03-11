package Vo;

public class IdsearchVo {
	private String id;
//	private String pwd;
	private String name;
	private int num;
	
	public IdsearchVo(String id,String name,int num) {
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;	
	}
	public int getNum() {
		return num;
	}
}
