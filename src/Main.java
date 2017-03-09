import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String player1,player2;
		int sayi,game1=0,game2=0,sayac=0,setsayisi=0,win1=0,win2=0;
		int []set1=new int[5];
		int []set2=new int[5];

		boolean deger=true;
		
		System.out.print("1. Oyuncu İsmini Giriniz: ");
		player1=input.nextLine();
		System.out.print("2. Oyuncu İsmini Giriniz: ");
		player2=input.nextLine();
		
		System.out.println(player1+" ise 1");
		System.out.println(player2+" ise 2");
		
		while(deger){
			System.out.print("Sayiyi Kim Aldi: ");
			sayi=input.nextInt();
			
			//set ekleme
			if(sayi==1 && (game1==100 || game1-game2==40 || game1-game2==25 || game1-game2==10)){
				set1[setsayisi]+=1;
				game1=0;
				game2=0;
				sayac++;
				}
			if(sayi==2 && (game2==100 || game2-game1==40 || game2-game1==25 || game2-game1==10)){
				set2[setsayisi]+=1;
				game1=0;
				game2=0;
				sayac++;
				}
			
			//avantaj
			if(sayi==1 && game1==40 && game2==40){
				game1=100;
				game2=0;
			}
			if(sayi==2 && game1==40 && game2==40){
				game2=100;
				game1=0;
			}
			
			//sayı ekleme
			if(sayi==1 && game2==100){
				game2=40;
				game1=40;
			}
			if(sayi==2 && game1==100){
				game2=40;
				game1=40;
			}
			if(sayi==1 && game1==30)
				game1=40;
			if(sayi==1 && game1==15)
				game1=30;
			if(sayi==1 && game1==0 && sayac==0)
				game1=15;
			if(sayi==2 && game2==30)
				game2=40;
			if(sayi==2 && game2==15)
				game2=30;
			if(sayi==2 && game2==0 && sayac==0)
				game2=15;
			
			//set sayısı ayarlama
			if(set1[setsayisi]>=6 && set1[setsayisi]-set2[setsayisi]>=2 ){
				setsayisi++;
				win1++;
				}
			if(set2[setsayisi]>=6 && set2[setsayisi]-set1[setsayisi]>=2 ){
				setsayisi++;
				win2++;
				}
			if(set1[setsayisi]==6 && set2[setsayisi]==6){
				boolean deger2=true;
				int sayi2,game11=0,game21=0;

				while(deger2){
					System.out.print("Sayiyi Kim Aldi: ");
					sayi2=input.nextInt();
					
					if(sayi2==1)
						game11++;
					if(sayi2==2)
						game21++;
					if(game11>=7 &&game11-game21>=2){
						set1[setsayisi]++;
						setsayisi++;
						deger2=false;
						win1++;
						}
					if(game21>=7 &&game21-game11>=2){
						set2[setsayisi]++;
						setsayisi++;
						deger2=false;
						win2++;
						}
					System.out.println(game11);
					System.out.println(game21);
			}
			}
			
			//kazananı yazdırma
			if(win1==3){
				System.out.println("tebrikler "+player1+" kazandı.");
				deger=false;
				
				}
			if(win2==3){
				System.out.println("tebrikler "+player2+" kazandı.");
				deger=false;
				}
			
			sayac=0;
			
			//scoreboard yazdırma
			if(game1==100){
				System.out.println(player1+": "+set1[0]+" "+set1[1]+" "+set1[2]+" "+set1[3]+" "+set1[4]+" | "+"Avantaj");
				System.out.println(player2+": "+set2[0]+" "+set2[1]+" "+set2[2]+" "+set2[3]+" "+set2[4]+" | "+game2);
			}
			else if(game2==100){
				System.out.println(player1+": "+set1[0]+" "+set1[1]+" "+set1[2]+" "+set1[3]+" "+set1[4]+" | "+game1);
				System.out.println(player2+": "+set2[0]+" "+set2[1]+" "+set2[2]+" "+set2[3]+" "+set2[4]+" | "+"Avantaj");
			}
			else{
				System.out.println(player1+": "+set1[0]+" "+set1[1]+" "+set1[2]+" "+set1[3]+" "+set1[4]+" | "+game1);
				System.out.println(player2+": "+set2[0]+" "+set2[1]+" "+set2[2]+" "+set2[3]+" "+set2[4]+" | "+game2);
			}
				
		
	}
	}}
