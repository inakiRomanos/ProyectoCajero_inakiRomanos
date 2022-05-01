
package Cajero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author i_rom
 *
 * Creamos la base de dato y la rellenamos
 *
 */
public class BaseDatos {


    public BaseDatos() {
    }

    public static void cargarBD() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.odb;user=acda;password=acda;drop");
        EntityManager em = emf.createEntityManager();

        //Aquí se realizan todas las acciones con la base de datos
        //se crean  objetos tipo Clientes
        try { 
        Clientes c1 = new Clientes(1234568, 0000, 180);
        Clientes c2 = new Clientes(87654321, 1234, 156);
        Clientes c3 = new Clientes(01020304, 4321, 143);
        Clientes c4 = new Clientes(10203040, 1234, 125);


        //Se almacena los objetos en la base de datos utilizando una transacción
        //Hemos utilizado la propiedad CascadeType.PERSIST, por lo que los ponentes también se guardarán
        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);

        em.getTransaction().commit();
        
        } catch (Exception e) {
        }

        //PanelPrincipal.tablaClientess.setModel (modelo);
        // Cerrar la conexión a la base de datos
        em.close();
        emf.close();
    }
    
}
