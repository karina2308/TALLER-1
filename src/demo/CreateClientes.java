/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;
/**
 *
 * @author Karina MartinezV
 */
public class CreateClientes {
    
    
    public static void main (String [] args) { 
        
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU"); 
EntityManager em = emf.createEntityManager ();

em.getTransaction().begin();

Clientes p1 = new Clientes();

p1.setId(444);
p1.setFirstname("lady");
p1.setLastname("ruiz");
p1.setTelefono(7485550);
p1.setDireccion("carrera100 Oriente");
em.persist(p1);

Clientes p2 = new Clientes();
p2.setId(55);
p2.setFirstname("andres");
p2.setLastname("vargas");
p2.setTelefono(7127840);
p2.setDireccion("carrera45 sur");
em.persist(p2);

em.getTransaction().commit();

em.close (); 
emf.close ();

}
   
}
