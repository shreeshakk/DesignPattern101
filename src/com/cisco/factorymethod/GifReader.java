package com.cisco.factorymethod;

/**
 * Created by shkk on 9/1/2016.
 */
public class GifReader implements ImageReader {

    public GifReader() {
        //check that it is a gif, throw exception if it is not, then if it is decode it
    }

    @Override
    public DecodedImage getDecodedImage() {
        System.out.println("Decoded image is a gif file");
        return new DecodedImage("GIF Image");
    }
}
