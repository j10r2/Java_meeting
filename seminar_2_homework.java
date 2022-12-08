import java.util.Arrays;

public class seminar_2_homework {

    //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
    private static void stringEqual(String str1, String str2){
        StringBuilder stb1 = new StringBuilder(str1).reverse();
        StringBuilder stb2 = new StringBuilder(str2).reverse();
        if (str1.equals(stb2.toString())  && str2.equals(stb1.toString())) {
            System.out.println("вращай меня полностью");
        }
        else System.out.println("чёт не вращается");
    }

    //Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки
    private static String windowSearch(String str1, String str2){
        int [] indexes = new int[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            indexes[i] = str1.indexOf(str2.toCharArray()[i]);
        }
        Arrays.sort(indexes);
        return str1.substring(indexes[0], indexes[indexes.length-1]+1);
    }

    // Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59; 3 – 56 = -53; 3 * 56 = 168
    // Используем метод StringBuilder.append()
    private static String stringConstructor(int num1, int num2){
        StringBuilder [] exx = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        exx[0].append(num1).append("+").append(num2).append("=").append(num1+num2);
        exx[1].append(num1).append("-").append(num2).append("=").append(num1-num2);
        exx[2].append(num1).append("*").append(num2).append("=").append(num1*num2);
        return Arrays.toString(exx);
    }

    //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()
    private static String stringChanger(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 3; i++) {
            stringBuilder.replace(stringBuilder.indexOf("="), stringBuilder.indexOf("=")+1, "равно");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string1 = "я люблю свою маму";
        String string2 = "мясо";
        //stringEqual(string1, string2);
        System.out.println(windowSearch(string1, string2));
        int n1 = 3;
        int n2 = 56;
        System.out.println(stringConstructor(n1, n2));
        System.out.println(stringChanger(stringConstructor(n1, n2)));
    }
}
