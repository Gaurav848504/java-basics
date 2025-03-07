abstract class Trainer {
    abstract void Teach();
}

class Student extends Trainer {
    void Teach() {
        System.out.println("Training is going on");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.Teach();
    }
}
