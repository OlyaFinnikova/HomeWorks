package part6.unit2;

import java.io.*;

/**
 * Класс шифрует или расшифровывает данные
 */
public class EncryptionOrDecryption {

    public UserValue userValue = new UserValue();

    /**
     * Шифрует или расшифровывает данные
     *
     * @param userPath   путь до файла
     * @param shift      шаг шифрования
     * @param userAction расшиврока или зашифровка
     */
    public void overWrite(String userPath, int shift, String userAction) {
        if (userValue.actions[0].equals(userAction)) {
            writeFile(encrypt(readFile(userPath), shift), userPath);
        } else {
            writeFile(decrypt(readFile(userPath), shift), userPath);
        }
    }

    /**
     * Чтение файла
     *
     * @param userPath путь до файла
     * @return содержание файла
     */
    public StringBuilder readFile(String userPath) {

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(userPath))) {
            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return stringBuilder;
    }

    /**
     * Шифрует данные
     *
     * @param file  данные из файла
     * @param shift шаг шифрования
     * @return зашифрованные данные
     */
    private StringBuilder encrypt(StringBuilder file, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : file.toString().toCharArray()) {
            int newC = (int)c;
            if (((int)c >= 65 && (int)c  <= 90) || ((int)c  >= 97 && (int)c  <= 122)) {
                for (int i = 1; i <= shift; i++) {
                    if (newC  == 90) {
                        newC = 65;
                    } else if (newC  == 122) {
                        newC = 97;
                    } else {
                        newC = newC+1;
                    }
                }
                stringBuilder.append((char) newC);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }

    /**
     * Расшифровывает данные
     *
     * @param file  данные из файла
     * @param shift шаг шифрования
     * @return расшифрованные данные
     */
    private StringBuilder decrypt(StringBuilder file, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : file.toString().toCharArray()) {
            int newC = (int)c;
            if (((int)c  >= 65 && (int)c  <= 90) || ((int)c >= 97 && (int)c  <= 122)) {
                for (int i = 1; i <= shift; i++) {
                    if (newC  == 65) {
                        newC = 90;
                    } else if (newC  == 97) {
                        newC = 122;
                    } else {
                        newC = newC-1;
                    }
                }
                stringBuilder.append((char) newC);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }

    /**
     * Записывает преобразованные данные в файл
     *
     * @param file     данные из файла
     * @param userPath путь до файла
     */
    private void writeFile(StringBuilder file, String userPath) {
        try (Writer out = new FileWriter(userPath)) {
            out.write(String.valueOf(file));
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
