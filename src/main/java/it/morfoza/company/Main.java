package it.morfoza.company;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("text")) {
            ConsoleMain.runOnConsole(args);
        } else {
            SpringMain.runOnSpringBoot(args);
        }
    }
}
