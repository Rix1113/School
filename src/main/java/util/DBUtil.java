package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE_MYSQL";
    private static EntityManagerFactory factory;

    public static EntityManager getEntityManagerMy() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory.createEntityManager();
    }

/*  ************************************************************************************
Selliselt saab mitu connectionit teha
 */
//    public static EntityManager getEntityManagerOracle() {
//        if (factory == null) {
//            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//        }
//        return factory.createEntityManager();
//    }
    /*
    ************************************************************************************
     */

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
