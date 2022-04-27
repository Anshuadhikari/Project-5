import java.utils.Objects;
import java.util.ArrayList;
/**
 * Write a description of class Devils here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seniordiscount extends Singleroom
{
    /**
     * Constructor for objects of class Goat
     */
    public seniordiscount(String n, int a, String contact, String g, SocialYear year, int gy) throws InvalidYearException
    {
       super(n, a, contact, g, year, gy); 
      
       if(age.equals("SENIOR"))
       {
            this.year = year; 
        
       }
       else 
       {
           throw new InvalidYearException("Devils graduated in odd years." );
       }
       
    }

    public String say()
    {
        return "Go Devils! Beat the Odds! " + this.gradYear;
    }
}