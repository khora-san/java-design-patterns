package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service implements IElement {

  private String nom;
  private List<IElement> elements = new ArrayList<>();

  public Service(String nom) {
    this.nom = nom;
  }

  public void ajouterElement(IElement... elements) {
    Collections.addAll(this.elements, elements);
  }
//  équivalent à:
//
//  public void ajouterElement(IElement... elements) {
//    for (IElement element : elements) {
//      this.elements.add(element);
//    }
//  }
//

  @Override
  public double calculerSalaire() {
    double accumulateur = 0.0;
    for (IElement element : elements) {
      accumulateur += element.calculerSalaire();
    }
    return accumulateur;
  }
}
