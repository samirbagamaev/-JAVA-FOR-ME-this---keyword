package WORK;

public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("TOM");
        human1.getInfo();  //ОТВЕТ: TOM,18

        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("BOB");
        human2.getInfo();  //ОТВЕТ: BOB,25
    }
}

//ОТВЕТ:
// TOM,18
// BOB,25
