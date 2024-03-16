public class Main {
    public static void main(String[] args) {
        // Создание объекта IntContainer
        IntContainer container = new IntContainer();

        // Добавление элементов в конец
        container.addToEnd(10);
        container.addToEnd(20);
        container.addToEnd(30);

        // Вывод всех элементов контейнера
        container.printAllElements();

        // Получение элемента по индексу
        System.out.println("Элемент по индексу 1: " + container.getByIndex(1));

        // Добавление элемента в начало
        container.addToStart(5);

        // Вывод всех элементов контейнера после добавления в начало
        container.printAllElements();

        // Удаление элемента из конца
        container.removeFromEnd();

        // Вывод всех элементов контейнера после удаления из конца
        container.printAllElements();

        // Удаление элемента из начала
        container.removeFromStart();

        // Вывод всех элементов контейнера после удаления из начала
        container.printAllElements();

        // Удаление всех элементов
        container.removeAll();

        // Вывод всех элементов контейнера после удаления всех элементов
        container.printAllElements();
    }
}
