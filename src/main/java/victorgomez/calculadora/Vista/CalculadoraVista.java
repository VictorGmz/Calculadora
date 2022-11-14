/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package victorgomez.calculadora.Vista;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import victorgomez.calculadora.Modelo.CalculadoraModelo;

/**
 *
 * @author DAM2
 */
public class CalculadoraVista extends javax.swing.JFrame {

    String num1, num2, resultado = "";
    boolean operandoPulsado = false;
    CalculadoraModelo modelo = new CalculadoraModelo();
    char operacion;
    Font fuentePequenya, fuenteMediana, fuenteGrande;

    ComponentAdapter resizeListener = new ComponentAdapter() {
        @Override
        //Adaptamos la fuente a cada componente dependiendo del tamaño de 
        //la ventana
        public void componentResized(ComponentEvent e) {
            if (jPanelNumerico.getWidth() > 700 && jPanelNumerico.getHeight() > 460) {
                boton0.setFont(fuenteGrande);
                boton1.setFont(fuenteGrande);
                boton2.setFont(fuenteGrande);
                boton3.setFont(fuenteGrande);
                boton4.setFont(fuenteGrande);
                boton5.setFont(fuenteGrande);
                boton6.setFont(fuenteGrande);
                boton7.setFont(fuenteGrande);
                boton8.setFont(fuenteGrande);
                boton9.setFont(fuenteGrande);
                botonComa.setFont(fuenteGrande);
                botonSuma.setFont(fuenteGrande);
                botonMenos.setFont(fuenteGrande);
                botonMultiplicacion.setFont(fuenteGrande);
                botonDivision.setFont(fuenteGrande);
                pantalla.setFont(fuenteGrande);
            } else if (jPanelNumerico.getWidth() < 600 && jPanelNumerico.getHeight() < 360) {
                boton0.setFont(fuentePequenya);
                boton1.setFont(fuentePequenya);
                boton2.setFont(fuentePequenya);
                boton3.setFont(fuentePequenya);
                boton4.setFont(fuentePequenya);
                boton5.setFont(fuentePequenya);
                boton6.setFont(fuentePequenya);
                boton7.setFont(fuentePequenya);
                boton8.setFont(fuentePequenya);
                boton9.setFont(fuentePequenya);
                botonComa.setFont(fuentePequenya);
                botonSuma.setFont(fuentePequenya);
                botonMenos.setFont(fuentePequenya);
                botonMultiplicacion.setFont(fuentePequenya);
                botonDivision.setFont(fuentePequenya);
                pantalla.setFont(fuentePequenya);
            } else {
                boton0.setFont(fuenteMediana);
                boton1.setFont(fuenteMediana);
                boton2.setFont(fuenteMediana);
                boton3.setFont(fuenteMediana);
                boton4.setFont(fuenteMediana);
                boton5.setFont(fuenteMediana);
                boton6.setFont(fuenteMediana);
                boton7.setFont(fuenteMediana);
                boton8.setFont(fuenteMediana);
                boton9.setFont(fuenteMediana);
                botonComa.setFont(fuenteMediana);
                botonSuma.setFont(fuenteMediana);
                botonMenos.setFont(fuenteMediana);
                botonMultiplicacion.setFont(fuenteMediana);
                botonDivision.setFont(fuenteMediana);
                pantalla.setFont(fuenteMediana);
            }
        }
    };

