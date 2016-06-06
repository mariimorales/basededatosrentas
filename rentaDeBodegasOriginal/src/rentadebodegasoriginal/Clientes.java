/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentadebodegasoriginal;

/**
 *
 * @author mariimorales
 */
public class Clientes {
    private String idCliente;
    private String NOMBRES;
    private String APELLIDOS;
    private String DIRECCION;
    private String TELEFONO;
    private String  CORREO;
    

public Clientes(String idCliente,String NOMBRES, 
    String APELLIDOS, String DIRECCION, String TELEFONO,String CORREO) {
    this.idCliente = idCliente;
    this.NOMBRES = NOMBRES;
    this.APELLIDOS= APELLIDOS;
    this.DIRECCION = DIRECCION;
    this.CORREO = CORREO;
}
public void setidCliente(String idCliente) {
    this.idCliente = idCliente;
}

public void setNOMBRES(String NOMBRES) {
    this.NOMBRES = NOMBRES;
}

public void setAPELLIDOS(String APELLIDOS) {
    this.APELLIDOS =APELLIDOS;
}

public void setDIRECCION(String DIRECCION) {
    this.DIRECCION = DIRECCION;
}

public void CORREO(String CORREO) {
    this.CORREO = CORREO;
}


public String getidCliente() {
    return idCliente;
}

public String getNOMBRES() {
    return NOMBRES;
}

public String getAPELLIDOS() {
    return APELLIDOS;
}

public String getDIRECCION() {
    return DIRECCION;
}

public String getCORREO() {
    return CORREO;
}
    

}
