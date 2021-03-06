package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class JfCadastroPessoa extends javax.swing.JDialog {

    private DefaultTableModel modelo;
    
    /**
     * Creates new form JfCadastroPessoa
     * @param parent
     * @param modal
     */
    public JfCadastroPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        modelo = (DefaultTableModel) jTableContato.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlblID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMaskDDD = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jMaskTel = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTxtNomeContato = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMaskDDDContato = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jMaskTelContato = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContato = new javax.swing.JTable();
        jBtnAdd = new javax.swing.JButton();
        jBtnRemove = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCboOperadora = new javax.swing.JComboBox();
        jBtnNovo = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 70, 14);

        jlblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblID.setText("0");
        getContentPane().add(jlblID);
        jlblID.setBounds(86, 50, 40, 14);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 84, 70, 14);

        jTxtNome.setEnabled(false);
        getContentPane().add(jTxtNome);
        jTxtNome.setBounds(90, 80, 480, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DDD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 120, 70, 14);

        try {
            jMaskDDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jMaskDDD.setEnabled(false);
        getContentPane().add(jMaskDDD);
        jMaskDDD.setBounds(90, 120, 80, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 120, 70, 14);

        try {
            jMaskTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jMaskTel.setEnabled(false);
        getContentPane().add(jMaskTel);
        jMaskTel.setBounds(330, 120, 240, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contatos"));
        jPanel1.setLayout(null);

        jLabel6.setText("Nome:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(25, 32, 31, 14);

        jTxtNomeContato.setEnabled(false);
        jPanel1.add(jTxtNomeContato);
        jTxtNomeContato.setBounds(60, 30, 380, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("DDD:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(15, 83, 40, 14);

        try {
            jMaskDDDContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jMaskDDDContato.setEnabled(false);
        jPanel1.add(jMaskDDDContato);
        jMaskDDDContato.setBounds(60, 80, 60, 20);

        jLabel8.setText("Operadora:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(284, 83, 56, 14);

        try {
            jMaskTelContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jMaskTelContato.setEnabled(false);
        jPanel1.add(jMaskTelContato);
        jMaskTelContato.setBounds(180, 80, 100, 20);

        jTableContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "DDD", "Telefone", "Operadora"
            }
        ));
        jScrollPane1.setViewportView(jTableContato);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 530, 190);

        jBtnAdd.setText("+");
        jBtnAdd.setEnabled(false);
        jPanel1.add(jBtnAdd);
        jBtnAdd.setBounds(460, 30, 60, 23);

        jBtnRemove.setText("-");
        jBtnRemove.setEnabled(false);
        jPanel1.add(jBtnRemove);
        jBtnRemove.setBounds(460, 80, 60, 23);

        jLabel9.setText("Telefone:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 83, 50, 14);

        jCboOperadora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vivo", "Claro", "Tim", "OI", "Nextel", "Telefônica", "Outros" }));
        jCboOperadora.setEnabled(false);
        jPanel1.add(jCboOperadora);
        jCboOperadora.setBounds(350, 80, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 180, 560, 310);

        jBtnNovo.setText("Novo");
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNovo);
        jBtnNovo.setBounds(180, 510, 90, 23);

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.setEnabled(false);
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalvar);
        jBtnSalvar.setBounds(273, 510, 80, 23);

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setEnabled(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar);
        jBtnCancelar.setBounds(360, 510, 100, 23);

        setSize(new java.awt.Dimension(631, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
        limparCampos();
        tratarCampos(true); //habilitar os campos
        jBtnSalvar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jBtnNovo.setEnabled(false);
    }//GEN-LAST:event_jBtnNovoActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        limparCampos();
        tratarCampos(false); //habilitar os campos
        jBtnSalvar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jBtnNovo.setEnabled(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        limparCampos();
        tratarCampos(false); //habilitar os campos
        jBtnSalvar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jBtnNovo.setEnabled(true);
    }//GEN-LAST:event_jBtnSalvarActionPerformed

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
                if (UIManager.getSystemLookAndFeelClassName().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JfCadastroPessoa dialog = new JfCadastroPessoa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnRemove;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JComboBox jCboOperadora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jMaskDDD;
    private javax.swing.JFormattedTextField jMaskDDDContato;
    private javax.swing.JFormattedTextField jMaskTel;
    private javax.swing.JFormattedTextField jMaskTelContato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContato;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNomeContato;
    private javax.swing.JLabel jlblID;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jTxtNome.setText(null);
        jMaskDDD.setText(null);
        jMaskTel.setText(null);

        jTxtNomeContato.setText(null);
        jMaskDDDContato.setText(null);
        jMaskTelContato.setText(null);
        jCboOperadora.setSelectedIndex(0);

        //limpar a tabela
        /*
        jTableContato.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nome", "DDD", "Telefone", "Operadora"
                }
        ));
        */
        
        modelo.setNumRows(0);
    }

    private boolean preencherObjeto() throws Exception {

        return true;
    }

    private boolean validarCampos() throws Exception {
        String msg = "";
        
        if (jTxtNome.getText().equals("")) {
            msg+="\nO campo nome não pode ser vazio";
            jTxtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        } else if (jTxtNome.getText().length() > 50) {
            msg+="\nO nome não pode ter mais de 50 caracteres";
        }
        
        if (jMaskDDD.getText().equals("(  )")) {
            msg+="\nPreencha o DDD da Pessoa";
        }

        //colocar os demais campos
        
        if (msg.length() == 0)
            return true;
        else {
            JOptionPane.showMessageDialog(null, msg);
            return false;
        }
    }

    private void tratarCampos(boolean f) {
        jTxtNome.setEnabled(f);
        jMaskDDD.setEnabled(f);
        jMaskTel.setEnabled(f);

        jTxtNomeContato.setEnabled(f);
        jMaskDDDContato.setEnabled(f);
        jMaskTelContato.setEnabled(f);
        jCboOperadora.setEnabled(f);

        jBtnNovo.setEnabled(f);
        jBtnSalvar.setEnabled(f);
        jBtnCancelar.setEnabled(f);
    }

}
