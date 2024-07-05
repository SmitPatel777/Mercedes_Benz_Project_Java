import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class car extends Thread {
	String car_name,final_fuel_type,desired_word = "ON-ROAD PRICE",name,final_name,payment;
	String car_amount,eqs="16331868", eqb="8312940 ",a_hatch="9102850 ",a_c="4464450 ",c_c="6148100 ",e_c="8099350 ",s_c="18045150",maybach_s_c="38161494",
	gla="5447880 ",gle="11404502",gls="13255058",maybach_gls="31869475";
	int i,j,k,l,m,fuel_type,m_o_p,name_length,add_length;
	long phone_no,age;
	String final_address,address_area;
	Scanner sc = new Scanner(System.in);

	car() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                                                                                         |");
		System.out.println("|                                                         MERCEDES BENZ                                                   |");
		System.out.println("|                                                                                                                         |");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n\n");
		System.out.println("\nMANAGER  : HELLO SIR\n");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}    
  
		System.out.println("CUSTOMER : HELLO !\n");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("ENTER YOUR NAME : ");
		name = sc.nextLine();
		name_length = name.length();
		
		switch(name_length) {
		case 1:
			final_name = name+"         ";
			break;
		case 2:
			final_name = name+"        ";
			break;
		case 3:
			final_name = name+"       ";
			break;
		case 4:
			final_name = name+"      ";
			break;
		case 5:
			final_name = name+"     ";
			break;
		case 6:
			final_name = name+"    ";
			break;
		case 7:
			final_name = name+"   ";                                                      
			break;
		case 8:
			final_name = name+"  ";
			break;
		case 9:
			final_name = name+" ";
			break;
		case 10:
			final_name = name;
			break;
		default:
			final_name = "         ";

		}

		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("ENTER ADDRESS : ");
		address_area = sc.nextLine();
		add_length = address_area.length();

		switch(add_length) {
		case 1:
			final_address = address_area+"         ";
			break;
		case 2:
			final_address = address_area+"        ";
			break;
		case 3:
			final_address = address_area+"       ";
			break;
		case 4:
			final_address = address_area+"      ";
			break;
		case 5:
			final_address = address_area+"     ";
			break;
		case 6:
			final_address = address_area+"    ";
			break;
		case 7:
			final_address = address_area+"   ";
			break;
		case 8:
			final_address = address_area+"  ";
			break;
		case 9:
			final_address = address_area+" ";
			break;
		case 10:
			final_address = address_area;
			break;
		default:
			final_address = "         ";
		}

		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("\nMANAGER  : HOW CAN I HELP YOU Mr/Mrs "+name+" ?\n");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("CUSTOMER : I WANT TO BUY A NEW CAR ! WILL YOU SHOW ME THE CARS WHICH ARE AVAILABLE RIGHT NOW?\n ");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("MANAGER  : SURE SIR ! BUT CAN YOU PLEASE LET ME KNOW YOUR INTERESTED FUEL TYPE YOU WANT TO GO WITH : \n");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		this.select_car();
	}

	void select_car() {
		System.out.println("\nSELECT FUEL TYPE : \n1.ELECTRIC  \n2.PETROL");
		fuel_type = sc.nextInt();
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		if(fuel_type==1) {
			final_fuel_type = "ELECTRIC";
		}
		else if(fuel_type==2) {
			final_fuel_type = "PETROL  ";
		}
		else {
			System.out.println("ENTER VALID NUMBER : ");
			this.select_car();
		} 

		System.out.println("\nYOU HAVE CHOOSEN "+final_fuel_type+" FUEL TYPE\n ");
		try {	
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		if(fuel_type==1) {
			System.out.println("WE HAVE 2 CARS AVAILABLE FOR YOU WITH ELECTRIC FUEL TYPE : \n1.EQS \n2.EQB");
			try {	
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			i = sc.nextInt();

			if(i==1) {
				car_name = "EQS                     ";
				car_amount = eqs ;
				System.out.println("\n\nPRINTING DETAILS OF THE CAR...\n");
				try {	
					Thread.sleep(3000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				File myfile = new File("EQS.txt");
				try {
					Scanner sc = new Scanner(myfile);
					while(sc.hasNextLine()) {
						String line = sc.nextLine();
						System.out.println(line);
					}
					sc.close();
				}
				catch(FileNotFoundException fe) {
					System.out.println("file not found ");
				}
				try {	
					Thread.sleep(5000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				System.out.println("\n\nAFTER READING DETAILS\n");
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				System.out.println("PRESS 1 TO BUY THE CAR \nPRESS 2 TO SEE OTHER CARS ");
				j=sc.nextInt();
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				this.pay_opt();
			}
			else if(i==2) {
				car_name = "EQB                     ";
				car_amount = eqb ;
				System.out.println("\n\nPRINTING DETAILS OF THE CAR...\n");
				try {	
					Thread.sleep(3000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				File myfile = new File("EQB.txt");
				try {
					Scanner sc = new Scanner(myfile);
					while(sc.hasNextLine()) {
						String line = sc.nextLine();
						System.out.println(line);
					}
					sc.close();
				}
				catch(FileNotFoundException fe) {
					System.out.println("file not found ");
				}
				try {	
					Thread.sleep(5000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				System.out.println("\n\nAFTER READING DETAILS\n");
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				System.out.println("PRESS 1 TO BUY THE CAR \nPRESS 2 TO SEE OTHER CARS ");
				j=sc.nextInt();
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			
				this.pay_opt();
			}	
		}
		else if(fuel_type==2) {
			System.out.println("WE HAVE 3 TYPES OF CARS AVAILABLE FOR YOU WITH PETROL FUEL TYPE : \n1.HATCHBACK \n2.SEDAN \n3.SUV");
			k = sc.nextInt();		
			try {	
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}

			if(k==1) {
				System.out.println("\nHATCHBACK CARS : \n1.A-CLASS_HATCHBACK");
				l=sc.nextInt();
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				if(l==1) {
					car_name = "A-CLASS_HATCHBACK       ";
					car_amount = a_hatch ;
					System.out.println("\n\nPRINTING DETAILS OF THE CAR...\n");
					try {	
						Thread.sleep(3000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					File myfile = new File("A-CLASS_HATCHBACK.txt");
					try {
						Scanner sc = new Scanner(myfile);
						while(sc.hasNextLine()) {
							String line = sc.nextLine();
							System.out.println(line);
						}
						sc.close();
					}
					catch(FileNotFoundException fe) {
						System.out.println("file not found ");
					}

					try {	
						Thread.sleep(5000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("\n\nAFTER READING DETAILS\n");
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("PRESS 1 TO BUY THE CAR \nPRESS 2 TO SEE OTHER CARS ");
					j=sc.nextInt();
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}
					this.pay_opt();
				}
				else {
					System.out.println("ENTER VALID NUMBER : ");
					this.select_car();
				}
			}
			else if(k==2) {
				System.out.println("\nSEDAN CARS : \n1. A-CLASS \n2. C-CLASS \n3. E-CLASS \n4. S-CLASS \n5. MERCEDES-MAYBACH_S-CLASS");
				l=sc.nextInt();
				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				if(l<=5) {
					switch(l) {
						case 1:
							car_name = "A-CLASS                 ";
							car_amount = a_c ;
							break;
						case 2:
							car_name = "C-CLASS                 "; 
							car_amount = c_c ;
							break;
						case 3:
							car_name = "E-CLASS                 ";
							car_amount = e_c ;
							break;
						case 4:
							car_name = "S-CLASS                 ";
							car_amount = s_c ;
							break;
						case 5:
							car_name = "MERCEDES-MAYBACH_S-CLASS";
							car_amount = maybach_s_c ;
							break;
						default:
							car_name = " ";
							car_amount = "  " ;
					}

					System.out.println("\n\nPRINTING DETAILS OF THE CAR...\n");
					try {	
						Thread.sleep(3000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					File myfile = new File(l+".txt");
					try {
						Scanner sc = new Scanner(myfile);
						while(sc.hasNextLine()) {
							String line = sc.nextLine();
							System.out.println(line);
						}
						sc.close();
					}
					catch(FileNotFoundException fe) {
						System.out.println("file not found ");
					}

					try {	
						Thread.sleep(5000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("\n\nAFTER READING DETAILS\n");
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("PRESS 1 TO BUY THE CAR \nPRESS 2 TO SEE OTHER CARS ");
					j=sc.nextInt();
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}
					this.pay_opt();
				}
				
				else {
					System.out.println("ENTER VALID NUMBER : ");
					this.select_car();
				}
			}
			else if(k==3) {
				System.out.println("\nSUV CARS : \n1. GLA \n2. GLE \n3. GLS \n4. MERCEDES-MAYBACH_GLS");
				l=sc.nextInt();

				try {	
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}

				if(l<=4) {
					switch(l) {
						case 1:
							car_name = "GLA                     ";
							car_amount = gla ;
							break;
						case 2:
							car_name = "GLE                     ";
							car_amount = gle ;
							break;
						case 3:
							car_name = "GLS                     ";
							car_amount = gls ;
							break;
						case 4:
							car_name = "MERCEDES-MAYBACH_GLS    ";
							car_amount = maybach_gls ;
							break;
						default:
							car_name = " ";
					}

					System.out.println("\n\nPRINTING DETAILS OF THE CAR...\n");
					try {	
						Thread.sleep(3000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					File myfile = new File("a"+l+".txt");
					try {
						Scanner sc = new Scanner(myfile);
						while(sc.hasNextLine()) {
							String line = sc.nextLine();
							System.out.println(line);
						}
						sc.close();
					}
					catch(FileNotFoundException fe) {
						System.out.println("file not found ");
					}

					try {	
						Thread.sleep(5000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("\n\nAFTER READING DETAILS\n");
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}

					System.out.println("PRESS 1 TO BUY THE CAR \nPRESS 2 TO SEE OTHER CARS ");
					j=sc.nextInt();
					try {	
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}
					this.pay_opt();
				}

				else {
					System.out.println("ENTER VALID NUMBER : ");
					this.select_car();
				}
			}
			else {
				System.out.println("ENTER VALID NUMBER : ");
				this.select_car();
			}		
		}
		else {
			System.out.println("ENTER VALID FUEL TYPE : ");
			this.select_car();
		}
	}

	void pay_opt() {
		if(j==1) {
			System.out.println("\nMANAGER  : GREAT CHOICE SIR/MAM.\n");
			try {	
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}

			System.out.println("MANAGER  : THERE ARE 2 MODES OF PAYMENT AVAILABLE : \n1.CASH \n2.CHEQUE \n\nCAN I KNOW YOUR MODE OF PAYMENT !");
			m_o_p = sc.nextInt();
			try {	
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}

			if(m_o_p<=2) {	
				switch(m_o_p) {
				case 1:
					payment = "CASH  ";
					break;
				case 2:
					payment = "CHEQUE";
					break;
				default:
					payment = " ";
				}	
				try {	
					this.bill();
				}
				catch(Exception e) {
					System.out.println(e);
				}	
				
			}
			else {
				System.out.println("ENTER VALID NUMBER : ");
				this.select_car();
			}
		}
		else if(j==2) {
			this.select_car();
		}
		else {
			System.out.println("ENTER VALID NUMBER : ");
			this.select_car();
		}
	}

	void bill() throws IOException, InterruptedException {	
		System.out.println("\nENTER MOBILE NO : ");
		phone_no = sc.nextLong();
		System.out.println("\nENTER AGE : ");
		age = sc.nextLong();
		System.out.println("\n\nGENERATING BILL...\n");
		try {	
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}

		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("|                                                                                              |");
		System.out.println("|                                         BILL INVOICE                                         |");
		System.out.println("|                                                                                              |");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("|                                                                                              |");
		System.out.println("|   CUSTOMER NAME   :                                          "+final_name+"                      |");
		System.out.println("|                                                                                              |");
		System.out.println("|   MOBILE NO       :                                          "+phone_no+"                      |");
		System.out.println("|                                                                                              |");
		System.out.println("|   CUSTOMER AGE    :                                          "+age+"                              |");
		System.out.println("|                                                                                              |");
		System.out.println("|   ADDRESS         :                                          "+final_address+"                      |");
		System.out.println("|                                                                                              |");
		System.out.println("|   CAR PURCHASED   :                                          "+car_name+"        |");
		System.out.println("|                                                                                              |");
		System.out.println("|   DATE            :                                          22-6-2024                       |");
		System.out.println("|                                                                                              |");
		System.out.println("|   TOTAL AMOUNT    :                                          "+car_amount+"                        |");
		System.out.println("|                                                                                              |");
		System.out.println("|   CAR FUEL TYPE   :                                          "+final_fuel_type+"                        |");
		System.out.println("|                                                                                              |");
		System.out.println("|   MODE OF PAYMENT :                                          "+payment+"                          |");
		System.out.println("|                                                                                              |");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("|                                          THANK YOU                                           |");
		System.out.println("------------------------------------------------------------------------------------------------");
	}
}

class mercedes {
	public static void main(String[] args) {
		car c1 = new car();
	}
}