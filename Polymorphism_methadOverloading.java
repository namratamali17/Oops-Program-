
public class Polymorphism_methadOverloading {

    String name;
    int age;
    public void print(String name)
    {
    	System.out.println(name);
    }
	public void print(int age)
	{ 
		System.out.println(age);
		
	}
	
	public void print(String name,int age)
	{ 
		System.out.println(name+""+age);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Polymorphism_methadOverloading a=new Polymorphism_methadOverloading();
		
		a.print(20);
		
	}

}
