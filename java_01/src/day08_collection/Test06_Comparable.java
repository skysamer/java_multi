package day08_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06_Comparable {

	public static void main(String[] args) {
		
//		Set<Book> set=new HashSet<Book>();
		Set<Book> set=new TreeSet<Book>();
		
		set.add(new Book("java", 2500));
		set.add(new Book("sql", 1500));
		set.add(new Book("html5", 3500));
		set.add(new Book("spring", 2700));
		set.add(new Book("python", 1300));
		
		if(!set.add(new Book("java", 500))) {
			System.out.println("이미 등록된 데이터입니다.");
		}
		
		Iterator<Book> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--- forEach ---");
		set.forEach(i->System.out.println(i));
	}

}

class Book implements Comparable<Book>{
	String title;
	int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book obj) {
//		return price- obj.price;
		return title.compareTo(obj.title);
	}
	
	
	
	
}