import java.util.Scanner;

public class Task2 {

    //Static variable(belongs to class share by all objects)
    static int sv = 100;

    //instance variable(belongs to object)
    double iv = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =10; //4 byte
        char ch ='a'; //2 byte
        double d = 1.0; //8 byte
        float f = 12.0f; //4 byte
        boolean flag = true; //1 byte
        short s = 1000; //2 byte
        long l = 10000; //8 byte
        byte b = 100; //1 byte

        System.out.println("int "+i);
        System.out.println("float "+f);
        System.out.println("char "+ch);
        System.out.println("boolean "+flag);
        System.out.println("short "+s);
        System.out.println("long "+l);
        System.out.println("double "+d);
        System.out.println("byte "+b);

        //User Input
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        //Conditionals
        if (age>=18){
            System.out.println("valid to vote");
        }
        else{
            System.out.println("not valid to vote");
        }

        System.out.print("Enter first number:");
        int x = sc.nextInt();

        System.out.print("Enter second number:");
        int y = sc.nextInt();

        int sum = x+y;
        System.out.print("sum is:"+sum);

        //typecasting
        int p = 10;
        double q = p;
        System.out.println("Type casting of integer into double is:"+q);

        Task2 obj =new Task2();
        int lv = 50; // local variable

        System.out.println("local variable:" +lv);
        System.out.println("Static variable:"+sc);
        System.out.println("Instance variable:"+ obj.iv);
    }
}
