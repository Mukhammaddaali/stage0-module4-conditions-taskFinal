package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if ( year>0 && month>0&& month<13){
           int day=0;
          switch (month){
              case 1:
              case 3:
              case 5:
              case 7:
              case 8:
              case 10:
              case 12:day=31;break;
              case 2: if (year%4!=0 || year%100==0&&year%400!=0) day=28;else day=29;break;
              case 4:
              case 6:
              case 9:
              day=30;break;


          }

            System.out.println(day);
        } else System.out.println("invalid date");

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();
        printDays(year,month);
    }
}
