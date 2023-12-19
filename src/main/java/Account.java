import static java.lang.System.*;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() < 3 || name.length() > 19) {
            System.out.println("Должно быть от 3 до 19 символов включительно!");
            return false;
        } else if (!name.trim().equals(name)) {
            System.out.println("Пробелы не должны быть в начале и конце строки!");
            return false;
        } else if (!name.contains(" ")) {
            System.out.println("Должен быть пробел!");
            return false;
        } else {
            System.out.println("Имя что надо!");
            return true;
        }


    }

}