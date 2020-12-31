package day07;

import day05.Employee;

public class Test01 {
	public static void main(String[] args) {
		new Employee();
	}

}

class salesEmployee extends Employee{
	
	public void print() {
		System.out.println(this.name);
	}
	
}