    //Creamos keybindings para cada uno de los botones
    public CalculadoraVista() {
        initComponents();
        createKeyBinding(boton0, KeyEvent.VK_0, KeyEvent.VK_NUMPAD0);
        createKeyBinding(boton1, KeyEvent.VK_1, KeyEvent.VK_NUMPAD1);
        createKeyBinding(boton2, KeyEvent.VK_2, KeyEvent.VK_NUMPAD2);
        createKeyBinding(boton3, KeyEvent.VK_3, KeyEvent.VK_NUMPAD3);
        createKeyBinding(boton4, KeyEvent.VK_4, KeyEvent.VK_NUMPAD4);
        createKeyBinding(boton5, KeyEvent.VK_5, KeyEvent.VK_NUMPAD5);
        createKeyBinding(boton6, KeyEvent.VK_6, KeyEvent.VK_NUMPAD6);
        createKeyBinding(boton7, KeyEvent.VK_7, KeyEvent.VK_NUMPAD7);
        createKeyBinding(boton8, KeyEvent.VK_8, KeyEvent.VK_NUMPAD8);
        createKeyBinding(boton9, KeyEvent.VK_9, KeyEvent.VK_NUMPAD9);
        createKeyBinding(botonSuma, KeyEvent.VK_PLUS, KeyEvent.VK_ADD);
        createKeyBinding(botonMenos, KeyEvent.VK_LESS, KeyEvent.VK_MINUS);
        createKeyBinding(botonMultiplicacion, KeyEvent.VK_ASTERISK, KeyEvent.VK_MULTIPLY);
        createKeyBinding(botonDivision, KeyEvent.VK_DIVIDE, KeyEvent.VK_SLASH);
        createKeyBinding(botonComa, KeyEvent.VK_PERIOD, KeyEvent.VK_DECIMAL);
        addComponentListener(resizeListener);
        //Tamanyos de letra
        fuentePequenya = new Font("Dialog", Font.PLAIN, 24);
        fuenteMediana = new Font("Dialog", Font.PLAIN, 48);
        fuenteGrande = new Font("Dialog", Font.PLAIN, 96);
    }

