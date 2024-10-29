import java.util.ArrayList;
import java.util.List;

public class RollingAverage {

    /** strong>* Метод для вычисления средних значений подмассивов длиной k
     * @param arr массив целых чисел
     * @param k длина подмассивов
     * @return список средних значений подмассивов
     */
    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        int n = arr.size(); // Получаем размер массива

        // Проверка на допустимость значения k
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("k должно быть положительным и меньше или равно размеру массива.");
        }
        // Создаём список result типа Double, который будет хранить средние значения каждого подмассива.
        List<Double> result = new ArrayList<>();

        // Проход по массиву с использованием индекса i
        // Условие i <= arr.size() - k гарантирует, что мы не выйдем за пределы массива,
        // когда будем извлекать подмассивы длиной k.
        for (int i = 0; i <= arr.size() - k; i++) {
            //Для каждого подмассива мы создаём переменную sum, которая инициализируется нулём.
            double sum = 0; // Переменная для суммирования элементов подмассива

            // Суммируем элементы подмассива длиной k
            //Внутренний цикл for проходит по k элементам, начиная с индекса i, и добавляет их значения к sum.
            for (int j = 0; j < k; j++) {
                sum += arr.get(i + j); // Добавляем текущий элемент подмассива к сумме
            }

            // Вычисляем среднее значение и добавляем в результат
            result.add(sum / k);
        }

        // Возвращаем список с результатами, содержащий средние значения.
        return result;
    }
}