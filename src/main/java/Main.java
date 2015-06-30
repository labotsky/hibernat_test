import com.simple.entity.*;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Person person = new Person("Steve", "Balmer");
        Employee employee = new Employee("James", "Gosling", new Date(), "Marketing");

        Info info1 = new Info();
        info1.setInformation("Information1");

        Info info2 = new Info();
        info2.setInformation("Information2");

        Set<Info> infos = new HashSet<Info>();
        infos.add(info1);
        infos.add(info2);


        person.setInfo(info1);

        employee.setInfo(info2);

        employee.setInfo(info2);

        Category c1 = new Category();
        c1.setName("Cat1");
        c1.setDescription("cat1 descr");

        Category c2 = new Category();
        c2.setName("Cat2");
        c2.setDescription("cat2 descr");

        Set<Category> categories = new HashSet<Category>();
        categories.add(c1);
        categories.add(c2);

        info2.getCategories().add(c1);
        c2.getInfos().add(info1);

        session.save(c1);
        session.save(c2);

        Department d1 = new Department();
        d1.setDepartmentName("Sales");

        Department d2 = new Department();
        d2.setDepartmentName("Gales");

        person.setDepartment(d1);
        employee.setDepartment(d1);

        d1.setPersons(new ArrayList<Person>());
        d1.getPersons().add(person);
        d1.getPersons().add(employee);

        session.save(d1);

        session.getTransaction().commit();
        session.close();
    }
}
