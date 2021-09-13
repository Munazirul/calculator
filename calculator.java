import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Which operation do you wnat to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square of a number");
        System.out.println("6. Square root of a number");
        int a = sc.nextInt();
        if (a>6) 
            System.out.println("Invaid choice!");
        
        else if(a==5){
            System.out.println("Enter the number:");
            int num1 =sc.nextInt();
            int sqr = num1*num1;    
            System.out.println("Square of a given number is: "+sqr);
        }
             
       
        else if(a==6){
            System.out.println("Enter the number:");
            int num2 =sc.nextInt();
            System.out.println(Math.sqrt(num2));
        }
        
        
        else
            System.out.println("Enter the two numbers:");
            double b = sc.nextInt();
            double c = sc.nextInt();
            double sum   =b+c;
            double Sub   =b-c;
            double multi =b*c;
            double div   =b/c;
            sc.close();
            switch (a) {
                case 1:
                    System.out.println("The addition of two numbers is:"+ sum);
                    break;
                case 2:
                System.out.println("The subtraction of two numbers is:"+ Sub);
                     break;
                case 3:
                System.out.println("The multiplication of two numbers is:"+ multi);
                     break;
                case 4:
                System.out.println("The division of two numbers is:"+ div);
                     break;
                default:
                System.out.println("Invalid choice!!");
                    break;   
            }
        }
       
    }
