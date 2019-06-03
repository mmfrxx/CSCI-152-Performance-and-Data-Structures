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
public  class Student  implements Comparable {
            private int id;
            private String name;
            private int number=12;
            public Student(int idd, String namee){
                id = idd;
                name = namee;
            }
    
            public int getId(){
                return id;
            }

            public String getName(){
                return name;
            }
    

   

 
            @Override
    public int compareTo(Object student) {
       Student std = (Student) student;
       
       return name.compareTo(std.getName());
       
    }
            @Override
            public String toString(){
    return name+" "+id;
}}

   
