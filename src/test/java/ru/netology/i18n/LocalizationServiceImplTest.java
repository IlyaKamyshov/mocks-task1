package ru.netology.i18n;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.entity.Country;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LocalizationServiceImplTest {

    @ParameterizedTest
    @CsvSource(value = {
            "RUSSIA, Добро пожаловать",
            "BRAZIL, Welcome",
            "GERMANY, Welcome",
            "USA, Welcome"
    })
    void locale(String country, String expected) {
        Country countryEnum = Country.valueOf(country);
        LocalizationServiceImpl tmp = new LocalizationServiceImpl();
        String actual = tmp.locale(countryEnum);
        assertThat(actual, is(expected));
    }

}