/*  WAJP below the requirement 
(a) create and appliction to book movie tickets
(b) refer book my show app to design the app  
*/

import java.util.Scanner;
class BookMovieTickets 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("\n******* Book Movie Tickets *******\n");
        int a ;


		do{

			System.out.println("## Select Locations ## \n * Press any Number *\n ");

			System.out.println(" 1. Delhi ");
		    System.out.println(" 2. Chennai");
			System.out.println(" 3. Gurugram");
			System.out.println(" 4. Faridbad");
			System.out.println(" 5. Noida");
			System.out.println(" 6. Ghaziyabad");
			System.out.println(" 7. Chandigarh");
			System.out.println(" 8. Bangluru");
			System.out.println(" 9. Hydrabad");
			System.out.println(" 10.Raipur");
			System.out.println(" 11.Mumbai\n");

            
			int selLoc = sc.nextInt();

			switch (selLoc)
			{
			case 1:{
				System.out.println(" * Select Movies and Press any Number \n ");
				
				System.out.println(" 1 Dunki");
				System.out.println(" 2 Salaar");
				System.out.println(" 3 12th Fail");
				System.out.println(" 4 SAM Bahadur");
				System.out.println(" 5 Animal");
				//System.out.println(" 6 Jawaan");
				//System.out.println(" 7 Leo");

				int selMovie = sc.nextInt();

				switch (selMovie)
				{
					case 1:{
						System.out.println("\n *** Book Now ***");
						System.out.println("\n * Select Language * ");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");

						int selLanguage = sc.nextInt();
            // *******************************************************************            
				        if (1 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
//******************************************************************************************************************
					  else if (2 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
// ***********************************************************************************************
					 else if (3 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
					   else {
						System.out.println("************* Invaild Language **************");
					   }
					}break;

//#######################################################################################################################################
                case 2:{
						System.out.println("\n *** Book Now ***");
						System.out.println("\n * Select Language * ");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");

						int selLanguage = sc.nextInt();
            // *******************************************************************            
				        if (1 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
//******************************************************************************************************************
					  else if (2 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
// ***********************************************************************************************
					 else if (3 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
					   else {
						System.out.println("************* Invaild Language **************");
					   }
					}break;
//####################################################################################################################################
					case 3:{
						System.out.println("\n *** Book Now ***");
						System.out.println("\n * Select Language * ");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");

						int selLanguage = sc.nextInt();
            // *******************************************************************            
				        if (1 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
//******************************************************************************************************************
					  else if (2 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
// ***********************************************************************************************
					 else if (3 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
					   else {
						System.out.println("************* Invaild Language **************");
					   }
					}break;
//#################################################################################################

					case 4:{
						System.out.println("\n *** Book Now ***");
						System.out.println("\n * Select Language * ");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");

						int selLanguage = sc.nextInt();
            // *******************************************************************            
				        if (1 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
//******************************************************************************************************************
					  else if (2 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
// ***********************************************************************************************
					 else if (3 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
					   else {
						System.out.println("************* Invaild Language **************");
					   }
					}break;
//################################################################################################################
					case 5:{
						System.out.println("\n *** Book Now ***");
						System.out.println("\n * Select Language * ");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");

						int selLanguage = sc.nextInt();
            // *******************************************************************            
				        if (1 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
//******************************************************************************************************************
					  else if (2 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
// ***********************************************************************************************
					 else if (3 == selLanguage)
				        {

							System.out.println("\n * Select Cinemas * ");

							System.out.println(" 1. Fun Cinemas, Delhi");
							System.out.println(" 2. INOX, Delhi");
							System.out.println(" 3. Miraj Cinemas, Delhi");
							System.out.println(" 4. M Cinemas, Delhi");
							System.out.println(" 5. Liberty Cinemas, Delhi");
							System.out.println(" 6. Amba Cinemas, Delhi");
							System.out.println(" 7. Movie Time Multiplex Cinemas, Delhi");
							System.out.println(" 8. PVR Premiere Cinemas, New Delhi");
							System.out.println(" 9. The Movie Hall Cinemas, Delhi");

							int selCinema = sc.nextInt();

							switch (selCinema)
							{
							case 1:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 2:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 3:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 4:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 5:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 6:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 7:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 8:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
							case 9:{
								int ru; 
						        System.out.println("\n ** Select Amount **");
								System.out.println(" 1. 400  VIP");
								System.out.println(" 2. 250  Executive");
								System.out.println(" 3. 200 ? Normal");

								int selAmount = sc.nextInt();
								if (1 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (2 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else if (3 == selAmount)
								{
									System.out.println("\n ** Pay Rupees ** ");
									System.out.println(" 1. UPI No");
									System.out.println(" 2. Net Banking ");

                                    int pay = sc.nextInt();
									if (1 == pay )
									{ 
										Scanner dd=new Scanner(System.in);
										System.out.print("UPI ID : ");
										String upi = dd.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else if (2 == pay)
									{
										Scanner db = new Scanner (System.in);
										System.out.print("NET BANKING : ");
										String netbank = db.nextLine();
										System.out.println("\n ******* Payment Successful *******");
									}
									else{
										System.out.println(" ***** Invalid Payment ***** ");
									}
								}
								else {
									System.out.println(" **** Invaild Amount **** ");
								}
							}
                         }
				       }
					   else {
						System.out.println("************* Invaild Language **************");
					   }
					}break;









				
				}


			}
			



			}
    

           a = sc.nextInt();
		}
		 
		while (1 == a);
	
	
	}
}

