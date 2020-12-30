package day06;

public class Dog extends Animal{
	String kind="강아지 종류";
	String name;
	
	

	public Dog() {
		super();
//		super.kind="강아지";
	}

	public Dog(String kind, String name) {
		super("강아지");
//		super.kind="강아지";
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.printf("Dog[%s : %s : %s] %n", super.kind, this.kind, name);
	}
	
	
	
	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}

	public static void main(String[] args) {   // this(), super() (x)
		Dog d1 =new Dog();
		d1.print();
		Dog d =new Dog("시츄", "캐리");
		System.out.println(d.kind);
		System.out.println(d.name);
		d.breath();
		d.print();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
}
