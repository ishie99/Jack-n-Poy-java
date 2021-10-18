import java.util.Scanner;
public class jackEnpoy{
    public static void main(String[]args)   
{
    Scanner scans = new Scanner(System.in);

int player1;//player 1 input
int pl1score = 0;//player 1 score storage
int player2;//player 2 input
int pl2score = 0;//player 2 score storage
int itsatie=0;//tie counts
int sets;

//sets how many times you want to play
System.out.print("How many sets: ");
sets =scans.nextInt();

//loop depends on the sets
for(int a = 1; sets >= a; a++) {

//game instructions
System.out.println();
System.out.println("    =PLAYERS CHOICES=");
System.out.println("        0 - ROCK");    
System.out.println("        2 - SCISSOR");
System.out.println("        5 - PAPER");
System.out.println();
System.out.println("            GAME SET " + a);//call the set number

//player1 input
System.out.print("      PLAYER 1 PICK : ");
player1 = scans.nextInt();

//player2 input
System.out.print("      PLAYER 2 PICK : ");
player2 = scans.nextInt(); 
System.out.println();

//for tie
if((player1 ==0)&&(player2==0)){
    System.out.println("        its a tie");
    itsatie++;
}
else if((player1 ==2)&&(player2==2)){
    System.out.println("        its a tie");
    itsatie++;
} 
else if((player1 ==5)&&(player2==5)){
    System.out.println("        its a tie");
    itsatie++;
} 

//for player 1 
else if((player1 ==0)&&(player2==2)){
    System.out.println("        Player 1 wins");
    pl1score++;
} 
else if((player1 ==2)&&(player2==5)){
    System.out.println("        Player 1 wins");
    pl1score++;
}
else if((player1 ==5)&&(player2==0)){
    System.out.println("        Player 1 wins");
    pl1score++;
}

//for player 2
else if((player1 ==2)&&(player2==0)){
    System.out.println("        Player 2 wins");
    pl2score++;
} 
else if((player1 ==5)&&(player2==2)){
    System.out.println("        Player 2 wins");
    pl2score++;
}
else if((player1 ==0)&&(player2==5)){
    System.out.println("        Player 2 wins");
    pl2score++;
}
else {
    System.out.println("      Invalid Input. Try Again");
    --a; //remain in last game set.
 
}
}

//over all result displaying
if(pl1score > pl2score){
    System.out.println();
    System.out.println("            Score Analysis");
    System.out.println("            Player 1 : "+ pl1score );
    System.out.println("            Player 2 : "+ pl2score );
    System.out.println();
    System.out.println("      Over all winner is Player 1. Congats!!");
}
else if(pl2score > pl1score){System.out.println();
    System.out.println("        Score Analysis");
    System.out.println("        Player 1 : "+ pl1score );
    System.out.println("        Player 2 : "+ pl2score );
    System.out.println();
    System.out.println("      Over all winner is Player 2. Congats!!");
}
else if((itsatie >= pl1score) && (itsatie >= pl2score)){
    System.out.println();
    System.out.println("        Score Analysis");
    System.out.println("        Player 1 : "+ pl1score );
    System.out.println("        Player 2 : "+ pl2score );
    System.out.println(); 
    System.out.println("      Over all its a Tie. Congats!!");
}
}
}