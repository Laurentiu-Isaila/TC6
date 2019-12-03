
public class Main {

	public static void main(String[] args) {
		MyIntArrayList test = new MyIntArrayList(10);
		test.add(40);
		test.add(30);
		test.add(100);
		test.add(2, 5000);
		test.add(40);
		test.removeElement(40);
		
		
		for(int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
		
		System.out.println(test.contains(31));
		System.out.println(test.lastIndex(100));
		
		
		
		
		
		

	}

}
