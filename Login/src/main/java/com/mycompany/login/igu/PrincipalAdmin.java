
package com.mycompany.login.igu;

import com.mycompany.login.logica.Controladora;
import com.mycompany.login.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrincipalAdmin extends javax.swing.JFrame {


    Controladora control;
    Usuario usr;
    public PrincipalAdmin(Controladora control, Usuario usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnBorra = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnBorra.setText("Borrar Usuario");
        btnBorra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setText("Crear Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sistema administrador de usuarios");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNombreUser.setEditable(false);
        txtNombreUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreUser.setText("jTextField1");
        txtNombreUser.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(usr.getNombreUsuario());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        
        AltaUsuarios altaUsu = new AltaUsuarios(control);
        altaUsu.setVisible(true);
        altaUsu.setLocationRelativeTo(null);
        //this.dispose();
        
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnBorraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraActionPerformed
        
        //validar que la tabla tenga elementos
        if (tablaUsuarios.getRowCount() > 0){
            //Controlar que se seleccione elemento de la tabla
            if (tablaUsuarios.getSelectedRow() != -1){
                //obtener la id del elemento
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),0)));
                //llamo al metodo borrar
                control.borrarUsuario(id_usuario);
                //avisar al usuario que se borro
                mostrarMensaje("Se borro le mensaje correctamente", "Info", "Eliminacion correcta");
                
                cargarTabla();
            }
            else {
                mostrarMensaje("No selecciono ningun registro", "Error", "Error al borrar");
            }
        }
        else{
            mostrarMensaje("La tabla es vacia", "Error", "Error al borrar");
        }
        
    }//GEN-LAST:event_btnBorraActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tablaUsuarios.getRowCount() > 0){
            if (tablaUsuarios.getSelectedRow() !=-1){
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
                //llamo a la ventana de edicion
                EdicionUsuarios pantallaEdic = new EdicionUsuarios(control, id_usuario);
                pantallaEdic.setVisible(true);
                pantallaEdic.setLocationRelativeTo(null);
            }
            else {
                mostrarMensaje("No selecciono ningun registro", "Error", "Error al editar");
            }
        }
        else{
            mostrarMensaje("La tabla es vacia", "Error", "Error al editar");
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")){
            optionPane.setMessage(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorra;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
           //definir el modelo que queremos que tenga la tabla
       DefaultTableModel modeloTabla = new DefaultTableModel () {
       
           //que fila y columnas no sean editables
           @Override
           public boolean isCellEditable (int row, int column) {
               return false;
           }
           
       };
       
       //establecemos los nombres de las columnas
       String titulos[] = {"Id", "Usuario", "Rol"};
       modeloTabla.setColumnIdentifiers(titulos);
       
       //traer de la bd la lista de Usuarios
       List<Usuario> listaUsuarios = control.traerUsuarios();
       
       //preguntamos si la lista está vacía
       if (listaUsuarios!=null) {
           
           //recorrer la lista
           for (Usuario usu : listaUsuarios) {
               Object[] objeto = {usu.getId(), usu.getNombreUsuario(), usu.getUnRol().getNombreRol()};
               
               modeloTabla.addRow(objeto);
           }
             
       }     
       
       tablaUsuarios.setModel(modeloTabla);
        
    }
}
