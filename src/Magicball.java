import java.util.Scanner;

public class Magicball {
    public static void main(String[]args){

        int number;
        Scanner keyboard;


        keyboard=new Scanner(System.in);


        System.out.println("Please enter a number");
        number=keyboard.nextInt();

        if(number>=1 && number<=10){
            System.out.println("Great luck");
        }
        else if (number>=11 && number<=20){
            System.out.println("Sweet dreams my dear");
        }
        else if (number>=12 && number<=20){
            System.out.println("I see sunshine up ahead");
        }
        else if (number>=21 && number<=30){
            System.out.println("Someone up there must really like you");
        }
        else if (number>=41 && number<=50){
            System.out.println("Nice Moves my dude");
        }
        else if (number>=51 && number<=60) {
            System.out.println("Sorry try again");
        }
        else if(number>=61 && number<=70){
            System.out.println("Is that a dark cloud I see ?");
        }
        else if(number>=71 && number<=80){
            System.out.println("Bad luck");
        }
        else if(number>=81 && number<=90){
            System.out.println("That's just sad");
        }
        else if(number>=91 && number<=100){
            System.out.println("That's the end for you");
        }

    }

}
