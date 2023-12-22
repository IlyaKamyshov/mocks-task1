package ru.netology.geo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.entity.Location;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GeoServiceImplIPTest {

    @ParameterizedTest
    @CsvSource(value = {
            "127.0.0.1, null",
            "172., RUSSIA",
            "96., USA",
            "97., null"
    })
    void byIp(String ip, String expected) {
        GeoServiceImpl tmp = new GeoServiceImpl();
        Location actualTmp = tmp.byIp(ip);
        String actual = (actualTmp == null || actualTmp.getCountry() == null) ? "null" : actualTmp.getCountry().name();
        assertThat(actual, is(expected));
    }

}