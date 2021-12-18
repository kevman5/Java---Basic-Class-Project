/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicclass_project;

/**
 *
 * @author kevmm
 */
public class Speed {
    private int speed;
    private int distance;
    private int time;
    public Speed()
    {
        speed = 0;
    }
    public Speed(int cDistance, int cTime)
    {
        distance = cDistance;
        time = cTime;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getDistance()
    {
        return distance;
    }
    public int getTime()
    {
        return time;
    }
    public void setSpeed(int speed1)
    {
        speed = speed1;
    }           
    public void setDistance(int distance1)
    {
        distance = distance1;
    }
    public void setTime(int time1)
    {
        time = time1;
    }
    public void FindSpeed()
    {
        int speed2, time2, dist2;
        dist2 = distance;
        time2 = time;
        speed2 = speed;
        {
          speed = dist2 / time2;  
        }
    }
}
