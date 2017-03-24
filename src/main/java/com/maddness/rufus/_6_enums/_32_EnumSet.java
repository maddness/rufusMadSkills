package com.maddness.rufus._6_enums;

import java.util.EnumSet;
import java.util.Set;

import static com.maddness.rufus._6_enums._32_EnumSet.Species.GARLIC;
import static com.maddness.rufus._6_enums._32_EnumSet.Species.SALT;

/**
 * @author aostrikov
 */
public class _32_EnumSet {
    enum Species {
        GARLIC,
        PEPPER,
        SALT
    }

    public static void main(String[] args) {
        addSpecies(EnumSet.of(GARLIC, SALT));
    }

    private static void addSpecies(Set<Species> species) {
        System.out.println(species);
    }
}
