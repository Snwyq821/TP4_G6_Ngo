package com.isep.rpg;

public class Main
{
    public static void main (String[] args)
    {
        Game game = new Game();
        game.heroesSelection();
        System.out.println(game.party);
    }
}
