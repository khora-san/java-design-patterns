package fr.diginamic.factory;

public class ElementFactory {

  private ElementFactory() {
  }

  public static Element creerElement(TypeElement type, String nom, double valeur, Unite unite) {
    switch (type) {
      case INGREDIENT:
        return new Ingredient(nom, valeur, unite);

      case ADDITIF:
        return new Additif(nom, valeur, unite);

      case ALLERGENE:
        return new Allergene(nom, valeur, unite);

      default:
        throw new IllegalArgumentException("Type d'élément inconnu : " + type);

    }
  }

}
