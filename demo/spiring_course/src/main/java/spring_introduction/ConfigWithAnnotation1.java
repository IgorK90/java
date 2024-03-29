package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        /*Cat myCat = context.getBean("catBean",Cat.class);
        myCat.say();*/
        /*Cat myCat = context.getBean("cat",Cat.class); // без beanId
        myCat.say();*/

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
