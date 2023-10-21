/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.edu.manteca.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.edu.manteca.entities.Post;
import mx.itson.edu.manteca.entities.Usuario;

/**
 *
 * @author manub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Usuario user = new Usuario();
user.setNombre("Manuel Gonzalez");
user.setDescripcion("Usuario estandar");
user.setCorreo("manubgr15@gmail.com");
user.setPassword("231022");
user.setCrear(false);
user.setEditar(false);
user.setEliminar(false);

Usuario user1 = new Usuario();
user1.setNombre("Jorge palacios");
user1.setDescripcion("Usuario estandar");
user1.setCorreo("Jorge.palacios.2849@gamil.com");
user1.setPassword("001298JP");
user1.setCrear(false);
user1.setEditar(false);
user1.setEliminar(false);

Usuario user2 = new Usuario();
user2.setNombre("Jesus Ceceña");
user2.setDescripcion("Administrador");
user2.setCorreo("Jesus.Ceceña.100328@potros.itson.edu.mx");
user.setPassword("9898JC");
user2.setCrear(false);
user2.setEditar(false);
user2.setEliminar(false);

List<Usuario> usuarios = new ArrayList<>();
usuarios.add(user);
usuarios.add(user1);
usuarios.add(user2);

List<String> Categorias = new ArrayList<>();
Categorias.add("Anime");
Categorias.add("Ambiente");
Categorias.add("Mexico");
Categorias.add("Memes");
Categorias.add("Animales");
Categorias.add("Social");
Categorias.add("Video juegos");
Categorias.add("Ingles");
Categorias.add("Universidad");
Categorias.add("Tecnologia");
Categorias.add("Musica");
Categorias.add("Danza");
Categorias.add("Kpop");
Categorias.add("Rock");
Categorias.add("Banda");
Categorias.add("Fit");
Categorias.add("Moda");


Post post = new Post();
post.setTitulo("En Beelcitosmemes pego mucho, lo paso por aca a ver que dicen");
post.setURL("https://preview.redd.it/rl091rp11kub1.jpg?width=736&format=pjpg&auto=webp&s=dddf9c285f18504da04c278b5f1c4485f3bd95ff");
post.setRpositivas(17);
post.setRnegativas(5);
post.setUsuarios(usuarios);
post.setCategorias(Categorias);
post.setRespuesta("Bakugo es inmamable e inmaduro, vegeta es mas maduro por que ha crecido como un adulto,\npadre, esposo y amigo, el caso es que vegeta y goku es cosa de competitividad \nque bakugo y deku es envidia de ver al chico que nunca tuvo un quirk pasar a tener uno de los mas rotos.");


        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println(usuarios.get(0).getNombre());
        System.err.println(post.getTitulo());
        System.out.println("Categoria: "+Categorias.get(0));
        System.out.println(post.getURL());
        System.out.println("Positivas: "+post.getRpositivas()+"                     "+"Negativas: "+post.getRnegativas());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(usuarios.get(1).getNombre());
        System.out.println(post.getRespuesta());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
 System.out.println("Positivas: "+post.getRpositivas()+"                     "+"Negativas: "+post.getRnegativas()+ "        "+ "Reply");
    
    
    }
    
    
}
