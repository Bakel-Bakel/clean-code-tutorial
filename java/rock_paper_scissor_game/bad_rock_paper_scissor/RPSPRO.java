/*
*  Project Started on 1st Feb. 2018 as a major BAKEL J's project/application
**
**
*Finished on 
 */
package rock_paper_scissor_game.bad_rock_paper_scissor;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

/**
 *
 * @author BAKEL J
 */
 class RPSPRO {

    /**
     * @param args the command line arguments
     */
    private static int n = 0;
    public static void main(String[] args) {
     INTRO();
     
    }
    private static JFrame frame;
    private static JTextField rounds;
    
    
    public static void INTRO(){
       rounds = new JTextField(8);
 JTextField weightField = new JTextField(5);
 JButton info = new JButton("ROCK PAPER SCISSOR");
 info.setBackground(Color.lightGray); 
 info.setForeground(Color.blue);
 info.setFont(new Font("Cooper Black", Font.PLAIN,16));
 
 
 JButton play = new JButton("PLAY");
 JLabel howmany = new JLabel("How many rounds do you want to play");
 howmany.setForeground(Color.blue); 
 howmany.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
 
 JLabel or = new JLabel ("--------------------OR----------------------");
 or.setForeground(Color.blue); 
 or.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
 
 JButton unlimit = new JButton ("PLAY UNLIMITEDLY");

 // layout
 JPanel north = new JPanel(new FlowLayout());
 north.add(howmany);
 north.add(rounds);
 north.add(play);
 north.add(or);
 north.add(unlimit);

 // overall frame
 frame = new JFrame("RPS");
 frame.setLocation(50, 50);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLayout(new BorderLayout());
 frame.add(info, BorderLayout.NORTH);
 frame.add(north, BorderLayout.CENTER);
 frame.setResizable(false);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 frame.setSize(300, 200);

         
 
 frame.setVisible(true); 
  play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            
             try {
           

            String loog = rounds.getText();
              n = Integer.parseInt(loog); 
             RPSPRO gui = new RPSPRO(n);
            
          

           

       } catch (NumberFormatException nfe) {
 
           JOptionPane.showMessageDialog(frame, "Sorry you entered an invalid number.\nNOTE : Integers only");
}
            
        }
        

  });
  info.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent event){
                  JOptionPane.showMessageDialog(frame, "RPS brings a traditional human game to the pc...."
                          + "\nMade up of 1109 lines of pure java code, RPS provides flexibilty, accuracy and entertainment"
                          + "\n By Bakel\t\t\t\n#HandofGod\nTHANKS FOR PLAYING");   
             }
             
        });
     unlimit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
              
              INTRO gu = new INTRO();
            }
            
        }
        );
          }
    
    
 public final JFrame Frame;
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

 
 
    public RPSPRO(int n){
 
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
        round = new JButton (r+" of "+n);
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
        
         gamelog.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                spce();
            }
        });
         
        restart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
              Frame.dispose();
              RPSPRO gui = new RPSPRO(n);
            }
            
        }
        );
           intro.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent event){
                  JOptionPane.showMessageDialog(Frame, "RPS Classic brings a traditional human game to the pc...."
                          + "\nThis section allows you to choose how many rounds you want to go with computer."
                          + "\n By Bakel\t\t\t\n#HandofGod\nTHANKS FOR PLAYING");   
             }
             
        });
    

    
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

       int bb = n;
        int a = 1;
    public class Scissors implements ActionListener{
        
        public void actionPerformed (ActionEvent e){
         a++;
         
           
          if (a==bb+1){
                int x = start();
          
          ins(x);
          round.setText("END OF GAME");
          almostend(a);
          }else if (a==bb){
              round.setText("Final Round");
              int x = start();
          
          ins(x); 
              
          }else{
          
          round.setText("Round "+a+" of "+bb);
          int x = start();
          
          ins(x);
          

        }
    }
    }
    public class Paper implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            a++;
            
          if (a==bb+1){
                int x = start();
          
          inp(x);
          round.setText("END OF GAME");
          almostend(a);
          }else if (a==bb){
              round.setText("Final Round");
              int x = start();
          
          inp(x); 
              
          }else{
          
          round.setText("Round "+a+" of "+bb);
          int x = start();
          
          inp(x); 
        }
    }
    }
    
    
    public class Rock implements ActionListener{

        public void actionPerformed(ActionEvent e) {
          a= a+1;
            
          if (a==bb+1){
                int x = start();
          
          inr(x);
          round.setText("END OF GAME");
          almostend(a);
          }else if (a==bb){
              round.setText("Final Round");
              int x = start();
          
          inr(x); 
              
          }else{
          
          round.setText("Round "+a+" of "+bb);
          int x = start();
          inr(x);
          }
          

          
        }
        
    }
    
    public void almostend(int a){
       
        if (a==bb+1){
        Rock.setEnabled(false);
        Scissors.setEnabled(false);
        Paper.setEnabled(false);
        restart.setEnabled(false);
        gamelog.setEnabled(true);
        south.add(next);
        
        next.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent event){
                endofround(a); 
             }
             
        });
        
         String playerscoress = player.getText();
         String p = playerscoress.substring(20);
         
         int pp = Integer.parseInt(p);
         
         String ccc = comp.getText();
         ccc = ccc.substring(20);
         
         int cc = Integer.parseInt(ccc);
         
         if (pp>cc){
          place.append("\n\n--------END OF GAME----------\nRESULTS \nCongratulations You won Computer \n"+p+" to "+cc);
          
        
          
         }else if (pp<cc){
           place.append( "\n\n--------END OF GAME----------\nRESULTS \nSorry Computer won You \n"+cc+" to "+p);    
         }else{
             place.append( "\n\n--------END OF GAME----------\nRESULTS \nYou drew with computer \n"+p+" to "+cc);  
         }
         
       
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
            if (a==bb+1){
                main.append("\n\n--------END OF GAME----------");
                
                
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
     if (n<bb+1){
         if (s>b){
            place.append("\n\nYou are currently winning computer "+s+" to "+b+"\nAnd have drawed "+cf+" times");
        }else if (s==b){
            place.append("\n\nYou are currently tied "+s+" to "+b+" with computer"+"\nAnd have drawed "+cf+" times");
        }else{
            place.append("\n\nComputer is currently winning "+b+" to "+s+"\nAnd you have drawed "+cf+" times");
        }
    }else{
      place.append("");   
     }
     }
    
    public void endofround(int a){
        
         String playerscoress = player.getText();
         String p = playerscoress.substring(20);
         
         int pp = Integer.parseInt(p);
         
         String c = comp.getText();
         c = c.substring(20);
         
         int cc = Integer.parseInt(c);
         
         if (pp>cc){
          String display = "End of Game \nCongratulations You won Computer \n"+p+" to "+c;
          
        
             JOptionPane.showMessageDialog(Frame, "End of Game \nCongratulations You won Computer \n"+p+" to "+c);   
         }else if (pp<cc){
           JOptionPane.showMessageDialog(Frame, "End of Game \nSorry Computer won You \n"+c+" to "+p);    
         }else{
             JOptionPane.showMessageDialog(Frame, "End of Game \nYou drew with computer \n"+p+" to "+c);  
         }
         
         Object [] options1 = {"GameLog","Play again","Quit"};
        int result =  JOptionPane.showOptionDialog(Frame,"THANK YOU FOR PLAYING","THANKS A LOT",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,null);
        String loog = place.getText(); 
        if (result == JOptionPane.YES_OPTION){
           spce();
           
           
         }else if(result == JOptionPane.NO_OPTION){
             Frame.dispose();
             frame.dispose();
             INTRO(); 
         }else{
             System.exit(0);
         }
         
         
        
    }
    
    
}




                                                              
