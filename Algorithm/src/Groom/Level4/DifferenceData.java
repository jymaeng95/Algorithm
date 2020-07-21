package Groom.Level4;

import java.util.Scanner;

public class DifferenceData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] date1 = scan.next().split("");
		String[] date2 = scan.next().split("");
		String y1="",y2="",m1="",m2="",d1="",d2="";
		for(int i=0;i<4;i++) {
			y1+=date1[i];
			y2+=date2[i];
		}

		for(int i=4;i<6;i++) {
			m1+=date1[i];
			m2+=date2[i];
		}

		for(int i=6;i<8;i++) {
			d1+=date1[i];
			d2+=date2[i];
		}
		int[] mm1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] mm2 = {31,29,31,30,31,30,31,31,30,31,30,31};

		int subYear = Integer.parseInt(y2) - Integer.parseInt(y1);
		int day = 0;

		if(subYear>0) {
			for(int i=0;i<subYear-1;i++) {
				if(isLeap(Integer.parseInt(y1+i))) {
					day+=366;
				}else {
					day+=365;
				}
			}

			int month;
			if(isLeap(Integer.parseInt(y1))) {
				if(date1[4].equals("0")) {
					month = Integer.parseInt(date1[5]);
				}else {
					month = Integer.parseInt(m1);
				}
				for(int i=month;i<12;i++) {
					day+=mm2[i];
				}
				day +=mm2[month-1]-Integer.parseInt(d1);
			}else {
				if(date1[4].equals("0")) {
					month = Integer.parseInt(date1[5]);
				}else {
					month = Integer.parseInt(m1);
				}
				for(int i=month;i<12;i++) {
					day+=mm1[i];
				}
				day +=mm1[month-1]-Integer.parseInt(d1);
			}

			if(isLeap(Integer.parseInt(y2))) {
				if(date2[4].equals("0")) {
					month = Integer.parseInt(date2[5]);
				}else {
					month = Integer.parseInt(m2);
				}
				for(int i=0;i<month-1;i++) {				
					day+= mm2[i];
				}
				day += Integer.parseInt(d2);
			}else {
				if(date2[4].equals("0")) {
					month = Integer.parseInt(date2[5]);
				}else {
					month = Integer.parseInt(m2);
				}
				for(int i=0;i<month-1;i++) {
					day+=mm1[i];
				}
				day +=Integer.parseInt(d2);
			}
		}else {
			int subMonth = Integer.parseInt(m2)-Integer.parseInt(m1);
			if(subMonth>0) {
				if(isLeap(Integer.parseInt(y1))) {
					for(int i=Integer.parseInt(m1);i<Integer.parseInt(m2)-1;i++) {
						day+= mm2[i];
					}
					day+= mm2[Integer.parseInt(m1)-1]-Integer.parseInt(d1);
					day+=Integer.parseInt(d2);
				}else {
					for(int i=Integer.parseInt(m1);i<Integer.parseInt(m2)-1;i++) {
						day+= mm1[i];
					}
					day+= mm1[Integer.parseInt(m1)-1]-Integer.parseInt(d1);
				
					day+=Integer.parseInt(d2);
				
				}
			}else {
				day+= Integer.parseInt(d2)-Integer.parseInt(d1);
				
			}
		}
		System.out.println(day);
	}
	public static boolean isLeap(int year) {

		if(year%4 == 0) {
			return true;
		}else if(year%4==0 && year%100==0) {
			return false;
		}else if(year%4==0 && year%100==0 && year%400 == 0) {
			return true;
		}else 
			return false;
	}
}
