interface Person {
    String eat();
    default void sleep(){
        System.out.println("default");
    }// Метод с реализацией

}

interface Animall{
    void breath();

}
class Akmat implements Person, Animall {

    public String eat(){
        return "he is eating";
    }
    public void breath(){
        System.out.println("He is breathing");
    }



}

class Mainn{
    public static void main(String[] args) {
        Akmat akmat = new Akmat();
        akmat.sleep();
    }
}
