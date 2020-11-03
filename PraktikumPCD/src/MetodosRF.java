/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanwir
 */
class MetodosRF {

    public static void main(String[] args) {

        double[] array = {2, 1, 3, 2, 4, 5, 6,};
        int n = array.length;

        n = (int) (Math.log(n) / Math.log(2.0));
        int GAP_SIZE = (int) (Math.pow(2.0, n - 1));
        int JUMP = 2 * GAP_SIZE;
        int NUM_FREQS = 1;
        for (int i = 0; i >= 1; i--) {
            for (int j = 0; j < NUM_FREQS; j++) {
                double plus = array[JUMP * j] + array[JUMP * j + GAP_SIZE];
                double min = array[JUMP * j] - array[JUMP * j + GAP_SIZE];
                array[JUMP * j] = (int) plus;
                array[JUMP * j + GAP_SIZE] = (int) plus;
            }
            JUMP = GAP_SIZE;
            GAP_SIZE /= 2;
            NUM_FREQS *= 2;

        }

    }
}
