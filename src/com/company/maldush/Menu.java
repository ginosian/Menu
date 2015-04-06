package com.company.maldush;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Marta on 4/6/2015.
 */
public class Menu {

    private ArrayList<MenuElement> menuElements;
    private Scanner scanner;
    private String invalidCommandMessage;

    public Menu(String invalidCommandMessage, Scanner scanner) {
        menuElements = new ArrayList<MenuElement>();
        this.scanner = scanner;
        this.invalidCommandMessage = invalidCommandMessage;
    }

    public void addElement(String message, MenuAction elementAction) {
        menuElements.add(new MenuElement(message, elementAction));
    }

    public void show() {
        for (int i = 0; i < menuElements.size(); i++) {
            System.out.println(i + 1 + ". " + menuElements.get(i).getMessage());
        }
    }

    public boolean update() {
        show();
        int input = scanner.nextInt();

        if (input > menuElements.size() || input < 1) {
            System.out.println(invalidCommandMessage);
            return false;
        }

        if (menuElements.get(input - 1).getElementAction().action()) {
            return true;
        }
        return false;
    }

}
