package com.company.jwd.task1;


import com.company.jwd.task1.count_func.CountFunction;
import com.company.jwd.task1.daysnumber_yeartype_func.DaysYearFunction;
import com.company.jwd.task1.lastnumber_func.LastNumberFunction;
import com.company.jwd.task1.number_perfect_func.NumberPerfectFunction;
import com.company.jwd.task1.point_distance_func.PointDistanceFunction;
import com.company.jwd.task1.round_params_func.RoundParamsFunction;
import com.company.jwd.task1.square_diff_func.SquareDiffFunction;
import com.company.jwd.task1.table_tg_func.TableTgFunction;
import com.company.jwd.task1.time_seconds_func.TimeSecondsFunction;
import com.company.jwd.task1.two_even_func.TwoEvenFunction;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {

        while (true) {
            printMenu();
            System.out.print("Введите любое целое число от 1 до 11: ");
            Scanner scan = new Scanner(System.in);
            while (!scan.hasNextInt()) {
                System.out.println("Input is not a number.");
                scan.nextLine();
            }
            int chosen = scan.nextInt();

            switch (chosen) {
                case 1: {
                    func1();
                    break;
                }
                case 2: {
                    func2();
                    break;
                }
                case 3: {
                    func3();
                    break;
                }
                case 4: {
                    func4();
                    break;
                }
                case 5: {
                    func5();
                    break;
                }
                case 6: {
                    func6();
                    break;
                }
                case 7: {
                    func7();
                    break;
                }
                case 8: {
                    func8();
                    break;
                }
                case 9: {
                    func9();
                    break;
                }
                case 10: {
                    func10();
                    break;
                }
                case 11: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Введите правильный номер функции");
                    break;
                }
            }
        }
    }

    private static void func1() {
        LastNumberFunction lastNumberFunction = new LastNumberFunction();
        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int input = scan.nextInt();

        System.out.println("Answer is " + lastNumberFunction.findLastNumber(input));
    }

    private static void func2() {
        DaysYearFunction daysYearFunction = new DaysYearFunction();

        System.out.print("Input year number ");
        Scanner scan1 = new Scanner(System.in);
        while (!scan1.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan1.nextLine();
        }
        int year = scan1.nextInt();

        System.out.print("Input month number ");
        Scanner scan2 = new Scanner(System.in);
        while (!scan2.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan2.nextLine();
        }
        int month = scan2.nextInt();

        System.out.println("Answer is " + daysYearFunction.findDaysNumberYearType(year, month));
    }

    private static void func3() {
        SquareDiffFunction squareDiffFunction = new SquareDiffFunction();

        System.out.println("Input square of bigger square");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        double input = scan.nextDouble();

        System.out.println("Answer is " + squareDiffFunction.findSquareDiff(input));
    }

    private static void func4() {
        TwoEvenFunction twoEvenFunction = new TwoEvenFunction();

        int[] mas = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Input " + i + " number");
            Scanner scan = new Scanner(System.in);
            while (!scan.hasNextInt()) {
                System.out.println("Input is not a number.");
                scan.nextLine();
            }
            mas[i] = scan.nextInt();
        }

        System.out.println("Answer is " + twoEvenFunction.ifTwoEven(mas[0], mas[1], mas[2], mas[3]));
    }

    private static void func5() {
        NumberPerfectFunction numberPerfectFunction = new NumberPerfectFunction();
        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int input = scan.nextInt();

        System.out.println("Answer is " + numberPerfectFunction.isNumberPerfect(input));
    }

    private static void func6() {
        TimeSecondsFunction timeSecondsFunction = new TimeSecondsFunction();
        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int input = scan.nextInt();

        System.out.println("Answer is " + timeSecondsFunction.findTimeWithSecond(input));
    }

    private static void func7() {
        PointDistanceFunction pointDistanceFunction = new PointDistanceFunction();

        System.out.print("Input x1 number ");
        Scanner scan1 = new Scanner(System.in);
        while (!scan1.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan1.nextLine();
        }
        int x1 = scan1.nextInt();

        System.out.print("Input y1 number ");
        Scanner scan2 = new Scanner(System.in);
        while (!scan2.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan2.nextLine();
        }
        int y1 = scan2.nextInt();

        System.out.print("Input x2 number ");
        Scanner scan3 = new Scanner(System.in);
        while (!scan3.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan3.nextLine();
        }
        int x2 = scan3.nextInt();

        System.out.print("Input y2 number ");
        Scanner scan4 = new Scanner(System.in);
        while (!scan4.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan4.nextLine();
        }
        int y2 = scan4.nextInt();

        System.out.println("Answer is " + pointDistanceFunction.findPointDistanse(x1, y1, x2, y2));

    }

    private static void func8() {
        CountFunction countFunction = new CountFunction();

        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int input = scan.nextInt();

        System.out.println("Answer is " + countFunction.countFunction(input));
    }

    private static void func9() {
        RoundParamsFunction roundParamsFunction = new RoundParamsFunction();

        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int input = scan.nextInt();

        System.out.println("Answer is " + roundParamsFunction.countRoundParameters(input));
    }

    private static void func10() {
        TableTgFunction tableTgFunction = new TableTgFunction();

        System.out.print("Input a number ");
        Scanner scan1 = new Scanner(System.in);
        while (!scan1.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan1.nextLine();
        }
        int a = scan1.nextInt();

        System.out.print("Input b number ");
        Scanner scan2 = new Scanner(System.in);
        while (!scan2.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan2.nextLine();
        }
        int b = scan2.nextInt();

        System.out.print("Input h number ");
        Scanner scan3 = new Scanner(System.in);
        while (!scan3.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan3.nextLine();
        }
        int h = scan3.nextInt();

        tableTgFunction.createTableTg(a, b, h);

    }

    private static void printMenu() {
        System.out.println("1 - Поиск последней цифры квадрата числа");
        System.out.println("2 - Определение кол-ва дней в месяце и типа года");
        System.out.println("3 - Поиск площади меньшего квадрата и разницы площадей квадратов");
        System.out.println("4 - Проверка массива на наличие 2ух четных чисел");
        System.out.println("5 - Проверка числа на совершенность");
        System.out.println("6 - Перевод секунд в стандартное время");
        System.out.println("7 - Проверка удаленности точек от центра");
        System.out.println("8 - Вычисление значения функции");
        System.out.println("9 - Вычисление длинны и площади круга");
        System.out.println("10 - Вычисление функции на заданном отрезке с шагом");
        System.out.println("11 - Выход");


    }

}

