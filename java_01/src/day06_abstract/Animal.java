package day06_abstract;

public abstract class Animal extends Object{
	String kind = "동물의 종류";
	
	public Animal(){}
	
	public Animal(String kind){
		this.kind=kind;
	}
	
	public void print() {}
	
	public abstract void breath();
	
	
	
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
	
	
	public static void main(String[] args) {
	}

}
