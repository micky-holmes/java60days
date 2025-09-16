package com.mickyholmes.java60days.day00;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Day00MainTest {

    @Test
    void sanityCheck() {
        assertEquals(49, 20 + 29, "Environment sanity check");
    }

    @Test
    void add_returnsSum(){
        assertEquals(5, Day00Main.add(2,3));
        assertEquals(0, Day00Main.add(-2, 2));
    }
}
