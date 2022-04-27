import java.util.ArrayList;
 import java.util.Objects;
/**
 * Write a description of class updatedroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  Doubleroom
{
    private String name1;
    private String contact1;
    private String gender1;
    private String name2;
    private int age1;
    private int age2;
    private String contact2;
    private String gender2;  
    private SocialYear year;
    private ArrayList<String> foods;
    
    public Doubleroom()
    {
        this.name1 = "";
        this.contact1 = "";
        this.gender1 = "";
        this.year = year;
        this.foods = new ArrayList<String>();
    }
    
    public Doubleroom(String name1,int age1,String contact1,String gender1, SocialYear year)
    {
        this.name1 = name1;
        this.age1 = age1;
        this.contact1 = contact1;
        this.gender1 = gender1;
        this.year = year;
        this.foods = new ArrayList<String>();
    }
    
    public ArrayList<String> getFood(){
        return this.foods;
    }
    
    public void addFood(String food){
        foods.add(food);
    }
    
    public SocialYear getSocialYear(){
        return this.year;
    }
    
    public void setSocialYear(SocialYear year){
        this.year = year;
        } 
        
    public String getName1(){
        return this.name1;
    }
    
    public String getGender1(){
        return this.gender1;
    }
    
    public String getContact1(){
        return this.contact1;
    }
    
    public String getName2(){
        return this.name2;
    }
    
    public String getGender2(){
        return this.gender2;
    }
    
    
    public void setName1(String name1){
         this.name1 = name1;
    }
    
    public void setGender1(String gender1){
         this.gender1 = gender1;
    }
    
    public void setContact1(String contact1){
         this.contact1 = contact1;
    }
    
    
    
    public boolean canBookroom()
    {
        if (age1 >= 18){
            return true;        
        }
        
        else if (age2 >= 18){
            return true;        
        }
        else 
        {
            return false; 
        }
    }
}
