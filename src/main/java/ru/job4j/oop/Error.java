package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        errorOne.printInfo();
        Error errorTwo = new Error(true, 200, "OK");
        errorTwo.printInfo();
        Error errorThree = new Error(false, 404, "Not Found");
        errorThree.printInfo();
    }
}
