package me.br.ex4.classes;

public class Data {
	private int day;
	private int month;
	private String monthName;
	private int year;
	
	public Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Data(String monthName, int day, int year) {
		this.monthName = monthName;
		this.day = day;
		this.year = year;
	}
	
	public Data(int day, int year) {
		this.day = day;
		this.year = year;
		this.month = -1;
	}
	
	public void setMonth(int v) {
		this.month = (v > 12) ? 12 : (v < 1) ? 1 : v;
	}
	
	public String stringifyDate() {
		String day = adjustSize(this.day, 2);
		if (monthName != null)
			return this.monthName + " " + day + ", " + year;
		if (this.month != -1)
			return day + "/" + adjustSize(this.month, 2) + "/" + this.year;
		return this.day + " " + this.year;
	}
	
	private String adjustSize(int n, int amt) {
		String build = Integer.toString(n);
		while(build.length() < amt) {
			build = "0" + build;
		}
		return build;
	}
}
