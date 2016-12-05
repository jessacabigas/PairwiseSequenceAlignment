
import Jama.Matrix;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jessa
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    ArrayList<Point> points;

    Sequence row;
    Sequence col;
    int max;
    double[][] score;

    public UI() {
        initComponents();
        initialize();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_ta = new javax.swing.JTextArea();
        reset_but = new javax.swing.JButton();
        upload_but = new javax.swing.JButton();
        submit_but = new javax.swing.JButton();
        nuc_rbut = new javax.swing.JRadioButton();
        prot_rbut = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        match_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mismatch_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gap_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        matrix_cbo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pairwise Sequence Alignment by J,Cabigas");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Input Space", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        input_ta.setColumns(20);
        input_ta.setRows(5);
        jScrollPane2.setViewportView(input_ta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        reset_but.setText("Reset");
        reset_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_butActionPerformed(evt);
            }
        });

        upload_but.setText("Upload Fasta");
        upload_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_butActionPerformed(evt);
            }
        });

        submit_but.setText("Submit");
        submit_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_butActionPerformed(evt);
            }
        });

        nuc_rbut.setText("Nucleotide Sequence");
        nuc_rbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuc_rbutActionPerformed(evt);
            }
        });

        prot_rbut.setText("Protein Sequence");
        prot_rbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prot_rbutActionPerformed(evt);
            }
        });

        jLabel2.setText("Scoring Scheme:");

        jLabel3.setText("Match:");

        match_tf.setText("5");
        match_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                match_tfActionPerformed(evt);
            }
        });

        jLabel4.setText("Mismatch:");

        mismatch_tf.setText("-3");
        mismatch_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mismatch_tfActionPerformed(evt);
            }
        });

        jLabel5.setText("Gap:");

        gap_tf.setText("-4");
        gap_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gap_tfActionPerformed(evt);
            }
        });

        jLabel6.setText("Scoring Matrix:");

        matrix_cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAM120(Global)" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mismatch_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(match_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gap_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(145, 145, 145)
                                .addComponent(matrix_cbo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nuc_rbut)
                                .addGap(91, 91, 91)
                                .addComponent(prot_rbut)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reset_but, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upload_but, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submit_but, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_but)
                    .addComponent(upload_but)
                    .addComponent(submit_but))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuc_rbut)
                    .addComponent(prot_rbut))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matrix_cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(match_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mismatch_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gap_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_butActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_butActionPerformed

    private void match_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_match_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_match_tfActionPerformed

    private void mismatch_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mismatch_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mismatch_tfActionPerformed

    private void gap_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gap_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gap_tfActionPerformed

    private void submit_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_butActionPerformed
        String[] text = input_ta.getText().split("\n");
        ArrayList<Sequence> seq = new ArrayList<>();
        boolean valid = true;
        int k = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].startsWith(">")) {
                k++;
                String comment = text[i].substring(1);
                String sequence = "";
                for (int j = i + 1; j < text.length; j++, i = j) {
                    if (text[j].isEmpty() || text[j].startsWith(">")) {
                        break;
                    }
                    sequence += text[j];
                }
                seq.add(new Sequence(comment, sequence));
                if (sequence.isEmpty()) {
                    i++;
                }
            } else if (!text[i].isEmpty()) {
                String comment = null;
                String sequence = "";
                for (int j = i; j < text.length; j++, i = j) {
                    if (text[j].isEmpty() || text[j].startsWith(">")) {
                        break;
                    }
                    sequence += text[j];
                }
                seq.add(new Sequence(comment, sequence));
                if (sequence.isEmpty()) {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (int i = 0; i < seq.size(); i++) {
            Sequence tmp = seq.get(i);
            if (tmp.title == null) {
                JOptionPane.showMessageDialog(null, tmp.getID() + ": Input is not in FASTA format.");
                valid = false;

            } else if (tmp.title != null && tmp.sequence.isEmpty()) {
                JOptionPane.showMessageDialog(null, tmp.getID() + ": Input is not in FASTA format.");
                valid = false;

            }
        }

        if (k == 2 && valid) {
            try {
                preprocess(seq);
            } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input invalid: Enter 2 valid sequences.");
        }

    }//GEN-LAST:event_submit_butActionPerformed

    private void nuc_rbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuc_rbutActionPerformed
        if (prot_rbut.isSelected()) {
            prot_rbut.setSelected(false);
            submit_but.enable();
        }

    }//GEN-LAST:event_nuc_rbutActionPerformed

    private void prot_rbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prot_rbutActionPerformed
        if (nuc_rbut.isSelected()) {
            nuc_rbut.setSelected(false);
            submit_but.enable();
        }

    }//GEN-LAST:event_prot_rbutActionPerformed

    private void upload_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_butActionPerformed
        String filename = "";
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
//            System.out.println(selectedFile.getName());
            filename = selectedFile.getName();
        }
        String line, input = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            while ((line = reader.readLine()) != null) {

                input += line;
                input += "\n";
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        input_ta.setText(input);

    }//GEN-LAST:event_upload_butActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField gap_tf;
    private javax.swing.JTextArea input_ta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField match_tf;
    private javax.swing.JComboBox<String> matrix_cbo;
    private javax.swing.JTextField mismatch_tf;
    private javax.swing.JRadioButton nuc_rbut;
    private javax.swing.JRadioButton prot_rbut;
    private javax.swing.JButton reset_but;
    private javax.swing.JButton submit_but;
    private javax.swing.JButton upload_but;
    // End of variables declaration//GEN-END:variables

    private void initialize() {

        submit_but.disable();
        points = new ArrayList<Point>();

    }

    private void preprocess(ArrayList<Sequence> seq) throws IOException {
        Sequence seq1 = seq.get(0);
        Sequence seq2 = seq.get(1);

        seq1.sequence = "-" + seq1.sequence;
        seq2.sequence = "-" + seq2.sequence;

        //longest sequence will be the row
        if (seq1.sequence.length() > seq2.sequence.length()) {
            col = seq1;
            row = seq2;
        } else {
            row = seq1;
            col = seq2;
        }

        int x = 0;

        score = new double[row.sequence.length()][col.sequence.length()];

        for (int i = 0; i < row.sequence.length(); i++) {
            for (int j = 0; j < col.sequence.length(); j++) {
                points.add(new Point(i, j, 0.0));
                score[i][j] = 0.0;
            }
        }

        //initalization of tables
        for (int i = 1; i < col.sequence.length(); i++) {
            x += Integer.parseInt(gap_tf.getText());
            if (i < row.sequence.length()) {
                score[i][0] = x;
                Point tmp = getPoint(i, 0);
                tmp.setValue(x);

            }
            score[0][i] = x;
            Point tmp = getPoint(0, i);
            tmp.setValue(x);
        }
        scoring();
//        displayPoints();
        tracing();

    }

    private void displayPoints() {

        for (int i = 0; i < points.size(); i++) {
            Point tmp = points.get(i);
            System.out.println(tmp.getX() + ", " + tmp.getY() + ": " + tmp.getValue());
        }
    }

    private Point getPoint(int x, int y) {
        Point tmp = null;
        for (int i = 0; i < points.size(); i++) {
            tmp = points.get(i);
            if (tmp.getX() == x && tmp.getY() == y) {
                break;
            }
        }
        return tmp;
    }

    private void scoring() {
        int match = Integer.parseInt(match_tf.getText());
        int mismatch = Integer.parseInt(mismatch_tf.getText());
        int gap = Integer.parseInt(gap_tf.getText());
        char a, b = '-';
        int cellValue = 0;

        for (int i = 1; i < row.sequence.length(); i++) {
            cellValue = 0;
            for (int j = 1; j < col.sequence.length(); j++) {
                Point cur = getPoint(i, j);

//                System.out.println(cur.getX() + " " + cur.getY());
                a = col.sequence.charAt(j);
                b = row.sequence.charAt(i);

                if (a == b) {
                    cellValue = match;
                } else {
                    cellValue = mismatch;
                }

                //diagonal
                double diagValue = getDiagonal(i, j);
                diagValue += cellValue;

                //left
                double leftValue = getLeft(i, j) + Integer.parseInt(gap_tf.getText());

                //top
                double topValue = getTop(i, j) + Integer.parseInt(gap_tf.getText());
                double tmp = 0;
                if (leftValue > topValue) {
                    if (leftValue > diagValue) {
                        tmp = leftValue;
                        cur.addOrigin(getPoint(i, j - 1), "left");
                    } else if (leftValue == diagValue) {
                        cur.addOrigin(getPoint(i, j - 1), "left");
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                        tmp = leftValue;
                    } else {
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                        tmp = diagValue;
                    }
                } else if (topValue > leftValue) {
                    if (topValue > diagValue) {
                        tmp = topValue;
                        cur.addOrigin(getPoint(i - 1, j), "top");
                    } else if (topValue == diagValue) {
                        cur.addOrigin(getPoint(i - 1, j), "top");
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                        tmp = topValue;
                    } else {
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                        tmp = diagValue;
                    }
                } else if (diagValue > topValue) {
                    if (diagValue > leftValue) {
                        tmp = diagValue;
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                    } else if (diagValue == leftValue) {
                        cur.addOrigin(getPoint(i - 1, j - 1), "diag");
                        cur.addOrigin(getPoint(i, j - 1), "left");
                        tmp = diagValue;
                    } else {
                        cur.addOrigin(getPoint(i, j - 1), "left");
                        tmp = leftValue;
                    }
                }

                score[i][j] = tmp;
                cur.setValue(tmp);

            }
        }

    }

    private double getLeft(int i, int j) {

        return score[i][j - 1];
    }

    private double getDiagonal(int i, int j) {
        return score[i - 1][j - 1];
    }

    private double getTop(int i, int j) {
        return score[i - 1][j];
    }

    private void tracing() throws IOException {
        ArrayList<Point> backtrack = new ArrayList<>();
        Point cur = getPoint(row.sequence.length(), col.sequence.length());
        int i = cur.getX(), j = cur.getY();
        boolean flag = false;
        backtrack.add(cur);

        while (i != 0 && j != 0) {
            cur = getPoint(i, j);
            backtrack.add(cur);

            if (cur.getOrigins().size() == 1) {
                i = cur.getOrigins().get(0).getX();
                j = cur.getOrigins().get(0).getY();
            } else {
                System.out.println("There are more than 1 possibility of the traceback.");
                for (int k = 0; k < cur.getOrigins().size(); k++) {
                    Point t = cur.getOrigins().get(k);
                    System.out.println(t.getX() + ", " + t.getY());
                }
                System.out.print("Enter cell[i]: ");
                Scanner scan = new Scanner(System.in);
                i = scan.nextInt();
                System.out.print("Enter cell[j]: ");
                j = scan.nextInt();
            }
            if (i == 0 && j == 0) {
                backtrack.add(getPoint(0, 0));
                flag = true;
            }
            if (flag) {
                break;
            }
        }

        extractFile(backtrack);
    }

    private void extractFile(ArrayList<Point> backtrack) throws IOException {
        String seq1 = "", seq2 = "", sim = "";
        int score = 0, dif = 0;
        int j = 1, k = 0;
        int s = backtrack.size() - 1;

        for (int i = 1; i < col.sequence.length();) {
            if (s > 0) {
                if (backtrack.get(s).getX() == backtrack.get(s - 1).getX() && backtrack.get(s).getY() == backtrack.get(s - 1).getY() - 1) {
                    seq2 += "-";
                    seq1 += col.sequence.charAt(i);
                    i++;
                } else if (backtrack.get(s).getX() == backtrack.get(s - 1).getX() - 1 && backtrack.get(s).getY() == backtrack.get(s - 1).getY()) {
                    seq1 += "-";
                    seq2 += row.sequence.charAt(j);
                    j++;
                } else {
                    seq2 += row.sequence.charAt(j);
                    j++;
                    seq1 += col.sequence.charAt(i);
                    i++;

                }
            }

            s--;
        }

        for (int i = 1; i < seq1.length(); i++) {
            if (seq2.charAt(j) == seq1.charAt(i)) {
                System.out.println(Integer.parseInt(match_tf.getText()));
            } else if (seq2.charAt(j) == '-') {
//                System.out.println(Integer.parseInt(gap_tf.getText()));
            } else {
//                System.out.println(Integer.parseInt(mismatch_tf.getText()));
            }

        }

        int res = JOptionPane.showConfirmDialog(null, "Generate Report?", "Pop-Up Menu", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            PrintWriter fw = new PrintWriter("output.txt", "UTF-8");

            fw.write("Pairwise Sequence Alignment ver 'x' by Jessa Cabigas\n");
            fw.write("Rundate: ");
            Date dateobj = new Date();
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            fw.write(df.format(dateobj));

            fw.write("\n>" + row.title);
            String[] thisCombo2 = row.sequence.split("(?<=\\G..........)");
            for (int i = 0; i < thisCombo2.length; i++) {
                fw.write("\n" + thisCombo2[i]);
            }

            fw.write("\n>" + col.title);
            thisCombo2 = col.sequence.split("(?<=\\G..........)");
            for (int i = 0; i < thisCombo2.length; i++) {
                fw.write("\n" + thisCombo2[i]);
            }

            fw.write("\n Sequence 1 Length: " + row.sequence.length());
            fw.write("\n Sequence 2 Length: " + col.sequence.length() + "\n");
            fw.write(seq1 + "\n");

            for (int l = 0; l < seq2.length(); l++) {
                if (seq1.charAt(l) == '-' || seq2.charAt(l) == '-') {
                    fw.write(" ");
                    dif += Integer.parseInt(gap_tf.getText());
                    System.out.println(Integer.parseInt(gap_tf.getText()));
                } else if (seq1.charAt(l) == seq2.charAt(l)) {
                    fw.write("|");
                    score += Integer.parseInt(match_tf.getText());
                    System.out.println(Integer.parseInt(match_tf.getText()));
                } else {
                    fw.write(" ");
                    score += Integer.parseInt(mismatch_tf.getText());
                    System.out.println(Integer.parseInt(mismatch_tf.getText()));
                }
            }

            fw.write("\n" + seq2);

            fw.write("\n SCORE : " + (score + dif));
            fw.close();
            System.exit(0);
        }
    }

}

class Sequence {

    public String sequence;
    public String title;

    Sequence(String title, String sequence) {
        this.title = title;
        this.sequence = sequence.toUpperCase();

    }

    public String getID() {
        try {
            return this.title.split("\\|")[1];
        } catch (Exception e) {
            return this.title;
        }
    }
}

class Point {

    private int x;
    private int y;
    private double value;
    private ArrayList<Point> origins = new ArrayList<Point>();
    private String source;

    Point(int x, int y, double value) {
        this.x = x;
        this.y = y;
        this.value = value;

    }

    public void addOrigin(Point origin, String source) {
        origin.setSource(source);
        getOrigins().add(origin);

    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the origins
     */
    public ArrayList<Point> getOrigins() {
        return origins;
    }

    /**
     * @param origins the origins to set
     */
    public void setOrigins(ArrayList<Point> origins) {
        this.origins = origins;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }
}
