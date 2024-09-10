package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15, "Mirmillon");
    Retiaire Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    Bob.afficherInfosPersonnageExtended();
    System.out.println("\n");
    Igor.afficherInfosPersonnageExtended();
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();
    // </editor-fold>
    
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    
    tour.afficheTour();
    
    while (Bob.pointsDeVie > 0 && Igor.pointsDeVie > 0) 
    {
        for (int i = 0; i < 100; i++) 
        {
            if (i == Bob.initiative)
            {
                Bob.frapperPersonnageExtended(Igor);
            }
            else if (i == Igor.initiative)
            {
                Igor.frapperPersonnageExtended(Bob);
            }
        }

        affichage.afficherSeparateurInfosPerso();
        Bob.afficherInfosPersonnageExtended();
        System.out.println("\n");
        Igor.afficherInfosPersonnageExtended();
        affichage.afficherSeparateurDeTour();
        
        Bob.setNewInitiativeRandomExtended();
        Igor.setNewInitiativeRandom();
    }
    affichage.afficheVictoire(Igor, Bob);

    // </editor-fold>
    
    }

}
