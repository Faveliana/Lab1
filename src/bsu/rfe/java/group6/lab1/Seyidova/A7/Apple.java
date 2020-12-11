package bsu.rfe.java.group6.lab1.Seyidova.A7;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;
    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Apple");
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съеден");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределѐнная версия метода equals(),при сравнении
// учитывает поле name (Шаг 1) и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая
// название продукта и его размер
    public String toString() {
        return super.toString() + " size '" + size.toUpperCase() + "'";
    }
}

