package com.maddness.rufus._6_enums;

import com.maddness.rufus._6_enums._30_AbstractMethod.Operation;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author aostrikov
 */
public class _30_AbstractMethodTest {
    @Test
    public void shouldCreateOperation() {
        assertThat(Operation.fromString("+"), is(Operation.PLUS));
    }
}