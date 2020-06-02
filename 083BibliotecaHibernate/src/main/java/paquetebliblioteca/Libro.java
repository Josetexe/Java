package paquetebliblioteca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
    private String nombre;
    private String titulo;
    private String autor;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    public Libro(String nombre, String titulo, String autor, int id) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }

    public Libro(String nombre, String titulo, String autor) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro() {
        System.out.println("Holi, alguien me está leyendo");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    	System.out.println("Holi, alguien está seteándome un nombre "+nombre);
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
    	System.out.println("Holi, alguien está seteándome un titulo "+titulo);
    	this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
    	System.out.println("Holi, alguien está seteándome un autor "+autor);
    	this.autor = autor;
    }
    
    
    
    @Override
    public String toString() {
        return id+" "+nombre+"->"+titulo+"->"+autor;
    }
    
}