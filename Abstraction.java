abstract class animal{
	public abstract void animalsound();
	public void sleep()
	{
		System.out.println("zzzzz");
	}
}
class pig extends animal{

	@Override
	public void animalsound() {
	System.out.println("wee weeee");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        pig a=new pig();
        a.animalsound();
        a.sleep();
	}

}
