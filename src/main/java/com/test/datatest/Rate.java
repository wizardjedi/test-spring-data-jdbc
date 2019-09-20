package com.test.datatest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("rates")
public class Rate {
    @Id
    protected Long id;
    protected String name;
    @Column(keyColumn = "rate_id", value = "rate_id")
    protected Set<RateDateItem> rateDateItems;

    protected Long partnerId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rate{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", rateDateItems=").append(rateDateItems);
        sb.append(", partnerId=").append(partnerId);
        sb.append('}');
        return sb.toString();
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public Rate setPartnerId(Long partnerId) {
        this.partnerId = partnerId;

        return this;
    }

    public Set<RateDateItem> getRateDateItems() {
        return rateDateItems;
    }

    public Rate setRateDateItems(Set<RateDateItem> rateDateItems) {
        this.rateDateItems = rateDateItems;

        return this;
    }

    public Long getId() {
        return id;
    }

    public Rate setId(Long id) {
        this.id = id;

        return this;
    }

    public String getName() {
        return name;
    }

    public Rate setName(String name) {
        this.name = name;

        return this;
    }
}
