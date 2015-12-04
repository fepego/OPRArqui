/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propiedad;
import Entities.PropiedadPK;
import Entities.Visitas;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import static javax.json.JsonValue.ValueType.NUMBER;
import javax.persistence.EntityManager;
import javax.persistence.EntityResult;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;

/**
 *
 * @author Erika
 */
@SqlResultSetMapping (name ="tablas",entities = 
 {@EntityResult(entityClass=Entities.Visitas.class),
  @EntityResult(entityClass=Entities.Propiedad.class)})

@Stateless
public class PropiedadFacade extends AbstractFacade<Propiedad> implements PropiedadFacadeLocal, Facades.PropiedadFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PropiedadFacade() {
        super(Propiedad.class);
    }
            public List <Object[]> findProperties(String usuario, String contrasena){




 List <Object[]> propiedades= new ArrayList<Object[]>();
 propiedades= em.createNativeQuery(" SELECT Propiedad.* FROM Visitas , Propiedad WHERE Visitas.idusuario= ? AND Visitas.IDPROPIEDAD_FK= Propiedad.IDPROPIEDAD").setParameter(1, usuario).getResultList(); 
 


 //propiedades=em.createQuery("SELECT v.propiedad.propiedadPK.idpropiedad FROM Visitas v WHERE v.idusuario.idUsuario = :usuario").setParameter("usuario", usuario).getResultList();
// propiedades2=em.createQuery("SELECT Propiedad.* FROM Propiedad WHERE Propiedad IN :propiedades2 ").setParameter("propiedades2", propiedades2).getResultList();
/*
        for (Object[] objects :propiedadesResult) {
          BigInteger idPropietario = (BigInteger)objects[0];
          BigInteger  idpropiedad = (BigInteger)objects[1];       
          String direccion = (String)objects[2];
          String localidad= (String)objects[3];
          String tipopropiedad= (String)objects[4];
          BigInteger numerocuartos = (BigInteger)objects[5];
          BigInteger costo = (BigInteger)objects[6];
          
       
          PropiedadPK pk= new PropiedadPK(idPropietario, idpropiedad); 
          Propiedad p = new Propiedad(pk, direccion, localidad, tipopropiedad, numerocuartos, costo) ;
          propiedades.add(p);
            
        } */


 
 
 
 
 return propiedades;
    }

    
}
