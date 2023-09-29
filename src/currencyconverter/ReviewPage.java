//Harrison Juneau

package currencyconverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ReviewPage 
{

    
    
    //array list to aggregate the reviews 
    protected ArrayList<Review> reviewPage = new ArrayList<>();

    //default constructor
    public ReviewPage() 
    {
        
        

    }

    //method to add a review to the arraylist
    public void addReview(Review newReview)
    {

        reviewPage.add(newReview);

    }
    
    //method to list the reviews in the reviewpgae arraylist
    public void listReviews()
    {
        for(Review r: reviewPage)
        {
            
            System.out.println("\n------------------------------------");
            r.getReview();
            
        }    
        
        
    }
    
   
    
}

