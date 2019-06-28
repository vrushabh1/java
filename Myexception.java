package exception;

public class Myexception extends Exception {
	String str;
	public Myexception(String str) {
		
		this.str=str;
	}
	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	

}
