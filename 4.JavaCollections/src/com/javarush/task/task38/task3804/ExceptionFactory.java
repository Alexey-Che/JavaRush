package com.javarush.task.task38.task3804;

public class ExceptionFactory {

    public static Throwable getException(Enum enumm) {

        if (enumm == null) return new IllegalArgumentException();
        String message = enumm.name().charAt(0) + enumm.name().substring(1).toLowerCase().replace("_", " ");
        switch (enumm.getClass().getSimpleName()) {
            case "ApplicationExceptionMessage":
                return new Exception(message);
            case "DatabaseExceptionMessage":
                return new RuntimeException(message);
            case "UserExceptionMessage":
                return new Error(message);
            default:
                return new IllegalArgumentException();
        }
    }
}
