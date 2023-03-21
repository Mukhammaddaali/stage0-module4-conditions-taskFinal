package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int temp;
        if (divider==0) System.out.println("division by zero"); else {
            temp=dividend/divider;
            if (dividend==divider*temp) System.out.println("can be divided completely"); else System.out.println("cannot be divided completely");
        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printCompletelyDivided(x,y);
    }
}
