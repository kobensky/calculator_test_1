package NewCalculatorMain;

public class Math {

    public static void Math(String s1, String s2, String mathOperator){
        if(AllChecks.checkString(s1) && AllChecks.checkString(s2)){
            // Делаем математику для арабских

            System.out.println("Ответ: " + MathOperations(s1, s2, mathOperator));
        }
        else if (!AllChecks.checkString(s1) && !AllChecks.checkString(s2)){
            // Делаем математику для римских
            System.out.println("Ответ: " + Converter.arabicToRome(MathOperations(Converter.romeToArabic(s1),
                    Converter.romeToArabic(s2), mathOperator)));
        }
        else {
            System.out.println("У вас тут залупа а не выражение");
        }
    }

    private static int MathOperations(String firstN, String secondN, String mathOp){
        int n1 = Integer.parseInt(firstN);
        int n2 = Integer.parseInt(secondN);
        int result;
        switch (mathOp){
            case "+": result = n1+n2; break;
            case "-": result = n1-n2; break;
            case "*": result = n1*n2; break;
            case "/": result = n1/n2; break;
            default: throw new IllegalStateException("Похоже ты хуй, раз попал сюда");
        }
        return result;

    }
}
