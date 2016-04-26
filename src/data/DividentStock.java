/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author usuario2
 */
public class DividentStock extends Stock{
    
    private double dividends;

    public DividentStock(double dividends, int totalShares, String symbol, double totalCost, double CurrentPrice) {
        super(totalShares, symbol, totalCost, CurrentPrice);
        this.dividends = dividends;
    }
    
    @Override
    public double getProfit() {
        return super.getProfit();
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue()+this.dividends;
    }
    
    
}
