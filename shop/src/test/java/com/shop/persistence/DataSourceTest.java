package com.shop.persistence;

import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringJUnitConfig(classes = ApplicationConfig.class)
@SpringBootTest
class DataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void testConnection() {
        try (Connection con = dataSource.getConnection()) {
            System.out.println("Connection is successful.");
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Connection failed: " + e.getMessage());
        }
    }
}
