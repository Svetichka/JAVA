public class HumanDemo {

    public static void main(String[] args) {

        Human human1 = new Human();

        human1.setName("Aleksandr");

        human1.setSurename("Petrov");

        human1.setAge(25);

        human1.hello(human1);



        Human human2 = new Human("Petr", "Kuznecov", 35);

        human2.hello(human2);

    }

}
