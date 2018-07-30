package com.cisco.command;

import java.util.Stack;

/**
 * Created by shkk on 7/30/2018.
 */
public class PhotoShopTest {

    public static void main(String[] args) {

        Stack<Command> photoShopUndoCommandList = new Stack<Command>();
        PhotoShop photoShop = new PhotoShopImpl();
        Command brightnessCommand = new Brightness(photoShop);
        Command contrastCommand = new Contrast(photoShop);

        brightnessCommand.execute();
        photoShopUndoCommandList.add(brightnessCommand);

        contrastCommand.execute();
        photoShopUndoCommandList.add(contrastCommand);
        Command lastCommand = photoShopUndoCommandList.pop();
        lastCommand.unexecute();

        lastCommand = photoShopUndoCommandList.pop();
        lastCommand.unexecute();
    }
}
