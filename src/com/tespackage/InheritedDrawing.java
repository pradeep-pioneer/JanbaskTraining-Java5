package com.tespackage;

import com.company.Drawing;

/**
 * Created by prade on 7/29/2017.
 */
public class InheritedDrawing extends Drawing {
    void Start(){
        super.increaseZoomLevel(25);
    }
}
