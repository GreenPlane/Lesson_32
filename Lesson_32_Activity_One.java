import java.util.Scanner;

public class Lesson_32_Activity_One {
    public static void monthName(int x){
        String [] months = {null, "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(months[x]);
    }
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        monthName(x);
    }

}
