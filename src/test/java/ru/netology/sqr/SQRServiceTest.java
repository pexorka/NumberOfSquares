package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateNumberOfSquares() {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.calculateNumberOfSquares(1000, 500);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresoutRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateNumberOfSquares(99, 0);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresmatchesRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateNumberOfSquares(120, 100);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresmaximum() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculateNumberOfSquares(9801, 100);

        assertEquals(expected, actual);
    }
}