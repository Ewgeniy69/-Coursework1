public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 10000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 250000);
        employees[3] = new Employee("Добров Дмитрий Дмитриевич", 4, 120000);
        employees[4] = new Employee("Атаев Атай Атаевич", 5, 30000);
        employees[5] = new Employee("Даунов Зелемхан Петрович", 2, 1000);
        employees[6] = new Employee("Нетуда Антон Викторович", 3, 50000);
        employees[7] = new Employee("Студентов Роман Алхимович", 4, 40000);
        employees[8] = new Employee("Добрыйвечер Константин Евгеньевич", 5, 60000);
        employees[9] = new Employee("Непомнящий Егор Гусейнович", 1, 70000);

        printAll();
        System.out.println("Сумма затрат на ЗП сотрудникам = " + addUpTheSumSalary());
        System.out.println("Сотрудник с минимальной ЗП - " + findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной ЗП - " + findEmployeeMaxSalary());
        System.out.println("Средняя ЗП сотрудника - " + addAverageOfSalary());
        printAllNames();
    }

    // Получаем список всех сотрудников со всеми имеющимися по ним данными (значения всех полей (toString));
    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Считаем сумму затрат на ЗП в месяц;

    private static int addUpTheSumSalary() {
        int sum = 0;
        for (Employee employees : employees) {
            sum += (int) employees.getSalary();
        }
        return sum;

    }
    // Сотрудник с минимальной ЗП;

    private static Employee findEmployeeMinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    // Сотрудник с максимальной ЗП;

    private static Employee findEmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    // Подсчет среднего значения зарплат сотрудников;
    private static double addAverageOfSalary() {
        return (double) addUpTheSumSalary() / employees.length;
    }
    //Распечатываем ФИО всех сотрудников;

    private static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}








