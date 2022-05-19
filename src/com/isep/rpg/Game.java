/*************************************
 * NGO Steven - G6C
 * TP Java 4
 * Mini RPG Lite 3000
 *************************************/

package com.isep.rpg;

import com.isep.rpg.hero.*;
import com.isep.rpg.enemy.*;
import com.isep.utils.InputParser;

import java.util.List;
import java.util.Scanner;



public class Game
{
    List<Hero> party;
    int playerTurn;
    InputParser inputParser;

    List<Enemy> enemyList;

    public void playGame()
    {
        // Defaite si plus de joueurs
    }

    public void generateCombat()
    {
        heroesSelection();

        // Generer boss et adds
    }


    // Méthodes pour le fonctionnement de la partie

    public void heroesSelection()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choissez vos héros" +
                "\n Hunter" +
                "\n Warrior" +
                "\n Mage" +
                "\n Healer");

        boolean isPartyCorrect = false;
        do
        {
            String choice = scanner.nextLine();
            switch (choice)
            {
                case "Hunter":
                    party.add(new Hunter());
                case "Warrior":
                    party.add(new Warrior());
                case "Mage":
                    party.add(new Mage());
                case "Healer":
                    party.add(new Healer());
                case "Start":
                    if (true)
                    {
                        System.out.println("Début de la partie !");
                        isPartyCorrect = true;
                        break;
                    }
                    else
                    {
                        System.out.println("Équipe inccorrecte.");
                    }
                default :
                    System.out.println("Équipe incorrecte.");
            }

        }
        while (!isPartyCorrect);
    }

    public void generateEnemies ()
    {
        enemyList.add(new Boss());
    }

    public void winOption ()
    {

    }

}

