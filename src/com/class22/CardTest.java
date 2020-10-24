package com.class22;

public class CardTest {

	public static void main(String[] args) {
		
		
		System.out.println(" ..........First way ......................");
		
		//take an Object of the child class and give reference to the parent
		//type reference variable= object is created
			
		Card card=new AX();//we created objects and assigned to the variables
		card.creditLimit();
		
		Card card1=new MC();//we created objects and assigned to the variables
		card1.creditLimit();
		
		
		Card card2=new Visa();//we created objects and assigned to the variables
		card2.creditLimit();
		
		
		
		
		System.out.println(" ..........Second way with array......................");
		
		
		//FIRST we created objects and assigned to the variables and then
		//stored those variables inside the array
		Card[] cardArray= {card, card1, card2};
		
		//creating an object and storing it directly into an Array of Cards
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		System.out.println("----------------");
		
		
		//for each elements(regular type)
		for(Card myCard:cardArray) {//sag tarafta her zaman array vardir. sol da ise parent class (Card )olur.
			myCard.chargeInterest();//yukarida card yazdigimiz icin burda myCard yazdik karismasin diye.
			myCard.creditLimit();
			
			
		}
		
		
		//lenght type
		for(int y=0; y<cardArray1.length; y++) {
			cardArray1[y].creditLimit();
		}
		System.out.println("-----Creating objects of each class----");
		
		
		//************ 4. TARZ ***************\\
		
		
		//BURADA DA normalde yaptigimiz islemleri yaptik:
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2=new MC();//MC array type a ornek olsun diye yazdik
		MC mc3=new MC();//MC array type a ornek olsun diye yazdik
		
		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();
		
		
		
		//************ 5. TARZ ***************\\
		
		
		System.out.println("----creating an array that will hold only MC types");
		//Sadece MasterCard (MC)i array type da yazmak istersek soyle yapariz
		MC[] masterCards= {mc1,mc2,mc3};//buraya ax1,c1 yazamayiz cunku bunlar
		                                //MC ye tanimli degiller.
		for(MC mCard:masterCards) {
			mCard.cashBack();
			mCard.chargeInterest();
			mCard.creditLimit();
		}	
	}
	
}