/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.vista.ListarTelefonos;
import ec.edu.ups.vista.RegistrarTelefono;
import java.awt.PopupMenu;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JList;

/**
 *
 * @author Juanc
 */
public class ControladorTelefono {
    //objetos vista
  
    private Telefono telefono;
    private ITelefonoDAO telefonoDao;
    //constructor

    public ControladorTelefono(  TelefonoDAO telefonoDao) {
        
        this.telefonoDao = telefonoDao;
    }
     public void registrarTelefono(Telefono telefono){
    
     telefonoDao.create(telefono);
   
     }
    public Telefono verTelefono(int id){
        return null;
    
   
    }
    public void verTelefonos(){
   
       
         
       
   
    }

    

   
}
