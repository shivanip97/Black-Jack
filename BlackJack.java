import java.util.Random;
	import java.util.Scanner;
public class newBlackjack {
	
		private int i;
		Random gen = new Random();
		Scanner scan = new Scanner(System.in);
		
		public newBlackjack() {
		}

		public int shuffleArray() {
			int ans;
			i = gen.nextInt(10)+1;
			
			if(i == 11 || i == 1){
			System.out.println("You pulled an ace.");
			System.out.println("Would you like an 11 or an one?");
			ans = scan.nextInt();
				if (ans == 1){
					i = 1;
				} else {
					i = 11;
				}
		}
			
			return i;
		}
	 
		public static void main(String[] args) {
			int playerTotal;
			Random gen = new Random();
			Scanner keyboard = new Scanner(System.in);

	        newBlackjack newCard1 = new newBlackjack();
	     
	        System.out.println("-------------------------Lets play some BlackJack!-------------------------");
	        System.out.println("---------------------------------------------------------------------------");
	        System.out.println();
	        int card1 = newCard1.shuffleArray();
	        int card2 = newCard1.shuffleArray();

	        System.out.println("You pulled a " + card1);
	        System.out.println("You also pulled a " + card2);
	        playerTotal = card1 + card2;
	        System.out.println("Your total is " + playerTotal + ".");
	        System.out.println();

	        
	        if (playerTotal == 21){
	            System.out.println("Blackjack, you win.");
	            System.exit(0);
	        }
	        if (playerTotal > 21){
	            System.out.println("You lose.");
	            System.exit(0);
	        }
	        
	        int card3 = newCard1.shuffleArray();
	        int card4 = newCard1.shuffleArray();
	        
	        System.out.println("The dealer has a " + card3 + " showing, and a hidden card.");
	        int dealerTotal = card3 + card4;
	       
	        System.out.println("His total is hidden.");
	        System.out.println();
	        System.out.print("Would you like to \"hit\" or \"stay\"? ");
	        String hitStay = keyboard.next();
	        System.out.println();
	        if (hitStay.equalsIgnoreCase("hit")){
	        
	            while (playerTotal < 21 && hitStay.equalsIgnoreCase("hit")){
	            	int card5 = newCard1.shuffleArray();
	                if (hitStay.equalsIgnoreCase("hit")){
	                	
	                    System.out.println("You drew a " + card5 + ".");
	                    playerTotal = playerTotal + card5;
	                    System.out.println("Your total is " + playerTotal + ".");
	                    System.out.println();
	                            
	                    if (playerTotal > 21){
	                        System.out.println("You lose.");
	                        System.exit(0);
	                    }
	                    if (playerTotal == 21){
	                        System.out.println("Blackjack, you win.");
	                        System.exit(0);
	                    }
	                    System.out.print("Would you like to \"hit\" or \"stay\"? ");
	                    hitStay = keyboard.next();
	                    System.out.println();
	                }
	            }        
	        }

	        System.out.println("Ok dealers turn.");
	        System.out.println("His hidden card was a " + card4 + ".");
	        System.out.println("The dealer total is " + dealerTotal +  ".");
	        
	        while (dealerTotal < 17){ 
	        	int card7 = newCard1.shuffleArray();
	            System.out.println();
	            System.out.println("Dealer chooses to hit.");
	            System.out.println("He draws a " + card7 + ".");
	            dealerTotal = dealerTotal + card7;
	            System.out.println();
	            System.out.println("His total is " + dealerTotal);
	            
	            if (dealerTotal > 21){
	                System.out.println();
	                System.out.println("Dealer looses, YOU WIN!");
	                System.exit(0);
	            }
	           
	            if (dealerTotal < 21 && dealerTotal >= 17){
	                System.out.println();
	                System.out.println("Dealer Stays.");
	            }
	        }
	        if (dealerTotal > 21){     
	            System.out.println();
	            System.out.println("Dealers total is " + dealerTotal + ".");
	            System.out.println("Dealer looses, you win!");
	            System.exit(0);
	        }
	      
	        System.out.println();
	        System.out.println("Dealer total is " + dealerTotal);
	        System.out.println("Your total is " + playerTotal);
	        System.out.println();

	        if (dealerTotal > playerTotal){
	            System.out.println("Dealer wins the game.");
	        } 
	        if (dealerTotal == playerTotal){
	            System.out.println("You both draw.");
	        }
	        if (dealerTotal < playerTotal){
	            System.out.println("You win the game!");
	        }
	        keyboard.close();
	    }
			
			
			
}
