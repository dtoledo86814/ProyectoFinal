/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

/**
 *
 * @author paola.bernal
 * @author david.toledo
 */
public class Libreria {
    public static void main(String[] args) throws Exception {
        //conexion a la base de datos
        ConnectionSource conexion;
        
        //url de la base de datos
        String url ="jdbc:h2:file:./data/librosExistentes";
        
        //conectarse a la base de datos del url
        conexion = new JdbcConnectionSource(url);
        
        //Dao=Data Access Object
        Dao<Libro,Integer> librosExistentes;
        librosExistentes = DaoManager.createDao(conexion, Libro.class);
        

        java.util.List<Libro> Libros = librosExistentes.queryForAll();
        
    
        conexion.close();
    }
    private Iterable<Libro> Libros;

    
    /**
     * agrega un libro a la base de datos.<br>.
     * @return true si se ejecuto correctamente
     */
    public boolean agregarLibro(){
        
        return false;   
    }
    /**
     * elimina un libro a la base de datos.<br>.
     * @return true si se ejecuto correctamente
     */
    public boolean eliminarLibro(){
        System.out.println("eliminado");
        return false; 
    }
    /**
     * Organiza la lista de lista de libros por nombre <br>
     *
     */
    public void organizarNombre(){
    }
        /**
     * Organiza la lista de lista de libros por costo <br>
     *
     */
    public void organizarCosto(){
    }
        /**
     * Organiza la lista de lista de libros por codigo <br>
     *
     */
    public void organizarCodigo(){
    }
    
}
