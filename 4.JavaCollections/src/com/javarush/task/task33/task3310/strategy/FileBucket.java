package com.javarush.task.task33.task3310.strategy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileBucket {

    Path path;

    public FileBucket() {
        try {
            this.path = Files.createTempFile(null, null);
            path.toFile().deleteOnExit();
            Files.deleteIfExists(path);
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getFileSize() {
        try {
            return Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void putEntry(Entry entry) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(entry);
        } catch (Exception ignored) {
        }
    }

    public Entry getEntry() {
        if (getFileSize() > 0) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
                return (Entry) ois.readObject();
            } catch (Exception ignored){
            }
        }
        return null;
    }

    public void remove() {
        try {
            Files.delete(path);
        } catch (Exception ignored) {
        }
    }
}
