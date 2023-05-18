package ua.com.hrv;

import java.util.Scanner;

public class Diputat extends Person {
    private String name;
    private String surname;
    private Boolean habar;
    private int habarSize;

    public Diputat(int weight, int height, String name, String surname, Boolean habar) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.habar = habar;
        habarAdd();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getHabar() {
        return habar;
    }

    public void setHabar(Boolean habar) {
        this.habar = habar;
    }

    public int getHabarSize() {
        return habarSize;
    }

    public void setHabarSize(int habarSize) {
        this.habarSize = habarSize;
    }

    @Override
    public String toString() {
        return "Diputat{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", habar=" + habar +
                ", habarSize=" + habarSize +
                '}';
    }

    public void habarAdd() {

        while (true) {
            if (!getHabar()) {
                System.out.println("Депутат не бере хабарів");
                break;
            } else if (this.habar = true) {
                System.out.println("Напишіть розмір хабаря");
                Scanner scanner = new Scanner(System.in);
                int next = scanner.nextInt();
                if (next >= 5000) {
                    System.out.println("Депуат заарештований");
                    break;
                } else if (4999 > next) {
                    setHabarSize(next);
                    System.out.println("Дані додано в особисту справу");
                    break;

                }
            }
        }
    }

}
