import java.util.Scanner;

public class HelloWrld {
    public static void main(String[] args){
        
        String greet = "Hello World, My name is Durga, How are you?";

       

        for(char st : greet.toCharArray()){
            System.out.print(st);
        }

        System.out.print("\ninput your response: ");

        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        System.out.println("Your response is: " + response);


        


    }
}
