class Student {
    String name;
    int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void display() {
        System.out.println("Student Details:\nName: " + name + "\nRoll Number: " + rollNumber + "\nGrade: " + grade);
    }

    public static void main(String[] args) {
        new Student("Ramya", 156, 'A').display();
    }
}
