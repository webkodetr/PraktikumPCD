
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Waflet {


    public double[][] HaarTransform(int[][] pixels, int cycles) {
        int w = pixels[0].length;
        int h = pixels.length;
        int maxCycle = getHaarMaxCycles(w);
        boolean isCycleAllowed = isCycleAllowed(maxCycle, cycles);
        if (isCycleAllowed) {
            double[][] ds = new double[h][w];
            double[][] tempds = new double[h][w];
            for (int i = 0; i < pixels.length; i++) {
                for (int j = 0; j < pixels[0].length; j++) {
                    ds[i][j] = pixels[i][j];
                }
            }
            for (int i = 0; i < cycles; i++) {
                w /= 2;
                for (int j = 0; j < h; j++) {
                    for (int k = 0; k < w; k++) {
                        double a = ds[j][2 * k];
                        double b = ds[j][2 * k + 1];
                        double add = a + b;
                        double sub = a - b;
                        double avgAdd = add / 2;
                        double avgSub = sub / 2;
                        tempds[j][k] = avgAdd;
                        tempds[j][k + w] = avgSub;
                    }
                }
                for (int j = 0; j < h; j++) {
                    for (int k = 0; k < w; k++) {
                        ds[j][k] = tempds[j][k];
                        ds[j][k + w] = tempds[j][k + w];
                    }
                }
                h /= 2;
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < h; k++) {
                        double a = ds[2 * k][j];
                        double b = ds[2 * k + 1][j];
                        double add = a + b;
                        double sub = a - b;
                        double avgAdd = add / 2;
                        double avgSub = sub / 2;
                        tempds[k][j] = avgAdd;
                        tempds[k + h][j] = avgSub;
                    }
                }
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < h; k++) {
                        ds[k][j] = tempds[k][j];
                        ds[k + h][j] = tempds[k + h][j];
                    }
                }
            }
            return ds;
        }
        return null;
    }

    
    private int getHaarMaxCycles(int hw) {
        int cycles = 0;
        while (hw > 1) {
            cycles++;
            hw /= 2;
        }
        return cycles;
    }

    private boolean isCycleAllowed(int maxCycle, int cycles) {
        return cycles <= maxCycle;
    }

    public static void main(String[] args) {

        Waflet wf = new Waflet();

        int[][] pixels = new int[8][8];
        pixels[0][0] = 1;
        pixels[0][1] = 2;
        pixels[0][2] = 3;
        pixels[0][3] = 4;
        pixels[0][4] = 5;
        pixels[0][5] = 6;
        pixels[0][6] = 7;
        pixels[0][7] = 8;

        pixels[1][0] = 9;
        pixels[1][1] = 10;
        pixels[1][2] = 11;
        pixels[1][3] = 12;
        pixels[1][4] = 13;
        pixels[1][5] = 14;
        pixels[1][6] = 15;
        pixels[1][7] = 16;

        pixels[2][0] = 17;
        pixels[2][1] = 18;
        pixels[2][2] = 19;
        pixels[2][3] = 20;
        pixels[2][4] = 21;
        pixels[2][5] = 22;
        pixels[2][6] = 23;
        pixels[2][7] = 24;

        pixels[3][0] = 25;
        pixels[3][1] = 26;
        pixels[3][2] = 27;
        pixels[3][3] = 28;
        pixels[3][4] = 29;
        pixels[3][5] = 30;
        pixels[3][6] = 31;
        pixels[3][7] = 32;

        
        pixels[4][0] = 1;
        pixels[4][1] = 2;
        pixels[4][2] = 3;
        pixels[4][3] = 4;
        pixels[4][4] = 5;
        pixels[4][5] = 6;
        pixels[4][6] = 7;
        pixels[4][7] = 8;

        pixels[5][0] = 9;
        pixels[5][1] = 10;
        pixels[5][2] = 11;
        pixels[5][3] = 12;
        pixels[5][4] = 13;
        pixels[5][5] = 14;
        pixels[5][6] = 15;
        pixels[5][7] = 16;

        pixels[6][0] = 17;
        pixels[6][1] = 18;
        pixels[6][2] = 19;
        pixels[6][3] = 20;
        pixels[6][4] = 21;
        pixels[6][5] = 22;
        pixels[6][6] = 23;
        pixels[6][7] = 24;
        
        pixels[7][0] = 25;
        pixels[7][1] = 26;
        pixels[7][2] = 27;
        pixels[7][3] = 28;
        pixels[7][4] = 29;
        pixels[7][5] = 30;
        pixels[7][6] = 31;
        pixels[7][7] = 32;
       
        
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                System.out.print(pixels[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        double[][] haarTransform = wf.HaarTransform(pixels, 2);
        for (int i = 0; i < haarTransform.length; i++) {
            for (int j = 0; j < haarTransform[0].length; j++) {
                System.out.print(haarTransform[i][j] + " ");
            }
            System.out.println();
        }
    }
}
