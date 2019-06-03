/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

/**
 *
 * @author As
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListSortedQueue<Integer> SQ = new LinkedListSortedQueue();
        int k = 5;

        SQ.insert(90);
        SQ.insert(80);
        SQ.insert(70);
        SQ.insert(60);
        SQ.insert(50);
        SQ.insert(40);
        SQ.insert(30);
        SQ.insert(20);
        SQ.insert(10);

        System.out.println(SQ);
        System.out.println(SQ.getSize());
        try {
            SQ.dequeue();
            SQ.dequeue();
            SQ.dequeue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(SQ);
        System.out.println(SQ.getSize());

        SQ.insert(100);
        SQ.insert(200);
        SQ.insert(300);
        SQ.insert(400);
        SQ.insert(500);
        SQ.insert(600);
        SQ.insert(700);
        SQ.insert(800);
        SQ.insert(900);
        System.out.println(SQ);
        System.out.println(SQ.getSize());

        try {
            SQ.dequeue();
            SQ.dequeue();
            SQ.dequeue();
            SQ.dequeue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(SQ);
        System.out.println(SQ.getSize());

        for (int i = 0; i < 92; i++) {
            SQ.insert(k);
            k += 10;
        }
        System.out.println(SQ);
        System.out.println(SQ.getSize());

        int integer = SQ.getSize();
        for (int i = 0; i < integer; i++) {
            try {
                SQ.dequeue();
            } catch (Exception ex) {

            }
        }

        System.out.println(SQ);
        System.out.println(SQ.getSize());
        SQ.insert(56);
        SQ.insert(35);
        SQ.insert(79);
        System.out.println(SQ);
        System.out.println(SQ.getSize());
        SQ.clear();
        System.out.println(SQ);
        System.out.println(SQ.getSize());
        SQ.insert(56);
        SQ.insert(35);
        SQ.insert(79);
        SQ.insert(86);
        SQ.insert(25);
        SQ.insert(99);
        System.out.println(SQ);
        System.out.println(SQ.getSize());

        LinkedListSortedQueue<Student> std = new LinkedListSortedQueue();
        Student std1 = new Student(10, "Dasha");
        Student std2 = new Student(13, "Dasha");
        Student std3 = new Student(16, "Daqha");
        Student std4 = new Student(15, "Dasra");

        LinkedListSortedQueue<Student> stdq = new LinkedListSortedQueue();
        stdq.insert(std1);
        stdq.insert(std2);
        stdq.insert(std3);
        stdq.insert(std4);

        System.out.println(stdq);
        System.out.println(stdq.getSize());
        try {
            stdq.dequeue();
            stdq.dequeue();
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println(stdq);
        System.out.println(stdq.getSize());
    }

}
