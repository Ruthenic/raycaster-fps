package com.ruthenic.raycasterfps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Scanner s = null;
        int i = 0;
        int l = 0;
        String username = System.getProperty("user.name");
        try {
            s = new Scanner(new File("/home/" + username + "/levels/level.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String>[][] level = new ArrayList[1024][1024];
        while (s.hasNext()) {
            level[i][l].add(s.next());
            if (level[i][l].get(level[i][l].size() - 1) == "/") {
                level[i][l].remove(level[i][l].get(level[i][l].size() - 1));
                i = 0;
                l++;
            }
        }
    }
}
