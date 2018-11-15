import java.util.Scanner;

public class Lesson_32_Activity_Two {
    public static void monthDays(int x){
        if (x == 1|| x == 3 || x==5||x== 7||x== 8||x== 10||x== 12){
            System.out.println("31");
        }
        else if (x == 2){
            System.out.println("28");
        }
        else{
            System.out.println("30");
        }
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        monthDays(x);
    }
}
