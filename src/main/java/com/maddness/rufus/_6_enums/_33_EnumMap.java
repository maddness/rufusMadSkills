package com.maddness.rufus._6_enums;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.maddness.rufus._6_enums._33_EnumMap.Pizza.Size.BIG;
import static com.maddness.rufus._6_enums._33_EnumMap.Pizza.Size.SMALL;

/**
 * @author aostrikov
 */
public class _33_EnumMap {

    public static class Pizza {
        public enum Size {SMALL, BIG}

        private final String name;
        private final Size size;

        Pizza(String name, Size size) {
            this.name = name;
            this.size = size;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Pizza> pizzas = Arrays.asList(
            new Pizza("Margarita", BIG),
            new Pizza("Peperoni", BIG),
            new Pizza("Vegania", SMALL)
        );

        EnumMap<Pizza.Size, Set<Pizza>> pizzaMap = new EnumMap<>(Pizza.Size.class);
        for (Pizza.Size size : Pizza.Size.values()) {
            pizzaMap.put(size, new HashSet<>());
        }

        pizzas.forEach(pizza -> pizzaMap.get(pizza.size).add(pizza));
        System.out.println(pizzaMap);
    }
}
