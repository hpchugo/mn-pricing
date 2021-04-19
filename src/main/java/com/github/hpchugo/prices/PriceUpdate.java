package com.github.hpchugo.prices;

import io.micronaut.core.annotation.Introspected;

import java.math.BigDecimal;
@Introspected
public class PriceUpdate {
    private String symbol;
    private BigDecimal lasPrice;

    public PriceUpdate() {
    }

    public PriceUpdate(String symbol, BigDecimal lasPrice) {
        this.symbol = symbol;
        this.lasPrice = lasPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getLasPrice() {
        return lasPrice;
    }

    public void setLasPrice(BigDecimal lasPrice) {
        this.lasPrice = lasPrice;
    }

    @Override
    public String toString() {
        return "PriceUpdate{" +
                "symbol='" + symbol + '\'' +
                ", lasPrice=" + lasPrice +
                '}';
    }
}
