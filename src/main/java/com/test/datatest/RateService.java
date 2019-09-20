package com.test.datatest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Table("rate_service")
public class RateService {
    @Id
    protected Long id;

    protected String guid = UUID.randomUUID().toString();

    protected String name;

    @Column(value = "service_id")
    protected Set<RateScale> scales;

    protected long currencyId = 1;

    protected BigDecimal fixPayment;

    protected BigDecimal minimalPayment;

    protected String shortNumber;

    protected boolean mandatory = false;

    protected Long rateDateItemId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RateService{");
        sb.append("id=").append(id);
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", scales=").append(scales);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", fixPayment=").append(fixPayment);
        sb.append(", minimalPayment=").append(minimalPayment);
        sb.append(", shortNumber='").append(shortNumber).append('\'');
        sb.append(", mandatory=").append(mandatory);
        sb.append(", rateDateItemId=").append(rateDateItemId);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public RateService setName(String name) {
        this.name = name;

        return this;
    }

    public Long getRateDateItemId() {
        return rateDateItemId;
    }

    public RateService setRateDateItemId(Long rateDateItemId) {
        this.rateDateItemId = rateDateItemId;

        return this;
    }

    public BigDecimal getMinimalPayment() {
        return minimalPayment;
    }

    public RateService setMinimalPayment(BigDecimal minimalPayment) {
        this.minimalPayment = minimalPayment;

        return this;
    }

    public String getShortNumber() {
        return shortNumber;
    }

    public RateService setShortNumber(String shortNumber) {
        this.shortNumber = shortNumber;

        return this;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public RateService setMandatory(boolean mandatory) {
        this.mandatory = mandatory;

        return this;
    }

    public String getGuid() {
        return guid;
    }

    public RateService setGuid(UUID guid) {
        this.guid = guid.toString();

        return this;
    }

    public BigDecimal getFixPayment() {
        return fixPayment;
    }

    public RateService setFixPayment(BigDecimal fixPayment) {
        this.fixPayment = fixPayment;

        return this;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public RateService setCurrencyId(long currencyId) {
        this.currencyId = currencyId;

        return this;
    }

    public Set<RateScale> getScales() {
        return scales;
    }

    public RateService setScales(Set<RateScale> scales) {
        this.scales = scales;

        return this;
    }

    public Long getId() {
        return id;
    }

    public RateService setId(Long id) {
        this.id = id;

        return this;
    }
}
