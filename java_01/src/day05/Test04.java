package day05;

public class Test04 {
	public static void main(String[] args) {
		
		Time t1=new Time(15, 17, 15);
		t1.print();
		
		Location loc=new Location();
		
	}

}

class Location{
	double x;
	double y;
}

class Time{
	private int hour;
	private int minute;
	private int second;
	private boolean am;
	
	
	
	public Time() { }
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void print() {
		System.out.printf("%d:%d:%d %n", hour, minute, second);
	}
	
	

}