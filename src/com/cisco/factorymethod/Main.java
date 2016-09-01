package com.cisco.factorymethod;

/**
 * Created by shkk on 9/1/2016.
 */
public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Invalid number of arguments. Please input JPEG | GIF");
            System.exit(0);
        }

        ImageReader imageReader = null;
        DecodedImage image = null;

        //key to factory method implementation
        if (args[0].equalsIgnoreCase("JPEG")) {
            imageReader = new JpegReader();
        } else if (args[0].equalsIgnoreCase("GIF")) {
            imageReader = new GifReader();
        }

        if (imageReader != null) {
            image = imageReader.getDecodedImage();
        }

        System.out.println(image);

    }
}
