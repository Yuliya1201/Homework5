package com.javacource.se.homework5;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 18;
        if (age == 18 && age < 18) {
            System.out.println("человек может водить");
        } else {
            System.out.println("не может водить несовершеннолетний");
            //Задание 2
            int child = 7;
            int x = 7;
            if (child >= x) {
                System.out.println("Ребенок ходит в школу");
                int ageMan = 18;
                if (ageMan >= 18) {
                    System.out.println("человек закончил школу и может отправляться в университет");
                    int men = 24;
                    if (men >= 24) {
                        System.out.println("Пора искать работу если человеку 24 года");
                        //    Задание3
                        int vagon = 102;
                        int settingsPlace = 60;
                        int stayPlace = 50;
                        if (vagon <= 102 && settingsPlace == 60 && stayPlace == 42) {
                            System.out.println("то вагон полный сидячих мест 60");
                        } else {
                            System.out.println("сидячих мест нет && сточих мест не осталось && вагон полный");
                            int v = 5;
                            int k = 10;
                            int с = 19;
                            int f = 24;
                            if (v >= 2 || v < 7) {
                                System.out.println("ребенок дошкольного возраста");
                                if (k >= 7 && k <= 18) {
                                    System.out.println("Ребенок учится в школе");
                                    if (с >= 18 || с <= 24) {
                                        System.out.println("Человек учиться в институте");
                                        if (f == 24 || f > 24) ;
                                        System.out.println("Человек может работать");
                                        //                        Задание 4
                                        int childV = 3;
                                        if (childV < 5) {
                                            System.out.println("Ребенок не может кататься на аттракционах");
                                            int childS = 10;
                                            if (childS >= 5 & childS < 14) {
                                                System.out.println("Ребенок может кататься в сопровождении взрослого");
                                                int Age = 15;
                                                if (Age > 14) {
                                                    System.out.println("Может кататься без сопровождения взрослого с 14 лет");
                                                    //                        Задание 5
                                                    int one = 10;
                                                    int two = 20;
                                                    int free = 5;
                                                    if (10 > 5 & 10 > 20 & 5 > 20) {
                                                        System.out.println("Значит значение переменной one больше значения переменной free");
                                                    } else {
                                                        System.out.println("20>10 & 20 > 5");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
