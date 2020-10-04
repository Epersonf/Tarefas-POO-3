package me.br.ex4;

import me.br.ex4.classes.Data;

public class Ex4 {
	public static void main(String[] args) {
		Data date = new Data("Agosto", 7, 2000);
		Data date2 = new Data("Setembro", 1, 2000);
		Data date3 = new Data(7, 9, 2000);
		Data date4 = new Data(7, 9, 2000);
		Data date5 = new Data(256, 2000);
		Data date6 = new Data(2, 2000);
		System.out.println(date.stringifyDate());
		System.out.println(date2.stringifyDate());
		System.out.println(date3.stringifyDate());
		System.out.println(date4.stringifyDate());
		System.out.println(date5.stringifyDate());
		System.out.println(date6.stringifyDate());
	}
}
