package NewCalculatorMain;

public class AllChecks {
    public static void checkCeloeChislo(String s1){
        if (s1.contains(".") || s1.contains(",")){
            throw new IllegalStateException("Вы ввели не целые числа");
        }
    }
    public static void checkColichestvoChlenov(String s1){
        String[] usersArgs = s1.split("[/*+-]");
        if (usersArgs.length > 2) {
            throw new IllegalStateException("Вы ввели более 2ух чисел " +
                    "или более одного математического оператора");
        }
    }
    public static String checkAndSetMathOperator(String s1){
        if (s1.contains("+")){
            return "+";
        }
        else if (s1.contains("-")){
            return "-";
        }
        else if (s1.contains("*")){
            return "*";
        }
        else if (s1.contains("/")){
            return "/";
        }
        else {
            throw new IllegalStateException("Вы ввели некорректный " +
                    "математический оператор, или забыли его ввести");
        }
    }
    public static boolean checkString(String s1) {
        try {
            Integer.parseInt(s1);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
