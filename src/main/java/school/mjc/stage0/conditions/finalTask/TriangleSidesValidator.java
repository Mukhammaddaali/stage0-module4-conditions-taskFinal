package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide+secondSide>thirdSide && firstSide+thirdSide>secondSide && secondSide+thirdSide>firstSide)
            System.out.println("this is a valid triangle");else System.out.println("it's not a triangle");

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        double x,y,z;
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        validate(x,y,z);
    }
}
