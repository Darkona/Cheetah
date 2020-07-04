package com.darkona;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Cheetah!");
        System.out.println("Line added by Darkona");
        System.out.println("La pizza lleva piña");
        int i = 0;

        StringBuilder str = new StringBuilder();

        while (i < 100){
            if(i<9) str.append(0);
            str.append(++i);
            if(i<100) str.append(",");
            if(i % 10 == 0 ) str.append("\n");
        }

        System.out.println(str);
    }
}
