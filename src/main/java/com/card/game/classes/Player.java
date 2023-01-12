package com.card.game.classes;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Player {
    private int id;
    private Snap snap;
    public String winStr = "";
    private boolean turn;
    public Player (int id){
        this.id = id;
        this.turn = false;
    }

    public int getId(){
        return this.id;
    }

    public void setTurn(){
        this.turn = !this.turn;
    }

    public boolean isTurn(){
        return this.turn;
    }

    public void getInput(){
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        timer.schedule(task, 2*1000);
        System.out.println("TYPE SNAP TO WIN!");
        winStr = scanner.nextLine();

    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            if(winStr.toLowerCase().equals("snap")){
                System.out.println("Player " + getId() + " won!");
                System.exit(0);
            } else {
                System.out.println("Player " + getId() + " lost!");
                System.exit(0);
            }
        }
    };

}
