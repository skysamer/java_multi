package day06;

public class Animal extends Object{
	String kind = "동물의 종류";
	
	public Animal(){}
	
	public Animal(String kind){
		this.kind=kind;
	}
	
	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
	
	
	
	@Override
	public String toString() {
		return "Animal [kind=" + kind + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		return true;
	}
	

	public void print() {}
	
	public static void main(String[] args) {
		Animal a1 =new Animal("강아지");
		Animal a =new Animal();
		System.out.println(a.kind);
		a.breath();
	}

}
