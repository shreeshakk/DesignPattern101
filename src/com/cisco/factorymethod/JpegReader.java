package com.cisco.factorymethod;

/**
 * Created by shkk on 9/1/2016.
 */
public class JpegReader implements ImageReader {

    public JpegReader() {
        //check that it is a jpeg, throw exception if it is not, then if it is decode it
    }

    @Override
    public DecodedImage getDecodedImage() {
        System.out.println("Decoded image is a jpeg file");
        return new DecodedImage("jpeg image");
    }
}
