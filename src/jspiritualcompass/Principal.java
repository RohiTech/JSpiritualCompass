/*
 * Principal.java
 *
 * Created on 28 de diciembre de 2008, 12:03 PM
 */

package jspiritualcompass;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author  José Francisco
 * @email: ingenierojosefrancisco@gmail.com
 * 
 */
public class Principal extends javax.swing.JFrame 
{
    int i = 0;
    int c = 0;
    String dir = "src/Citas_Biblicas/";
    String est = "";
    JLectorArchivo l = new JLectorArchivo();
    
    /** Creates new form Principal */
    public Principal() 
    {
        initComponents();
        Seleccionar_Imagen();
        //super.setExtendedState(super.MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSpiritualCompass");
        setResizable(false);
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agradecido", "Amargado o en crisis", "Amenazando el desastre", "Angustiado", "Ansioso", "Cansado", "Con dificultades", "Con miedo", "Derrotado", "Desalentado", "Dejando el hogar", "Deprimido", "Dudando", "Enfermo o con dolor", "Enfrentando una crisis", "En oración", "Fallando el amigo", "Fallando la fe", "Necesitando dirección", "Necesitando paz", "Necesitando la protección de Dios", "Necesitando reglas para vivir", "Preocupado", "Protegido", "Solitario", "Tentado", "Triste", "Vencido", "Viajando", "Volviendo atrás" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 40, 260, 20);

        jLabel1.setText("DONDE ENCONTRAR AYUDA, cuando está");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 260, 14);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 40, 230, 200);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 660, 210);

        jLabel3.setText("Cita Biblica:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 260, 14);

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(20, 240, 260, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Autor.png"))); // NOI18N
        jLabel4.setToolTipText("Autor");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 240, 20, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ayuda.png"))); // NOI18N
        jLabel5.setToolTipText("Ayuda");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 240, 20, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-702)/2, (screenSize.height-526)/2, 702, 526);
    }// </editor-fold>//GEN-END:initComponents

private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
// TODO add your handling code here:
    Seleccionar_Imagen();
    Limpiar_Texto();
    Seleccionar_Cita();
}//GEN-LAST:event_jComboBox1ItemStateChanged

private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
// TODO add your handling code here:
    JOptionPane.showMessageDialog(null, "Para mayor información o sugerencia: ingenierojosefrancisco@gmail.com", "JSpiritualCompass", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jLabel4MouseClicked

private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
// TODO add your handling code here:
    JOptionPane.showMessageDialog(null, "Estimad@ lector(a): \nJSpiritualCompass es una aplicación portable que tiene algunas citas biblicas que sirven como luz para guiarle, alimento para sostenerlo y consuelo para alentarlo a usted. \nLo ideal es leer la propia biblia porque contiene la mente de Dios, el estado del hombre, el camino de salvación, la condenación de los pecadores y la felicidad de los creyentes.\nLéala para ser sabio, créala para ser salvo y practíquela para ser santo\nQue Dios te Bendiga y Prospere en Todo.\nAmén.","JSpiritualCompass",JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jLabel5MouseClicked

private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
// TODO add your handling code here:
    Seleccionar_Cita();
}//GEN-LAST:event_jComboBox2ItemStateChanged

private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBox2ActionPerformed

public static void Limpiar_Texto()
{
    jTextArea1.setText("");
}

public void Seleccionar_Cita()
{
    i = this.jComboBox1.getSelectedIndex();
    c = this.jComboBox2.getSelectedIndex();
    est = "";
    
    switch(i)
    {
        case 0:
            this.Agradecido();
            break;
        case 1:
            this.Amargado();
            break;
        case 2:
            this.Amenazando_Desastre();
            break;
        case 3:
            this.Angustiado();
            break;
        case 4:
            this.Ansioso();
            break;
        case 5:
            this.Cansado();
            break;
        case 6:
            this.Con_Dificultades();
            break;
        case 7:
            this.Con_Miedo();
            break;
        case 8:
            this.Derrotado();
            break;
        case 9:
            this.Desalentado();
            break;
        case 10:
            this.Dejando_Hogar();
            break;
        case 11:
            this.Deprimido();
            break;
        case 12:
            this.Dudando();
            break;
        case 13:
            this.Enfermo();
            break;
        case 14:
            this.Enfrentando_Crisis();
            break;
        case 15:
            this.En_Oracion();
            break;
        case 16:
            this.Fallando_Amigo();
            break;
        case 17:
            this.Fallando_Fe();
            break;
        case 18:
            this.Necesitando_Direccion();
            break;
        case 19:
            this.Necesitando_Paz();
            break;
        case 20:
            this.Necesitando_Proteccion();
            break;
        case 21:
            this.Necesitando_Reglas();
            break;
        case 22:
            this.Preocupado();
            break;
        case 23:
            this.Protegido();
            break;
        case 24:
            this.Solitario();
            break;
        case 25:
            this.Tentado();
            break;
        case 26:
            this.Triste();
            break;
        case 27:
            this.Vencido();
            break;
        case 28:
            this.Viajando();
            break;
        case 29:
            this.Volviendo_Atras();
            break;
    }
}

public void Agradecido()
{
    est = "Agradecido/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_100.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "I_Tes_5_18.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Heb_13_15.txt");
            break;
    }
}

