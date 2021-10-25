package ru.dataart.academy.java;

import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipInputStream;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {
        int symbol;
        int count = 0;
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while (zipInputStream.getNextEntry() != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream));
                while ((symbol = bufferedReader.read()) != -1) {

                    if ((char) symbol == character) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {
        int max = 0;
        String word;

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while (zipInputStream.getNextEntry() != null) {
                Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(zipInputStream)));
                while (scanner.hasNext()) {
                    word = scanner.next();
                    max = Math.max(max, word.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return max;
    }

}
