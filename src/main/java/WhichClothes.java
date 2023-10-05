import java.util.Scanner;

public class WhichClothes {
    public  static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the weather today?");
        String weatherInput = reader.nextLine();

        System.out.println("What is the temperature?");
        int temperatureInput = Integer.parseInt(reader.nextLine());

        if (weatherInput.equals("rainy")){
            if (temperatureInput == 8){
                System.out.println("Wear a winter rain coat");
            } else if (temperatureInput == 18){
                System.out.println("Wear a light rain coat");
            } else{
                System.out.println("Don't bother with a coat, just wear an umbrella");
            }
        } else if (weatherInput.equals("sunny")){
            if (temperatureInput == 8){
                System.out.println("Lol you must be in England");
            } else if (temperatureInput == 18){
                System.out.println("Suns out, guns out!!");
            } else{
                System.out.println("Don't forget your suncream");
            }
        }
    }
}
