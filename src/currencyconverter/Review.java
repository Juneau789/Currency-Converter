//Harrison Juneau

package currencyconverter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Review 
{

    //data members to store a star rating and comment given by the user
    private int stars;
    private String comment;

    //constructor to initialize stars and comment
    public Review(int Stars, String Comment) 
    {

        stars = Stars;
        comment = Comment;

    }

    //setter method to set the stars value
    public void setStars(int Stars)
    {

       stars = Stars; 

    }
    
    //setter method to set comment value
    public void setComment(String Comment)
    {
        
        comment = Comment;
        
    }
    
    //getter method to get the stored value of stars
    public int getStars()
    {
        
        return stars;
        
    }
    
    //getter method to get the stored value of comment
    public String getComment()
    {
        
        return comment;
        
    }
    
    //getter method which gets the vaule of a comment consisting of a star rating and comment
    public void getReview()
    {
        
        System.out.printf("\n%d out of 5 stars, Heres what they had to say about us: \n%s", stars, comment);
        
    }
    
    public void saveToFile() throws FileNotFoundException, IOException
    {
       
        FileWriter writer = new FileWriter("Reviews.txt");
        writer.write(stars + "out of 5 stars\nHeres what they had to say about us: " + comment);
        writer.close();
        
    }
  


}

