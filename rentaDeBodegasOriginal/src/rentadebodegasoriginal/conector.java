/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentadebodegasoriginal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mariimorales
 */
public class conector {
    Connection conect=null;
    public Connection conexion() {
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
                    conect=DriverManager.getConnection("jdbc:mysql//localhost/clientes","root","root");
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"error"+e);
                    }
            return conect;
    }
    
    
}
