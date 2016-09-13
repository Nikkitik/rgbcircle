package ru.nikitos.rgbcircle;

/**
 * Created by Nikkitik on 15.12.2015.
 */
public interface ICanvasView {
    void drawCircle(SimpleCircle circle);


    void redraw();

    void showMessage(String text);
}
