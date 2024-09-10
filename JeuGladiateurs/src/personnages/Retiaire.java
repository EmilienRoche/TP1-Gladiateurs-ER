/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;
import java.util.Random;

/**
 *
 * @author 202330289
 */
public class Retiaire extends Personnage {
    String classeName = "Rétiaire";
    Boolean filetEnMain = true;

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getter / Setter">
    // Getter
    public String getClasse() {
        return classeName;
    }

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

    public int getValeurDefense() {
        return valeurDefense;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }
    
    // Setter

    public void setClasse(String classe) {
        this.classeName = classe;
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
        Random rand = new Random();
        
        if (filetEnMain == true)
        {
            System.out.println("\nIgor l'empaleur lance sont filet !");
            int randomNbr = rand.nextInt(100 - 0 + 1) + 0;
            
            if (randomNbr <= 10)
            {
                personnageCible.pointsDeVie = 0;
                filetEnMain = false;
                System.out.println("Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance !");
            }
            else
            {
                filetEnMain = false;
                System.out.println("Le filet n'atteint pas sa cible !");
            }
        }
        else
        {
            filetEnMain = true;
            System.out.println("\nIgor l'empaleur ramasse son filet et en profite pour attaquer");
            frapperPersonnage(personnageCible);
        }
    }
    // </editor-fold>
}
