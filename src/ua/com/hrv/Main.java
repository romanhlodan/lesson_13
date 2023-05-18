package ua.com.hrv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Faction faction = new Faction("ruga");

        VR rada = VR.getInstance();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            switch (scanner.nextInt()) {

                case 1: {
                    rada.addFr();
                    break;
                }
                case 2: {
                    rada.deleteFr();
                    break;
                }
                case 3: {
                    rada.allVuvid();
                    break;
                }
                case 4: {
                    faction.cleanAll();
                    break;
                }
                case 5: {
                    rada.oneVuvid();
                    break;
                }
                case 6: {
                    rada.addDipInFc();
                    break;
                }
                case 7: {
                    rada.delDipInFc();
                    break;
                }
                case 8: {
                    faction.allHabarnyk();
                    break;
                }
                case 9: {
                    System.out.println("Не вийшло");
                }

            }
        }
    }

    public static void menu() {
        System.out.println("Натисніть 1 щоб додати фракцію");
        System.out.println("Натисніть 2 щоб видалити конкретну фракцію");
        System.out.println("Натисніть 3  щоб вивести усі  фракції");
        System.out.println("Натисніть 4 щоб очистити конкретну фракцію");
        System.out.println("Натисніть 5 щоб вивести конкретну фракцію");
        System.out.println("Натисніть 6 щоб додати депутата в фракцію");
        System.out.println("Натисніть 7 щоб видалити депутата з фракції");
        System.out.println("Натисніть 8 щоб вивести список хабарниківів");
        System.out.println("Натисніть 9 щоб вивести найбільшого хабарника");
    }
}
