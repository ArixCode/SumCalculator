import java.util.Scanner;

public class SumCalculator {

    public static void main (String[] args){
        
        // Es wird nach der Eingabe von Zahlen gefragt
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter Q to end):");


        // Sum wird auf 0 gesetzt und während die Eingabe != 'Q' ist wird nach weiteren Zeichen gefragt (Zeichenfolge wird im String input gespeichert)
        double sum = 0;
        while (true) {
            String input = scanner.next();
            if (input.equals("Q")) {
                break; // Beendet die Schleife, wenn 'Q' eingegeben wird
            }

            // Es wird versucht jedes Zeichen der Zeichenkette in eine Zahl zu speichern (da die Zahlen in einem String in Ihrer Hüllklasse sind) und bei Nicht-Zahlen wird eine Exception geworfen wenn diese vorzufinden ist
            try {
                double num = Double.parseDouble(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'Q' to terminate.");
            }
        }

        System.out.println("Sum of the numbers entered: " + sum);
    }
}



