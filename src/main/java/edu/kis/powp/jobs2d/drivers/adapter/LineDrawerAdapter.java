package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;

public class LineDrawerAdapter implements Job2dDriver{
    private int startX;
    private int startY;

    private DrawPanelController drawerController;
    private ILine line;

    public LineDrawerAdapter(DrawPanelController drawerController, ILine line){
        this.drawerController = drawerController;
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y){
        startX = x;
        startY = y;
    }

    @Override
    public void operateTo(int x, int y){
        line.setStartCoordinates(startX, startY);
        line.setEndCoordinates(x, y);

        drawerController.drawLine(line);

        startX = x;
        startY = y;
    }

    @Override
    public String toString(){
        return "Line Drawer Adapter";
    }
}