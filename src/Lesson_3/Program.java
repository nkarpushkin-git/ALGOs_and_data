package Lesson_3;

import java.util.ArrayDeque;

public class Program {

    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // Добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем в конец коллекции
        states.add("Italy");

        // Получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);
        // Получаем последний элемень без удаления
        String sLast = states.getLast();
        System.out.println(sLast); // Italy

        System.out.printf("Queue size: %d \n", states.size()); //5

        // перебор коллекции
        while (states.peek() != null){
            // извлечение с начала
            System.out.println(states.pop());
        }

        // Очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for (Person p : people){
            System.out.println(p.getName());
        }
    }
}

class Person{
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName(){
        return name;
    }
}