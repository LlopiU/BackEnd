package com.portfolio.ull.Interface;

import com.portfolio.ull.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un obj de persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
