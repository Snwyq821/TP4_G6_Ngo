/*************************************
 * NGO Steven - G6C
 * TP Java 4
 * Mini RPG Lite 3000
 *************************************/

package com.isep.rpg;

import com.isep.rpg.hero.Hero;
import com.isep.utils.InputParser;

import java.util.List;
import java.util.Scanner;



public class Game
{
    List<Hero> Heroes;
    int playerTurn;
    InputParser inputParser;

    public void playGame()
    {
        // Defaite si plus de joueurs
    }

    public void generateCombat()
    {
        heroesSelection();

        // Generer boss et adds
    }


    // Fonctions

    void heroesSelection()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choissez vos héros" +
                "\n Hunter" +
                "\n Warrior" +
                "\n Mage" +
                "\n Healer");
        scanner.nextLine();

        do
        {
        }
        while (false);
    }

}

