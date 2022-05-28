package ru.netology.sqr;

public class SQRService {

    public int calculateNumberOfSquares(int upperBound, int underBound) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= underBound && i * i <= upperBound) {
                counter++;
            }
        }
        System.out.println("Количество квадратов чисел:" + counter);
        return counter;
    }
}
