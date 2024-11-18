
public class Encapsulation {

		private String name;
		public String getname()
		{
			return name;
		}
        public void setname()
        {
        	this.name=name;
        }
	

}
class Test 
{
	public static void main(String args[])
	{
	Encapsulation s=new Encapsulation();
	s.setname();
	System.out.println(s.getname());
	
	
}
	}