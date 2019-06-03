/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;
import adt.SortedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class MergePerge {

    public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
        /* assuming d1 and d2 are sorted, merge their contents
       into a single sorted Deque, and return it */
        Deque<Integer> deque = new LinkedListDeque();
        SortedQueue<Integer> sq = new LinkedListSortedQueue();
        int size = d1.getSize();
        int size1 = d2.getSize();
        for (int i = 0; i < size; i++) {
            try {
                sq.insert(d1.popFromFront());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        for (int i = 0; i < size1; i++) {
            try {
                sq.insert(d2.popFromFront());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        int size2 = sq.getSize();
        for (int i = 0; i < size2; i++) {
            try {
                deque.pushToBack(sq.dequeue());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return deque;

    }

    public static Deque<Integer> mergeSort(Deque<Integer> deq) {
        /* Step 0:  base case???
        Step 1:  split deq into two Deques of relatively equal size
        Step 2:  pass both of these Deques into mergeSort
        Step 3:  pass the resulting Deques into merge, and return the result
         */
        Deque<Integer> deque = new LinkedListDeque();
        Deque<Integer> deque2 = new LinkedListDeque();
        Deque<Integer> result = new LinkedListDeque();

        if (deq.getSize() >= 2) {
            if (deq.getSize() % 2 == 1) {
                int limit = (deq.getSize() - 1) / 2;
                for (int i = 0; i < limit; i++) {
                    try {
                        deque.pushToBack(deq.popFromBack());
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    try {
                        deque2.pushToFront(deq.popFromFront());
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                try {
                    deque.pushToBack(deq.popFromBack());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                if (deque.getSize() > 2) {
                    deque = mergeSort(deque);
                    deque2 = mergeSort(deque2);
                    result = merge(deque, deque2);
                    return result;
                }
            } else {
                int limit = deq.getSize() / 2;
                for (int i = 0; i < limit; i++) {
                    try {
                        deque.pushToBack(deq.popFromBack());
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    try {
                        deque2.pushToFront(deq.popFromFront());
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                if (deque.getSize() > 2) {
                    deque = mergeSort(deque);

                    deque2 = mergeSort(deque2);

                    result = merge(deque, deque2);

                    return result;
                }

            }
        } else if (deq.getSize() == 1) {
            result = deq;
            return result;
        }

        if (deq.getSize() == 2 || deque.getSize() <= 2) {

            result = merge(deque, deque2);

        }
        return result;
    }
}
