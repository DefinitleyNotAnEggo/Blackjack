import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import svu.csc213.Dialog;

public class Blackjack extends GraphicsProgram {

    // data about the game
    private int wager = 0;
    private int balance = 10000;
    private int bank = 10000;

    // labels to display info to the player
    private GLabel bankLabel;
    private GLabel wagerLabel;
    private GLabel balanceLabel;
    private GLabel blackjack;

    // buttons for controls
    private JButton wagerButton;
    private JButton playButton;
    private JButton hitButton;
    private JButton stayButton;
    private JButton quitButton;

    // objects we are playing with
    private Deck deck; // duh
    private GHand player;
    private GHand dealer;


    @Override
    public void init() {
        Color background = new Color(90, 100, 200);
        this.setBackground(Color.GREEN);

        deck = new Deck();

        // set up our buttons
        wagerButton = new JButton("Wager");
        playButton = new JButton("Play");
        hitButton = new JButton("Hit");
        stayButton = new JButton("Stay");
        quitButton = new JButton("Quit");


        // add buttons to the screen
        add(wagerButton, SOUTH);
        add(playButton, SOUTH);
        add(hitButton, SOUTH);
        add(stayButton, SOUTH);
        add(quitButton, SOUTH);

        // TODO: handle initial button visibility


        addActionListeners();

        // TODO: set up your GLabels

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Wager":
                // TODO
                wager = Dialog.getInteger("munie?");


                bank -= wager;
                break;

            case "Play":
                // TODO
                player.hit();
                break;

            case "Hit":
                // TODO
                break;

            case "Stay":
                // TODO
                break;

            case "Quit":
                // TODO
                break;

            default:
                System.out.println("I do not recognize that action command. Check your button text.");
        }
    }


    @Override
    public void run() {
        //GHand hand = new GHand(new Hand(deck, true));
        //add(hand, 100, 100);
        //hand.hit();
    }

    public static void main(String[] args) {
        new Blackjack().start();
    }
}