class student{
    void speak(){
        System.out.println("Yes students are public speakers");
    }
}
class teacher extends student{
    void teach(){
        System.out.println("yes they are teachers");
    }
}
class principle extends teacher{
    void manage(){
        System.out.println("Principle ma'am");
    }
}
class topper extends student{
    void read(){
        System.out.println("Students are reading");
    }
}
public class inheritanceex {

    public static void main(String[] args) {
        teacher t = new teacher();
        principle p = new principle();
        topper to = new topper();
        t.speak();
        t.teach();
        p.speak();
        to.speak();
        to.read();
}
}