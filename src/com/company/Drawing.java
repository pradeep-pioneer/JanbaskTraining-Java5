package com.company;

import java.awt.*;

/**
 * Created by prade on 7/29/2017.
 */
public class Drawing {
    private int canvasWidth;
    public int getCanvasWidth(){
        return canvasWidth;
    }

    public void InitializeDrawing(int canvasWidth){
        int defaultZoom = 1;
        this.canvasWidth=canvasWidth*defaultZoom;
        Main.main(new String[]{"no data"});
        String program = Main.ProgramName;
    }

    protected void increaseZoomLevel(int zoomLevelIncrement){
        canvasWidth = canvasWidth * zoomLevelIncrement;
    }

    //Parameter Signature
    int dataSignature(int data1, String data2){
        //(int, String) -> int
        return data1 + data2.length();
    }

    String dataSignature(int data1, int data2){
        //(int, int) -> int
        return String.valueOf(data1)+data2;
    }
}
