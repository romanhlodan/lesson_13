package ua.com.hrv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VR {
    private static VR instance;

    private VR() {
    }

    public static VR getInstance() {
        if (instance == null) {
            instance = new VR();
        }
        return instance;
    }

    List<Faction> factions = new ArrayList<Faction>();
    private String fName;

    public List<Faction> getFactions() {
        return factions;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fname) {
        fName = fname;
    }

    @Override
    public String toString() {
        return "VR{" +
                "factions=" + factions +
                ", fName='" + fName + '\'' +
                '}';
    }

    public void addFr() {
        System.out.println("Введіть назву фракції: ");
        Scanner scanner = new Scanner(System.in);
        setfName(scanner.next());
        factions.add(new Faction(fName));
    }

    public void deleteFr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції: ");
        factions.removeIf(next -> next.getfName().equalsIgnoreCase(scanner.next()));
    }

    public void allVuvid() {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction next = iterator.next();
            System.out.println(next.getfName());
        }
    }

    public void oneVuvid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції: ");
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction next = iterator.next();
            if (next.getfName().equalsIgnoreCase(scanner.next())) {
                System.out.println(next);
            }
        }
    }

    public void addDipInFc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції: ");
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction next = iterator.next();
            if (next.getfName().equalsIgnoreCase(scanner.next())) {
                next.addDiputat();
            }
        }
    }

    public void delDipInFc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції: ");
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction next = iterator.next();
            next.deleteDip();
        }
    }
}
