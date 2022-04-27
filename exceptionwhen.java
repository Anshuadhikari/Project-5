import java.util.ArrayList;
/**
 * Write a description of class exceptionwhen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class exceptionwhen
{
    public static void main(String[] args)
    {
        // Create an ArrayList for Student objects
        ArrayList<Doubleroom> list = new ArrayList<Doubleroom>();

       try {
       // Create some devils and goats and add them to the list
        seniordiscount erin = new seniordiscount("Erin", "5406561972","Female", SocialYear.SENIOR, 2019);
        noseniordiscount sarah = new noseniordiscount("Sarah", "5406561973","Male",SocialYear.YOUNG, 2020);
        seniordiscount omar = new seniordiscount("Omar", "5406561974", "Male" , SocialYear.ADULT, 2021);
        noseniordiscount bert = new noseniordiscount("Bert", "5406561975", "FEmale", SocialYear.ADULT, 2018);
        
        list.add(erin);
        list.add(sarah);
        list.add(omar); 
        list.add(bert);
        
        } catch (InvalidYearException e) {
        System.err.println("InvalidGradYearException: " + e.getMessage());
        }
        
        
        
        // Print out all the students cheering
        for(int i=0; i<list.size(); i++) {
            String c = list.get(i).cheer();
            System.out.println(c);
        }
    }
}