    private void createKeyBinding(JButton boton, int keyCode1, int keyCode2) {
        boton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(keyCode1, 0), keyCode1 + "");
        boton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(keyCode2, 0), keyCode1 + "");
        boton.getActionMap().put(keyCode1 + "", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton.doClick();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pantalla = new javax.swing.JTextField();
        jPanelNumerico = new javax.swing.JPanel();
        boton7 = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonComa = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraSwing");
        setMaximumSize(new java.awt.Dimension(2200, 2200));
        setMinimumSize(new java.awt.Dimension(230, 260));
        setSize(new java.awt.Dimension(230, 260));

        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setToolTipText("");
        pantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pantalla.setMinimumSize(new java.awt.Dimension(64, 44));

        jPanelNumerico.setBackground(new java.awt.Color(255, 204, 102));
        jPanelNumerico.setMinimumSize(new java.awt.Dimension(230, 250));
        jPanelNumerico.setLayout(new java.awt.GridBagLayout());

        boton7.setText("7");
        boton7.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton7, gridBagConstraints);

        botonSuma.setText("+");
        botonSuma.setMaximumSize(new java.awt.Dimension(2200, 2200));
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanelNumerico.add(botonSuma, gridBagConstraints);

        botonComa.setText(".");
        botonComa.setMaximumSize(new java.awt.Dimension(2200, 2200));
        botonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelNumerico.add(botonComa, gridBagConstraints);

        botonMenos.setText("-");
        botonMenos.setMaximumSize(new java.awt.Dimension(2200, 2200));
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanelNumerico.add(botonMenos, gridBagConstraints);

        boton3.setText("3");
        boton3.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton3, gridBagConstraints);

        boton4.setText("4");
        boton4.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton4, gridBagConstraints);

        boton1.setText("1");
        boton1.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton1, gridBagConstraints);

        boton6.setText("6");
        boton6.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton6, gridBagConstraints);

        boton0.setText("0");
        boton0.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelNumerico.add(boton0, gridBagConstraints);

        boton5.setText("5");
        boton5.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton5, gridBagConstraints);

        botonMultiplicacion.setText("X");
        botonMultiplicacion.setMaximumSize(new java.awt.Dimension(2200, 2200));
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanelNumerico.add(botonMultiplicacion, gridBagConstraints);

        boton2.setText("2");
        boton2.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton2, gridBagConstraints);

        boton8.setText("8");
        boton8.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton8, gridBagConstraints);

        boton9.setText("9");
        boton9.setMaximumSize(new java.awt.Dimension(2200, 2200));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelNumerico.add(boton9, gridBagConstraints);

        botonDivision.setText("/");
        botonDivision.setMaximumSize(new java.awt.Dimension(2200, 2200));
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanelNumerico.add(botonDivision, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelNumerico, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNumerico, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        resultado += "1";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        resultado += "3";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        //Si no es una cadena vacia
        if (!"".equals(resultado)) {
            if (!operandoPulsado) {
                num1 = resultado;
                resultado = "";
                operandoPulsado = true;
                modelo.setNumero(Double.parseDouble(num1));
                operacion = '-';
            } else {
                num2 = resultado;
                resultado = "";
                modelo.calcula(operacion, Double.parseDouble(num2));
                if (numeroEntero(modelo)) {
                    pantalla.setText((int) modelo.getNumero() + "");
                } else {
                    pantalla.setText(modelo.getNumero() + "");
                }
                operacion = '-';
            }
        }
    }//GEN-LAST:event_botonMenosActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        resultado += "2";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        resultado += "4";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        resultado += "5";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        resultado += "6";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        resultado += "7";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        resultado += "8";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        resultado += "9";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        resultado += "0";
        pantalla.setText(resultado);
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComaActionPerformed
        if ("".equals(resultado)) {
            resultado += "0";
        }
        if (!resultado.contains(".")) {
            resultado += ".";
            pantalla.setText(resultado);
        } else {
            pantalla.setText(resultado);
        }
    }//GEN-LAST:event_botonComaActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        if (!"".equals(resultado)) {
            if (!operandoPulsado) {
                num1 = resultado;
                resultado = "";
                operandoPulsado = true;
                modelo.setNumero(Double.parseDouble(num1));
                operacion = '+';
            } else {
                num2 = resultado;
                resultado = "";
                modelo.calcula(operacion, Double.parseDouble(num2));
                if (numeroEntero(modelo)) {
                    pantalla.setText((int) modelo.getNumero() + "");
                } else {
                    pantalla.setText(modelo.getNumero() + "");
                }
                operacion = '+';
            }
        }
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
        if (!"".equals(resultado)) {
            if (!operandoPulsado) {
                num1 = resultado;
                resultado = "";
                operandoPulsado = true;
                modelo.setNumero(Double.parseDouble(num1));
                operacion = '*';
            } else {
                num2 = resultado;
                resultado = "";
                modelo.calcula(operacion, Double.parseDouble(num2));
                if (numeroEntero(modelo)) {
                    pantalla.setText((int) modelo.getNumero() + "");
                } else {
                    pantalla.setText(modelo.getNumero() + "");
                }
                operacion = '*';
            }
        }
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if (!"".equals(resultado)) {
            if (!operandoPulsado) {
                num1 = resultado;
                resultado = "";
                operandoPulsado = true;
                modelo.setNumero(Double.parseDouble(num1));
                operacion = '/';
            } else {
                num2 = resultado;
                resultado = "";
                modelo.calcula(operacion, Double.parseDouble(num2));
                if (numeroEntero(modelo)) {
                    pantalla.setText((int) modelo.getNumero() + "");
                } else {
                    pantalla.setText(modelo.getNumero() + "");
                }
                operacion = '/';
            }
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    //Formatea el resultado del modelo si el numero decimal es exacto
    public boolean numeroEntero(CalculadoraModelo model) {
        return model.getNumero() - (int) model.getNumero() == 0;
    }

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
            java.util.logging.Logger.getLogger(CalculadoraVista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculadoraVista vista = new CalculadoraVista();
                //Le damos un tamaño mínimo para que siempre se vea nuestra
                //calculadora
                Dimension tamanyo = new Dimension(330, 360);
                vista.setMinimumSize(tamanyo);
                vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonComa;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonSuma;
    private javax.swing.JPanel jPanelNumerico;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables

}
