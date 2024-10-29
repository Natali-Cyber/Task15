import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // Создаём пример массива целых чисел
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        // Определяем значение k, равное 2, что обозначает, что мы будем вычислять средние значения для подмассивов длиной 2.
        int k = 2;

        // Вызываем метод getRollingAverage для получения результата,
        // передавая наш массив arr и значение k, а затем сохраняем результаты в переменной res.
        List<Double> res = RollingAverage.getRollingAverage(arr, k);

        // Выводим результат на экран
        System.out.println(res); // Ожидаемый вывод: [1.5, 2.5, 4.0]
    }
}