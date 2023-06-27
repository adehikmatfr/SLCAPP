/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Administrator
 */
public class Encoder {
    public static String encodePassword(String password) {
        // Generate a salt for bcrypt
        String salt = BCrypt.gensalt();

        // Hash the password with bcrypt
        String hashedPassword = BCrypt.hashpw(password, salt);

        return hashedPassword;
    }

    public static boolean verifyPassword(String password, String hashedPassword) {
        // Verify the entered password against the hashed password
        boolean result = BCrypt.checkpw(password, hashedPassword);

        return result;
    }
}
