import java.util.*;

class Main {
    public static void main(String[] args) {
        DataManipulation dataManipulation = new DataManipulation();
        List<Map<String, String>> table = new ArrayList<>();

        table.add(dataManipulation.AddDataToList("Кирилл","26", "Middle java dev", "150 000 руб"));
        table.add(dataManipulation.AddDataToList("Виталий","28", "Senior java automation QA", "2000$"));
        table.add(dataManipulation.AddDataToList("Александр","31", "junior functional tester", "50 000 руб"));
        table.add(dataManipulation.AddDataToList("Дементий","35", "dev-ops", "1500$"));

        System.out.println("1. Имена сотрудников младше 30: ");
        dataManipulation.NamesOfEmployeesUnder30(table);

        System.out.println("2. Имена сотрудников, получающих зарплату в рублях: ");
        dataManipulation.EmployeesWithRubSalaries(table);

        System.out.println("3. Средний возраст всех сотрудников: ");
        dataManipulation.MiddleAgeOfEmployees(table);
    }
}
