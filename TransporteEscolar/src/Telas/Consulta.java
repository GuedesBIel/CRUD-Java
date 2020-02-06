/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DaoAluno.Acoes;
import DtoAluno.Dados;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author gabri
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
        initComponents();

        DefaultTableModel model = (DefaultTableModel) jTableDados.getModel();
        jTableDados.setRowSorter(new TableRowSorter(model));

        readJtable();
        

    }
    public static int cod;

    public void readJtable() {

        DefaultTableModel model = (DefaultTableModel) jTableDados.getModel();
        Acoes ac = new Acoes();

        model.setNumRows(0);

        for (Dados dd : ac.ConsultaDados()) {

            model.addRow(new Object[]{
                cod = dd.getCodAluno(),
                dd.getNomeAluno(),
                dd.getNomeResp(),
                dd.getEndereco(),
                dd.getEscolaAluno(),
                dd.getHorario(),
                dd.getRgResp(),
                dd.getCpfResp(),             
                dd.getTel(),
                dd.getTel1(),
                dd.getTel2(),
                dd.getInicio(),
                dd.getTermino(),
                dd.getValorT(),
                dd.getParcelas(),
                dd.getValorP(),
                dd.getDiaPaga()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Aluno");
        setPreferredSize(new java.awt.Dimension(1366, 768));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Selecione o registro desejado");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Nome Resposavel", "Endereço", "Escola", "Horario", "RG do Respnsavel", "CPF", "Telefone Responsavel", "Telefone Casa", "Telefone Comercial", "Inicio", "Termino", "Valor Total", "Parcelas", "Valor Parcelas", "Dia Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setMinWidth(50);
            jTableDados.getColumnModel().getColumn(1).setMinWidth(200);
            jTableDados.getColumnModel().getColumn(2).setMinWidth(200);
            jTableDados.getColumnModel().getColumn(3).setMinWidth(200);
            jTableDados.getColumnModel().getColumn(4).setMinWidth(150);
            jTableDados.getColumnModel().getColumn(5).setMinWidth(100);
            jTableDados.getColumnModel().getColumn(6).setMinWidth(100);
            jTableDados.getColumnModel().getColumn(7).setMinWidth(100);
        }

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1106, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static String codAluno;
            
    private void jTableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseClicked

        Dados dd = new Dados();

        dd.setCodAluno((int)jTableDados.getValueAt(jTableDados.getSelectedRow(), 0));
        dd.setNomeAluno(jTableDados.getValueAt(jTableDados.getSelectedRow(), 1).toString());
        dd.setNomeResp(jTableDados.getValueAt(jTableDados.getSelectedRow(), 2).toString());
        dd.setEndereco(jTableDados.getValueAt(jTableDados.getSelectedRow(), 3).toString());
        dd.setEscolaAluno(jTableDados.getValueAt(jTableDados.getSelectedRow(), 4).toString());
        dd.setHorario(jTableDados.getValueAt(jTableDados.getSelectedRow(), 5).toString());
        dd.setRgResp(jTableDados.getValueAt(jTableDados.getSelectedRow(), 6).toString());
        dd.setCpfResp(jTableDados.getValueAt(jTableDados.getSelectedRow(), 7).toString());        
        dd.setTel(jTableDados.getValueAt(jTableDados.getSelectedRow(), 8).toString());
        dd.setTel1(jTableDados.getValueAt(jTableDados.getSelectedRow(), 9).toString());
        dd.setTel2(jTableDados.getValueAt(jTableDados.getSelectedRow(), 10).toString());
        dd.setInicio(jTableDados.getValueAt(jTableDados.getSelectedRow(), 11).toString());
        dd.setTermino(jTableDados.getValueAt(jTableDados.getSelectedRow(), 12).toString());
        dd.setValorT(jTableDados.getValueAt(jTableDados.getSelectedRow(), 13).toString());
        dd.setParcelas(jTableDados.getValueAt(jTableDados.getSelectedRow(), 14).toString());
        dd.setValorP(jTableDados.getValueAt(jTableDados.getSelectedRow(), 15).toString());
        dd.setDiaPaga(jTableDados.getValueAt(jTableDados.getSelectedRow(), 16).toString());

        DadosAluno ddAluno = new DadosAluno(dd);

        ddAluno.setVisible(true);
        ddAluno.setExtendedState(MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jTableDadosMouseClicked

    /*public void ViewJTable(){
    }*/
 /*public void readJTable(){
        DefaultTableModel modelo = new (DefaultTableModel) 
    }*/
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDados;
    // End of variables declaration//GEN-END:variables
}