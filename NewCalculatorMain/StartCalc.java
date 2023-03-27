package NewCalculatorMain;
import java.util.Scanner;

public class StartCalc {
    private static String usersInput;
    public static void startCalc(){

        dataInput();
        usersInput = usersInput.replaceAll("\\s", "");

        AllChecks.checkCeloeChislo(usersInput);
        AllChecks.checkColichestvoChlenov(usersInput);

        String[] numbers = usersInput.split("[/*+-]");

        Math.Math(numbers[0], numbers[1], AllChecks.checkAndSetMathOperator(usersInput));


    }

    private static void dataInput(){
        Scanner inPut = new Scanner(System.in);
        System.out.println();
        System.out.println("Вводить можно только целые числа от 1 до 10,");
        System.out.println("а также либо ТОЛЬКО арабские цифры, либо ТОЛЬКО римские цифры.");
        System.out.print("Введите ваше выражение: ");
        usersInput = inPut.nextLine();
    }
}
