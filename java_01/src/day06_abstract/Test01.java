package day06_abstract;

public class Test01 {
	public static void main(String[] args) {
		
		Animal[] animals= {
				new Dog(), 
				new Dog("진돗개", "캐리"),
				new Fish("쿠피"), 
				new Fish()
				
		};
		
		for(Animal data:animals) {
			data.print();
			data.breath();
			
		}

	}

}
