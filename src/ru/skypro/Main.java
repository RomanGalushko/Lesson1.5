package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Tesk1

        int[] locker = new int[5];
        locker[0] = 1;
        locker[1] = 4;
        locker[2] = 3;
        locker[3] = 8;
        locker[4] = 9;


        float[] newLocker = {1.57f, 7.654f, 9.986f};


        char[] weights = new char[5];
        weights[0] = 'H';
        weights[1] = 'E';
        weights[2] = 'L';
        weights[3] = 'L';
        weights[4] = 'O';


        //Tesk2

        {
            int i = 0;
            while (i < locker.length) {
                if (i == locker.length - 1) {
                    System.out.println(locker[i] + " ");
                    break;
                }
                System.out.print(locker[i] + ", ");
                i++;
            }
        }

        for (int i = 0; i < newLocker.length; i++) {
            if (i == newLocker.length - 1) {
                System.out.println(newLocker[i] + " ");
                break;
            }
            System.out.print(newLocker[i] + ", ");
        }

        System.out.print(weights[0] + "," + weights[1] + "," + weights[2] + "," + weights[3] + "," + weights[4]);
        System.out.println("\n");

        //Tesk3

        {
            int i = locker.length -1;
            while (i >= 0) {
                if (i == 0) {
                    System.out.println(locker[i] + " ");
                    break;
                }
                System.out.print(locker[i] + ", ");
                i--;
            }
        }

        for (int i = newLocker.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(newLocker[i] + " ");
                break;
            }
            System.out.print(newLocker[i] + ", ");
        }

        System.out.print(weights[4] + "," + weights[3] + "," + weights[2] + "," + weights[1] + "," + weights[0]);
        System.out.println("\n");

        //Tesk4

        for (int i : locker) {
            if (i % 2 != 0) {
                i += 1;
                System.out.print(i + " ");
            }
        }

    }
}
