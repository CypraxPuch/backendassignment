package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:42 PM<br/>
 * Generated to
 */
public class HolderTest {

    private Holder holder;

    @Before
    public void setUp() throws Exception {
        holder = new Holder();
    }

    @Test
    public void getName_NullAnd_NotNull() {
        assertNull(holder.getName());
        String name = "name_01";
        holder.setName(name);
        assertNotNull(holder.getName());
        assertEquals(name, holder.getName());
    }

    @Test
    public void isAlias_FalseAndTrue() {
        assertFalse(holder.isAlias());
        holder.setAlias(true);
        assertTrue(holder.isAlias());
    }
}