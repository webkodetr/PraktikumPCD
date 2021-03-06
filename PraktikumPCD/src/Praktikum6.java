/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Praktikum6 extends javax.swing.JFrame {

    String sumber;
    BufferedImage gambar;
    Image gambarhasil;
    int ukuranX;
    int ukuranY;
    String gb1 = "Grafik Histogram";

    /**
     * Creates new form Praktikum4
     */
    public Praktikum6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Analyzer");
        setAlwaysOnTop(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Citra Input");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Citra Output");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Pengaturan Brightness:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Pengaturan Contrast:");

        jScrollBar2.setMaximum(128);
        jScrollBar2.setMinimum(-128);
        jScrollBar2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar2AdjustmentValueChanged(evt);
            }
        });

        jScrollBar1.setMaximum(255);
        jScrollBar1.setMinimum(-255);
        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Preprocessing");

        jMenuItem3.setText("Convert To Grayscale");
        jMenuItem3.setToolTipText("");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Equalisasi Histogram");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        jMenuItem4.setText("Histogram");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem6.setText("Equalis");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int open = fc.showOpenDialog(jPanel1);
        if (open == JFileChooser.APPROVE_OPTION) {
            sumber = fc.getSelectedFile().getPath();
            BufferedImage loadImg = loadImage(sumber);
            int x = jLabel1.getWidth();
            int y = jLabel1.getHeight();
            int x1 = jLabel2.getWidth();
            int y1 = jLabel2.getHeight();

            ImageIcon imageIcon1 = new ImageIcon(resize(loadImg, x, y));
            ImageIcon imageIcon2 = new ImageIcon(resize(loadImg, x1, y1));
            jLabel1.setIcon(imageIcon1);
            jLabel2.setIcon(imageIcon2);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BufferedImage grayscale = rgb2Gray(sumber);
        int x = jLabel2.getWidth();
        int y = jLabel2.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(grayscale, x, y));
        jLabel2.setIcon(imageIcon);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        BufferedImage loadImg = loadImage(sumber);
        drawHistogram(loadImg, gb1);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        int cerah = jScrollBar1.getValue();
        BufferedImage hasilBrig = brigthness(sumber, cerah);
        int x = jLabel2.getWidth();
        int y = jLabel2.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(hasilBrig, x, y));
        jLabel2.setIcon(imageIcon);
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged

    private void jScrollBar2AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar2AdjustmentValueChanged
        int cerah = jScrollBar2.getValue();
        BufferedImage hasilBrig = kontras(sumber, cerah);
        int x = jLabel2.getWidth();
        int y = jLabel2.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(hasilBrig, x, y));
        jLabel2.setIcon(imageIcon);
    }//GEN-LAST:event_jScrollBar2AdjustmentValueChanged

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        HistogrEqualisation histEq = new HistogrEqualisation();// pembentukan object histogEqualisation
        BufferedImage gbInput = loadImage(sumber); // membaca input gambar berdasarkan alamat path yg diberikan
        BufferedImage gbEq;                         // deklarasi variabel dengan tipe buffreadImage
        int ukuranX = gbInput.getWidth();           // mengambil jumlah baris
        int ukuranY = gbInput.getHeight();          // mengambil jumlah kolom
        int size = ukuranX * ukuranY;               // menghitung ukuran gambar
        int grayScale[][] = new int[ukuranX][ukuranY]; // inisialisasi matriks grayscale/pembentukan array dua dimensi
        int histogram[] = new int[256];                // inisialisasi matriks histogram
        int cdf[] = new int[256];
        float equalized[] = new float[256];
        float picEqualized[][] = new float[ukuranX][ukuranY];

        grayScale = histEq.ArrayGray(sumber);
        histogram = histEq.histogram(grayScale, ukuranX, ukuranY);
        cdf = histEq.getCDF(histogram);
        equalized = histEq.equalization(cdf, size);
        picEqualized = histEq.gbEqualiz(grayScale, equalized, ukuranX, ukuranY);
        gbEq = histEq.gbHasil(picEqualized, ukuranX, ukuranY);
        int counter = 0;
        int x = jLabel2.getWidth();
        int y = jLabel2.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(gbEq, x, y));
        jLabel2.setIcon(imageIcon);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        HistogrEqualisation histEq = new HistogrEqualisation();
        BufferedImage gbInput = loadImage(sumber);
        BufferedImage gbEq;
        int ukuranX = gbInput.getWidth();
        int ukuranY = gbInput.getHeight();
        int size = ukuranX * ukuranY;
        int grayScale[][] = new int[ukuranX][ukuranY];
        int histogram[] = new int[256];
        int cdf[] = new int[256];
        float equalized[] = new float[256];
        float picEqualized[][] = new float[ukuranX][ukuranY];
        grayScale = histEq.ArrayGray(sumber);
        histogram = histEq.histogram(grayScale, ukuranX, ukuranY);
        cdf = histEq.getCDF(histogram);
        equalized = histEq.equalization(cdf, size);
        picEqualized = histEq.gbEqualiz(grayScale, equalized, ukuranX, ukuranY);
        gbEq = histEq.gbHasil(picEqualized, ukuranX, ukuranY);
        int counter = 0;
        int x = jLabel2.getWidth();
        int y = jLabel2.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(gbEq, x, y));
        jLabel2.setIcon(imageIcon);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static BufferedImage loadImage(String ref) {
        BufferedImage bimg = null;
        try {
            bimg = ImageIO.read(new File(ref));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bimg;
    }

// Deklarasi Methode untuk menyesuaikan ukuran gambar dengan ukuran jLabel
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return dimg;
    }

