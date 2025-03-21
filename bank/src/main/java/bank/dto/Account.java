package bank.dto;

public class Account {
	private int no;
	private String id;
	private String pw;
//	private int age;
	private int balance;
	private String bdate;
	private String ip;
	public static String Company = "(주)회사";
	
 //기본생성자 ##
 public Account(){}
 
 public Account(String id, String pw, int balance) {
	super();
	this.id = id;
	this.pw = pw;
	this.balance = balance;
}

// toString 상태확인 ##
 	
	 @Override
	 public String toString() {
		 return "Account [no=" + no + ", id=" + id + ", pw=" + pw + ", balance=" + balance + ", bdate=" + bdate + ", ip="
				 + ip + "]";
	 }

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
