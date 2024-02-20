/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class panel extends javax.swing.JFrame {

    //declaracion de variables auxiliares
    int contador;
    int contador2;
    //declaramos la pila a utilizar
    PILA pilita;
    //variables para almacenar la posicion de cada imagen
    int posPolloX;
    int posPolloY;
    int posPapaX;
    int posPapaY;
    int posTomateX;
    int posTomateY;
    int posQuesoX;
    int posQuesoY;
    int posAceitunaX;
    int posAceitunaY;
    int posCarneX;
    int posCarneY;
    //variables de verificado si estan el pila o no visualmente
    boolean sw1, sw2, sw3, sw4, sw5, sw6;

    public panel() {
        initComponents();
        //componentes para la dimension y para permitir el movimiento en software
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(1200, 700));
        panelPrincipal.setFocusable(true);
        //inicializmos variables
        contador = 1;
        contador2 = 0;
        //inicializamos la pilita
        pilita = new PILA();
        //guardando posiciones de cada imagen
        //posicion de pollo
        posPolloX = lblPollo.getX();
        posPolloY = lblPollo.getY();
        //posicion de papa
        posPapaX = lblPapa.getX();
        posPapaY = lblPapa.getY();
        //posicion de tomate
        posTomateX = lblTomate.getX();
        posTomateY = lblTomate.getY();
        //posicion de queso
        posQuesoX = lblQueso.getX();
        posQuesoY = lblQueso.getY();
        //posiccion de Aceituna
        posAceitunaX = lblAceituna.getX();
        posAceitunaY = lblAceituna.getY();
        //posicion de carne
        posCarneX = lblCarne.getX();
        posCarneY = lblCarne.getY();
        //variables boolean para identificar los elementos de la pila
        sw1 = false;
        sw2 = false;
        sw3 = false;
        sw4 = false;
        sw5 = false;
        sw5 = false;

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloIngredientes = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        lblAceituna = new javax.swing.JLabel();
        lblCarne = new javax.swing.JLabel();
        lblTomate = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblPollo = new javax.swing.JLabel();
        lblPapa = new javax.swing.JLabel();
        lblQueso = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(91, 133, 5));

        tituloIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icon2.png"))); // NOI18N

        titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/images.png"))); // NOI18N

        lblAceituna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aceitunita.png"))); // NOI18N

        lblCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carnita.png"))); // NOI18N

        lblTomate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tomatito.png"))); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 153, 0));
        btnIngresar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Pollito.png"))); // NOI18N

        lblPapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Papita.png"))); // NOI18N

        lblQueso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/quesito.png"))); // NOI18N

        panelPrincipal.setBackground(new java.awt.Color(253, 228, 157));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/espadita.png"))); // NOI18N
        panelPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, 513));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/brocheta.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        panelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 345, 109));

        cerrar.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 30)); // NOI18N
        cerrar.setForeground(new java.awt.Color(204, 204, 204));
        cerrar.setText("x");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        panelPrincipal.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tituloIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(titulo2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPollo)
                                    .addComponent(lblQueso))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAceituna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPapa))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)))
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPollo)
                            .addComponent(lblPapa))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAceituna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblQueso))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Boton Ingresar
        if (contador <= 6) {
            //incio de la transcicion de mover imagenes
            reloj.start();

        } else {
            JOptionPane.showMessageDialog(null, "La pila llego a su limite");
        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Busca elementos dentro de la pila visual
        if (sw6) {
            //eliminar el ultimo elemento que entro a a pila "carne"
            lblCarne.setLocation(posCarneX, posCarneY);//devuelve la imagen a us posicion
            pilita.Quitar();//saca el elemento de la pila
            pilita.imprimir();//imprime la pila
            sw6 = false;//variable de verficiacion si el elemento se encuentra en la pila
            
            /*
            * SE REPITE EL MISMO CODIGO PARA TODOS SOLO QUE MUEVE DIFERENTES IMAGENES
            */
        } else {
            if (sw5) {
                lblAceituna.setLocation(posAceitunaX, posAceitunaY);
                pilita.Quitar();
                pilita.imprimir();
                sw5 = false;

            } else {
                if (sw4) {
                    lblQueso.setLocation(posQuesoX, posQuesoY);
                    pilita.Quitar();
                    pilita.imprimir();
                    sw4 = false;

                } else {
                    if (sw3) {
                        lblTomate.setLocation(posTomateX, posTomateY);
                        pilita.Quitar();
                        pilita.imprimir();
                        sw3 = false;

                    } else {
                        if (sw2) {
                            lblPapa.setLocation(posPapaX, posPapaY);
                            pilita.Quitar();
                            pilita.imprimir();
                            sw2 = false;
                        } else {
                            if (sw1) {
                                lblPollo.setLocation(posPolloX, posPolloY);
                                pilita.Quitar();
                                sw1 = false;
                                JOptionPane.showMessageDialog(null, "La pila quedo Vacia");

                            }else{
                                JOptionPane.showMessageDialog(null, "La pila esta Vacia");
                            }
                        }

                    }
                }
            }

        }

     

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_cerrarMouseExited
    //metodo mover jlabel  con tiempo
    Timer reloj = new Timer(80, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            /**
             EXISTIRA UN CONTADOR PARA REALIZAR EL ADICIONADO DE LOS ELEMENTOS A LA PILA
             */
            switch (contador) {
                case 1:
                    //PREGUNTAMOS POSICIONES INICIALES PARA PODER MOVER LA IMAGEN
                    if (lblPollo.getX() < 858) {
                        //MUEVE LA IMAGENEN EL EJE X EN TIEMPO DE 20 PIXELES
                        lblPollo.setLocation(lblPollo.getX() + 20, lblPollo.getY());
                        //VA REPINTANDO LA IMAGEN PARA QUE SE VEA DETALLADA AL MOVERSE
                        lblPollo.repaint();

                    }
                    /*PREGUNTAMOS SI LA IMAGEN YA LLEGO A SU  POSICION EN EL EJE X 
                      Y ASI PODER INGRESAR A LA BROCHETA*/
                    if (lblPollo.getX() == 858 && lblPollo.getY() < 522) {
                        lblPollo.setLocation(lblPollo.getX(), lblPollo.getY() + 20);

                    }
                    //UNA VEZ LA IMAGEN ENTRE A LA BROCHETA , INTERNAMENTE INGRESARA A LA PILA DE DATOS
                    if (lblPollo.getY() == 522) {
                        contador++;
                        contador2++;
                        pilita.poner("Pollo");
                        pilita.imprimir();
                        reloj.stop();
                        sw1 = true;
                    }

                    break;
                    //PARA CADA CASO SE REPITE 
                case 2:

                    if (lblPapa.getX() < 875) {
                        lblPapa.setLocation(lblPapa.getX() + 20, lblPapa.getY());
                        lblPapa.repaint();

                    }
                    if (lblPapa.getX() == 875 && lblPapa.getY() < 462) {
                        lblPapa.setLocation(lblPapa.getX(), lblPapa.getY() + 20);

                    }
                    if (lblPapa.getY() == 462) {
                        contador++;
                        contador2++;
                        pilita.poner("Papa");
                        pilita.imprimir();
                        reloj.stop();
                        sw2 = true;
                    }
                    break;
                case 3:

                    if (lblTomate.getX() < 871) {
                        lblTomate.setLocation(lblTomate.getX() + 20, lblTomate.getY());
                        lblTomate.repaint();

                    }
                    if (lblTomate.getX() == 871 && lblTomate.getY() < 402) {
                        lblTomate.setLocation(lblTomate.getX(), lblTomate.getY() + 20);

                    }
                    if (lblTomate.getY() == 402) {
                        contador++;
                        contador2++;
                        pilita.poner("Tomate");
                        pilita.imprimir();
                        reloj.stop();
                        sw3 = true;
                    }

                    break;
                case 4:
                    if (lblQueso.getX() < 878 && lblQueso.getY() > 200) {

                        lblQueso.setLocation(lblQueso.getX() + 80, lblQueso.getY() - 20);
                        lblQueso.repaint();

                    }

                    if (lblQueso.getX() == 878 && lblQueso.getY() < 340) {
                        lblQueso.setLocation(lblQueso.getX(), lblQueso.getY() + 30);

                    }
                    if (lblQueso.getY() == 340) {
                        contador++;
                        contador2++;
                        pilita.poner("Queso");
                        pilita.imprimir();
                        reloj.stop();
                        sw4 = true;
                    }
                    break;
                case 5:

                    if (lblAceituna.getX() < 875 && lblAceituna.getY() > 200) {

                        lblAceituna.setLocation(lblAceituna.getX() + 80, lblAceituna.getY() - 20);
                        lblAceituna.repaint();
                    }

                    if (lblAceituna.getX() == 875 && lblAceituna.getY() < 280) {
                        lblAceituna.setLocation(lblAceituna.getX(), lblAceituna.getY() + 20);
                    }
                    if (lblAceituna.getY() == 290 && lblAceituna.getX() == 875) {
                        contador++;
                        contador2++;
                        pilita.poner("Aceituna");
                        pilita.imprimir();
                        reloj.stop();
                        sw5 = true;
                    }

                    break;
                case 6:

                    if (lblCarne.getX() < 871 && lblCarne.getY() > 100) {

                        lblCarne.setLocation(lblCarne.getX() + 80, lblCarne.getY() - 30);
                        lblCarne.repaint();
                    }

                    if (lblCarne.getX() == 871 && lblCarne.getY() < 220) {
                        lblCarne.setLocation(lblCarne.getX(), lblCarne.getY() + 20);
                    }
                    if (lblCarne.getY() == 230 && lblCarne.getX() == 871) {
                        pilita.poner("Carne");
                        pilita.imprimir();
                        reloj.stop();
                        contador++;
                        sw6 = true;
                    }
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "La pila llego al limite");
                        break;
            }

        }
    });//fin del metodo mover imagenes

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAceituna;
    private javax.swing.JLabel lblCarne;
    private javax.swing.JLabel lblPapa;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblQueso;
    private javax.swing.JLabel lblTomate;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel tituloIngredientes;
    // End of variables declaration//GEN-END:variables
}
