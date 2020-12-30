package day06_abstract;

public class Test02 {
	public static void main(String[] args) {
		
		Service service=new OracleServiceImpl();
		
		service.insert();
		service.delete();
		service.update();
		
		

	}

}
