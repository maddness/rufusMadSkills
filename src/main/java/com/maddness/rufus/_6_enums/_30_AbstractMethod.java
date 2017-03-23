package com.maddness.rufus._6_enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aostrikov
 */
public class _30_AbstractMethod {
    public enum Operation {
        PLUS("+") {
            double apply(int a, int b) {
                return a + b;
            }
        },
        MINUS("-") {
            double apply(int a, int b) {
                return a - b;
            }
        },
        TIMES("*") {
            double apply(int a, int b) {
                return a * b;
            }
        },
        DIVIDE("/") {
            double apply(int a, int b) {
                return (double) a / b;
            }
        };

        private String symbol;

        private static final Map<String, Operation> stringToOperation = new HashMap<>();

        static {
            for (Operation o: Operation.values()) {
                stringToOperation.put(o.toString(), o);
            }
        }

        Operation(String symbol) {
            this.symbol = symbol;
        }

        abstract double apply(int a, int b);

        public static Operation fromString(String s) {
            return stringToOperation.get(s);
        }

        @Override
        public String toString() {
            return symbol;
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        for (Operation i : Operation.values()) {
            System.out.println(String.format("%s %s %s = %s", a, i, b, i.apply(a, b)));
        }
    }
}
