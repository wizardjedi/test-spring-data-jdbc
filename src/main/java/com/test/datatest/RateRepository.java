package com.test.datatest;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RateRepository extends CrudRepository<Rate, Long> {
    @Query("SELECT * FROM rates WHERE partner_id=:partnerId")
    Rate getRateByPartnerId(@Param("partnerId") Long partnerId);
}
