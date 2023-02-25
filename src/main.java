import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("***** Задание 1 *****");
        System.out.println();
/*
Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
Напишите четыре строки:
первая с именем firstName — для хранения имени;
вторая с именем middleName — для хранения отчества;
третья с именем lastName — для хранения фамилии;
четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
Выведите в консоль фразу: “ФИО сотрудника — ….”
В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
- Критерии оценки
        – Строки инициализированы верно.
        – Сложение строк проведено корректно.
        – При изменении данных в строках результат программы выводится корректно.
        – Все условия задания выполнены.
 */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;

        System.out.println("FIO sotrudnika = " + fullName);

        System.out.println();
        System.out.println("***** Задание 2 *****");
        System.out.println();
/*
Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников, полностью
написанные заглавными буквами (верхним регистром). Напишите программу, которая изменит написание Ф. И. О. сотрудника
с “Ivanov Ivan Ivanovich” на полностью заглавные буквы. В качестве строки с исходными данными используйте строку
fullName. Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
- Критерии оценки
        – Применен метод, меняющий регистр символов строки.
        – При изменении содержания строки результат программы выполняется.
        – Результат программы выведен в консоль согласно условиям задачи.
 */
        String fullNameForAccountsDepartment = fullName.toUpperCase();
        System.out.println("Dannie FIO sotrudnika dly zapolneniy otcheta = " + fullNameForAccountsDepartment);

        System.out.println();
        System.out.println("***** Задание 3 *****");
        System.out.println();
/*
Система, в которой мы работаем, не принимает символ “ё”.
Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
- **Подсказка**
        Может потребоваться метод split() и метод contains().
    - Критерии оценки
        – Применен метод, меняющий написание данных строки.
        – При изменении содержания строки результат программы выполняется.
        – Результат программы выведен в консоль согласно условиям задачи.
 */

        String fullName3 = "Ivanov Semёn Semёnovich";
        fullName3 = fullName3.replace("ё", "e");
        System.out.println("Dannie FIO sotrudnika = " + fullName3);


        System.out.println();
        System.out.println("***** Повышенная сложность. Задание 5 *****");
        System.out.println();
        /*
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
**Важно**:
«в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
- **Подсказка**
    Определить индексы символов помогут методы indexOf() и lastIndexOf().
- Критерии оценки
    – При изменении содержания строки результат программы выполняется.
    – Программа решена с помощью метода substring().
    – Результат программы выведен в консоль согласно условиям задачи.
         */
        int indexSpace1 = fullName.indexOf(' ');
        int indexSpace2 = fullName.lastIndexOf(' ');
        int fullNameLength = fullName.length();
        String firstName5 = fullName.substring(indexSpace1 + 1, indexSpace2);
        String lastName5 = fullName.substring(0, indexSpace1);
        String middleName5 = fullName.substring(indexSpace2 + 1, fullNameLength);

        System.out.println("Имя сотрудника — " + firstName5);
        System.out.println("Фамилия сотрудника — " + lastName5);
        System.out.println("Отчество сотрудника — " + middleName5);

        System.out.println();
        System.out.println("***** Повышенная сложность. Задание 6 *****");
        System.out.println();
        /*
Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
в правильный формат. В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
которые нужно преобразовать в “Ivanov Ivan Ivanovich”. Выведите результат программы в консоль в формате:
“Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
- **Подсказка 1**
        Метод toCharArray() может быть полезен.
    - **Подсказка 2**
        Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
    - Критерии оценки
        – Применен метод, меняющий написание данных строки.
        – При изменении содержания строки результат программы выполняется.
        – Результат программы выведен в консоль согласно условиям задачи.
         */
        String fullName6 = fullName.toLowerCase();
        System.out.println("Исходные данные - " + fullName6);
        char[] array = fullName6.toCharArray();
        for (int i = 0; i < array.length; i++)
            array[0] = Character.toUpperCase(array[0]);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == ' ') {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
        }
        fullName6 = new String(array);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName6);

        System.out.println();
        System.out.println("***** Повышенная сложность. Задание 7 *****");
        System.out.println();
        /*
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
- **Подсказка**
        Следует использовать StringBuilder.
    - Критерии оценки
        – Применен метод, меняющий написание данных строки.
        – При изменении содержания строки результат программы выполняется.
        – Результат программы выведен в консоль согласно условиям задачи.
         */
        String first = "135";
        String second = "246";
        char[] arrayFirst = first.toCharArray();
        char[] arraySecond = second.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayFirst.length; i++) {
            result.append(arrayFirst[i]);
            result.append(arraySecond[i]);
        }
        System.out.println("Данные строки — " + result);

        System.out.println();
        System.out.println("***** Повышенная сложность. Задание 8 *****");
        System.out.println();
    /*
Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
- Критерии оценки
     – Данные в строке отсортированы корректно.
     – При изменении содержания строки результат программы выполняется.
     – Результат программы выведен в консоль согласно условиям задачи.
    */
        String withDuplicates = "aabccddefgghiijjkk";
        char[] arrayDuplicates = withDuplicates.toCharArray();
        Arrays.sort(arrayDuplicates);
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < arrayDuplicates.length - 1; i++) {
                if (arrayDuplicates[i] == arrayDuplicates[i + 1]) {
                    duplicates.append(arrayDuplicates[i]);
                }
            }
        System.out.println("Дублируемые — " + duplicates);
    }
}