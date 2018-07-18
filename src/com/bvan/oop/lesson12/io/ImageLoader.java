package com.bvan.oop.lesson12.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author bvanchuhov
 */
public class ImageLoader {

    public static void main(String[] args) throws IOException {
        URL url = new URL("....");
        InputStream inputStream = url.openStream();
    }
}
