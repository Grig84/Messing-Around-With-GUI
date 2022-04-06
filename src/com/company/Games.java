package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Games {
    static String input1;
    static ArrayList<String> numbers = new ArrayList<String>(1);
    static int hold;
    static int player1;
    static int player2;
    static int turn = 0;
    static int b4C;
    static ArrayList<Integer> finals = new ArrayList<Integer>(1);

    public static void RockPaperScissors() {
        b4C = 0;
        hold = 0;
        player1 = 0;
        player2 = 0;
        JLabel tf = new JLabel("Push Start!", SwingConstants.CENTER);// MAKE ROCK PAPER SCISSORS

        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JButton button1 = new JButton();
        JButton button2 = new JButton("Start");
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton("RESET");

        tf.setBounds(1,10, 100,30);
        button1.setBounds(80,235+20, 100,30);
        button2.setBounds(200,235+20, 100,30);
        button3.setBounds(320,235+20, 100,30);
        button4.setBounds(200, 300+20, 100, 30);
        button5.setBounds(320, 100+20, 100, 30);

        frame.getContentPane().add(button1); // Adds Button to content pane of frame
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(tf);

        frame.setVisible(true);

        button1.addActionListener(e -> {
            hold = 1;
        });

        button2.addActionListener(e -> {
            if(turn == 0){
                button1.setText("Rock");
                button2.setText("Paper");
                button3.setText("Scissors");
                button4.setText("Done");
                tf.setText("Player One's Choice!");
            }
            hold = 2;
        });

        button3.addActionListener(e -> {
            hold = 3;
        });

        button4.addActionListener(e -> {
            b4C ++;
            turn ++;
            System.out.println(b4C);
            if(b4C == 1){
                tf.setText("Player Two's Choice!");
                player1 = hold;
                hold = 0;
            } else if(b4C == 2){
                player2 = hold;
                hold = 0;
                System.out.println(player1 + "" + player2);
                if((player1 == 1 && player2 == 3 ) || (player1 == 3 && player2 == 2) || (player1 == 2 && player2 == 1)){
                    tf.setText("Player 1 Wins!");
                }

                if((player2 == 1 && player1 == 3 ) || (player2 == 3 && player1 == 2) || (player2 == 2 && player1 == 1)){
                    tf.setText("Player 2 Wins!");
                }

                if(player1 == player2) {
                    tf.setText("It's a Tie!");
                }
            }
        });
        button5.addActionListener(e -> {
            hold = 0;
            turn = 0;
            player2 = 0;
            player1 = 0;
            b4C = 0;
            button1.setText("");
            button2.setText("Start");
            button3.setText("");
            button4.setText("");
            tf.setText("Push Button to Start!");

        });
    }

    public static void Calculator() {
        input1 = "";
        b4C = 0;
        hold = 0;
        player1 = 0;
        player2 = 0;

        JLabel tf = new JLabel("", 0);// MAKE ROCK PAPER SCISSORS

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonTimes = new JButton("*");
        JButton buttonDevided = new JButton("/");
        JButton buttonEquals = new JButton("=");

        frame.getContentPane().add(button1); // Adds Button to content pane of frame
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(button6);
        frame.getContentPane().add(button7);
        frame.getContentPane().add(button8);
        frame.getContentPane().add(button9);
        frame.getContentPane().add(button0);
        frame.getContentPane().add(buttonPlus);
        frame.getContentPane().add(buttonMinus);
        frame.getContentPane().add(buttonTimes);
        frame.getContentPane().add(buttonDevided);
        frame.getContentPane().add(buttonEquals);

        tf.setBounds(1,10, 100,30);
        button1.setBounds(80,350, 50,30);
        button2.setBounds(160,350, 50,30);
        button3.setBounds(240,350, 50,30);
        button4.setBounds(80, 300, 50, 30);
        button5.setBounds(160, 300, 50, 30);
        button6.setBounds(240,300, 50,30);
        button7.setBounds(80,250, 50,30);
        button8.setBounds(160,250, 50,30);
        button9.setBounds(240, 250, 50, 30);
        button0.setBounds(160, 400, 50, 30);

        buttonPlus.setBounds(320,200, 50,30);
        buttonMinus.setBounds(320,250, 50,30);
        buttonTimes.setBounds(320,300, 50,30);
        buttonDevided.setBounds(320, 350, 50, 30);
        buttonEquals.setBounds(320, 400, 50, 30);

        frame.getContentPane().add(tf);

        frame.setVisible(true);

        button1.addActionListener(e -> {
            input1 = input1 + "1";
            tf.setText(tf.getText()+"1");
        });

        button2.addActionListener(e -> {
            input1 = input1 + "2";
            tf.setText(tf.getText()+"2");
        });

        button3.addActionListener(e -> {
            input1 = input1 + "3";
            tf.setText(tf.getText()+"3");
        });

        button4.addActionListener(e -> {
            input1 = input1 + "4";
            tf.setText(tf.getText()+"4");
        });

        button5.addActionListener(e -> {
            input1 = input1 + "5";
            tf.setText(tf.getText()+"5");
        });

        button6.addActionListener(e -> {
            input1 = input1 + "6";
            tf.setText(tf.getText()+"6");
        });

        button7.addActionListener(e -> {
            input1 = input1 + "7";
            tf.setText(tf.getText()+"7");
        });

        button8.addActionListener(e -> {
            input1 = input1 + "8";
            tf.setText(tf.getText()+"8");
        });

        button9.addActionListener(e -> {
            input1 = input1 + "9";
            tf.setText(tf.getText()+"9");
        });

        button0.addActionListener(e -> {
            input1 = input1 + "0";
            tf.setText(tf.getText()+"0");
        });

        buttonPlus.addActionListener(e -> {
            numbers.add(input1);
            input1 = "";
            numbers.add("+");
            tf.setText("");
            for(int i = 0; i < numbers.size(); i++){
                tf.setText(tf.getText() + numbers.get(i));
            }
        });

        buttonMinus.addActionListener(e -> {
            numbers.add(input1);
            input1 = "";
            numbers.add("-");
            tf.setText("");
            for(int i = 0; i < numbers.size(); i++){
                tf.setText(tf.getText() + numbers.get(i));
            }
        });

        buttonTimes.addActionListener(e -> {
            numbers.add(input1);
            input1 = "";
            numbers.add("*");
            tf.setText("");
            for(int i = 0; i < numbers.size(); i++){
                tf.setText(tf.getText() + numbers.get(i));
            }
        });

        buttonDevided.addActionListener(e -> {
            numbers.add(input1);
            input1 = "";
            numbers.add("/");
            tf.setText("");
            for(int i = 0; i < numbers.size(); i++){
                tf.setText(tf.getText() + numbers.get(i));
            }
        });

        buttonEquals.addActionListener(e -> {
            for(int p = 0; p<numbers.size(); p++){
                finals.add(parseInt(numbers.get(p)));
            }
        });
    }
}

