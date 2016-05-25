/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.springframework.ui.Model;
import play.data.validation.Constraints;
import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

/**
 *
 * @author usuario
 */
@Entity
public class Docente extends Model{
    @Id
    @Constraints.Min(10)
    public long id;
    
    @Constraints.Required
    ArrayList<Curso> arrayCurso = new ArrayList<Curso>();
    
    
    @Constraints.Required
    public String nombre;
     
     @Constraints.Required
    public String materia;
     
      @Constraints.Required
    public String cedula;
 
        @Constraints.Required
    public String telefono;

    
    public static Finder<Long, Docente> find = new Finder<Long, Docente>(Docente.class); 
    
    
}
