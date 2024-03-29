package burbuja;

import java.time.LocalTime;
import java.util.*;

public class Main extends javax.swing.JFrame implements Runnable{
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        h1 = new Thread(this);
        h1.start(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        PanelUP = new javax.swing.JPanel();
        LbCenter = new javax.swing.JLabel();
        LbLeft = new javax.swing.JLabel();
        LbRight = new javax.swing.JLabel();
        PanelDwn = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 420));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setToolTipText("");

        PanelUP.setBackground(new java.awt.Color(102, 204, 255));
        PanelUP.setPreferredSize(new java.awt.Dimension(500, 100));

        LbCenter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbCenter.setForeground(new java.awt.Color(0, 0, 0));
        LbCenter.setText("Burbuja");
        LbCenter.setToolTipText("");

        LbLeft.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbLeft.setForeground(new java.awt.Color(0, 0, 0));
        LbLeft.setText("Hora: 12:00:00AM");
        LbLeft.setToolTipText("");

        LbRight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbRight.setForeground(new java.awt.Color(0, 0, 0));
        LbRight.setText("Fecha:00/00/0000");
        LbRight.setToolTipText("");

        javax.swing.GroupLayout PanelUPLayout = new javax.swing.GroupLayout(PanelUP);
        PanelUP.setLayout(PanelUPLayout);
        PanelUPLayout.setHorizontalGroup(
            PanelUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUPLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(LbLeft)
                .addGap(258, 258, 258)
                .addComponent(LbCenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(LbRight)
                .addGap(49, 49, 49))
        );
        PanelUPLayout.setVerticalGroup(
            PanelUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbCenter)
                    .addComponent(LbLeft)
                    .addComponent(LbRight))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelDwn.setBackground(new java.awt.Color(102, 204, 255));
        PanelDwn.setPreferredSize(new java.awt.Dimension(500, 100));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDwnLayout = new javax.swing.GroupLayout(PanelDwn);
        PanelDwn.setLayout(PanelDwnLayout);
        PanelDwnLayout.setHorizontalGroup(
            PanelDwnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDwnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDwnLayout.setVerticalGroup(
            PanelDwnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDwnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUP, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addComponent(PanelDwn, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(PanelUP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(PanelDwn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      LocalTime horaActual = LocalTime.now();
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel LbCenter;
    private javax.swing.JLabel LbLeft;
    private javax.swing.JLabel LbRight;
    private javax.swing.JPanel PanelDwn;
    private javax.swing.JPanel PanelUP;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct= Thread.currentThread();
        Calendar calendar = new GregorianCalendar();
        Date fecha = new Date();
        
        calendar.setTime(fecha);
        
        int dia, mes, anio;
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        mes = calendar.get(Calendar.MONTH)+1;
        anio = calendar.get(Calendar.YEAR);
        
        
        
        LbRight.setText("Fecha: "+dia+"/"+mes+"/"+anio);
        while(ct == h1){
            calcula();
            LbLeft.setText(hora+":"+minutos+":"+segundos+" "+ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm= calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
        if (ampm.equals("PM")) {
            int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
                        
        }else{
            hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
