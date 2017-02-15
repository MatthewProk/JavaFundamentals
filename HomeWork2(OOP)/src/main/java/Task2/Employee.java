package Task2;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int age;
    private ArrayList<Tool> list = new ArrayList<Tool>();


    private Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Функция считает общую стоимость всех инструментов у одного товарища.
     */
    private static double sum(ArrayList<Tool> tool){
        double sum = 0;
        for(Tool tl:tool){
            sum += tl.getWorth();
        }
        return sum;
    }


    private void oString(ArrayList<Tool> tool) {
        System.out.println("Стоимость всех концелярских товаров: " + sum(tool));
    }

    /**
     * Метод добавляет один инструмент к определенному товарищу.
     */
    private static void addTools(ArrayList<Tool> l, Tool tool){
        l.add(tool);
    }

    /**
     * Метод забирает один инструмент у определенного товарища.
     */
    private static void removeTools(ArrayList<Tool> l, Tool tool){
        l.remove(tool);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 50);
        Employee employee2 = new Employee("Merc", 45);
        Tool tool1 = new Tool("pen", 55);
        Tool tool2 = new Tool("pencil", 104);
        Tool tool3 = new Tool("erase", 111);
        Tool tool4 = new Tool("pencil", 321);
        addTools(employee1.list, tool1);
        addTools(employee1.list, tool2);
        addTools(employee1.list, tool3);
        addTools(employee2.list, tool4);
        employee1.oString(employee1.list);
        removeTools(employee1.list, tool3);
        employee1.oString(employee1.list);
    }

}

