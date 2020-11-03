/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *kkkjivvv
 * @author IngesQ
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class HistogrEqualisation {
    public static BufferedImage loadImage(String ref) {
        BufferedImage bimg = null;
        try {
            bimg = ImageIO.read(new File(ref));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bimg;
    }

    public int[][] ArrayGray(String sumber) {
        BufferedImage gbRgb = loadImage(sumber);
        int ukuranX = gbRgb.getWidth();
        int ukuranY = gbRgb.getHeight();
        int[][] arrayGray = new int[ukuranX][ukuranY];
        for (int x = 0; x < ukuranX; x++) {
            for (int y = 0; y < ukuranY; y++) {
                int rgb = gbRgb.getRGB(x, y);
                int merahg = (rgb >> 16) & 0xff;
                int hijaug = (rgb >> 8) & 0xff;
                int birug = (rgb >> 0) & 0xff;
                float gray = (float) ((0.5 * merahg) + (0.3 * hijaug) + (0.2 * birug));
                int grayhasil = Math.round(gray);
                arrayGray[x][y] = grayhasil;
                //  prosesGambar.setRGB(x, y, gray);                         
            }
        }
        return arrayGray;
    }

    public int[] histogram(int[][] grayScale, int ukuranX, int ukuranY) { // deklarasi method
        int[] pixNum = new int[256]; // deklarasi array satu dimensi dengan panjang 256
        int size = grayScale.length; // mengambil panjang array dari matriks input grayscale
        for (int c = 0; c < 256; c++) { // perulangan dari 0 hingga nilai gray level maksimum yaitu 256
            int sum = 0;            // deklarasi dan pemberiaan nilai awal pada variabel
            for (int i = 0; i < ukuranX; i++) { // perulangan dari 0 hingga jumlah baris matriks
                for (int j = 0; j < ukuranY; j++) { // perulangan dari 0 hingga jumlah kolom matriks
                    if (grayScale[i][j] == c) {
                        sum++; // proses compare atau logika perbandingan nilai graylevel
                    }
                    pixNum[c] = sum;                        // mengisikan nilai array pixNum dengan jumlah dari tiap tiap gray level
                }
            }

        }
        return pixNum;
    }

    //CDF = Cumulative Distributif Function
    public int[] getCDF(int[] histogram) {
        int[] cdf = new int[256];
        int cum = 0;
        for (int i = 0; i < 256; i++) {
            cum += histogram[i];
            cdf[i] = cum;
        }
        return cdf;
    }

    public int getMinCDF(int[] cdf) {
        int minCDF = 257;
        for (int i = 0; i < 256; i++) {
            if (cdf[i] < minCDF && cdf[i] != 0) {
                minCDF = cdf[i];
            }
        }
        return minCDF;
    }

    public int getMaxCDF(int[] cdf) {
        int maxCDF = 0;
        for (int i = 0; i < 256; i++) {
            if (cdf[i] > maxCDF) {
                maxCDF = cdf[i];
            }
        }
        return maxCDF;
    }

    public float[] equalization(int[] cdf, int pictSize) {
        int min = getMinCDF(cdf);
        float e[] = new float[256];
        System.out.println("minimum: " + min);
        System.out.println("pictSize: " + pictSize);
        for (int i = 0; i < 256; i++) {
            e[i] = (float) ((((float) cdf[i] - min) / (float) pictSize) * 255);
            System.out.println(e[i]);
        }
        for (int i = 0; i < 256; i++) {
            if (e[i] < 0) {
                e[i] = 0;
            }
            if (e[i] > 255) {
                e[i] = 255;
            }
        }
        return e;
    }

    public float[][] gbEqualiz(int[][] grayScale, float[] equalization, int w, int h) {
        int size = w * h;
        float[][] newGS = new float[w][h];
        int counter = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                newGS[i][j] = equalization[(int) grayScale[i][j]]; //convert
                counter++;
            }
        }
        return newGS;
    }

    public BufferedImage gbHasil(float[][] newGS, int w, int h) {
        int size = w * h;
        int counter = 0;
        BufferedImage im = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster raster = im.getRaster();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                float gray = newGS[i][j];
                raster.setSample(i, j, 0, gray);
                counter++;
            }
        }
        return im;
    }
}
