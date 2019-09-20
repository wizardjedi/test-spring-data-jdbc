package com.test.datatest;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RateScaleRepository extends CrudRepository<RateScale, Long> {
    @Query(
        "SELECT *" +
            " FROM rate_scale" +
            " WHERE" +
            " service_id=:serviceId" +
            " AND delivery_type=:deliveryType" +
            " AND alias=:alias" +
            " AND traffic_type=:trafficType" +
            " AND tarification_type=:tarificationType")
    List<RateScale> getListByDeliveryTypeAndAliasAndTrafficTypeAndTarificationType(
        @Param("serviceId") Long serviceId,
        @Param("deliveryType") String deliveryType,
        @Param("alias") String alias,
        @Param("trafficType") String trafficType,
        @Param("tarificationType") String tarificationType
    );
}
