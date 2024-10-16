import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DataManipulation {

    Map<String, String> AddDataToList(String name, String age, String position, String salary) {
        Map<String, String> tableMap = new HashMap<>();
        tableMap.put("Имя", name);
        tableMap.put("Возраст", age);
        tableMap.put("Должность", position);
        tableMap.put("Зарплата", salary);

        return tableMap;
    }

    void NamesOfEmployeesUnder30(List<Map<String, String>> table){
        for (Map<String, String> map : table) {
            int age = Integer.parseInt(map.get("Возраст"));
            if (age < 30) {
                System.out.println(map.get("Имя"));
            }
        }
    }

    void EmployeesWithRubSalaries(List<Map<String, String>> table){
        for (Map<String, String> map : table) {
            if(map.get("Зарплата").contains("руб")){
                System.out.println(map.get("Имя"));
            }
        }
    }

    void MiddleAgeOfEmployees(List<Map<String, String>> table){
        int ageSum = 0;
        for (Map<String, String> map : table) {
            int age = Integer.parseInt(map.get("Возраст"));
            ageSum += age;
        }
        System.out.println(ageSum / table.size());
    }
}
