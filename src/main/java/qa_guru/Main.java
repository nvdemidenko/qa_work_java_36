package qa_guru;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int i = 1;
        int k = 4;

        int sum = i + k;
        int dif = k - i;
        int mult = i * k;
        int div = k / i;
        int rem = sum % k;

        System.out.println("Сумма чисел " + i + " и " + k + " равна " +sum); // 20
        System.out.println("Разность чисел " + k + " и " + i + " равна " + dif); // 20
        System.out.println("Произведение чисел " + i + " и " + k + " равно " + mult); // 20
        System.out.println("Деление " + k + " на " + i + " равно " + div); // 20
        System.out.println("Отстаток от деления " + sum + " на " + k + " равен " + rem); // 20

        // применить несколько арифметических операций над int и double в одном выражении
        i = 9;
        double d = 5.5;

        double expression  = (i + d)/(i - d);

        System.out.println("Результат операций над int и double в одном выражении: " + expression);

        //применить несколько логических операций ( < , >, >=, <= )
        int x = 1;
        int y = 0;
        int z = 0;

        System.out.println("выражение x > y: " + (x > y));
        System.out.println("выражение x < y: " + (x < y));
        System.out.println("выражение x >= 1: " + (x >= 1));
        System.out.println("выражение y <= 0: " + (y <= 0));

        // получить переполнение при арифметической операции
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное значение для типа int: " + maxValue);

        int nextToMax = maxValue + 1;
        System.out.println("К максимальному значению " + maxValue + " + 1: " + nextToMax);

    }
}