public void Amargado()
{
    est = "Amargado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "I_Corintios_13.txt");
            break;
    }
}

public void Amenazando_Desastre()
{
    est = "Amenazando_desastre/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_91.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_118_5__6.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Luc_8_22_25.txt");
            break;
    }
}

public void Angustiado()
{
    est = "Angustiado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Mat_5_4.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "II_Corintios_1_3__4.txt");
            break;
    }
}

public void Ansioso()
{
    est = "Ansioso/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_46.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_6_19_34.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Fil_4_6.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "I_Pedro_5_6__7.txt");
            break;
    }
}

public void Cansado()
{
    est = "Cansado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_90.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_11_28_30.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "I_Corintios_15_58.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Galatas_6_9_10.txt");
            break;
    }
}

public void Con_Dificultades()
{
    est = "Con_dificultades/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos 16.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos 31.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Juan_14_1_4.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Heb_7_25.txt");
            break;
    }
}

public void Con_Miedo()
{
    est = "Con_miedo/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_34_4.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_10_28.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "II_Timoteo_1_7.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Heb_13_5_6.txt");
            break;
    }
}

public void Dejando_Hogar()
{
    est = "Dejando_Hogar/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_121.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_10_16_20.txt");
            break;
    }
}

public void Deprimido()
{
    est = "Deprimido/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_34.txt");
            break;
    }
}

public void Derrotado()
{
    est = "Derrotado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Romanos_8_31_39.txt");
            break;
    }
}

public void Desalentado()
{
    est = "Desalentado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_23.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_42_6_11.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Salmos_55_22.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Mateo_5_11__12.txt");
            break;
        case 4:
            l.Leer_Archivo(dir + est + "II_Corintios_4_8_18.txt");
            break;
        case 5:
            l.Leer_Archivo(dir + est + "Fil_4_4_7.txt");
            break;
    }
}

public void Dudando()
{
    est = "Dudando/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Mateo_8_26.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Hebreos_11.txt");
            break;
    }
}

public void En_Oracion()
{
    est = "En_Oracion/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_4.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_42.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Luc_11_1_13.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Juan_17.txt");
            break;
        case 4:
            l.Leer_Archivo(dir + est + "I_Juan_5_14_15");
            break;
    }
}

public void Enfermo()
{
    est = "Enfermo/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_38.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_26_39.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Rom_5_3_5.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "II_Corintios_12_9__10.txt");
            break;
        case 4:
            l.Leer_Archivo(dir + est + "I_Pedro_4_12_13__19.txt");
            break;
    }
}

public void Enfrentando_Crisis()
{
    est = "Enfrentando_Crisis/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_121.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_6_25_34.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Heb_4_16.txt");
            break;
    }
}

public void Fallando_Amigo()
{
    est = "Fallando_Amigo/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_41_9_13.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Luc_17_3__4.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Rom_12_14__17__19__21.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "II_Timoteo_4_16_18.txt");
            break;
    }
}

public void Fallando_Fe()
{
    est = "Fallando_Fe/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_42_5.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Heb_11.txt");
            break;
    }
}

public void Necesitando_Direccion()
{
    est = "Necesitando_Direccion/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_32_8.txt");
            break;
    }
}

