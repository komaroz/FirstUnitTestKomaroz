package Selllll;


public class Lashadka {
    private String name = "Cesar";
    private int age;
    private boolean isHungry;

    public String sayHello() {
        return "Hello, I'm a horse. My name is" + name;
    }

    public void renameLashadka( String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Lashadka lashadka = new Lashadka();
        System.out.println(lashadka.sayHello());
        lashadka.renameLashadka("Julij Cesar");
        System.out.println(lashadka.sayHello());


    }
}