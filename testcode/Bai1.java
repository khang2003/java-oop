package testcode;
public class Bai1{
	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void printDay() {
		System.out.println("Day"+this.day);
		
	}
	public void printMonth() {
		System.out.println("Day"+this.month);
		
	}
	public void printMonth() {
		System.out.println("Day"+this.year);
		
	}
	public void printData() {
		System.out.println("Date : "+this.day+this.month+this.year);
	}
	
}