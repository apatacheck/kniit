import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Консольный калькулятор (для выхода введите 'exit')");

        while (true) {
            System.out.print("Введите первое число: ");
            String firstInput = scanner.nextLine();
            if (firstInput.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.nextLine();
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            System.out.print("Введите второе число: ");
            String secondInput = scanner.nextLine();
            if (secondInput.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                double firstNumber = Double.parseDouble(firstInput);
                double secondNumber = Double.parseDouble(secondInput);
                double result;

                switch (operator) {
                    case "+": result = calculator.add(firstNumber, secondNumber); break;
                    case "-": result = calculator.subtract(firstNumber, secondNumber); break;
                    case "*": result = calculator.multiply(firstNumber, secondNumber); break;
                    case "/": result = calculator.divide(firstNumber, secondNumber); break;
                    default:
                        System.out.println("Ошибка: Неверный оператор\n");
                        continue;
                }

                System.out.println("Результат: " + result + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число!\n");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage() + "\n");
            }
        }

        scanner.close();
    }
}