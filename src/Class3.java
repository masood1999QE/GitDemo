
public class Class3 implements InterfacePractice1,InterfacePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		InterfacePractice2 obj=new Class3();
		InterfacePractice1 obj1=new Class3();
		
		System.out.println(obj.display());
		//System.out.println(obj1.display());
		
	}

	@Override
	public int display() {
		// TODO Auto-generated method stub
		return 12;
	}

}