public void Necesitando_Paz()
{
    est = "Necesitando_Paz/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Juan_14_1_4.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Juan_16_33.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Rom_5_1_5.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "Fil_4_6__7.txt");
            break;
    }
}

public void Necesitando_Proteccion()
{
    est = "Necesitando_Proteccion_Dios/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_27_1_6.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_91.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Fil_4_19.txt");
            break;
    }
}

public void Necesitando_Reglas()
{
    est = "Necesitando_Reglas_Vivir/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Rom_12.txt");
            break;
    }
}

public void Preocupado()
{
    est = "Preocupado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Mateo_6_19_34.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "I_Pedro_5_6__7.txt");
            break;
    }
}

public void Protegido()
{
    est = "Protegido/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_18_1_3.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_34_7.txt");
            break;
    }
}

public void Solitario()
{
    est = "Solitario/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_23.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Heb_13_5__6.txt");
            break;
    }
}

public void Tentado()
{
    est = "Tentado/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_1.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Salmos_139_23__24.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Mateo_26_41.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "I_Corintios_10_12_14.txt");
            break;
        case 4:
            l.Leer_Archivo(dir + est + "Fil_4_8.txt");
            break;
        case 5:
            l.Leer_Archivo(dir + est + "Santiago_4_7.txt");
            break;
        case 6:
            l.Leer_Archivo(dir + est + "II_Pedro_2_9.txt");
            break;
        case 7:
            l.Leer_Archivo(dir + est + "II_Pedro_3_17.txt");
            break;
    }
}

public void Triste()
{
    est = "Triste/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_51.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Mateo_5_4.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "Juan_14.txt");
            break;
        case 3:
            l.Leer_Archivo(dir + est + "II_Corintios_1_3__4.txt");
            break;
        case 4:
            l.Leer_Archivo(dir + est + "I_Tes_4_13_18.txt");
            break;
    }
}

public void Vencido()
{
    est = "Vencido/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_6.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "Rom_8_31_39.txt");
            break;
        case 2:
            l.Leer_Archivo(dir + est + "I_Juan_1_4_9.txt");
            break;
    }
}

public void Viajando()
{
    est = "Viajando/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_121.txt");
            break;
    }
}

public void Volviendo_Atras()
{
    est = "Volviendo_atras/";
    switch(c)
    {
        case 0:
            l.Leer_Archivo(dir + est + "Salmos_51.txt");
            break;
        case 1:
            l.Leer_Archivo(dir + est + "I_Juan_1_4_9.txt");
            break;
    }
}

