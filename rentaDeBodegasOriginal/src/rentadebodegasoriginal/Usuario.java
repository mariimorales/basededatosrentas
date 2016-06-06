/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentadebodegasoriginal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author mariimorales
 */
class Usuario {
     private String nombUsuario;
    private String password;
    private int cvTipo;
    private String nombre;
    

public void Usuario(String strNombUsuario, String strPassword, 
            int nCvTipo, String strNombre) {
        this.nombUsuario = strNombUsuario;
        this.password = strPassword;
        this.cvTipo = nCvTipo;
        this.nombre = strNombre;
    }
 public void setNomUsuario(String strNomUsuario) {
        this.nombUsuario = strNomUsuario;
}
 
    public void setPassword(String strPassword) {
        this.password = strPassword;
    }
    
    public void setTipoUsuario(int nCveTipo) {
        this.cvTipo = nCveTipo;
    }
    
    public void setNombre(String strNombre) {
        this.nombre = strNombre;
    }
    
    // Métodos GET
    
    public String getNomUsuario() {
        return nombUsuario;
    }
    
    public String getPasswod() {
        return password;
    }
    
    public int getTipoUsuario() {
        return cvTipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    // Método valida usuario
    public int validaUsuario(String strNomUsuario, 
            char[] strPassword) {
        int tipoUsuario = 0;
        
        try {
            File archivo = new File("usuarios.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nombUsuario = st.nextToken().trim();
                    String password = st.nextToken().trim();                    
                    char[] clave = password.toCharArray();
                    if ((nombUsuario.equals(strNomUsuario)) && 
                            (Arrays.equals(clave, strPassword))) {
                        tipoUsuario = Integer.parseInt(st.nextToken().trim());
                    }
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
            }
        
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
        }
        return tipoUsuario;
    }
}