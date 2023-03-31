package com.abdifatah.librarySystem;

import org.junit.Assert;
import org.junit.Test;

public class TestAdd {

    @Test
    public void testAdd() {
        Assert.assertEquals(13, Main.add(4,9));
        Assert.assertEquals(5, Main.add(2, 3));
    }

}
