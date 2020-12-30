package day06_abstract;

public interface Service {
	
	void delete();
	void update();
	abstract void insert();

}



class OracleServiceImpl implements Service{
	
	@Override
	public void delete() {
		System.out.println("oracle delete 작업수행");
	}
	@Override
	public void update() {
		System.out.println("oracle update 작업수행");
	}
	@Override
	public void insert() {
		System.out.println("oracle insert 작업수행");
	}
}


class MysqlServiceImpl implements Service{
	@Override
	public void delete() {
		System.out.println("mysql delete 작업수행");
	}
	@Override
	public void update() {
		System.out.println("mysql update 작업수행");
	}
	@Override
	public void insert() {
		System.out.println("mysql insert 작업수행");
	}
}