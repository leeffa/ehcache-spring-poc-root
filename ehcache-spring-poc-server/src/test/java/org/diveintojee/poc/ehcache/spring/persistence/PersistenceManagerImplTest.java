/**
 * 
 */
package org.diveintojee.poc.ehcache.spring.persistence;

import static org.junit.Assert.assertNull;

import org.diveintojee.poc.ehcache.spring.domain.Product;
import org.diveintojee.poc.ehcache.spring.persistence.PersistenceManager;
import org.diveintojee.poc.ehcache.spring.persistence.PersistenceManagerImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author louis.gueye@gmail.com
 */
public class PersistenceManagerImplTest {

   private PersistenceManager persistenceManager;

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception {
      persistenceManager = new PersistenceManagerImpl();
   }

   /**
    * Test method for {@link org.diveintojee.poc.ehcache.spring.persistence.PersistenceManagerImpl#get(java.lang.Class, java.lang.Long)}.
    */
   @Test
   public final void getWillReturnNullWithNullEntityClass() {
      assertNull(persistenceManager.get(null, Long.valueOf(0)));
   }

   /**
    * Test method for {@link org.diveintojee.poc.ehcache.spring.persistence.PersistenceManagerImpl#get(java.lang.Class, java.lang.Long)}.
    */
   @Test
   public final void getWillReturnNullWithNullId() {
      assertNull(persistenceManager.get(Product.class, null));
   }

   /**
    * Test method for {@link org.diveintojee.poc.ehcache.spring.persistence.PersistenceManagerImpl#get(java.lang.Class, java.lang.Long)}.
    */
   @Test
   public final void getWillReturnNullWithNotFoundEntityMap() {
      assertNull(persistenceManager.get(Product.class, Long.valueOf(5)));
   }
}
