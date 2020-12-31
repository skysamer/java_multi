package day07;

import javax.swing.JOptionPane;

public class Test02_Command {
	public static void main(String[] args) {
		Command cmd=null;
		
		String msg=JOptionPane.showInputDialog("1.Delete, 2.Insert, 3.List, 4.Update");
		
		switch(msg) {
			case "1":
				cmd=new DeleteCommand();
				break;
			case "2":
				cmd=new InsertCommand();
				break;
			case "3":
				cmd=new ListCommand();
				break;
			case "4":
				cmd=new UpdateCommand();
				break;
			default:
				System.out.println("잘못입력했습니다.");
		
		}
		
		cmd.exec();
		
		cmd.base();
		

	}

}




class DeleteCommand implements Command{
	public void exec() {
		System.out.println("DeleteCommand 삭제 수행");
	}
	public void base() {
		System.out.println("DeleteCommand 재정의");
	}
}

class UpdateCommand implements Command{
	public void exec() {
		System.out.println("UpdateCommand 수정 수행");
	}
}

class InsertCommand implements Command{
	public void exec() {
		System.out.println("InsertCommand 생성 수행");
	}
}

class ListCommand implements Command{
	public void exec() {
		System.out.println("ListCommand select 수행");
	}
}