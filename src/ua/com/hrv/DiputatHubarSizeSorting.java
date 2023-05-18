package ua.com.hrv;

import java.util.Comparator;

public class DiputatHubarSizeSorting implements Comparator<Diputat> {
    @Override
    public int compare(Diputat d1, Diputat d2) {
        return d1.getHabarSize() > d2.getHabarSize() ? 1: -1;
    }
}
