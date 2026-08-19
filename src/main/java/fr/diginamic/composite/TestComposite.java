package fr.diginamic.composite;

public class TestComposite {

  public static void main(String[] args) {
    Employe directeur = new Employe("RASPEY", "Cécile", 10000);
    Employe architecte = new Employe("BECHKAR", "Bilel", 8000);
    Employe chefBigData = new Employe("RANMEY", "JB", 7500);
    Employe concepteur = new Employe("DOE", "Jane", 3500);
    Employe chefJavaDev = new Employe("GUINEAU", "Kévin", 7500);
    Employe leadDev = new Employe("MARTIN", "Paul", 3500);
    Service dsin = new Service("DSIN");
    Service bigData = new Service("Big Data");
    Service javaDev = new Service("Java Dev");

    bigData.ajouterElement(chefBigData, concepteur);
    javaDev.ajouterElement(chefJavaDev, leadDev);
    dsin.ajouterElement(directeur, architecte, bigData, javaDev);

    System.out.println("Salaire DSIN: " + dsin.calculerSalaire());
    System.out.println("Salaire Service Big Data: " + bigData.calculerSalaire());
    System.out.println("Salaire Service Java Dev: " + javaDev.calculerSalaire());


  }

}
