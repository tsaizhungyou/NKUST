import java.util.Locale;

public class Person {
    String name;
    double HP;
    double MP;
    double attack;

    String getName(){return this.name;}

    void ShoutName(){
        System.out.println("Name: "+getName().toUpperCase());
    }
    void Attack(){
        double hurt;
        hurt = attack - HP;
    }
    void wear(){
        String wear;
    }
}
