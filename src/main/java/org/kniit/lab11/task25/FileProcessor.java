package org.kniit.lab11.task25;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileProcessor {

    private static final long MAX_SIZE = 10485760; // 10 MB - ну или 1024**2 * 10
    private FileDAO fileDAO = new FileDAO();

    public void processFiles(String path) {
        File fileOrDir = new File(path);

        if (!fileOrDir.exists()) {
            System.out.println("Путь не существует!");
            return;
        }
        processFilesRecursive(fileOrDir); //вход в рекурсию
    }

    private void processFilesRecursive(File fileOrDir) {
        if (fileOrDir.isFile()) {
            processFile(fileOrDir); // если файл - перекидываем в функцию для сохранения
        } else if (fileOrDir.isDirectory()) {
            File[] files = fileOrDir.listFiles();
            if (files != null) {
                for (File f : files) {
                    processFilesRecursive(f); // рекурсивно обходим все подпапки
                }
            }
        }
    }

    //сохранение отдельного файла
    private void processFile(File file) {
        if (file.length() <= MAX_SIZE) {
            try {
                fileDAO.saveFile(file);
                System.out.println("Файл сохранён: " + file.getAbsolutePath());
            } catch (SQLException | IOException e) {
                System.out.println("Ошибка при сохранении файла: " + file.getAbsolutePath());
                e.printStackTrace();
            }
        } else if (file.length() > MAX_SIZE) {
            System.out.println("Файл слишком большой: " + file.getAbsolutePath());
        }
    }
}
