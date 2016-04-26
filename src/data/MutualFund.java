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
public class MutualFund extends ShareAsset {
    
    private double totalShares;

    public MutualFund(double totalshares, String symbol, double totalCost, double CurrentPrice) {
        super(symbol, totalCost, CurrentPrice);
        this.totalShares = totalshares;
    }
    
    

    @Override
    public double getProfit() {
        return ((this.totalShares)*(super.getCurrentPrice())-(super.getTotalCost()));
    }

    @Override
    public double getMarketValue() {
        return this.totalShares*super.getCurrentPrice();
    }
    
    
}
