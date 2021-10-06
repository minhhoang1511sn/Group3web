package murach.data;

import murach.business.User;

import java.io.*;
import java.util.Scanner;

public class UserIO {

    public static User getUser(String emailAddress, String path) {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            User obj = (User) objectIn.readObject();
            objectIn.close();
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
       return null;
    }

    public static void add(User user, String path) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;
            try {
                File file = new File(path);
                fileOutputStream = new FileOutputStream(file);
                outputStream = new ObjectOutputStream(fileOutputStream);
                outputStream.writeObject(user);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
