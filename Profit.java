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
public class Profit {
    
    private int revenue;
    private int cost;
    private int profit;
    public Profit()
    {
        revenue = 100;
        
    }
    public Profit(int cRevenue, int cCost)
    {
        revenue = cRevenue;
        cost = cCost;
    }
    public Profit(int dCost)
    {
        
        cost = 75;
    }
    public int getRevenue()
    {   

    return revenue;
}
    public int getCost()
    {
        return cost;
    }
    public int getProfit()
    {
        return profit;
    }
    public void setRevenue(int rev1)
    {
        revenue = rev1;
    }           
    public void setCost(int cost1)
    {
        cost = cost1;
    }
    public void setProfits(int profit1)
    {
        profit = profit1;
    }
    public void CalcProfit()
    {
        int rev, cost2, prof;
        rev = revenue;
        cost2 = cost;
        prof = profit;
        {
          profit = rev - cost2;  
        }
        
        
        
    }
}