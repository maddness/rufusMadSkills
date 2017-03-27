package com.maddness.rufus._6_enums;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author aostrikov
 */
public class _32_EnumSet {

    // old style
    private static final int STYLE_BOLD = 1 << 0;            // 1
    private static final int STYLE_ITALIC = 1 << 1;          // 2
    private static final int STYLE_UNDERLINE = 1 << 2;       // 4
    private static final int STYLE_STRIKETHROUGH = 1 << 3;   // 8

    // Parameter is bitwise OR of zero or more STYLE_ constants
    public static void applyStyles(int styles) {
        System.out.println(styles);
    }

    // preferable way
    enum Styles {
        STYLE_BOLD,
        STYLE_ITALIC
    }

    public static void applyStyles(Set<Styles> styles) {
        System.out.println(styles);
    }

    public static void main(String[] args) {
        applyStyles(STYLE_ITALIC | STYLE_BOLD);
        applyStyles(EnumSet.of(Styles.STYLE_ITALIC, Styles.STYLE_BOLD));
    }

}
