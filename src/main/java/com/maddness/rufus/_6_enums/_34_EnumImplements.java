package com.maddness.rufus._6_enums;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author aostrikov
 */
public class _34_EnumImplements {

    public static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();

    enum Task implements Runnable {
        FIBONACCI {
            @Override
            public void run() {
                System.out.println("\nFIBONACCI");
                long a = 0;
                long b = 1;

                while (a + b >= 0) {
                    long c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
            }
        },
        SQRT {
            @Override
            public void run() {
                System.out.println("\nSQRT");
                double root = 89453;
                while (!Thread.interrupted() && root > 1) {
                    root = Math.sqrt(root);
                    System.out.println(root);
                }
            }
        }
    }

    public static void main(String[] args) {
        run(Task.class);
        run(Arrays.asList(Task.values()));

        EXECUTOR.shutdown();
    }

    private static <T extends Enum<T> & Runnable> void run(Class<T> clazz) {
        for (T task : clazz.getEnumConstants()) {
            EXECUTOR.execute(task);
        }
    }

    private static void run(Collection<? extends Runnable> tasks) {
        tasks.forEach(EXECUTOR::execute);
    }
}
