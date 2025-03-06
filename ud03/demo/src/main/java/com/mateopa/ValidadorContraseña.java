package com.mateopa;

public class ValidadorContraseña {
    public boolean esValida(String contraseña) {
        if (contraseña == null || contraseña.length() < 8) {
            return false;
        }
        if (!contraseña.matches(".*[A-Z].*")) {
            return false;
        }
        if (!contraseña.matches(".*[a-z].*")) {
            return false;
        }
        if (!contraseña.matches(".*\\d.*")) {
            return false;
        }
        if (!contraseña.matches(".*[!@#$%^&*].*")) {
            return false;
        }
        return true;
    }
}
