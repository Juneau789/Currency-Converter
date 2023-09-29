package currencyconverter;
//Harrison Juneau



import java.text.DecimalFormat;
import java.util.Scanner;


public class CurrencyConverter 
{
   
    public static void main(String[] args)
    {
        
        
    
       
        
       //setting exit to 0 and creating a new instance of a reviewpage
       int exit = 0;
       ReviewPage reviews = new ReviewPage();
      
       //while loop for switch statemnt
       while(exit != 1)
       {
           
            //printing out main menu 
            System.out.println("\n-----------Currency Converter---------------");
            System.out.println("\nHello, and welcome to the Currency Converter");
            System.out.println("Please slect and option from the following menu:");
            System.out.println("\n\t1-Convert Currency\n\t2-Add a Review\n\t3-Check reviews\n\t4-Exit");

           //scanner for scanning user input
           Scanner input = new Scanner(System.in);
           
           //data member with is equal to the next integer the user inputs
           int choice = input.nextInt();

           //main switch statment for main menu
           switch(choice)
           {

               //case 1 opens the second switch statement menu for choosing a currency
               case 1:
               {
                   
                   //formatting the decimals
                   DecimalFormat f = new DecimalFormat("##.##");
                    
                   //setting int menu to 0 for use to close currency menu later
                   int menu = 0;
                   
                   //secondary while loop for secondary switch statemnt
                   while(menu != 1)
                   {
                   
                       //prinitng the currency menu to the user
                        System.out.println("\nPlease select which currency you have to convert:");
                        System.out.println("\n\t1-Dollar\n\t2-Euro\n\t3-Rupee\n\t4-Yen\n\t5-Return to main menu");

                        int currency = input.nextInt();
                        
                        //secondary switch statement for the currency menu 
                        switch(currency)
                        {
                            
                            //first case allows input of dollars
                             case 1:
                            {

                                System.out.println("\nHow many dollars do you have?");
                                float dollars = input.nextFloat();
                                System.out.println("\n--------------------------------");
                                System.out.println("\nyour "+ dollars +" dollars is equivilent to:");
                                System.out.println("\n\tEuros: " + f.format(dollars * 1.03));
                                System.out.println("\n\tRupees: " + f.format(dollars * 82.19));
                                System.out.println("\n\tYen: " + f.format(dollars * 146.26));
                                System.out.println("\n--------------------------------");
                                break;
                                
                            }

                            //second case allows input for euros
                            case 2:
                            {

                                System.out.println("\nHow many Euros do you have?");
                                float euros = input.nextFloat();
                                System.out.println("\n--------------------------------");
                                System.out.println("\nyour "+ euros +" euros is equivilent to:");
                                System.out.println("\n\tDollars: " + f.format(euros * .97));
                                System.out.println("\n\tRupees: " + f.format(euros * 79.80));
                                System.out.println("\n\tYen: " + f.format(euros * 142.02));
                                System.out.println("\n--------------------------------");
                                break;
                                
                            }

                            //third case allows input for rupees
                            case 3:
                            {

                                System.out.println("\nHow many rupees do you have?");
                                float rupees = input.nextFloat();
                                System.out.println("\n--------------------------------");
                                System.out.println("\nyour "+ rupees +" rupees is equivilent to:");
                                System.out.println("\n\tEuros: " + f.format(rupees * .013));
                                System.out.println("\n\tDollars: " + f.format(rupees * .012));
                                System.out.println("\n\tYen: " + f.format(rupees * 1.78));
                                System.out.println("\n--------------------------------");
                                break;
                            }

                            //fourth case allows input for yen
                            case 4:
                            {

                                System.out.println("\nHow many Yen do you have?");
                                float yen = input.nextFloat();
                                System.out.println("\n--------------------------------");
                                System.out.println("\nyour "+ yen +" yen is equivilent to:");
                                System.out.println("\n\tEuros: " + f.format(yen * .0070));
                                System.out.println("\n\tRupees: " + f.format(yen * .56));
                                System.out.println("\n\tDollars: " + f.format(yen * .0068));
                                System.out.println("\n--------------------------------");
                                break;
                                
                            }

                            //case 5 is used to return to the main switch statemnt menu
                            case 5:
                            {

                                System.out.println("\nThanks for Converting!");
                                menu = 1;
                                break;

                            }
                            
                            //default is used if something other than an allowed value is inputted 
                            default:
                            {
                                
                                System.out.println("\nInvalid choice.");
                                
                            }
                            
                        }
                       
                        
                   }
                    

                   break;

               }

               //case 2 deals with inputting a review which includes a star rating and comment
               case 2:
               {

                   System.out.println("\nEnter a star rating between 0 & 5:");
                   int stars = input.nextInt();
                   System.out.println("\nPlease feel free to leave a comment and tell us how we did, if you do not wish to make a comment please type N/A:");
                   
                   String comment = input.next();
                    comment += input.nextLine();
                   reviews.addReview(new Review(stars, comment));
                   
                   break;
               }

               //case 3 lists the reviews given
               case 3:
               {
                   
                   reviews.listReviews();
                   break;

               }
               
               //case 4 allows user to exit the application and give a goodbye message
               case 4:
               {
                   
                   System.out.println("\nHave a wonderful Day! Hope you enjoyed our services");
                   exit = 1;
                   break;
                   
               }
               
               //used for any invalid inputs and bring the main menu back up
               default:
               {
                   
                   System.out.println("\nInvalid choice.");
                   
               }

           }

       }
        
    }
    
}