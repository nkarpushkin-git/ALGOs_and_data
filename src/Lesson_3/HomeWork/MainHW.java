package Lesson_3.HomeWork;

public class MainHW {
    public static void main(String[] args) {

        MyDeck deck = new MyDeck(12);

//        deck.insertLeft(1);
//        deck.insertLeft(2);
//        deck.insertLeft(3);
//        deck.insertLeft(4);
//        deck.insertLeft(5);
//        deck.insertFront(6);
//        deck.insertFront(7);
//        deck.insertFront(8);
//        deck.insertFront(9);
//        deck.insertFront(10);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(deck.removeLeft());
//            System.out.println(deck.removeRight());
//        }


//        deck.insertRear(1);
//        deck.insertRear(2);
//        deck.insertRear(3);
//        deck.insertRear(4);
//        deck.insertRear(5);
//        deck.insertRight(6);
//        deck.insertRight(7);
//        deck.insertRight(8);
//        deck.insertRight(9);
//        deck.insertRight(10);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(deck.removeRight());
//            System.out.println(deck.removeLeft());
//        }

//        for (int i = 0; i < 4; i++) {
//            System.out.println(deck.removeFront());
//            System.out.println(deck.removeFront());
//            System.out.println(deck.removeRear());
//            System.out.println(deck.removeRear());
//        }

        // Читаем строку в обратном порядке
        String s = "Hello World!";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            deck.insertLeft(ch[i]);
        }

        for (int i = 0; i < 12; i++) {
            System.out.print(deck.removeRight());
        }

    }


}
