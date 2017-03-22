package com.maddness.rufus._6_enums;

/**
 * @author aostrikov
 */
public class _30_AbstractMethod {
    enum Operation {
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

        Operation(String symbol) {
            this.symbol = symbol;
        }

        abstract double apply(int a, int b);

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
