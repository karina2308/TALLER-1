
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.persistence.EntityTransaction; 
import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;

/**
 *
 * @author LAB.INFORMATICA12
 */

public class Createfactura {
  
    //crear ();
//editar();
    //eliminar();
    
 public static void main (String [] args) { 
    
     {
            
            int Opcion;
do{    

Opcion = Integer.parseInt(JOptionPane.showInputDialog ("MENU DE TABLA FACTURA \n1 -> Insertar\n2 -> Editar \n3 -> Eliminar"));

switch (Opcion) {
case 1:
  
JOptionPane.showMessageDialog(null ," Insertar informacion ");

{
    insertar1();
}
break;

case 2:

JOptionPane.showMessageDialog(null ," Editar informacion ");
{
    editar1();
}
break;

case 3:

JOptionPane.showMessageDialog(null ," Eliminar informacion ");
{
    eliminar1();
}
break;

 } } while (Opcion!=2);
 }
    
  }          // menu karina
        
        
     public static void insertar1() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{
 Factura Factura1 = new Factura();
  

    Factura1.setFacturaId(1223);
    Factura1.setFecha("12 mayo");
    Factura1.setIva(12);
    

    et.begin();
    em.persist(Factura1);
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
     
    public static void editar1() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=333;
    Factura Factura1=em.find(Factura.class, Id);
    Factura1.setFecha("12 mayo");
    Factura1.setIva(12);
    
    
   
    et.begin();
    em.merge(Factura1);
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


public static void  eliminar1() 

{
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=111;
    Factura Factura1=em.find(Factura.class, Id);
    
      

    et.begin();
    em.remove(Factura1);
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
     
   /*     
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU"); 
EntityManager em = emf.createEntityManager (); 

em.getTransaction().begin();

Factura g1 = new Factura();
g1.setFacturaId(1515);
g1.setFecha("28/04/16");
g1.setIva(1);
em.persist(g1);


Detalle t1 = new Detalle();
t1.setDetalleId(5852);
t1.setCantidad(1000);
t1.setDescripcion("juegos didacticos");
t1.setPrecio(800000);
em.persist(t1);


Clientes p1 = new Clientes();
p1.setId(77);
p1.setFirstname("nicole");
p1.setLastname("vargas");
p1.setTelefono(1584268);
p1.setDireccion("carrera 25 Oriente");
em.persist(p1);


em.getTransaction().commit();

em.close (); 
emf.close ();

        
    }
}
*/