package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GeoServiceImplCoordinatesTest {

    @ParameterizedTest
    @CsvSource(value = {
            "55.7522200, 37.6155600",
            "40.7142700, -74.0059700",
    })
    void byCoordinates(double latitude, double longitude) {
        GeoServiceImpl tmp = new GeoServiceImpl();
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> tmp.byCoordinates(latitude, longitude));
        assertThat("Not implemented", is(thrown.getMessage()));

    }

}