import java.io.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;

class FoxInSocks{
	public static void main(String args[]){
		String line;
		boolean dublicate;
		Collection<String> saga1 = new ArrayList<String>();
		Collection<String> saga2 = new LinkedHashSet<String>();
		Collection<String> saga3 = new TreeSet<String>();
		ArrayList<String> saga4 = new ArrayList<String>(); //Behöver vara en arraylist för att använda metoden get
		Collection<String> saga5 = new ArrayList<String>();

		try(BufferedReader helpRdr = new BufferedReader(new FileReader("fox-in-socks.txt"))){
			do{
				line = helpRdr.readLine();
				if(line != null){
					saga1.add(line);
					saga2.add(line);
					saga3.add(line);

					//Saga4 ska läsas in
					duplicate = false; //är det en duplicate? startar som false
					for(int i = 0;i<saga4.size();i++){
						if(line.compareTo(saga4.get(i)) == 0){
							duplicate = true; //Ändras till true om raden redan finns
						}
					}
					if(!duplicate){ //OM det inte är en duplicate, lägg till raden i saga4
						saga4.add(line);
					}
					//Saga4 inläsning klar
				}

			}while(line != null); //Slutet på filen
		}catch(IOException e){
			System.out.println("Error accessing fox-in-socks.txt");
		}

		//Saga5 lägger bara in var 3e rad (från saga4)
		for(int i = 0;i<saga4.size();i++){
			if(i%3 == 0){ //Skiver var 3e rad!
				saga5.add(saga4.get(i));
			}
		}

		//Skriver ut saga5, här kan man ändra till vilken saga som helst och det kommer gå bra, 
		//t.ex. saga3 som använder tree
		for(String rader: saga5){
			System.out.println(rader);
		}

		//Skriver ut saga5 till fox-in-socks2.txt
		try(BufferedWriter br = new BufferedWriter(new FileWriter("fox-in-socks2.txt"))){
			for(String rader: saga5){
				br.write(rader);
				br.newLine();
			}
		}catch(IOException e){
			System.out.println("Error accessing fox-in-socks.txt");
		}

	}
}