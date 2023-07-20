import java.util.Scanner;
public class MyCalc {
    public static void main(String args[]){
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Bem vindo ao MyCalc!");

        System.out.println("Digite o primeiro número da sua operação:");
        double FirstNumber = UserInput.nextDouble();

        System.out.println("Digite o segundo número da sua operação:");
        double SecondNumber = UserInput.nextDouble();

        System.out.println("Qual operação deseja executar?");
        System.out.println("1. Adição.");
        System.out.println("2. Subtração.");
        System.out.println("3. Multiplicação.");
        System.out.println("4. Divisão.");
        System.out.println("5. Módulo");
        int AritmeticalOperation = UserInput.nextInt();

        switch (AritmeticalOperation) {
            case 1:
                double SumResult = FirstNumber + SecondNumber;
                System.out.println("O resultado da adição de " + FirstNumber + " + " + SecondNumber + " é: " + SumResult);
                break;
            case 2:
                double SubtractResult = FirstNumber - SecondNumber;
                System.out.println("O resultado da subtração de " + FirstNumber + " + " + SecondNumber + " é: " + SubtractResult);
                break;
            case 3:
                double MultiplyResult = FirstNumber * SecondNumber;
                System.out.println("O resultado da multiplicação de " + FirstNumber + " + " + SecondNumber + " é: " + MultiplyResult);
                break;
            case 4:
                double DivisionResult = FirstNumber / SecondNumber;
                System.out.println("O resultado da divisão de " + FirstNumber + " + " + SecondNumber + " é: " + DivisionResult);
                break;
            case 5:
                double ModResult = FirstNumber % SecondNumber;
                System.out.println("O resultado da módulo de " + FirstNumber + " + " + SecondNumber + " é: " + ModResult);
                break;
        }

    }
}