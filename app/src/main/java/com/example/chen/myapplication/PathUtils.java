package com.example.chen.myapplication;

import android.graphics.Path;

public class PathUtils {
    /**
     * 在正方形中画一个爱心
     */
    public static Path getHeartPath(int length,float scale)
    {
        if (length < 0 || scale <0)
        {
            throw new IllegalStateException("参数异常");
        }
        float s = length / 242f * scale;
        float offset = length / 2f * (1-scale);
        Path path = new Path();
        path.moveTo(121 * s + offset,225 * s + offset);
        path.cubicTo(-96 * s+offset,119 * s + offset,
                    40 * s + offset,-55 * s +offset,
                121 * s + offset,55 * s +offset);
        path.cubicTo(202 * s + offset, -55 * s + offset,
                338 * s + offset, 119 * s + offset,
                121 * s + offset, 225 * s + offset);
        return  path;
    }

    public static Path getHeartPath(int length)
    {
        return getHeartPath(length,1f);
    }

    /**
     * 添加一个路径到指定的Path
     */

    public static void addHeart(Path path,int x,int y,int length,float scale)
    {
        Path temp = getHeartPath(length,scale);
        temp.offset(x,y);
        path.addPath(temp);
    }

    public static void addHeart(Path path,int x,int y,int length)
    {
        Path temp = getHeartPath(length);
        temp.offset(x,y);
        path.addPath(temp);
    }

}
