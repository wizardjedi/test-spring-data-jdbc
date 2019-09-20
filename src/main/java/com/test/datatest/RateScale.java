package com.test.datatest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;
import java.util.UUID;

@Table("rate_scale")
public class RateScale {
    @Id
    protected Long id;

    protected String guid = UUID.randomUUID().toString();

    @Column(value = "rate_scale_id")
    protected Set<RatePrice> prices;

    protected String deliveryType;

    protected String alias;

    protected String trafficType;

    protected String tarificationType;

    @Column("service_id")
    protected Long rateServiceId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RateScale{");
        sb.append("id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", prices=").append(prices);
        sb.append(", deliveryType='").append(deliveryType).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", trafficType='").append(trafficType).append('\'');
        sb.append(", tarificationType='").append(tarificationType).append('\'');
        sb.append(", rateServiceId=").append(rateServiceId);
        sb.append('}');
        return sb.toString();
    }

    public Long getRateServiceId() {
        return rateServiceId;
    }

    public RateScale setRateServiceId(Long rateServiceId) {
        this.rateServiceId = rateServiceId;

        return this;
    }

    public String getGuid() {
        return guid;
    }

    public RateScale setGuid(UUID guid) {
        this.guid = guid.toString();

        return this;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public RateScale setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;

        return this;
    }

    public String getAlias() {
        return alias;
    }

    public RateScale setAlias(String alias) {
        this.alias = alias;

        return this;
    }

    public String getTrafficType() {
        return trafficType;
    }

    public RateScale setTrafficType(String trafficType) {
        this.trafficType = trafficType;

        return this;
    }

    public String getTarificationType() {
        return tarificationType;
    }

    public RateScale setTarificationType(String tarificationType) {
        this.tarificationType = tarificationType;

        return this;
    }

    public Set<RatePrice> getPrices() {
        return prices;
    }

    public RateScale setPrices(Set<RatePrice> prices) {
        this.prices = prices;

        return this;
    }

    public Long getId() {
        return id;
    }

    public RateScale setId(Long id) {
        this.id = id;

        return this;
    }
}
