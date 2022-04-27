import java.util.ArrayList;

/**
 * Write a description of class Lab10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class costumers
{
    public static void main(String[] args)
    {
        Singleroom a = new Singleroom("Anshu",19,"5406561972","Female", SocialYear.YOUNG);
        Singleroom b = new Singleroom();
        System.out.print(b);
        
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(a.getAge());
        System.out.println(b.getAge());
        b.setAge(17);
        b.setName("Jess");
        
        b.setSocialYear(SocialYear.SENIOR);
        
        System.out.println(a.canBookroom());
        System.out.println(b.canBookroom());
        
        System.out.println(a.getSocialYear());
        System.out.println(b.getSocialYear());
        
        a.addFood("Indian");
        a.addFood(" Chinese");
         
         b.addFood("Japanese");
         b.addFood("Indonesian");
         
        System.out.println(a.getFood());
        
    Doubleroom Anshu = new Doubleroom("Anshu",20,"5406561972","Female", SocialYear.ADULT);
    Doubleroom Angela = new Doubleroom("Angela" , 18 , "5406561983","Female",SocialYear.ADULT);
    Doubleroom Mary = new Doubleroom("Mary" , 45 ,"5406561986","Female",SocialYear.SENIOR);
    Doubleroom Peter = new Doubleroom ("Peter",60,"5406561972","Male", SocialYear.SENIOR);

      if (Peter.canBookroom()) {
            System.out.println(Peter.getName1() + " can Book a room.");
        } else {
            System.out.println(Peter.getName2() + " is not old enough to Book a room.");
        }
        
     System.out.println(Peter.getName1() + " is a " + Peter.getSocialYear() + ".");
          System.out.println(Mary.getName1() + " is a " + Mary.getSocialYear() + ".");

    }
}
