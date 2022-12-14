package polymophism;

public class MainPolymorphism {
    public static void main(String[] args) {

        Employee employee = new Employee("Umi");
        Manager manager = new Manager("Ahmad");
        VicePresident vicePresident = new VicePresident("Joko");

        // call method
        employee.sayHello();
        manager.sayHello();
        vicePresident.sayHello();
    }
}
