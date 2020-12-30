package day06;

public class Test03 {
	public static void main(String[] args) {
		
		Dog[] dogs= {new Dog(), new Dog("진돗개", "캐리")};
		Fish[] fishes= {new Fish("쿠피"), new Fish()};
		
		Animal[] animals= {
				new Dog(), 
				new Dog("진돗개", "캐리"),
				new Fish("쿠피"), 
				new Fish()
				
		};
		
		for(Animal data:animals) {
			data.print();
			data.breath();
			
//			Dog d =(Dog)data;
		}

	}

}
