package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Есть ли ошибка в программе " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error errorNew = new Error(true, 1, "Ошибка");
        error.printInfo();
        System.out.println();
        errorNew.printInfo();
        Error error1 = new Error(false, 5, "Ошибка5");
        Error error2 = new Error(true, 505, "Ошибка 505");
        System.out.println();
        error1.printInfo();
        System.out.println();
        error2.printInfo();
    }
}
