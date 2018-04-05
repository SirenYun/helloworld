package controller;

public class Order {
	private String oid;
    private String oaddress;
    private String odate;
    private int ostatus;
    private User user;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getOstatus() {
		return ostatus;
	}
	public void setOstatus(int ostatus) {
		this.ostatus = ostatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Order(String oid, String oaddress, String odate, int ostatus) {
		super();
		this.oid = oid;
		this.oaddress = oaddress;
		this.odate = odate;
		this.ostatus = ostatus;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
}
}