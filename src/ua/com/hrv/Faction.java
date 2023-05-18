package ua.com.hrv;

import java.util.*;

public class Faction {
    private String fName;
    List<Diputat> diputats = new ArrayList<>();
    private int weight;
    private int height;
    private String name;
    private String surname;
    private boolean habar;
    private int habarSize;


    public Faction(String fname) {
        fName = fname;
    }

    public String getfName() {
        return fName;
    }

    public void setFname(String fname) {
        fName = fname;
    }

    public List<Diputat> getDiputats() {
        return diputats;
    }

    public void setDiputats(List<Diputat> diputats) {
        this.diputats = diputats;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public boolean isHabar() {
        return habar;
    }

    public void setHabar(boolean habar) {
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
        return "Faction{" +
                "diputats=" + diputats +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", habar=" + habar +
                ", habarSize=" + habarSize +
                '}';
    }


    public void addDiputat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть ім'я депутата: ");
        setName(scanner.next());
        System.out.println("Вкажіть прізвище депутата: ");
        setSurname(scanner.next());
        System.out.println("Напишіть true, якщо депутат хабарник або false, якщо не хабарник: ");
        setHabar(scanner.nextBoolean());
        System.out.println("Вкажіть вагу депутата: ");
        setWeight(Integer.parseInt(scanner.next()));
        System.out.println("Вкажіть ріст депутата: ");
        setHeight(scanner.nextInt());
        diputats.add(new Diputat(weight, height, name, surname, habar));

    }

    public void vuvid() {
        System.out.println(diputats);
    }

    public void cleanAll() {
        diputats.clear();
    }

    public void deleteDip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть прізвище депутата: ");
        diputats.removeIf(next -> next.getSurname().equalsIgnoreCase(scanner.next()));
    }

    public void allHabarnyk() {
        Iterator<Diputat> iterator = diputats.iterator();
        while (iterator.hasNext()) {
            Diputat next = iterator.next();
            if (next.getHabar() == true) {
                System.out.println(next);
            }
        }
    }

    public void bigHubar(){
        Collections.sort(diputats,new DiputatHubarSizeSorting());
        System.out.println(diputats.get(diputats.size()-1));
    }
}
