package uscs3;

public class Box_Int {
	private int item1;
	private int item2;
	
	public Box_Int() {
		item1 = 0;
		item2 = 0;
	}
	
	
	public void ImprimeBoxInt() {
		System.out.println("O primeiro item e: " + item1);
		System.out.println("O segundo item e: " + item2);
		
	}
	
	
	public void AlteraItem1(int x) {
		item1 = x;
		
	}
	
	public void AlteraItem2(int x) {
		item2 = x;
		
	}
	
}
