/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author paola.bernal
 * @author david.toledo
 */

@DatabaseTable(tableName="Libros")
public class Libro {
    @DatabaseField(id =true)
    private int codigo;
    @DatabaseField(canBeNull = false)
    private String nombre;
    @DatabaseField
    private String autor;
    @DatabaseField(canBeNull = false)
    private int costo;
    

    public Libro() {
    }

    public Libro(int codigo, String nombre, String autor, int costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

   
    
    
}
