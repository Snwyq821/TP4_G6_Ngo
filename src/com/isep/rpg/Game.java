/*************************************
 * NGO Steven - G6C
 * TP Java 4
 * Mini RPG Lite 3000
 *************************************/

package com.isep.rpg;

import com.isep.rpg.hero.*;
import com.isep.rpg.enemy.*;
import com.isep.utils.InputParser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Game
{
    ArrayList<Hero> party = new ArrayList<Hero>();
    ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
    int playerTurn;
    boolean isPlayerTurn = true;
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
                    this.party.add(new Hunter());
                    break;
                case "Warrior":
                    this.party.add(new Warrior());
                    break;
                case "Mage":
                    this.party.add(new Mage());
                    break;
                case "Healer":
                    this.party.add(new Healer());
                    break;
                case "Start":
                    if (this.party.size() > 0)
                    {
                        System.out.println("Début de la partie !");
                        isPartyCorrect = true;
                        break;
                    }
                    else
                    {
                        System.out.println("Équipe inccorrecte.");
                        break;
                    }
                default :
                    System.out.println("Saisie incorrecte.");
                    break;
            }
        }
        while (!isPartyCorrect && this.party.size() >= 4);
    }

    public void generateEnemies ()
    {
        this.enemyList.add(new Boss());
        for (int i = 0; i < this.party.size() - 1; i++)
        {
            this.enemyList.add(new BasicEnemy());
        }
    }

    public boolean checkHeroLife(Hero hero)
    {
        if (hero.getHp() <= 0)
        {
            this.party.remove(hero);
            return true;
        }
        else { return false; }
    }

    public boolean checkEnemyLife(Enemy hero)
    {
        if (hero.getHp() <= 0)
        {
            this.enemyList.remove(hero);
            return true;
        }
        else { return false; }
    }



    public void winOption ()
    {

    }

}

