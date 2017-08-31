package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFName = reader.readLine();
        Cat grandF = new Cat(grandFName);

        String grandMName = reader.readLine();
        Cat grandM = new Cat(grandMName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, grandF, true);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandM, false);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(grandF);
        System.out.println(grandM);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        public String getName() {
            return name;
        }

        private String name;
        private Cat parent;
        private Cat father;
        private Cat mother;
        private String parentsStr = ", no mother, no father";

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, boolean hasFather) {
            this.name = name;
            this.parent = parent;
                parentsStr = hasFather ? ", no mother, father is " + parent.getName() :
                                         ", mother is " + parent.getName() + ", no father";

        }

        Cat(String name, Cat mother, Cat father){
            this.name = name;
            this.mother = mother;
            this.father = father;
            parentsStr = ", mother is " + mother.getName() + ", father is " + father.getName();
        }
        @Override
        public String toString() {
                return "Cat name is " + name + parentsStr;
        }
    }

}
