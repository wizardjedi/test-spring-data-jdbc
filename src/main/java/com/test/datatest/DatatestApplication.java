package com.test.datatest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableJdbcRepositories(basePackages = "com.test.datatest")
public class DatatestApplication
    implements CommandLineRunner
{

    private final static Logger log = LoggerFactory.getLogger(DatatestApplication.class);

    @Autowired
    protected RateRepository rateRepository;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DatatestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Rate rate = new Rate();
        rate.setName("new rate");
        rate.setPartnerId(9298l);

        log.info("Rate after save:{}", rate);

        final HashSet<RateDateItem> rateDateItems = new HashSet<>();

        RateDateItem rateDateItem1 = new RateDateItem();
        rateDateItem1.setStartDate(LocalDate.of(2019,3,1));
        rateDateItem1.setRateId(rate.getId());

        rateDateItems.add(rateDateItem1);

        rate.setRateDateItems(rateDateItems);

        log.info("Rate after save:{}", rate);

        RateService rateService = new RateService();

        rateService.setRateDateItemId(rateDateItem1.getId());
        rateService.setName("Service1");

        final HashSet<RateService> rateServices = new HashSet<>();
        rateServices.add(rateService);

        rateDateItem1.setServices(rateServices);

        log.info("Rate after save:{}", rate);

        rateRepository.save(rate);

        log.info("Rate after save:{}", rate);
    }

}
