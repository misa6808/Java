public class Main {
    public static void main(String[] args) {
        // Пример вызова метода для первой задачи
        printOddNumbers();

        // Пример вызова метода для второй задачи
        int[][] array = createArray();
        printArray(array);
        swapDiagonal(array);
        System.out.println("После перестановки элементов через диагональ:");
        printArray(array);

        // Пример вызова метода для третьей задачи
        int[][] array2 = createArray();
        printArray(array2);
        swapReverseDiagonal(array2);
        System.out.println("После перестановки элементов через обратную диагональ:");
        printArray(array2);
    }

    // Метод для сохранения всех нечетных чисел от 0 до 100 и их вывода в одну строку
    public static void printOddNumbers() {
        int[] oddNumbers = new int[51]; // В массиве будет 51 элемент (максимальное количество нечетных чисел от 0 до 100)
        int index = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }
        // Вывод элементов массива в одной строке
        for (int i = 0; i < index; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }

    // Метод для создания двумерного массива и заполнения его числами от 1 до 16
    public static int[][] createArray() {
        int[][] array = new int[4][4];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num;
                num++;
            }
        }
        return array;
    }

    // Метод для вывода двумерного массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Метод для перестановки элементов массива через диагональ (левый верхний - правый нижний)
    public static void swapDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    // Метод для перестановки элементов массива через обратную диагональ (левый нижний - правый верхний)
    public static void swapReverseDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i - 1; j++) {
                int temp = array[i][j];
                array[i][j] = array[array.length - 1 - j][array.length - 1 - i];
                array[array.length - 1 - j][array.length - 1 - i] = temp;
            }
        }
    }
}