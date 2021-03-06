/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import play.data.validation.Constraints;

/**
 *
 * @author usuario
 */
public class Curso extends Model {
    
    
    @Id
    @Constraints.Min(10)
    public long id;

    @Constraints.Required
    public String identificador;
    
    
    ArrayList<Grupo> arrayGrupo = new ArrayList<Grupo>();
     ArrayList<Docente> arrayDocente = new ArrayList<Docente>();
    
    public static Finder<Long, Curso> find = new Finder<Long, Curso>(Curso.class); 
}
