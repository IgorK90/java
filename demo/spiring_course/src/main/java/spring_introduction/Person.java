package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person : set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person : set Age");
        this.age = age;
    }

    /*
        public Person(Pet pet) {
            System.out.println("Person BEAN is created");
            this.pet = pet;
        }
    */
    public Person(){
        System.out.println("Person bean is created");
    }
    // property name  интерпретируется в pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
