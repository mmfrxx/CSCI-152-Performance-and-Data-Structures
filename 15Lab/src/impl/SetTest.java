/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import static impl.Seperateclass.intersection;
import static impl.Seperateclass.isSubset;
import static impl.Seperateclass.union;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class SetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Student> students = new LLQueueSet();
        try {
            students.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(students + "\nSize" + students.getSize());

        students.add(new Student(1234, "Aya"));
        students.add(new Student(1267, "Arailym"));
        students.add(new Student(1567, "Zhadyra"));
        students.add(new Student(5090, "Aygerim"));
        students.add(new Student(1233, "Gulnar"));
        System.out.println(students + "\nSize" + students.getSize());

        Student std = new Student(1567, "Zhadyra");
        students.remove(std);
        System.out.println(students + "\nSize" + students.getSize());

        std = new Student(1567, "Zhadyra");
        students.remove(std);
        System.out.println(students + "\nSize" + students.getSize());

        students.add(new Student(5090, "Aygerim"));
        students.add(new Student(1233, "Gulnar"));
        System.out.println(students + "\nSize" + students.getSize());

        students.add(new Student(5080, "Aygerim"));
        students.add(new Student(5090, "Aigerim"));
        students.add(new Student(5560, "Zhadyra"));
        System.out.println(students + "\nSize" + students.getSize());

        try {
            System.out.println(students.removeAny());
        } catch (Exception ex) {
        }
        try {
            System.out.println(students.removeAny());
        } catch (Exception ex) {
        }
        System.out.println(students + "\nSize" + students.getSize());

        students.clear();
        System.out.println(students + "\nSize" + students.getSize());
        
        students.add(new Student(5090, "Aigerim"));
        students.add(new Student(5560, "Zhadyra"));
        System.out.println(students + "\nSize" + students.getSize());
        System.out.println("Next task!!!!!!!!!!!!!");
        Set<Student> student = new LLStackSet();
        try {
            student.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(student + "\nSize" + student.getSize());

        student.add(new Student(1234, "Aya"));
        student.add(new Student(1267, "Arailym"));
        student.add(new Student(1567, "Zhadyra"));
        student.add(new Student(5090, "Aygerim"));
        student.add(new Student(1233, "Gulnar"));
        System.out.println(student + "\nSize" + student.getSize());

        Student stud = new Student(1567, "Zhadyra");
        student.remove(stud);
        System.out.println(student + "\nSize" + student.getSize());

        stud = new Student(1567, "Zhadyra");
        student.remove(stud);
        System.out.println(student + "\nSize" + student.getSize());

        student.add(new Student(5090, "Aygerim"));
        student.add(new Student(1233, "Gulnar"));
        System.out.println(student + "\nSize" + student.getSize());

        student.add(new Student(5080, "Aygerim"));
        student.add(new Student(5090, "Aigerim"));
        student.add(new Student(5560, "Zhadyra"));
        System.out.println(student + "\nSize" + student.getSize());

        try {
            System.out.println(student.removeAny());
        } catch (Exception ex) {
        }
        try {
            System.out.println(student.removeAny());
        } catch (Exception ex) {
        }
        System.out.println(student + "\nSize" + student.getSize());

        student.clear();
        System.out.println(student + "\nSize" + student.getSize());
        
        student.add(new Student(5090, "Aigerim"));
        student.add(new Student(5560, "Zhadyra"));
        System.out.println(student + "\nSize" + student.getSize());
        
        Set<Integer> numbers = new LLQueueSet();
        Set<Integer> numbers1 = new LLQueueSet();
        
        numbers.add(55);
        numbers.add(35);
        numbers.add(135);
        numbers.add(45);
        numbers.add(65);
        
        numbers1.add(45);
        numbers1.add(35);
        
        System.out.println(isSubset(numbers1, numbers));
        
        
         Set<String> names = new LLQueueSet();
        Set<String> names1 = new LLQueueSet();
        names1.add("Aya");
        names1.add("Masha");
        names1.add("Dasha");
        names1.add("Pasha");
        names1.add("Sasha");
        
        names.add("Aya");
        names.add("Kolya");
        names.add("Dasha");
        names.add("Artem");
        names.add("Katya");
        
        System.out.println(union(names1, names));
        
        Set<Integer> numbers2 = new LLQueueSet();
        Set<Integer> numbers3 = new LLQueueSet();
        
        numbers2.add(55);
        numbers2.add(35);
        numbers2.add(135);
        numbers2.add(45);
        numbers2.add(65);
        
        numbers3.add(45);
        numbers3.add(35);
        numbers3.add(25);
        numbers3.add(65);
        numbers3.add(15);
        
        System.out.println(intersection(numbers2, numbers3));
        
        Set<Integer> seet = new BSTSet();
        seet.add(5);
        seet.add(12);
        seet.add(3);
        seet.add(6);
        seet.add(14);
        seet.add(2);
        seet.add(-6);
        seet.add(8);
        seet.add(0);
        System.out.println(seet);
        seet.add(14);
        seet.add(-6);
        seet.add(5);
        System.out.println(seet);
        System.out.println(seet.contains(12));
        System.out.println(seet);
        System.out.println(seet.contains(7));
        System.out.println(seet.contains(2));
        System.out.println(seet.contains(-8));
        System.out.println(seet.contains(5));
        seet.clear();
        System.out.println(seet);
         seet.add(55);
        seet.add(24);
        seet.add(78);
        seet.add(51);
        System.out.println(seet);
        
        Set<Student> stdset = new BSTSet();
        stdset.add(new Student(1234, "Aya"));
        stdset.add(new Student(1267, "Arailym"));
        stdset.add(new Student(1567, "Zhadyra"));
        stdset.add(new Student(5090, "Aygerim"));
        stdset.add(new Student(1233, "Gulnar"));
        System.out.println(stdset);

        

        

        stdset.add(new Student(5090, "Aygerim"));
        stdset.add(new Student(1233, "Gulnar"));
        System.out.println(stdset);

        stdset.add(new Student(5080, "Aygerim"));
        stdset.add(new Student(5090, "Aigerim"));
        stdset.add(new Student(1567, "Zhadyra"));
        System.out.println(stdset);

        

        stdset.clear();
        System.out.println(stdset);
        
        stdset.add(new Student(5090, "Aigerim"));
        stdset.add(new Student(5560, "Zhadyra"));
        System.out.println(stdset );
    }
    
}