public void Seleccionar_Imagen()
{
    i = this.jComboBox1.getSelectedIndex();
    
    switch(i)
    {
        case 0:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Agradecido.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 100");
            this.jComboBox2.addItem("1 Tes. 5:18");
            this.jComboBox2.addItem("Heb. 13:15");
            break;
        case 1:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Amargado o en Crisis.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("1 Cor. 13");
            break;
        case 2:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Amenazando el Desastre.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 91");
            this.jComboBox2.addItem("Sal. 118:5, 6");
            this.jComboBox2.addItem("Luc. 8:22-25");
            break;
        case 3:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Angustiado.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Mat. 5:4");
            this.jComboBox2.addItem("2 Cor. 1:3, 4");
            break;
        case 4:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Ansioso.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 46");
            this.jComboBox2.addItem("Mat. 6:19-34");
            this.jComboBox2.addItem("Fil. 4:6");
            this.jComboBox2.addItem("1 Pedro 5:6, 7");
            break;
        case 5:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Cansado.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 90");
            this.jComboBox2.addItem("Mat. 11:28-30");
            this.jComboBox2.addItem("1 Cor. 15:58");
            this.jComboBox2.addItem("Gal. 6:9, 10");
            break;
        case 6:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Con Dificultades.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 16");
            this.jComboBox2.addItem("Salmo 31");
            this.jComboBox2.addItem("Juan 14:1-4");
            this.jComboBox2.addItem("Heb. 7:25");
            break;
        case 7:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Con Miedo.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 34:4");
            this.jComboBox2.addItem("Mat. 10:28");
            this.jComboBox2.addItem("2 Tim. 1:7");
            this.jComboBox2.addItem("Heb. 13:5, 6");
            break;
        case 8:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Derrotado.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Rom. 8: 31-39");
            break;
        case 9:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Desalentado.gif"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 23");
            this.jComboBox2.addItem("Salmo 42:6-11");
            this.jComboBox2.addItem("Salmo 55:22");
            this.jComboBox2.addItem("Mat. 5:11, 12");
            this.jComboBox2.addItem("2 Cor. 4:8-18");
            this.jComboBox2.addItem("Fil. 4:4-7");
            break;
        case 10:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Dejando el Hogar.gif"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 121");
            this.jComboBox2.addItem("Mat. 10:16-20");
            break;
        case 11:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Deprimido.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 34");            
            break;
        case 12:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Dudando.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Mat. 8:26");
            this.jComboBox2.addItem("Hebreos 11");
            break;
        case 13:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Enfermo o con Dolor.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 38");
            this.jComboBox2.addItem("Mat. 26:39");
            this.jComboBox2.addItem("Rom. 5:3-5");
            this.jComboBox2.addItem("2 Cor. 12:9, 10");
            this.jComboBox2.addItem("1 Pedro 4:12, 13, 19");
            break;
        case 14:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Enfrentando una Crisis.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 121");
            this.jComboBox2.addItem("Mat. 6:25-34");
            this.jComboBox2.addItem("Heb. 4:16");
            break;
        case 15:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/En Oracion.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 4");
            this.jComboBox2.addItem("Salmo 42");
            this.jComboBox2.addItem("Luc. 11:1-13");
            this.jComboBox2.addItem("Juan 17");
            this.jComboBox2.addItem("1 Juan 5:14, 15");
            break;
        case 16:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Fallando el Amigo.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 41:9-13");
            this.jComboBox2.addItem("Luc. 17:3, 4");
            this.jComboBox2.addItem("Rom. 12:14, 17, 19, 21");
            this.jComboBox2.addItem("2 Tim. 4:16-18");
            break;
        case 17:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Fallando la Fe.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 42:5");
            this.jComboBox2.addItem("Hebreos 11");
            break;
        case 18:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Necesitando Direccion.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 32:8");
            break;
        case 19:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Necesitando Paz.gif"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Juan 14:1-4");
            this.jComboBox2.addItem("Juan 16:33");
            this.jComboBox2.addItem("Rom. 5:1-5");
            this.jComboBox2.addItem("Fil. 4:6, 7");
            break;
        case 20:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Necesitando la Protección de Dios.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 27:1-6");
            this.jComboBox2.addItem("Salmo 91");
            this.jComboBox2.addItem("Fil. 4:19");
            break;
        case 21:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Necesitando Reglas para Vivir.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Romanos 12");
            break;
        case 22:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Preocupado.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Mat. 6:19-34");
            this.jComboBox2.addItem("1 Pedro 5:6, 7");
            break;
        case 23:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Protegido.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 18:1-3");
            this.jComboBox2.addItem("Salmo 34:7");
            break;
        case 24:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Solitario.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 23");
            this.jComboBox2.addItem("Heb. 13:5, 6");
            break;
        case 25:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Tentado.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 1");
            this.jComboBox2.addItem("Sal. 139:23, 24");
            this.jComboBox2.addItem("Mat. 26:41");
            this.jComboBox2.addItem("1 Cor. 10:12-14");
            this.jComboBox2.addItem("Filipenses 4:8");
            this.jComboBox2.addItem("Santiago 4:7");
            this.jComboBox2.addItem("2 Pedro 2:9");
            this.jComboBox2.addItem("2 Pedro 3:17");
            break;
        case 26:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Triste.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 51");
            this.jComboBox2.addItem("Mat. 5:4");
            this.jComboBox2.addItem("Juan 14");
            this.jComboBox2.addItem("2 Cor. 1:3, 4");
            this.jComboBox2.addItem("1 Tes. 4:13-18");
            break;
        case 27:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Vencido.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 6");
            this.jComboBox2.addItem("Rom. 8:31-39");
            this.jComboBox2.addItem("1 Juan 1:4-9");
            break;
        case 28:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Viajando.jpg"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 121");
            break;
        case 29:
            this.jLabel2.setIcon(new ImageIcon("src/imagenes/Volviendo atras.gif"));
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Salmo 51");
            this.jComboBox2.addItem("1 Juan 1:4-9");
            break;
    }
}

public static void Poner_Cita(String linea)
{
    jTextArea1.setText(linea);
}

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}