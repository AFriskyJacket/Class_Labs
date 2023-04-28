package com.perscholas.java_basics;

public class PolymorphismAndInterfacePA {
    /*
    public final String KIDS = "Kids";
    public final String FICTION = "Fiction";
    */
    //changed to use enums instead
    private enum BookType{
        KIDS,
        FICTION
    }
    public static void main(String[] args) {
        PolymorphismAndInterfacePA practice = new PolymorphismAndInterfacePA();
        practice.test_1();
    }
    void test_1(){
        KidUser kid1 = new KidUser(10);
        KidUser kid2 = new KidUser(18);

        kid1.registerAccount();
        kid2.registerAccount();

        kid1.requestBook(BookType.KIDS);
        kid2.requestBook(BookType.FICTION);

        AdultUser adult1 = new AdultUser(5);
        AdultUser adult2 = new AdultUser(23);

        adult1.registerAccount();
        adult2.registerAccount();

        adult1.requestBook(BookType.KIDS);
        adult2.requestBook(BookType.FICTION);
    }

    interface LibraryUser {
        void registerAccount();

        void requestBook(BookType bookType);
    }

    class KidUser implements LibraryUser {
        private int age;
        private BookType bookType;

        KidUser(int age) {
            this.age = age;
        }

        @Override
        public void registerAccount() {
            if (age <= 11) {
                System.out.println("You have successfully registered under a Kids Account");
            } else if (age > 11) {
                System.out.println("Sorry, age must be less than 12 to register as a kid.");
            } else {
                System.out.println("Age not properly defined!");
            }
        }

        @Override
        public void requestBook(BookType bookType) {
            if (bookType == BookType.KIDS) {
                System.out.println("Book issued successfully, please return the book within 10 days");
                this.bookType = bookType;
            } else {
                System.out.println("Oops, you are allowed to take only kids books.");
            }
        }
    }
    class AdultUser implements LibraryUser {
        private int age;
        private BookType bookType;

        AdultUser(int age) {
            this.age = age;
        }

        @Override
        public void registerAccount() {
            if (age > 11) {
                System.out.println("You have successfully registered under an Adult Account");
            } else if (age <= 11) {
                System.out.println("Sorry, age must be greater than 12 to register as an adult.");
            } else {
                System.out.println("Age not properly defined!");
            }
        }

        @Override
        public void requestBook(BookType bookType) {
            if (bookType == BookType.FICTION) {
                System.out.println("Book issued successfully, please return the book within 10 days");
                this.bookType = bookType;
            } else {
                System.out.println("“Oops, you are allowed to take only adult Fiction books.");
            }
        }
    }
}
