package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first=first^second;
        second=first^second;
        first=first^second;
        System.out.println(first);
        System.out.println(second);
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        swap(x,y);
    }
}
