/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentadebodegasoriginal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author mariimorales
 */
public class arregloClientes {
    private ArrayList<Clientes> objClientes;
    private Object idCliente;
    
    // Contructor
    public arregloClientes() {
        objClientes = new ArrayList<Clientes>();
        
    }
    
    // Métodos de manejo del ArrayList
    public void agregar(Clientes obj) {
        objClientes.add(obj);
    }
    
    public void borrar(Clientes obj) {
        objClientes.remove(obj);
    }
    
    public Clientes obtener(int pos) {
        return objClientes.get(pos);
    }
    
    public Clientes buscar(String noControl) {
        for (int i = 0; i < objClientes.size(); i++) {
            if(idCliente.equals(objClientes.get(i).getidCliente()))
                return objClientes.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return objClientes.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    private void cargar(){
        
        try {
            
            File archivo = new File("users.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("users.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nomUsuario = st.nextToken().trim();
                    String password = st.nextToken().trim();                    
                    char[] clave = password.toCharArray();
                    Object NomUsuario = null;
                    char[] Password = null;
                    if ((nomUsuario.equals(NomUsuario)) && 
                            (Arrays.equals(clave,Password))) {
                        int tipoUsuario = Integer.parseInt(st.nextToken().trim());
                    }
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "");
            }
        
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
        }
        
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("tabla.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getidCliente()+","+obtener(i).getNOMBRES()+","+
                        obtener(i).getAPELLIDOS()+","+obtener(i).getDIRECCION()+","+obtener(i).getCORREO());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
}
