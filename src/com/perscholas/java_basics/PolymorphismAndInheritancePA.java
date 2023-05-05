package com.perscholas.java_basics;


public class PolymorphismAndInheritancePA {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast


        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()


        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()


        // We have a problem here!!!
        Monster m4 = new Monster();
        System.out.println(m4.attack());  // garbage!!!
    }

    private static class Monster {
        protected String attackText = "!^_&^$@+%$* I don't know how to attack!";

        public Monster() {
        }

        public String attack() {
            return attackText;
        }
    }

    private static class FireMonster extends Monster {

        public FireMonster(String r2u2) {
            super();
            attackText = "Attack with fire!";
        }

    }

    private static class WaterMonster extends Monster {
        public WaterMonster(String u2r2) {
            super();
            attackText = "Attack with Water";
        }
    }

    private static class StoneMonster extends Monster {
        public StoneMonster(String r2r2) {
            super();
            attackText = "Attack with Stone";
        }
    }
}


