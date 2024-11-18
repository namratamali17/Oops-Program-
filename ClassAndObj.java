
public class ClassAndObj {
	
	String colur;
	String pentype;
	public void write() {
		System.out.println("write something ....");
		System.out.println(colur);
		System.out.println(pentype);
	}
	public void printcolur()
	{
		System.out.println(this.colur);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObj pen =new ClassAndObj();
		pen.colur="red";
		pen.pentype="gel";
		pen.write();
	}

}