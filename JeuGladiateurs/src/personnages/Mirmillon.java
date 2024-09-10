/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202330289
 */
public class Mirmillon extends Personnage {
    String classeName = "Mirmillon";

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini, String classe) {
        super(nom, attaqueMax, defense, pvs, ini);
        classeName = classe;
    }

    // <editor-fold defaultstate="collapsed" desc="Getter / Setter">
    // Getter
    public String getName() {
        return classeName;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    @Override
    public int getValeurDefense() {
        return valeurDefense;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }
    
    // Setter
    
    public void setName(String name) {
        this.classeName = name;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    @Override
    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    @Override
    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Fonction">
    
    public void afficherInfosPersonnageExtended()
    {
        afficherInfosPersonnage();
        System.out.println("    Classe : " + classeName);
    }
    
    public void frapperPersonnageExtended(Personnage personnageCible)
    {
        frapperPersonnage(personnageCible);
        
        if (personnageCible.pointsDeVie <= 0)
        {
            System.out.println("Il décapite son adversaire !");
        }
        else
        {
            System.out.println("Il frappe de nouveau !\n");
            frapperPersonnage(personnageCible);
        }
    }
    
    public void setNewInitiativeRandomExtended()
    {
        maxIni = 30;
        setNewInitiativeRandom();   
    }
    // </editor-fold>
}
