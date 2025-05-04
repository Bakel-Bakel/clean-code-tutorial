package rpspro.rock_paper_scissor_game.bad_rock_paper_scissor;
import java.util.Scanner;
/**
 *
 * @author BAKEL J
 */
public class RPS {

    
    public static void main(String[] args) {
        intro(); 
       
    
    }
    public static void intro(){
        System.out.println("Welcome to the game of ROCK PAPER SCISSOR");
         System.out.println("This is how it works the computer picks a material then you pick yours then we see who wins");
       input();
    }
    public static void input(){
       
        System.out.println("For Rock, enter R\nPaper, enter P\nThen for Scissor, enter S ");
        Scanner input = new Scanner(System.in);
        String pp = input.nextLine();
        int x = (int)(Math.random()*3);
        OBJECTpick (pp,x);
    }
    
    public static void OBJECTpick (String pp , int x){
           if (x==0){
          
            String cc = "ROCK";
          System.out.println("Computer picked "+cc);
          
        }else if (x == 1) {
            
            String cc = "PAPER";
             System.out.println("Computer picked "+cc);
             
        }else{
            
            String cc = "SCISSOR";
            System.out.println("Computer picked "+cc);
            
        }
         pp = pp.toLowerCase();
        if (pp.startsWith("r")){
            System.out.println ("You picked ROCK");
            
            }else if (pp.startsWith("p")) {
                System.out.println ("You picked PAPER");
                        
            }else if (pp.startsWith("s")){
                System.out.println ("You picked SCISSOR");
                
            }else {
                System.out.println ("You did not pick a valid item");
                input();
            }
        PPwin (pp,x);
    }
    public static void PPwin (String pp, int x){
        String win = "You win....CONGRATULATIONS";
        String lose = "I am sorry, you lost";
        String tie = "Your pick is the same with that of the computer...ITS A TIE";
        if (pp.startsWith("r")){
            if (x==0){
                System.out.println(tie);
            }else if (x==1){
                System.out.println(lose);
            }else{
                System.out.println(win);
            }
        }else if (pp.startsWith("p")) {
            if (x==0){
                System.out.println(win);
            }else if (x==1){
                System.out.println(tie);
            }else{
                System.out.println(lose);
            }
            
        }else{
            if (x==0){
                System.out.println(lose);
            }else if (x==1){
                System.out.println(win);
            }else{
                System.out.println(tie);
            }
        }
        Playagain();
    }
    public static void Playagain(){
    System.out.println("To play again, Enter Y, else enter N");
    Scanner input = new Scanner(System.in);
    String play = input.nextLine();
    play = play.toLowerCase();
    if (play.startsWith("y")){
        intro();
    }else{
        System.out.println ("Thank you for playing");
    }
}
}
