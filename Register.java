/*
 * @ author newtoncyta
 */

/* programu inayosaidia usajili wa washiriki wapya katika
 *  vikundi vidogo vidogo vya 
 *  dini hapa chuoni.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try block
		    try {
			int lugha; 
		System.out.println(" Language/Lugha ");
		System.out.println(" 1. English ");
		System.out.println(" 2. Kiswahili ");
		System.out.println(" Chagua lugha ");
		Scanner input = new Scanner(System.in);
		
		// chukua lugha kwa mtumishi anayotaka
		lugha = input.nextInt();
		if (lugha == 1) {
			
			// if person replies in English
			System.out.println(" Welcome to USCF Registration of new members ");
			System.out.println(" Choose your year of study ");
			System.out.println(" 1. First Year ");
			System.out.println(" 2. Second Year ");
			System.out.println(" 3. Third Year ");
			System.out.println(" 4. Fourth Year ");
			System.out.println(" 5. Fifth Year ");
			System.out.println(" Reply using number (1-5) ");
			
			//chukua mwaka wa mtumishi anaosoma
			int mwaka;
			mwaka = input.nextInt();
			if (mwaka == 1 || mwaka == 2 || mwaka == 3 || mwaka == 4 || mwaka == 5) {
				System.out.println(" Choose your college ");
				System.out.println(" 1. CoICT ");
				System.out.println(" 2. CoET ");
				System.out.println(" 3. CoHU ");
				System.out.println(" 4. CoSS ");
				System.out.println(" 5. SJMC ");
				System.out.println(" 6. CoAF ");
				System.out.println(" 7. UDBS ");
				System.out.println(" 8. not in the list");
				
				//chukua jina la college analosoma mtumishi 
				int chuo;
				chuo = input.nextInt();
				if (chuo == 1 || chuo == 2 || chuo == 3 || chuo == 4 || chuo == 5 || chuo == 6 || chuo == 7 || chuo == 8) {
					System.out.println(" Are you born again? ");
					System.out.println(" 1 for Yes ");
					System.out.println(" 0 for No ");
					
					int bornagain;
					bornagain = input.nextInt();
					if (bornagain == 1) {
						System.out.println(" You made good decision to receive and believe in Jesus Christ. ");
						System.out.println(" Welcome to USCF ministry.");
						System.out.println(" Give us your surname followed by first name eg Lyimo, Elisha");
						
						// chukua jina la mtumishi ie Newton Peter
						String name;
						Scanner s = new Scanner(System.in);
						name = s.nextLine();
						if (name != "") {
							System.out.printf(" Thanks %s. Please kindly send us your phone number for example 0678463684 \n ", name);
							int phone;
							phone = s.nextInt();
							System.out.printf(" Congrats %s. You have successfully completed your registration at USCF ministry with the phonenumber: %d ", name, phone );
							System.out.println(" We ussually meet from Monday to Saturday starting from 07:00pm to 08:00pm ");
						}
						else {
							System.out.println(" No name entered, Try again ");
						}											
					}
					else {
						// kama hajaokoka je  
						// weka hata mistari kwenye bible
						System.out.println(" Being born is not a religion as how many would have thought, ");
						System.out.println(" but it's a about a close relationship with God ");
						System.out.println(" by the renewal of our mind and becoming a new creation since the past is gone.");
						System.out.println(" Today is the day, don't wait till you lose your gift from God,");
						System.out.println(" that is eternal life in Christ Jesus our Lord. ");

						System.out.println(" Give us your surname followed by first name eg Lyimo, Elisha");

						// chukua jina la ambao hawajaokoka.
						String xname;
						Scanner s = new Scanner(System.in);
						xname = s.nextLine();
						if (xname != "") {
							System.out.println(" Thanks %s. Please give us your phonenumber eg. 0675998494 \n ");
							int xphone;
							xphone = s.nextInt();
							System.out.printf(" Congrats %s. You have successfully completed your registration at USCF ministry with the phonenumber: %d ", xname, xphone );
							System.out.println(" We ussually meet from Monday to Saturday starting from 07:00pm to 08:00pm ");
						} else {
							System.out.println(" No name entered!");
						}
					}
				}
				else {
					System.out.println(" Invalid input ");
				}
			}
			
			else {
				System.out.println("Invalid input");
			}
		}
		else if (lugha == 2) {
			// kama mshiriki akijibu kwa kiswahili
			System.out.println("Karibu katika usajili wa wageni katika Huduma ya USCF  ");
			System.out.println(" Chagua mwaka wa masomo: ");
			System.out.println(" 1. Mwaka wa Kwanza ");
			System.out.println(" 2. Mwaka wa Pili ");
			System.out.println(" 3. Mwaka wa Tatu ");
			System.out.println(" 4. Mwaka wa Nne ");
			System.out.println(" 5. Mwaka wa Tano ");
			System.out.println(" Jibu kwa nambari (1-5) ");
			
			//chukua mwaka wa mtumishi anaosoma
			int mwaka;
			mwaka = input.nextInt();
			if (mwaka == 1 || mwaka == 2 || mwaka == 3 || mwaka == 4 || mwaka == 5) {
				System.out.println(" Chagua chuo husika ");
				System.out.println(" 1. CoICT ");
				System.out.println(" 2. CoET ");
				System.out.println(" 3. CoHU ");
				System.out.println(" 4. CoSS ");
				System.out.println(" 5. SJMC ");
				System.out.println(" 6. CoAF ");
				System.out.println(" 7. UDBS ");
				System.out.println(" 8. Haipo kwenye orodha ");
				
				//chukua jina la college analosoma mtumishi 
				int chuo;
				chuo = input.nextInt();
				if (chuo == 1 || chuo == 2 || chuo == 3 || chuo == 4 || chuo == 5 || chuo == 6 || chuo == 7 || chuo == 8) {
					System.out.println(" Umezaliwa mara ya pili ");
					System.out.println(" 1 kwa Ndio ");
					System.out.println(" 0 kwa Hapana ");
					
					int bornagain;
					bornagain = input.nextInt();
					if (bornagain == 1) {
						System.out.println(" Umefanya maamuzi mazuri ya kumpokea na kumwamini Bwana Yesu. ");
						System.out.println(" Karibu katika Huduma ya USCF. ");
						System.out.println(" Tuma jina lako la mwisho likifatiwa na jina lako la kwanza mfano Lyimo, Eliya ");
						
						// chukua jina la mtumishi ie Newton Peter
						String name;
						Scanner s = new Scanner(System.in);
						name = s.nextLine();
						if (name != "") {
							System.out.printf(" Asante %s. Tafadhali tutumie namba yako ya simu mfano 0687833982 \n", name);
							int phone;
							phone = s.nextInt();
							System.out.printf(" Hongera %s. Umefanikisha usajili wako katika Huduma yetu ya USCF kwa nambari %d. \n ", name, phone);
							System.out.println("");
							System.out.println(" Ibada zetu huanza kila siku saa moja jioni mpaka saa 2 usiku pale Chapel kasoro Jumapili. ");
						}
						else {
							System.out.println(" Hujatuma jina lako. Jaribu tena ");
						}											
					}
					else {
						// kama hajaokoka je  
						// weka hata mistari kwenye bible
						System.out.println(" Kuzaliwa mara ya pili sio dini kama watu wengi wanavyofikiria, ");
						System.out.println(" bali ni kuwa na uhusiano wa karibu na Mungu. ");						
						System.out.println(" Leo ni siku sahihi ya kufanya uamuzi wa kumpa Yesu maisha yako. ");
						System.out.println(" Kabla yule mwovu hajaja kuiba ile karama ya Mungu uliopewa");
						System.out.println(" nayo ni uzima wa milele katika Kristu Yesu Bwana wetu. ");

						System.out.println(" Tutumie jina lako la mwisho likifatiwa na jina lako la kwanza mfano Lyimo, Eliya ");

						// chukua jina la ambao hawajaokoka.
						String xname;
						Scanner s = new Scanner(System.in);
						xname = s.nextLine();
						if (xname != "") {
							System.out.printf(" Asante %s. Tafadhali tutumie nambari yako ya simu mfano 0685494894 \n", xname);
							int xphone;
							xphone = s.nextInt();
							System.out.printf(" Hongera %s. Umefanikisha usajili wako katika Huduma ya USCF kwa nambari %d ", xname, xphone);
							System.out.println(" Ibada zetu huanza kila siku saa moja jioni mpaka saa 2 usiku pale Chapel kasoro Jumapili. ");
						} else {
							System.out.println(" Hakuna jina uliloingiza, Jaribu tena");
						}
					}
				}
			}
			
			else {
				System.out.println(" Hujachagua sahihi ");
			}			
		}
		
		else {
			// kama mtu akichagua tofauti na vile inavyotakiwa.
			System.out.println(" Hujachagua sahihi ");
		}
	        }
            //catch statement
	        catch (InputMismatchException e) {
		  System.out.println(" Choose a number/Chagua nambari ");
	        }
		
	}

}
