import java.util.*;

public class seminar_3_homework {



    public static void main(String[] args) {
        //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(new Random().nextInt(30));
        list.add(new Random().nextInt(30));
        list.add(new Random().nextInt(30));
        //так и не понял, почему на семинаре for each изменял элементы, а у меня не изменяет, после цикла всё выводится без изменений
        System.out.println(list);

        //2. Итерация всех элементов списка цветов и добавления к каждому символа '!'
        String clrs = "Black White Red Green Yellow Blue Brown Orange Pink Purple Grey";
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(clrs.split(" ")));
        colors.replaceAll(s -> s + "!");
        System.out.println(colors);

        colors.add(0, "rainbow"); //3. Вставить элемент на первую позицию
        System.out.println(colors.get(3)); //4. Извлечь элемент по индексу
        colors.set(3, "Rat!"); //5. Обновить определенный элемент списка по заданному индексу
        System.out.println(colors);
        colors.remove(2); // 6. Удалить третий элемент из списка
        System.out.println(colors.indexOf("Rat!")); // 7. Поиск элемента в списке по строке
        ArrayList<String> newList = new ArrayList<>(colors.subList(2, 5)); // 8. Создать новый список и добавить в него несколько елементов первого списка
        Collections.sort(colors); // 10. Сортировка списка
        System.out.println(colors);
        colors.retainAll(newList); // 9. Удалить из первого списка все элементы отсутствующие во втором списке
        System.out.println(newList + "\n" + colors);
    }
}
