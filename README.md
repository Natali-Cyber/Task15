# Rolling Average Calculator

Данный проект представляет собой Java-программу для вычисления средних значений подмассивов фиксированной длины в заданном массиве целых чисел.

## Структура проекта

### 1. Классы

#### RollingAverage

- <strong>Описание</strong>: Класс, содержащий метод для вычисления средних значений подмассивов.
- <strong>Методы</strong>:
    - <code>public static List&lt;Double&gt; getRollingAverage(ArrayList&lt;Integer&gt; arr, int k)</code>
        - <strong>Параметры</strong>:
            - <code>ArrayList&lt;Integer&gt; arr</code>: массив целых чисел.
            - <code>int k</code>: длина подмассивов для вычисления средних значений.
        - <strong>Возвращает</strong>: Список средних значений подмассивов длиной <code>k</code>.
        - <strong>Логика</strong>: Проходит по массиву, суммирует элементы каждого подмассива длиной <code>k</code>, затем делит сумму на <code>k</code> для получения среднего значения и добавляет результат в список.

#### Main

- <strong>Описание</strong>: Главный класс, содержащий метод <code>main</code>, точка входа в программу.
- <strong>Методы</strong>:
    - <code>public static void main(String[] args)</code>
        - <strong>Логика</strong>:
            - Создает пример массива целых чисел.
            - Устанавливает длину подмассива <code>k</code>.
            - Вызывает метод <code>getRollingAverage</code> из класса <code>RollingAverage</code> для получения результатов.
            - Выводит список средних значений на экран.
