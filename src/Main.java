import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //5 Подсчёт положительных из N вводимых Ввод: N, затем N целых. Вывести: сколько из них > 0.

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Введите количество чисел: ");
//        int a = scanner.nextInt();
//        int count = 0;
//        System.out.print("Введите число: ");
//        for (int i = 1; i <= a; i++) {
//            int b = scanner.nextInt();
//            if (b > 0) count++;
//            if (i!=a) System.out.print("Введите число: ");
//        }
//        System.out.println(count);

//      6  Степени двойки до N Ввод: N (N ≥ 1). Вывести: 1 2 4 8 ... пока число ≤ N. Подсказка: for (long x =        1; x <= N; x *= 2).

//        System.out.print("Введите число: ");
//        int a1 = scanner.nextInt();
//
//        for (long i = 1; i <= a1; i*= 2) {
//            System.out.println(i);
//        }

//        7.Сумма цифр числа Ввод: неотрицательное целое n. Вывести: сумму его цифр. Подсказка: for (; n > 0; n /= 10) sum += n % 10; (обработайте n==0 отдельно).

//        System.out.print("Введите число: ");
//        int a2 = scanner.nextInt();
//        int sum = 0;
//        if (a2 == 0) {
//            System.out.println(0) ;
//        }
//        else{
//            for (int i = a2; i > 0; i /= 10) {
//                sum+=i%10;
//            }
//            System.out.println(sum);
//        }

//        8.Разворот числа Ввод: одно число n. Вывести: n в обратном порядке.

//        System.out.print("Введите число: ");
//        int a3 = scanner.nextInt();
//        int reserved = 0;
//
//        for (int i = a3; i > 0; i /= 10) {
//            reserved=reserved*10+i%10;
//            }
//            System.out.println(reserved);

//        9.Проверка числа на простоту Ввод: n (n ≥ 2). Вывести: YES, если простое, иначе NO. Подсказка: проверять делители до i*i ≤ n (один for).

//        System.out.print("Введите число (n ≥ 2): ");
//        int a4 = scanner.nextInt();
//        boolean IsPrime = true;
//        if (a4 % 2 == 0) {
//            System.out.println("NO" );
//        }
//        else {
//            for (int i = 3; i*i <= a4; i +=2) {
//                if (a4 % i == 0) {
//                    IsPrime = false;
//                    break;
//                }
//            }
//            System.out.println(IsPrime ? "YES" : "NO");
//        }

//        10.Арифметическая прогрессия Ввод: a, d, n. Вывести: первые n членов прогрессии: a, a+d, a+2d, .... Подсказка: печатайте с пробелом, заканчивайте переводом строки.

        System.out.print("Введите число a: ");
        int a5 = scanner.nextInt();
        System.out.print("Введите число d: ");
        int d5 = scanner.nextInt();
        System.out.print("Введите число n: ");
        int n5 = scanner.nextInt();

        int t5 = 0;
        for (int i = 1; i <= n5; i ++) {
            t5= a5+d5*i;
            System.out.print(" "+t5);
        }







    }
}