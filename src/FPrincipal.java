
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class FPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipal
     */
    public FPrincipal() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visor = new javax.swing.JTextArea();
        ed1 = new javax.swing.JButton();
        ed4 = new javax.swing.JButton();
        ed7 = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        ed5 = new javax.swing.JButton();
        ed8 = new javax.swing.JButton();
        ed0 = new javax.swing.JButton();
        ed2 = new javax.swing.JButton();
        ed9 = new javax.swing.JButton();
        ed3 = new javax.swing.JButton();
        ed6 = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        somar = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicativo do Gui");
        setBackground(new java.awt.Color(255, 255, 255));

        Visor.setEditable(false);
        Visor.setColumns(20);
        Visor.setRows(5);
        jScrollPane1.setViewportView(Visor);

        ed1.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed1.setForeground(new java.awt.Color(0, 0, 0));
        ed1.setText("1");
        ed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed1ActionPerformed(evt);
            }
        });

        ed4.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed4.setForeground(new java.awt.Color(0, 0, 0));
        ed4.setText("4");
        ed4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed4ActionPerformed(evt);
            }
        });

        ed7.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed7.setForeground(new java.awt.Color(0, 0, 0));
        ed7.setText("7");
        ed7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed7ActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        limpar.setForeground(new java.awt.Color(0, 0, 0));
        limpar.setText("C");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        ed5.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed5.setForeground(new java.awt.Color(0, 0, 0));
        ed5.setText("5");
        ed5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed5ActionPerformed(evt);
            }
        });

        ed8.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed8.setForeground(new java.awt.Color(0, 0, 0));
        ed8.setText("8");
        ed8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed8ActionPerformed(evt);
            }
        });

        ed0.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed0.setForeground(new java.awt.Color(0, 0, 0));
        ed0.setText("0");
        ed0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed0ActionPerformed(evt);
            }
        });

        ed2.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed2.setForeground(new java.awt.Color(0, 0, 0));
        ed2.setText("2");
        ed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed2ActionPerformed(evt);
            }
        });

        ed9.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed9.setForeground(new java.awt.Color(0, 0, 0));
        ed9.setText("9");
        ed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed9ActionPerformed(evt);
            }
        });

        ed3.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed3.setForeground(new java.awt.Color(0, 0, 0));
        ed3.setText("3");
        ed3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed3ActionPerformed(evt);
            }
        });

        ed6.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        ed6.setForeground(new java.awt.Color(0, 0, 0));
        ed6.setText("6");
        ed6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed6ActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        multiplicar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(0, 0, 0));
        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        dividir.setForeground(new java.awt.Color(0, 0, 0));
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        somar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        somar.setForeground(new java.awt.Color(0, 0, 0));
        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        subtrair.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        subtrair.setForeground(new java.awt.Color(0, 0, 0));
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ed1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ed4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ed7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ed2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ed5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ed8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ed0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ed3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ed6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ed9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed1ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "1");
    }//GEN-LAST:event_ed1ActionPerformed

    private void ed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed2ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "2");

    }//GEN-LAST:event_ed2ActionPerformed

    private void ed3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed3ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "3");

    }//GEN-LAST:event_ed3ActionPerformed

    private void ed4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed4ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "4");

    }//GEN-LAST:event_ed4ActionPerformed

    private void ed5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed5ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "5");

    }//GEN-LAST:event_ed5ActionPerformed

    private void ed6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed6ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "6");

    }//GEN-LAST:event_ed6ActionPerformed

    private void ed7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed7ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "7");

    }//GEN-LAST:event_ed7ActionPerformed

    private void ed8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed8ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "8");

    }//GEN-LAST:event_ed8ActionPerformed

    private void ed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed9ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "9");

    }//GEN-LAST:event_ed9ActionPerformed

    private void ed0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed0ActionPerformed
        // TODO add your handling code here:
        Visor.setText(Visor.getText() + "0");

    }//GEN-LAST:event_ed0ActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        // TODO add your handling code here:

        valor1 = Integer.parseInt(Visor.getText());
        Visor.setText("");
        operacao = '+';


    }//GEN-LAST:event_somarActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:

        valor2 = Integer.parseInt(Visor.getText());
        if (operacao == '+') {
            Visor.setText(Integer.toString(valor1 + valor2));

        } else if (operacao == '*') {
            Visor.setText(Integer.toString(valor1 * valor2));

        } else if (operacao == '/') {
            Visor.setText(Integer.toString(valor1 / valor2));
        } else {
            Visor.setText(Integer.toString(valor1 - valor2));
        }


    }//GEN-LAST:event_resultadoActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        Visor.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
        valor1 = Integer.parseInt(Visor.getText());
        Visor.setText("");
        operacao = '*';
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        // TODO add your handling code here:
        valor1 = Integer.parseInt(Visor.getText());
        Visor.setText("");
        operacao = '/';
    }//GEN-LAST:event_dividirActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        // TODO add your handling code here:
        valor1 = Integer.parseInt(Visor.getText());
        Visor.setText("");
        operacao = '-';
    }//GEN-LAST:event_subtrairActionPerformed

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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Visor;
    private javax.swing.JButton dividir;
    private javax.swing.JButton ed0;
    private javax.swing.JButton ed1;
    private javax.swing.JButton ed2;
    private javax.swing.JButton ed3;
    private javax.swing.JButton ed4;
    private javax.swing.JButton ed5;
    private javax.swing.JButton ed6;
    private javax.swing.JButton ed7;
    private javax.swing.JButton ed8;
    private javax.swing.JButton ed9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton resultado;
    private javax.swing.JButton somar;
    private javax.swing.JButton subtrair;
    // End of variables declaration//GEN-END:variables
    int valor1 = 0;
    int valor2 = 0;
    char operacao;

}
