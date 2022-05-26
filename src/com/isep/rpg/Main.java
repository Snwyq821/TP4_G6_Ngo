package com.isep.rpg;

import com.isep.rpg.enemy.Boss;
import com.isep.rpg.enemy.Enemy;
import com.isep.rpg.hero.*;

public class Main
{
    public static void main (String[] args)
    {
        /*
        Game game = new Game();
        game.heroesSelection();
        System.out.println(game.party);
        */

        Boss boss = new Boss();
        Healer healer = new Healer();
        healer.attack(boss);
        System.out.println(boss.getHp());
    }
}
