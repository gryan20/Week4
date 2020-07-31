public class Box2 {

	public int size = 0;
	
	
	public void printBox() { 
		for (int row = 0;  row < size; row ++)
		{
			for (int col = 0; col < size; col ++)
				{	
			System.out.print("*");
		}
			System.out.println();
		}
	}
	public void printBox(char c) {	
		for (int row = 0; row < size; row++)
		{
			for (int col = 0; col< size; col ++)
			{
				System.out.print("c");
			}
			    System.out.println();
		}
	}
	public static void main(String[] args) {
		Box2 myBox = new Box2();
	 	myBox.size = 5;
		myBox.printBox();
		
		myBox.printBox('c');
	
	} 

}

