package com.test.datatest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("rate_price")
public class RatePrice {
    @Id
    protected Long id;

    protected Long rangeTo;

    protected BigDecimal price;

    protected Long rateScaleId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RatePrice{");
        sb.append("id=").append(id);
        sb.append(", rangeTo=").append(rangeTo);
        sb.append(", price=").append(price);
        sb.append(", rateScaleId=").append(rateScaleId);
        sb.append('}');
        return sb.toString();
    }

    public Long getRateScaleId() {
        return rateScaleId;
    }

    public RatePrice setRateScaleId(Long rateScaleId) {
        this.rateScaleId = rateScaleId;

        return this;
    }

    public Long getId() {
        return id;
    }

    public RatePrice setId(Long id) {
        this.id = id;

        return this;
    }

    public Long getRangeTo() {
        return rangeTo;
    }

    public RatePrice setRangeTo(Long rangeTo) {
        this.rangeTo = rangeTo;

        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public RatePrice setPrice(BigDecimal price) {
        this.price = price;

        return this;
    }
}
