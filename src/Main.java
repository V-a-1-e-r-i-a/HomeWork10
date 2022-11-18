public class Main {
    public static void main(String[] args) {


        //Задание1
        System.out.println("Задание 1");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника -  " + fullName);

        //Задание 2
        System.out.println("Задание 2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета  — " + fullNameUpper);

        //Задание 3
        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "  +  fullName2);
    }
}