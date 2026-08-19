package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactoryTest {

  @Test
  public void creerElement_avecTypeIngredient_retourneUneInstanceDIngredient() {
    // Arrange;Act
    Element element = ElementFactory.creerElement(TypeElement.INGREDIENT, "farine", 1000,
        Unite.MILLI_GRAMMES);

    //Assert
    assertNotNull(element);
    assertTrue(element instanceof Ingredient);
    assertEquals("farine", element.getNom());
    assertEquals(1000, element.getValeur(), 0.001);
    assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
  }

  @Test
  public void creerElement_avecTypeAdditif_retourneUneInstanceDAdditif() {
    // Arrange;Act
    Element additif = ElementFactory.creerElement(TypeElement.ADDITIF, "E330 - Acide citrique", 5.0,
        Unite.MILLI_GRAMMES);

    //Assert
    assertNotNull(additif);
    assertTrue(additif instanceof Additif);
    assertEquals("E330 - Acide citrique", additif.getNom());
    assertEquals(5.0, additif.getValeur(), 0.001);
    assertEquals(Unite.MILLI_GRAMMES, additif.getUnite());
  }

  @Test
  public void creerElement_avecTypeAllergene_retourneUneInstanceDAllergene() {
    // Arrange;Act
    Element allergene = ElementFactory.creerElement(TypeElement.ALLERGENE, "Gluten", 200.0,
        Unite.MILLI_GRAMMES);

    //Assert
    assertNotNull(allergene);
    assertTrue(allergene instanceof Allergene);
    assertEquals("Gluten", allergene.getNom());
    assertEquals(200.0, allergene.getValeur(), 0.001);
    assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());
  }

}
