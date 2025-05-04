/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpspro.rock_paper_scissor_game.bad_rock_paper_scissor;
import static rpspro.rock_paper_scissor_game.bad_rock_paper_scissor.RPSPRO.INTRO;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
/**
 *
 * @author BAKEL J
 */





public class INTRO {
  
    
  private JFrame Frame;
 private JLabel scores;
 private JLabel player;
 private JLabel comp;
 private JLabel playercomp;
 private JTextArea main;
 private JButton next;
 private JLabel compscore;
 private JLabel playerscore;
 private JTextArea info;
 private JButton intro;
 private JButton round;
 private JButton gamelog;
 private JLabel pvc;
 private JButton Rock;
 private JButton Paper;
 private JButton Scissors;
 private JButton hint;
 private JPanel south;
 private JButton restart;
 private JLabel draw;
 private String log;
 
 private JFrame flog;
 private JButton history;
 private JTextArea place; 
    
    public INTRO(){
        Frame = new JFrame();
        scores = new JLabel("SCORES");
        player = new JLabel("  Player's win(s) : 0");
        player.setForeground(Color.blue);
        player.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
        
        draw = new JLabel ("        Draws : 0 ");
        draw.setForeground(Color.blue);
        draw.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
        
        comp = new JLabel ("Computer's win(s) : 0");
        comp.setForeground(Color.blue);
        comp.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
        
        compscore = new JLabel ("1");
        
        playerscore = new JLabel ("2");
        
        info = new JTextArea(); 
        intro = new JButton ("ROCK PAPER SCISSOR");
        intro.setBackground(Color.lightGray); 
        intro.setForeground(Color.blue);
        intro.setFont(new Font("Cooper Black", Font.PLAIN,16));
        
        String r = "Round 1";
        round = new JButton (r+" of unlimited");
        round.setBackground(Color.blue);
        round.setForeground(Color.LIGHT_GRAY);
        
        gamelog = new JButton ("Game Log");
        gamelog.setBackground(Color.white);
        gamelog.setFont(new Font("Arial", Font.PLAIN,12));
        
        restart = new JButton ("Restart");
        restart.setBackground(Color.white);
        restart.setFont(new Font("Arial", Font.PLAIN,12));
        
        Rock = new JButton("ROCK");
        
        Paper = new JButton ("PAPER");
        
        Scissors = new JButton ("SCISSORS");
        
        next = new JButton (" Next ");
        
        
        main = new JTextArea ("-------------LET THE GAME BEGIN----------------\n");
        Frame.add(new JScrollPane(main));
        main.setForeground(Color.blue);
        main.setFont(new Font("Lucida Handwriting", Font.PLAIN, 16));
        main.setEditable(false);
        
        pvc = new JLabel ("Player vs Computer");
        
        hint = new JButton ("HINT/CHEAT");
        hint.setBackground(Color.white);
        hint.setFont(new Font("Arial", Font.PLAIN,11));
        
        place = new JTextArea();
        place.setEditable(false);
        place.setForeground(Color.blue);
        place.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
        place.append("-------------LET THE GAME BEGIN----------------");
        
        
        JPanel northwest = new JPanel (new GridLayout (1,3));
       
        northwest.add(round);
        
        
        JPanel test = new JPanel (new GridLayout(1,9));
        test.add(gamelog);
        test.add(restart);
        test.add(new JLabel(" "));
        test.add(new JLabel(" "));
        
        
       
        JPanel scoring = new JPanel (new GridLayout (1,3));
        scoring.add(player);
        scoring.add(draw);
        scoring.add(comp);
        
        
        JPanel center = new JPanel (new GridLayout (3,1));
        center.add(main);
        
   
         JPanel north = new JPanel (new GridLayout(4,1));
        north.add(intro);
        north.add(northwest, BorderLayout.CENTER);
        north.add(test);
        north.add(scoring);
        
        
        south = new JPanel (new FlowLayout());
        south.add(Rock);
        south.add(Paper);
        south.add(Scissors);
        
        Frame.setLayout(new BorderLayout());
      
        Frame.add(north , BorderLayout.NORTH);
        Frame.add(center, BorderLayout.CENTER);
        Frame.add(south, BorderLayout.SOUTH);
        Frame.add(new JScrollPane(main));
        
        Frame.setResizable(false);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setVisible(true);
        Frame.setSize(440, 400);
        Frame.setTitle("RPS: Rock, Paper, Scissor");
        gamelog.setEnabled(true);
       
    Rock.addActionListener(new Rock());
        
        Scissors.addActionListener(new Scissors());
        Paper.addActionListener(new Paper());
        
        
        restart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
              Frame.dispose();
              INTRO gui = new INTRO();
            }
            
        }
        );
           intro.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent event){
                  JOptionPane.showMessageDialog(Frame, "RPS Unlimited brings a traditional human game to the pc...."
                          + "\nThis section of the game allows you to play with computer as much as you want (unlimitedly)"
                          + "\n By Bakel\t\t\t\n#HandofGod\nTHANKS FOR PLAYING");   
             }
             
        });
      
           gamelog.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent event){
                  spce();
              }
           });

         
       
       
       
        
         
 
     
    }
     int a = 1;
    public class Scissors implements ActionListener{
        
        public void actionPerformed (ActionEvent e){
         a++;
          round.setText("Round "+a+" of unlimited ");
          int x = start();
          
          ins(x);
          

        }
    }
    
    public class Paper implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            a++;
          
          round.setText("Round "+a+" of unlimited ");
          int x = start();
          
          inp(x); 
        }
    }
    
    
    
    public class Rock implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        a++ ;
         round.setText("Round "+a+" of unlimited ");
          int x = start();
          inr(x);
          }
          

          
        }
          
    public int start(){
     int x = (int)(Math.random()*3);   
    return x; 
    }
    
    public void inp (int x){
      String pp = "paper";
        
        OBJECTpick (pp,x);  
        
    }
    
    public void ins (int x){
        String pp = "Scissors";
        OBJECTpick (pp,x);
    }
    
    public  void inr(int x){
        
        String pp = "rock";
        
        OBJECTpick (pp,x);
    }
    
    public  void OBJECTpick (String pp , int x){
        String start = main.getText();
        
        if (x==0){
          log = "";
            String cc = "ROCK";
           int w = a -1;
            String cpick = "\n\nComputer picked "+cc;
            String cpicks = "\n\nRound "+w+ "\n\nComputer picked "+cc;
          main.setText(cpick);
          place.append(cpicks);
        }else if (x == 1) {
            int w = a -1;
            String cc = "PAPER";
            String cpick = "\n\nComputer picked "+cc;   
            String cpicks ="\n\nRound "+w+ "\n\nComputer picked "+cc;
          main.setText(cpick);
          place.append(cpicks);
             
        }else{
            int w = a -1;
            String cc = "SCISSOR";
            String cpick = "\n\nComputer picked "+cc;
            String cpicks = "\n\nRound "+w+ "\n\nComputer picked "+cc;
          main.setText(cpick);
          place.append(cpicks);
        }
            
         pp = pp.toLowerCase();
        if (pp.startsWith("r")){
            main.append (("\nYou picked ROCK"));
            place.append("\nYou picked ROCK");
            }else if (pp.startsWith("p")) {
                main.append ("\nYou picked PAPER");
                place.append("\nYou picked PAPER");        
            }else if (pp.startsWith("s")){
                main.append ("\nYou picked SCISSOR");
                place.append("\nYou picked SCISSOR");
                
            }else {
                main.append ("\nYou did not pick a valid item");
                
            }
        PPwin (pp,x);
    }
    public  void PPwin (String pp, int x){
        String win = "\nYou win....";
        String lose = "\nI am sorry, you lost";
        String tie = "\nYour pick is the same with that of the computer\n ITS A TIE";
        if (pp.startsWith("r")){
            if (x==0){
                main.append(tie);
                place.append(tie);
                drawpoint();
 
            }else if (x==1){
                main.append(lose);
                place.append(lose);
                comppoint();
                
            }else{
                main.append(win);
                place.append(win);
                playerpoint();
            }
        }else if (pp.startsWith("p")) {
            if (x==0){
                main.append(win);
                place.append(win);
                playerpoint();
            }else if (x==1){
                main.append(tie);
                place.append(tie);
                drawpoint();
            }else{
                main.append(lose);
                place.append(lose);
                comppoint();
            }
            
        }else{
            if (x==0){
                main.append(lose);
                place.append(lose);
                comppoint();
            }else if (x==1){
                main.append(win);
                place.append(win);
                playerpoint();
            }else{
                main.append(tie);
                place.append(tie);
                drawpoint();
            }
          
       
    
    }
  
}
    
    
  
    
     
    
     
    
int s = 0;
    
    public void playerpoint(){
        
        s++;
        player.setText("  Player's win(s) : "+s);
        
    }
    
    int b = 0;
    
    public void comppoint(){
       
        b++;
        comp.setText("Computer's win(s) : "+b); 
    }
    
    
    int cf = 0;
    
    public void drawpoint(){
        cf++;
        draw.setText("        Draws : "+cf);
        
    }
    
    
    public void Status(){
        if (s>b){
            place.append("\n\nYou are currently winning computer "+s+" to "+b+"\nAnd have drawed "+cf+" times");
        }else if (s==b){
            place.append("\n\nYou are currently tied "+s+" to "+b+" with computer"+"\nAnd have drawed "+cf+" times");
        }else{
            place.append("\n\nComputer is currently winning "+b+" to "+s+"\nAnd you have drawed "+cf+" times");
        }
    }
    
    public void spce(){
         flog = new JFrame("GAME LOG");
        
        history = new JButton("GAME HISTORY");
        history.setBackground(Color.lightGray); 
        history.setForeground(Color.blue);
        history.setFont(new Font("Cooper Black", Font.PLAIN,16));
        
        JTextArea places = new JTextArea();
        places.setEditable(false);
        places.setForeground(Color.blue);
        places.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
        
        JPanel center = new JPanel(new GridLayout(2,1));
        center.add(history);
        center.add(places);
        
        flog.setLayout(new BorderLayout());
        flog.add(center, BorderLayout.CENTER);
        
        flog.add(new JScrollPane(places));
        flog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        flog.setVisible(true);
        flog.setSize(440, 400); 
        Status(); 
        String loog = place.getText();
        places.setText(loog);
       
    }  
 
  
  
}
