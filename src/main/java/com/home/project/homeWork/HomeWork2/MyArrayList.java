package com.home.project.homeWork.HomeWork2;

public class MyArrayList {
    /**
     * поле отвечающее за объем динамического массива по умолчанию равное 10 элементам
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * поле отвечающие за храние всех элементов коллекции
     */
    transient Object[] elements;
    /**
     * поле-cчетчик, хранящее в себе количество действительно
     * находящихся в массиве элементов.
     * Значение поля меняется в слуяае изменения количества элементов массива.
     */
    private int counter;
    /**
     * конструктор без параментов, создающий пустой массив на 10 элементов
     */
    public MyArrayList() {
    this.elements = new Object[DEFAULT_CAPACITY];
    }
    /**
     * конструктор создающий списочный массив имеющий началную емкость.
     * если начальная емкость (initialCapacity) больше или равно 0,
     * то создается новый массив указанного размера.
     * Если initialCapacity меньше 0, то генерируется исключение
     * IIIegalArgumentException
     */
    public MyArrayList(int initialCapacity) {
    if (initialCapacity >= 0) {
        this.elements = new Object[initialCapacity];
    } else {
    throw new IllegalStateException("Начальная емкость (initialCapacity) не может быть меньше нулz");
    }

    }

}



