package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x==0||y==0) System.out.println("zero");else
            if (x>0){
                if (y>0) System.out.println("first"); else System.out.println("fourth");
            } else {
                if (y>0) System.out.println("second");else System.out.println("third");
            }
        }
        public void main(String []args){
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            printQuadrant(x,y);
        }
}
