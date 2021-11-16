package Employee;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Homework_Labda_Exp
{
    public static void main(String[] args)
    {
        List<employee> companyList = employee.createShortList();

        //Predicates
        Predicate<employee> women = e -> e.getGender().equals(employee.Gender.FEMALE);
        Predicate<employee> dept = e -> e.getDept().equals("General Management");
        Predicate<employee> deptAndAge = e -> e.getDept().equals("General Management") && e.getAge() > 30;
        Predicate<employee> managers = e -> e.getRole().equals(Role.MANAGER);
        Predicate<employee> staff = e -> e.getRole().equals(Role.STAFF);

        // Lambda Expressions
        Consumer<employee> printEmployee = System.out::println;
        Function<List<employee>, employee> youngestInTeam = eList ->
                eList.stream()
                        .min(Comparator.comparing(employee::getAge))
                        .orElseThrow();
        Supplier<employee> employeeIgor = () -> new employee.Builder()
                .setGivenName("Igor")
                .setSurName("Ivanov")
                .setAge(40)
                .setGender(employee.Gender.MALE)
                .setRole(Role.MANAGER)
                .setDept("General Management")
                .setPhone("5489211")
                .setAddress("Rbs Street 31")
                .setCity("Moscow")
                .setCode("30")
                .build();
        BiPredicate<employee, Role> checkRole = (e, role) -> e.getRole().equals(role);

        printEmployee.accept(companyList.get(0));
        employee young = youngestInTeam.apply(companyList);
        System.out.println(young);
        System.out.println(employeeIgor.get());
        System.out.println(checkRole.test(companyList.get(1), Role.MANAGER));

        // Выплата премии женщинам сотрудникам
        System.out.println("=== women premium ===");
        companyList.stream()
                .filter(women)
                .forEach(Accountant::payPremium);
        System.out.println();

        // Выплата зарплаты сотрудникам определенного департамента
        System.out.println("=== particular dept wage ===");
        companyList.stream()
                .filter(dept)
                .forEach(Accountant::paySalary);
        System.out.println();

        // 	Выплата премии сотрудникам старше 30, работающим в определенном департаменте
        System.out.println("=== particular dept and age > 30 premium ===");
        companyList.stream()
                .filter(deptAndAge)
                .forEach(Accountant::payPremium);
        System.out.println();

        // Выплата зарплаты менеджерам
        System.out.println("=== managers wage ===");
        companyList.stream()
                .filter(managers)
                .forEach(Accountant::paySalary);
        System.out.println();

        // Выплата премии стаффу
        System.out.println("=== staff premium ===");
        companyList.stream()
                .filter(staff)
                .forEach(Accountant::payPremium);
        System.out.println();
    }
}