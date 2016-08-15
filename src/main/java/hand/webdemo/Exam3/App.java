package hand.webdemo.Exam3;
//判断这一天是这一年的第几天

import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args) {
		

		int  months[] ={31,28,31,30,31,30,31,31,30,31,30,31};
		 
		System.out.print("请输入日期:");
		Scanner scanner = new Scanner(System.in);
		String date =  scanner.nextLine();
		
	     
		//获取年月日2016-08-15 
		
		int year = Integer.parseInt(date.substring(0, 4));
		int mon = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
        int current_day = day;
		
		
		if((year %100 !=0 && year% 4== 0) || year % 400 == 0){
			months[1] = 29;      //闰年多一天
		}
		
		for(int i =0;i<mon-1;i++){
			current_day += months[i];//加上本月之前的月份
		}
		
		System.out.println("你输入的日期为当年的第 " +current_day+"天");
	}

		
}

