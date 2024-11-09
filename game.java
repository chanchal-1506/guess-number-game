import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int userNumber=0;
        int myNumber =(int)(Math.random()*100);

        do{
            System.out.println("Guess my number");
            userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("WOOHOO.. correnct Number!!!");
            }
            else if (userNumber > myNumber){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
        }while(userNumber>=0);
        System.out.println("my number was:");
        System.out.println(myNumber);
    }}


