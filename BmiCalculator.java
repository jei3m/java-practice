import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        
        // declare variables
        Scanner scn = new Scanner(System.in);   
        
        double weight = 0; // in (kg)
        double height = 0; // in (m)
        double bmi = 0;


        System.out.println("INPUT YOUR WEIGHT IN KG:");
        weight = scn.nextDouble();

        System.out.println("INPUT YOU HEIGHT IN METERS:");
        height = scn.nextDouble();


        bmi = weight / (height * height);

        System.out.println("=====BMI REPORT=====");
        System.out.println("weight: " + weight + " kg");
        System.out.println("height: " + height + " meters");
        System.out.println("BMI: " + bmi);
        

        if(bmi >= 30.0){

            System.out.println("Obese");
        }
        
        else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("Overweight");

        }
        else if (bmi >= 18.5 && bmi <=24.9 ){
            System.out.println("Normal");
        }
        else{
            System.out.println("Underweight");
        }
        
        if (bmi <=  18.5 && bmi <= 24.9 ){
            System.out.println("Category: Keep it up");
        }
        else{
            System.out.println("Category: See a Doctor");
        }
        scn.close();

    }
}