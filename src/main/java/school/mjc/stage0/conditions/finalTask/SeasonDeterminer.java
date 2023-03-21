package school.mjc.stage0.conditions.finalTask;

import java.util.Scanner;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn"); break;
            default:
                System.out.println("Wrong month number");

        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        tellTheSeason(x);
    }
}
