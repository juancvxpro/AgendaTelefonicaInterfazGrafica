/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juanc
 */
public class TelefonoDAO implements ITelefonoDAO {
    private final List<Telefono> listaTelefonos;

    public TelefonoDAO() {
        listaTelefonos = new ArrayList<>();
    }
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.add(telefono);
    }
    @Override
    public Telefono read(int id) {
       
        return null;
    }

    //para actualizar un telefono
    @Override
    public void update(Telefono telefono) {
        

    }

    //para eliminar un telefono
    @Override
    public void delete(Telefono telefono) {
       
    }

    //para devolver un mapa de telefonos
    @Override
    public List<Telefono> findAll() {
        return listaTelefonos;
    }

}
