package org.example;

public class Main {
    public static void main (String[] args) {
        StringListImpl list=new StringListImpl();
        // 1
        System.out.println("_____задача 1:_________");

          System.out.println("Добавленный элемент -"+ list.add("Привет"));
          System.out.println("Добавленный элемент -"+ list.add("Привет1"));
          System.out.println("Добавленный элемент -"+ list.add("Привет2"));
          System.out.println("Добавленный элемент -"+ list.add("Привет3"));
          System.out.println("Добавленный элемент -"+ list.add("Привет4"));
           System.out.println("всего элементов "+list.size());
                list.getAll();


        System.out.println("_____задача 2:_________");
          System.out.println("Новый элемент "+list.add(3,"элемент по задаче 2"));
                 list.getAll();

        System.out.println("_____задача 3:_________");
        System.out.println("Переписан элемент по задачи 3: "+list.set(3,"новый элемент"));
        list.getAll();

        System.out.println("_____задача 4:_________");
        System.out.println(list.remove("Привет3"));
        list.getAll();

        System.out.println("_____задача 5:_________");
        System.out.println(list.remove(6));
        list.getAll();



    }


}