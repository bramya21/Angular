package Test;

public class Bean {
	String pl;
	String name;
	public String getPl() {
		return pl;
		}
		public void setPl(String pl) {
		this.pl = pl;
		}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getComments()
	{
		if(pl.equals("C"))
			return "Base language";
		if(pl.equals("C++"))
			return "OOPs";
		if(pl.equals("Java"))
			return "Pure OOP";
		if(pl.equals("Python"))
			return "Server side";
		return "invalid";
		
		
		
		
	}

}
