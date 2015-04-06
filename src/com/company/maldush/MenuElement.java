package com.company.maldush;

/**
 * Created by Marta on 4/6/2015.
 */
public class MenuElement {

    private String message;
    private MenuAction elementAction;


    public MenuElement(String message, MenuAction elementAction) {
        this.message = message;
        this.elementAction = elementAction;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public MenuAction getElementAction() {
        return elementAction;
    }
    public void setElementAction(MenuAction elementAction) {
        this.elementAction = elementAction;
    }
}
