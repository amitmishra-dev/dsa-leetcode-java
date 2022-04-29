package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> empList= new ArrayList<>();
        List<Address> addList= new ArrayList<>();
        Address address1 = new Address(20000, "bcbb" );
        Address address2 = new Address(30000, "bbac" );
        Address address3 = new Address(40000, "bbbc" );
        addList.add(address1);
        addList.add(address2);
        addList.add(address3);

        empList.add(new Employee(1,"amit",20,50,addList));
        empList.add(new Employee(2,"Ankit",25,40));
        empList.add(new Employee(11,"prem",48,40));
        empList.add(new Employee(13,"ajit",18,80));
        empList.add(new Employee(14,"arun",49,40));



        empList.get(0).getAddressList().stream().sorted((o1, o2) -> o1.getStreet().compareTo(o2.getStreet()));

        System.out.println("\n================***********************");
        //filter All whose age > 40
        empList.stream().filter(e->e.getAge()>40).collect(Collectors.toList()).forEach(System.out::println);

        //map all id to list
        empList.stream().map(e->e.getId()).collect(Collectors.toList()).forEach(System.out::println);

        //sort
        empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("***********************");

        //compare
        empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("\n\n ***********************");
        Map<String, List<Employee>> l=empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed()).collect(Collectors.groupingBy(Employee::getName));
        l.forEach((s, employees) -> {
            System.out.println(s);
            employees.stream().forEach(System.out::println);
            System.out.println("**********");
        });
    }
}
