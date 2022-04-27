import java.util.ArrayList;

/**
 * constructor for objects of class Singleroom
 */



public class Singleroom
{
    private String name;
    private String contact;
    private int age;
    private String gender; 
    private SocialYear year;
    private ArrayList<String> foods;
     protected String Birthyear;

   
   public Singleroom()
    {
        this.name = "";
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.year = year;
        this.age = -1;
        this.foods = new ArrayList<String>();
    }
    
    public Singleroom(String name,int age,String contact,String gender, SocialYear year){
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.gender = gender;
        this.year = year;
        this.foods = new ArrayList<String>();
    }
    
     public ArrayList<String> getFood(){
        return this.foods;
    }
    
    public void addFood(String food){
        foods.add(food);
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getContact(){
        return this.contact;
    }
    
    public String getGender(){
        return this.gender;
    } 
    
    public void setName(String name){
         this.name = name;
    }
    
    public SocialYear getSocialYear(){
        return this.year;
    }
    
    public void setSocialYear(SocialYear year){
        this.year = year;
        } 
        
    public void setContact(String contact){
         this.contact = contact ;
    }
    
    public void setGender(String gender){
         this.gender = gender ;
    }
    
    public int getAge(){
        return this.age;
    }
   
    
    public void setAge(int age){
        this.age = age;
    }
    
    public boolean canBookroom()
    {
        if (age >= 18){
            return true;        
        }
        else 
        {
            return false; 
        }
    }
}
    
    
    /*
    public static void  NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
    */



