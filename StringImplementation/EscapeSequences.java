package StringImplementation;

public class EscapeSequences {
    public static void main(String[] args) throws InterruptedException {

        String sentence = "My favorite book is \"The Miserable Ones\" from " +
                "Victor Hugo";
        System.out.println(sentence);

        String path = "\\home\\john\\lib";
        System.out.println(path);

        System.out.println("Name\tSurname\tResult");
        System.out.println("Jack\tNight\t10");

        String poem = "I had a cat\nwho was so fat\nhe could not even\nsit on" +
                " his mat";
        System.out.println(poem);

        String emf = " electromotive force, emf, is denoted by \u2107 ";
        System.out.println(emf);

        String salary = "310$";
        boolean printCurrencySymbol = false;
        salary = (!printCurrencySymbol ? salary + "\b" : salary);
        System.out.println(salary);

        for (int i = 0; i <= 100; i += 5) {
            System.out.print("Completed %" + i + "\r");
            Thread.sleep(1000);
        }
    }
}
