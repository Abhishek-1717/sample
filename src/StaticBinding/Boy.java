package StaticBinding;

public class Boy extends Human{
	
	static void walk()
	{
		System.out.println("Boy walk");
	}
	
	void speak()
	{
		System.out.println("boy speak");
	}

	public static void main(String[] args)
	{
		Human h=new Boy();
		Human h2=new Human();
		h.walk();
		h.speak();
		
		h2.walk();
		h2.speak();
        
	}

}
