
public class Hola extends javax.swing.JFrame {
BD cx= new BD("libreria");
Connection con=cx.conectar();
    public Hola() {
        initComponents();
        Mostrar("");
    }
    //Este es el evento KeyReleased de el textField Buscar donde se pondra el metodo
    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {                                   
        Mostrar(Buscar.getText());
    } 
    
public JTable Mostrar(String Nombre){
        try {
            String sql;
            Statement st=con.createStatement();
            if(Nombre.equals("")){
            sql="SELECT * FROM libros";
            }
            else{
                sql="Select * from libros where isbn like'%"+Nombre+"%' OR título like'%"+Nombre+"%' "
                        + "OR autor like'%"+Nombre+"%' OR cantidad like'%"+Nombre+"%' "
                        + "OR precio like'%"+Nombre+"%' OR género like'%"+Nombre+"%' ";
            }
            ResultSet rs= st.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();{
        }
            for(int i=1;i<=col;i++){
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while(rs.next()){
                String[] fila = new String[col];
                for(int j=0;j<col;j++){
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            Tabla.setModel(modelo);
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error...", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return Tabla;
    }
