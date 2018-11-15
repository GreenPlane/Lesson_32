import java.util.Scanner;

public class Lesson_32_Activity_Four {
    public static void realTime(int x){
        int hours = x/3600;
        int minutes = (x-(hours * 3600))/60;
        int seconds = (x-((hours * 3600)+(minutes * 60)));

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        int x = scan.nextInt();

        realTime(x);
    }
}
