package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {

    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    public BigDecimal getCost() {
        //hardcoded stub cost = 20
        return super.getCost().add(new BigDecimal(20.00));
    }

    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}