package uscs3;

public class TesteBoxInt {
	
	public static void main(String[] args) {
		
		Box_Int box = new Box_Int();
		Box_Int box2 = new Box_Int();
			
		box.AlteraItem1(10);
		box.AlteraItem2(20);
	
		box2.AlteraItem1(33);
		box2.AlteraItem2(55);
		
		box.ImprimeBoxInt();
		box2.ImprimeBoxInt();
	
	}
}
