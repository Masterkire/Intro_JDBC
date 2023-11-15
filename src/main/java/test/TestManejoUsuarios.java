package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //Insertando un nuevo objeto de tipo usuario
//        Usuario nuevoUsuario = new Usuario("Alejandro", "alr9015");
//        int usuariosNuevos = usuarioDao.insertar(nuevoUsuario);
//        System.out.println("Numero de usuarios insertados: " + usuariosNuevos);
        
        //Actualizar registro de usuario existente
//        Usuario usuarioModificado = new Usuario(2,"Alewax", "Alewax123");
//        int usuariosModificados = usuarioDao.actualizar(usuarioModificado);
//        System.out.println("Se ha modificado informacion de: " + usuariosModificados + " usuarios");

        //Eliminar usuarios
        Usuario usuarioEliminado = new Usuario(3);
        int usuariosEliminados = usuarioDao.eliminar(usuarioEliminado);
        System.out.println("Se han eliminado: " + usuariosEliminados + " usuarios");
        
        //Listar registro en pantalla de usuarios
        List<Usuario> usuarios = usuarioDao.seleccionar();
        
        usuarios.forEach(usuario -> {
            System.out.println("Usuario: " + usuario);
        });
    }
}
