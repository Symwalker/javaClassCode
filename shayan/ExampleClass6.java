import java.util.Scanner;
public class ExampleClass6 {
    public static void main(String args[]) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);


int[] news = new int[5];
news[0] = 33;
news[1] = 23;
System.out.println(news[0]);

int[] cars = {1,2,3,4,5};
        for(int i :cars){
            System.out.println(i);
        }
    }
}
