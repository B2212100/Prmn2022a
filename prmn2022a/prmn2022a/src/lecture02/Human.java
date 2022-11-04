package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {

        if (age <= 18) {
            System.out.println(this.name + " (生徒) " + this.age + "歳");
        } else if (age <= 22) {
            System.out.println(this.name + " (学生) " + this.age + "歳");
        } else {
            System.out.println(this.name + " " + this.age + "歳");
        }
        return;
    }
}
