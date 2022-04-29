package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Mapoperations {
    public static void main(String[] args) {
        HashMap<Employee,Integer> employeeAgeHashMap= new HashMap<>();
        //HashMap<Employee,Integer> employeeAgeHashMap= new LinkedHashMap<>();
        employeeAgeHashMap.put(new Employee(2,"Ankit",35,40),40);
        employeeAgeHashMap.put(new Employee(1,"Amit",25,48),20);
        employeeAgeHashMap.put(new Employee(12,"Ajit",22,900),21);
        employeeAgeHashMap.put(new Employee(22,"Ankita",45,40),50);


        LinkedHashMap<Employee,Integer> linkedHashMap=employeeAgeHashMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() >= o1.getValue() ? 1:-1).collect(Collectors.toMap(
                Map.Entry::getKey,Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
        linkedHashMap.entrySet().stream().forEach(System.out::println);

        System.out.println("=======================");

        LinkedHashMap<Employee,Integer> linkedHashMapBasedOnAge=employeeAgeHashMap.entrySet().stream().sorted((o1, o2) -> o2.getKey()
                .getAge() >= o1.getKey()
                .getAge() ? 1:-1).collect(Collectors.toMap(
                Map.Entry::getKey,Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
        linkedHashMapBasedOnAge.entrySet().stream().forEach(System.out::println);

        System.out.println("==============filter on sorted map=========");

        employeeAgeHashMap.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo((e1.getValue()))).filter(employeeIntegerEntry -> employeeIntegerEntry.getValue()>30).distinct().forEach(
                System.out::println);

        System.out.println("==============PRINT random KEYSET=========");
        Object[] arr=employeeAgeHashMap.keySet().stream().toArray();
        System.out.println(employeeAgeHashMap.get(arr[new Random().nextInt(arr.length)]));
        Arrays.stream(arr).forEach(System.out::println);
    }
}
