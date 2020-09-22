package info.jackwade.weightconverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Print to user instructions & Obtain Weight and unit
        WeightConversion conversionInput = printOutInstructions();

        //Process conversion
        WeightConversion conversionOutput = weightConversion(conversionInput);

        //Print out converted values
        System.out.println("Kilograms: " + String.format("%.2f",conversionOutput.kilogramV));
        System.out.println("Pounds: " + String.format("%.2f",conversionOutput.poundV));
        System.out.println("Stone: " + String.format("%.2f",conversionOutput.stoneV));
        System.out.println("Grams: " + String.format("%.2f",conversionOutput.gramV));
    }

    private static WeightConversion printOutInstructions() {
        Scanner weightEntry = new Scanner(System.in);
        Scanner unitEntry = new Scanner(System.in);

        System.out.println("Welcome, please enter the weight that you would like to convert:");
        String weight = weightEntry.nextLine();
        System.out.println("Please now enter the current measurement unit:");
        Character unit = unitEntry.nextLine().charAt(0);

        return new WeightConversion(weight,unit);
    }

    public static WeightConversion weightConversion(WeightConversion input) {
        float weightValue = Float.parseFloat(input.weight);
        //Parse current unit to identify applicable conversions
        switch (input.unit) {
            case 'k':
                input.kilogramV = weightValue;
                input.poundV = weightValue * 2.205f;
                input.stoneV = weightValue / 6.35f;
                input.gramV = weightValue * 1000f;
                break;
            case 'P':
                input.kilogramV = weightValue / 2.205f;
                input.poundV = weightValue;
                input.stoneV = weightValue / 14f;
                input.gramV = weightValue * 454f;
                break;
            case 's':
                input.kilogramV = weightValue * 6.35f;
                input.poundV = weightValue * 14f;
                input.stoneV = weightValue;
                input.gramV = weightValue * 6350f;
                break;
            case 'g':
                input.kilogramV = weightValue / 1000f;
                input.poundV = weightValue / 454f;
                input.stoneV = weightValue / 6350f;
                input.gramV = weightValue;
                break;
        }
    return input;
    }
}