// deklarasi methode untuk grayscale
    public BufferedImage rgb2Gray(String sumber) {
        BufferedImage prosesGambar;
        BufferedImage loadIng = loadImage(sumber);
        ukuranX = loadIng.getWidth();
        ukuranY = loadIng.getHeight();
        prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = prosesGambar.getGraphics();
        g.drawImage(loadIng, 0, 0, null);
        WritableRaster raster = prosesGambar.getRaster();
        for (int x = 0; x < ukuranX; x++) {
            for (int y = 0; y < ukuranY; y++) {
                int rgb = loadIng.getRGB(x, y);
                int alpha = (rgb << 24) & 0xff;
                int merahg = (rgb >> 16) & 0xff;
                int hijaug = (rgb >> 8) & 0xff;
                int birug = (rgb >> 0) & 0xff;
                float gray = (float) ((0.5 * merahg) + (0.3 * hijaug) + (0.2 * birug));
                raster.setSample(x, y, 0, gray);
            }
        }
        return prosesGambar;
    }

    public void drawHistogram(BufferedImage gmbar, String hs1) {
        int widht = gmbar.getWidth();
        int height = gmbar.getHeight();
        int count[][] = new int[4][0x100];
        int RED = 0;
        int BLUE = 1;
        int GREEN = 2;
        int total = widht * height;
        for (int x = 0; x < widht; x++) {
            for (int y = 0; y < height; y++) {
                int rgb = gmbar.getRGB(x, y);
                int merahg = (rgb & 0x00ff0000) >> 16;
                int hijaug = (rgb & 0x0000ff00) >> 8;
                int birug = (rgb & 0x000000ff);
                int gray = (merahg + hijaug + birug) / 3;
                count[RED][merahg]++;
                count[GREEN][hijaug]++;
                count[BLUE][birug]++;
                count[3][gray]++;

            }
        }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red", new Integer(f));
            dataset.addValue(count[2][f], "Blue", new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }
        JFreeChart histo = ChartFactory.createBarChart("Histogram Citra", "Nilai",
                "Frekuensi", dataset, PlotOrientation.VERTICAL, true, false, false);

        ChartFrame frame = new ChartFrame("histogram Citra", histo);
        histo.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) histo.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeMinorGridlinePaint(Color.white);
        frame.setSize(500, 350);
        frame.setVisible(true);
        frame.setLocation(380, 200);
        frame.setTitle(hs1);
        String status = frame.getTitle();

    }

    public BufferedImage brigthness(String sumber, int cerah) {
        BufferedImage prosesGambar;
        BufferedImage loadIng = loadImage(sumber);
        ukuranX = loadIng.getWidth();
        ukuranY = loadIng.getHeight();
        prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesGambar.getGraphics();
        g.drawImage(loadIng, 0, 0, null);
        WritableRaster raster = prosesGambar.getRaster();
        for (int x = 0; x < ukuranX; x++) {
            for (int y = 0; y < ukuranY; y++) {
                int rgb = loadIng.getRGB(x, y);
                int alpha = (rgb << 24) & 0xff;
                int merahg = (rgb >> 16) & 0xff;
                int hijaug = (rgb >> 8) & 0xff;
                int birug = (rgb >> 0) & 0xff;
                int gray = ((merahg) + (hijaug) + (birug)) / 3;
                int merah2 = merahg + cerah;
                int hijau2 = hijaug + cerah;
                int biru2 = birug + cerah;

                if (merah2 < 0) {
                    merah2 = 0;
                }
                if (hijau2 < 0) {
                    hijau2 = 0;
                }
                if (biru2 < 0) {
                    biru2 = 0;
                }
                if (merah2 > 255) {
                    merah2 = 255;
                }
                if (hijau2 > 255) {
                    hijau2 = 255;
                }
                if (biru2 > 255) {
                    biru2 = 255;
                }
                int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;
                prosesGambar.setRGB(x, y, rgb2);
            }
        }
        return prosesGambar;
    }

    public BufferedImage kontras(String sumber, int kontras) {
        {
            BufferedImage prosesGambar;
            BufferedImage loadIng = loadImage(sumber);
            ukuranX = loadIng.getWidth();
            ukuranY = loadIng.getHeight();
            prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesGambar.getGraphics();
            g.drawImage(loadIng, 0, 0, null);
            WritableRaster raster = prosesGambar.getRaster();
            for (int x = 0; x < ukuranX; x++) {
                for (int y = 0; y < ukuranY; y++) {
                    int rgb = loadIng.getRGB(x, y);
                    int alpha = (rgb << 24) & 0xff;
                    int merahg = (rgb >> 16) & 0xff;
                    int hijaug = (rgb >> 8) & 0xff;
                    int birug = (rgb >> 0) & 0xff;
                    int gray = ((merahg) + (hijaug) + (birug)) / 3;
                    int merah2 = 0, hijau2 = 0, biru2 = 0;
                    if (merahg > 128) {
                        merah2 = merahg + kontras;
                    } else {
                        merah2 = merahg - kontras;
                    }
                    if (hijaug > 128) {
                        hijau2 = hijaug + kontras;
                    } else {
                        hijau2 = hijaug - kontras;
                    }
                    if (birug > 128) {
                        biru2 = birug + kontras;
                    } else {
                        biru2 = birug + kontras;
                    }
                    if (merah2 < 0) {
                        merah2 = 0;
                    }
                    if (hijau2 < 0) {
                        hijau2 = 0;
                    }
                    if (biru2 < 0) {
                        biru2 = 0;
                    }
                    if (merah2 > 255) {
                        merah2 = 255;
                    }
                    if (hijau2 > 255) {
                        hijau2 = 255;
                    }
                    if (biru2 > 255) {
                        biru2 = 255;
                    }
                    int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;
                    prosesGambar.setRGB(x, y, rgb2);
                }
            }
            return prosesGambar;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Praktikum4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Praktikum4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Praktikum4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Praktikum6().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    // End of variables declaration//GEN-END:variables
}
