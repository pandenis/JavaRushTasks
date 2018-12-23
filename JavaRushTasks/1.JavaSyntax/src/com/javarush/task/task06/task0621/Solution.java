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

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, grandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;
        private Cat grandfather;
        private Cat grandmother;
        private Cat grandparent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat grandfather) {
            this.name = name;
            this.grandfather = grandfather;
            this.grandmother = null;
        }

        Cat(String name, Cat grandmother, Cat grandfather) {
            this.name = name;
            this.grandfather = null;
            this.grandmother = grandfather;
        }

        Cat(String name, Cat mother, Cat father, Cat grandparent) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.grandparent = null;
        }

        @Override
        public String toString() {
            if (grandparent == null && mother == null && father == null);
            System.out.println("The cat's name is " + name + ", no mother , no father");
            if (mother == null && father == null)
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
