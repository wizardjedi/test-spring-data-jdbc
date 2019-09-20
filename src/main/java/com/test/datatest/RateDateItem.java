package com.test.datatest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.util.Set;

@Table("rate_date_item")
public class RateDateItem {
    @Id
    protected Long id;
    protected LocalDate startDate;
    @Column(value = "rate_date_item_id", keyColumn = "rate_date_item_id")
    protected Set<RateService> services;
    protected Long rateId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RateDateItem{");
        sb.append("id=").append(id);
        sb.append(", startDate=").append(startDate);
        sb.append(", services=").append(services);
        sb.append(", rateId=").append(rateId);
        sb.append('}');
        return sb.toString();
    }

    public Long getRateId() {
        return rateId;
    }

    public RateDateItem setRateId(Long rateId) {
        this.rateId = rateId;

        return this;
    }

    public Set<RateService> getServices() {
        return services;
    }

    public RateDateItem setServices(Set<RateService> services) {
        this.services = services;

        return this;
    }

    public Long getId() {
        return id;
    }

    public RateDateItem setId(Long id) {
        this.id = id;

        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public RateDateItem setStartDate(LocalDate startDate) {
        this.startDate = startDate;

        return this;
    }
}
