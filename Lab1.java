package com.goit.core.module01;

/**
 * Created by Mala on 10/28/2016.
 */
public class Lab1 {


    public class FirstClass {
        public void FirstClassMetod(){
            System.out.println("Мой первый класс на Java 1");
        }
    }

    public class SecondClass {
        public void SecondClassMetod(){
            System.out.println("Мой первый класс на Java 2");
        }
    }

    public class ThirdClass {
        public void ThirdClassMetod(){
            System.out.println("Мой первый класс на Java 3");
        }
    }
    public class FourthClass {
        public void FourthClassMetod(){
            System.out.println("Мой первый класс на Java 4");
        }
    }
    public class FifthClass {
        public void FifthClassMetod(){
            System.out.println("Мой первый класс на Java 5");
        }
    }

    public static void main(String[] args) {
        Lab1 lb =new Lab1();
        Lab1.FirstClass FC = lb.new FirstClass();
        Lab1.SecondClass SC = lb.new SecondClass();
        Lab1.ThirdClass TC = lb.new ThirdClass();
        Lab1.FourthClass FoC = lb.new FourthClass();
        Lab1.FifthClass FiC = lb.new FifthClass();
        FC.FirstClassMetod();
        SC.SecondClassMetod();
        TC.ThirdClassMetod();
        FoC.FourthClassMetod();
        FiC.FifthClassMetod();

    }
}

