package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader imageType;

        if (type == ImageTypes.BMP) {
            imageType = new BmpReader();
        } else if (type == ImageTypes.JPG) {
            imageType = new JpgReader();
        } else if (type == ImageTypes.PNG) {
            imageType = new PngReader();
        } else {
            throw (new IllegalArgumentException("Неизвестный тип картинки"));
        }
        return imageType;
    }
}
