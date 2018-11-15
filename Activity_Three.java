import java.util.Scanner;

public class Lesson_32_Activity_Three {
    public static void swap (int x, int y){
        System.out.print(y + " " + x);
    }

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        int x = scan.nextInt(), y = scan.nextInt();
        swap(x, y);
    }
}
