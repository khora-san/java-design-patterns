package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SingletonTest {

  @Test
  public void testUniciteDeLInstance() {
    ConfigurationSingleton instance1 = ConfigurationSingleton.getInstance();
    ConfigurationSingleton instance2 = ConfigurationSingleton.getInstance();

    assertSame(instance1, instance2);
  }

  @Test
  public void testBonneLectureDesProprietes() {
    ConfigurationSingleton instance = ConfigurationSingleton.getInstance();
    String valeur = instance.getProperty("db.user");

    assertEquals("root", valeur);
  }
}

