/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Karina MartinezV
 */
public class MAIN {
    
    public static void main (String [] args) 
    
        {
            
            int Opcion;
do{    

Opcion = Integer.parseInt(JOptionPane.showInputDialog ("MENU DEL TALLER CLIENTE \n1 -> Insertar\n2 -> Editar \n3 -> Eliminar"));

switch (Opcion) {
case 1:
  
JOptionPane.showMessageDialog(null ," Insertar informacion del cliente");

{
    insertar();
}
break;

case 2:

JOptionPane.showMessageDialog(null ," Editar informacion del cliente");
{
    editar();
}
break;

case 3:

JOptionPane.showMessageDialog(null ," Eliminar cliente");
{
    eliminar();
}
break;

 } } while (Opcion!=2);
 }
    
            // menu karina
        
        
     public static void insertar() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{
 Clientes Cliente = new Clientes();
  
 Cliente.setId(5577);
 Cliente.setFirstname("Angie");
 Cliente.setLastname("ramirez");
 Cliente.setTelefono(31278466);
 Cliente.setDireccion("Calle 22a 34");
    

    et.begin();
    em.persist(Cliente);
    et.commit();
    
    JOptionPane.showMessageDialog(null, "El registro se realizo Correctamente");
    //System.out.println("El registro de realizo");
        }
catch (Exception ex)
    {
        et.rollback();
        System.out.println("Error: "+ ex.getMessage());
        }
finally
{
    em.close();
}

}
     
    public static void editar() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=77;
    Clientes Cliente=em.find(Clientes.class, Id);
    Cliente.setFirstname("karina");
    Cliente.setLastname("ruiz");
    Cliente.setTelefono(7485550);
    Cliente.setDireccion("calle23");
   
    et.begin();
    em.merge(Cliente);
    et.commit();
    
    JOptionPane.showMessageDialog(null, "Edicion realizada correctamente");
   // System.out.println("Edicion realizada ok");
    
        }
     
   catch (Exception ex)
    {
        et.rollback();
        
        JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        //System.out.println("Error: "+ ex.getMessage());
        
        }
finally
{
    em.close();
}

}

/////metodo de eliminar


public static void  eliminar() 

{
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=55;
    Clientes Cliente=em.find(Clientes.class, Id);
    
      

    et.begin();
    em.remove(Cliente);
    et.commit();
           
    
    JOptionPane.showMessageDialog(null, "Registro eliminado Correctamente");
    // System.out.println("Registro eliminado");
    
        }
     
   catch (Exception ex)
    {
        et.rollback();
        
        JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
       // System.out.println("Error: "+ ex.getMessage());
        }
finally
{
    em.close();
}



                

    
}
    
}         
             
                
                
            
	



