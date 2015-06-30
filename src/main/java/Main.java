import com.simple.entity.Department;
import com.simple.entity.Employee;
import com.simple.entity.Info;
import com.simple.entity.Person;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;

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

        person.setInfo(info1);

        employee.setInfo(info2);

        employee.setInfo(info2);

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

        Department d = (Department) session.get(Department.class, 1L);
        for(Person p : d.getPersons()){
            System.out.println(p.getDepartment().getDepartmentName());
        }
        session.close();
    }
}
