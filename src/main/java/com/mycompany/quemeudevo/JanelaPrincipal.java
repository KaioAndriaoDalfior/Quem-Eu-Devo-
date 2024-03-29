package com.mycompany.quemeudevo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        
         btnRegistrarDivida.addActionListener((ActionEvent e) -> {
             registrarDivida();
        });
         btnBaixarPDF.addActionListener((ActionEvent e) -> {
             baixarPDF();
        });
    }
     private void registrarDivida() {
        String nome = txtNome.getText();
        String valor = txtValor.getText();
        String data = txtData.getText();

        if (nome.isEmpty() || valor.isEmpty() || data.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        int contadorDividas = 0;

        String divida = String.format("%02d: Nome: %s | Data: %s | Valor: %s", contadorDividas, nome, data, valor);
        jTextArea1.append(divida + "\n");

        // Incrementa o contador de dívidas
        contadorDividas++;

        // Limpar os campos após o registro da dívida
        txtNome.setText("");
        txtValor.setText("");
        txtData.setText("");
    }
      private void baixarPDF() {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("lista_de_dividas.pdf"));
            document.open();
            document.add(new Paragraph(jTextArea1.getText()));
            document.close();
            javax.swing.JOptionPane.showMessageDialog(this, "Arquivo PDF baixado com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException | IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao baixar o arquivo PDF!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnBaixarPDF = new javax.swing.JButton();
        btnRegistrarDivida = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jpDadosColetados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAreaPessoasQueEuDevo = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        lblNome.setText("Nome: ");

        lblValor.setText("Valor: ");

        lblData.setText("Data:");

        btnBaixarPDF.setText("Baixar PDF");

        btnRegistrarDivida.setText("Registrar Dívida");

        javax.swing.GroupLayout jpDadosLayout = new javax.swing.GroupLayout(jpDados);
        jpDados.setLayout(jpDadosLayout);
        jpDadosLayout.setHorizontalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblData)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDadosLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnRegistrarDivida)
                                .addGap(18, 18, 18)
                                .addComponent(btnBaixarPDF)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpDadosLayout.setVerticalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaixarPDF)
                    .addComponent(btnRegistrarDivida))
                .addContainerGap())
        );

        jLabel4.setText("QUEM EU DEVO?");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtAreaPessoasQueEuDevo.setViewportView(jTextArea1);

        javax.swing.GroupLayout jpDadosColetadosLayout = new javax.swing.GroupLayout(jpDadosColetados);
        jpDadosColetados.setLayout(jpDadosColetadosLayout);
        jpDadosColetadosLayout.setHorizontalGroup(
            jpDadosColetadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosColetadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosColetadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosColetadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAreaPessoasQueEuDevo))
                .addContainerGap())
        );
        jpDadosColetadosLayout.setVerticalGroup(
            jpDadosColetadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosColetadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAreaPessoasQueEuDevo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDadosColetados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDadosColetados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaixarPDF;
    private javax.swing.JButton btnRegistrarDivida;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpDadosColetados;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    private javax.swing.JScrollPane txtAreaPessoasQueEuDevo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
