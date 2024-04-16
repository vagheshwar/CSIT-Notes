
public class methoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methoddemo demo = new methoddemo();
		String name=demo.getdata();
		System.out.println(name);
		methoddemo2 d = new methoddemo2();
		d.getuserdata();
		getdata1();

	}

	public String getdata()
	{
		System.out.println("Hello World");
		return("Eshwar vaghmare");
	}
	public static String getdata1()
	{
		System.out.println("Hello World");
		return("vaghmare");
	}
	
}
