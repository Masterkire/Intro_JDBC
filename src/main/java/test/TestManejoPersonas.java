package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo persona
        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com","5587652154");
        personaDao.insertar(personaNueva);
        
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
