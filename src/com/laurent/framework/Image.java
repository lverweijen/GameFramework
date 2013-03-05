package com.laurent.framework;

import com.laurent.framework.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
