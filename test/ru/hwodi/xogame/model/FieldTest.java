package ru.hwodi.xogame.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() {
        int expectedSize = 3;
        Field field = new Field();
        int actialSize = field.getSize();

        assertEquals(expectedSize, actialSize);
    }

    @Test
    public void getFigure() {
        Figure expectedFigure = Figure.X;
        Field field = new Field();

    }

    @Test
    public void setFigure() {
    }
}