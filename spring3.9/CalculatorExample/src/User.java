
public class User  {
	int a,b;
	Calc c;
	public User()
	{
		super();
	}
	public Calc getC() {
		return c;
	}
	public void setC(Calc c) {
		this.c = c;
	}
	public User(int a, int b, Calc c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public void add( )
	{
		c.add(a, b);
	}
	
	
}
