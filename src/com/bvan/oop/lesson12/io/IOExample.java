package com.bvan.oop.lesson12.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IOExample {

    public static void main(String[] args) {
        String fileName = "files/users.csv";

        // Java 7
        try {
            List<User> users = readUsersFromFile(fileName);
            for (User user : users) {
                System.out.println(user);
            }
            writeUsersIntoFile(users, "files/users-out.csv");

            writeUsersIntoBinFile(users, "files/users.dat");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeUsersIntoBinFile(List<User> users, String fileName) throws IOException {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(users);
        }
    }

    public static void writeUsersIntoFile(List<User> users, String fileName) throws IOException {
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(fileName, true))) {
            for (User user : users) {
                writer.write(user.getName() + "|" + user.getAge());
                writer.newLine();
            }
        }
    }

    public static User readUserFromFile(String fileName) throws IOException {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            String s = reader.readLine();
            return parseUser(s);
        }
    }

    public static List<User> readUsersFromFile(String fileName) throws IOException {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            return readUsers(reader);
        }
    }

    private static List<User> readUsers(BufferedReader reader) throws IOException {
        List<User> res = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            User user = parseUser(line);
            res.add(user);
        }
        return res;
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User parseUser(String s) {
        String[] tokens = s.split(",");
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        return new User(name, age);
    }
}
