package com.company.maldush;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Menu mainMenu;
    static Menu recipeMenu;

    public static void main(String[] args) {

        initRecipeMenu();
        initMainMenu();

        loop(mainMenu);
    }

    private static void initMainMenu() {
        mainMenu = new Menu("Invalid command!", scanner);;
        mainMenu.addElement("Add ingridient.", new MenuAction() {
            @Override
            public boolean action() {
                System.out.println("Ingridient added");
                return false;
            }
        });
        mainMenu.addElement("Add Recipe.", new MenuAction() {
            @Override
            public boolean action() {
                loop(recipeMenu);
                return false;
            }
        });
        mainMenu.addElement("Exit.", new MenuAction() {
            @Override
            public boolean action() {
                System.out.println("Thank you...");
                return true;
            }
        });
    }
    private static void initRecipeMenu() {

        recipeMenu = new Menu("Invalid input!", scanner);
        recipeMenu.addElement("Specify ingredient.", new MenuAction() {
            @Override
            public boolean action() {
                System.out.println("Ingredient specified!");
                return false;
            }
        });
        recipeMenu.addElement("Tell me how Are you.", new MenuAction() {
            @Override
            public boolean action() {
                System.out.println("OK!");
                return false;
            }
        });
        recipeMenu.addElement("Exit.", new MenuAction() {
            @Override
            public boolean action() {
                System.out.println("OK!");
                return true;
            }
        });
    }

    public static void loop(Menu menu) {
        do {
            if (menu.update()) {
                break;
            }
        } while (true);
    }

}
