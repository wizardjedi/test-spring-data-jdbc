package com.test.datatest;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RateServiceRepository extends CrudRepository<RateService, Long> {
    @Query("SELECT * FROM rate_service WHERE rate_date_item_id=:rateDateItemId AND name=:name")
    List<RateService> getListRateDateItemAndName(
        @Param("rateDateItemId") Long rateDateItemId,
        @Param("name") String name
    );
}
