
package ExListaCircular;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class ListaCircular extends javax.swing.JFrame {

    ListaCircularDuplamenteLigada lista;
    int indiceCorrente=0;
    
    public ListaCircular() {
        initComponents();
        
        lista=new ListaCircularDuplamenteLigada();
        
        for(int i=0;i<10;i++){
            lista.adicionar(i);
        }
        lblValor.setText( lista.getLista(0).toString());
        setLblQtd();
        carregaLista();
    }

    private void setLblQtd(){
        lblQtdNos.setText("Qtd Nós: "+ lista.tamanho());
    }
    private void carregaLista(){
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0;i<lista.tamanho();i++){        
            modelo.addElement(i+" - " + lista.getLista(i));
        }
        jList1.setModel(modelo);
        
        txtbListaNos.setText(lista.imprimirLista());
    }
            
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblndice1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btoAvancar = new javax.swing.JButton();
        btoRecuar = new javax.swing.JButton();
        lblndice = new javax.swing.JLabel();
        txtbIndice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btoRemover = new javax.swing.JButton();
        txtbValor = new javax.swing.JTextField();
        btoAdicionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblQtdNos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbListaNos = new javax.swing.JTextPane();

        lblndice1.setText("Índice: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValor.setText("jLabel1");

        btoAvancar.setText("Avançar");
        btoAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoAvancarActionPerformed(evt);
            }
        });

        btoRecuar.setText("Recuar");
        btoRecuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoRecuarActionPerformed(evt);
            }
        });

        lblndice.setText("Índice: ");

        txtbIndice.setText("0");

        jLabel1.setText("Índice:");

        btoRemover.setText("Remover");
        btoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoRemoverActionPerformed(evt);
            }
        });

        txtbValor.setText("Hello World");

        btoAdicionar.setText("Adicionar");
        btoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoAdicionarActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        lblQtdNos.setText("Qtd Nós:");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(txtbListaNos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btoRecuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblndice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblQtdNos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btoAvancar)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btoAdicionar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btoRemover)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblndice)
                    .addComponent(lblQtdNos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(btoRecuar)
                    .addComponent(btoAvancar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoAdicionar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoAvancarActionPerformed
        
        try{
            lblValor.setText(lista.getLista(indiceCorrente+1).toString());
            indiceCorrente+=1;
            lblndice.setText("índice: "+indiceCorrente);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btoAvancarActionPerformed

    private void btoRecuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoRecuarActionPerformed
         try{            
            lblValor.setText(lista.getLista(indiceCorrente-1).toString());
            indiceCorrente-=1;
            lblndice.setText("índice: "+indiceCorrente);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btoRecuarActionPerformed

    private void btoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoRemoverActionPerformed
        try{            
            
            lista.remover(Integer.parseInt(txtbIndice.getText()));
            setLblQtd();
            carregaLista();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btoRemoverActionPerformed

    private void btoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoAdicionarActionPerformed
        try {
            
            lista.adicionar(txtbValor.getText(), Integer.parseInt(txtbIndice.getText()));
            setLblQtd();
            carregaLista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btoAdicionarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        /*try {
            if(evt.getClickCount()==1)
                txtbIndice.setText(String.valueOf(jList1.getSelectedIndex()) );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }*/
        
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(ListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoAdicionar;
    private javax.swing.JButton btoAvancar;
    private javax.swing.JButton btoRecuar;
    private javax.swing.JButton btoRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQtdNos;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblndice;
    private javax.swing.JLabel lblndice1;
    private javax.swing.JTextField txtbIndice;
    private javax.swing.JTextPane txtbListaNos;
    private javax.swing.JTextField txtbValor;
    // End of variables declaration//GEN-END:variables
}
