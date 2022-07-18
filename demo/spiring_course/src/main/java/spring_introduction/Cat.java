package spring_introduction;

public class Cat implements Pet {
    public Cat(){
        System.out.println("Cat BEAN is created");
    }
    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
