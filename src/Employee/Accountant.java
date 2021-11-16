package Employee;

public class Accountant
{
    public static void paySalary(employee Employee)
    {
        System.out.println(Employee.getSurname() + ' ' +  Employee.getName() + ',' +
                " you received your month wage: " +  Employee.getRole().getSalary() + 'K');
    }

    public static void payPremium(employee Employee)
    {
        double premium = Employee.getRole().getPremium() * Employee.getRole().getSalary();
        System.out.println(Employee.getSurname() + ' ' +  Employee.getName() + ',' +
                " you received premium: " +  premium + 'K');
    }
}

//Выплату зарплаты реализовать через вывод в консоль сообщения о выплате
//Выплату премии реализовать через вывод в консоль сообщения о выплате. Процент премии хранится в enum role (STAFF = 10%, MANAGER = 20%, EXECUTIVE = 30%)