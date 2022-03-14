public class HomeWork {
    public static void main(String[] args){
        Employee [] emplArray = new Employee[5];
        emplArray[0] = new Employee("Чапанова Людмила Дмитриевна", "технолог","ludmila@mail.ru", "+98 524 25 36", 500000, 35);
        emplArray[1] = new Employee("Герасимов Александр Сергеевич", "ОТК", "alexandr@mail.ru", "947558565", 900000, 41);
        emplArray[2] = new Employee("Шкадова Татьяна Викторовна", "Бухгалтер", "tanya@mail.ru", "989963251", 2000000, 18);
        emplArray[3] = new Employee("Полторак Матвей Леонидович", "Финансист", "matvey@mail.ru", "998888888", 10000000, 50);
        emplArray[4] = new Employee("Тюгаева Альфия Владимировна", "Логист", "alfiya@mail.ru", "902135689", 5000000, 36);

    }
}
class Employee {
    private String full_name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String full_name, String position, String email, String phone, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        if (age > 40) {
            System.out.println("ФИО: " + full_name + "\n" +
                    "Должность: " +  position + "\n" +
                    "email: " + email + "\n" +
                    "Телефрнный номер: " + phone + "\n" +
                    "Оклад: " + salary +"\n" +
                    "Возраст: " + age);
        }

    }

}
