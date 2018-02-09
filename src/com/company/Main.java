package com.company;

public class Main {

    public static void main(String[] args) {
        int[] potentials = {16, 17, 4, 3, 5, 2};
        int[] reversed = reverse(potentials);
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for (int i=0;i<reversed.length;i++) {
            if (reversed[i] > total) {
                sb.append(reversed[i] + " is a leader\n");
                total+=reversed[i];
            }
        }
        System.out.println(sb.toString());
    }

    public static int[] reverse(int[] array) {
        int tmp;
        int n;
        for (int i=0; i <= Math.floor((array.length - 2)/2); i++) { // only have to move through half the string
            n = array.length - i - 1; // n tracks the current index's "mirror"
            tmp = array[i]; // save this String
            array[i] = array[n]; // copy 'mirror' to this index
            array[n] = tmp; // write the saved String to the 'mirror's place
        }
        return array;
    }
}
