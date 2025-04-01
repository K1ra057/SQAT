package edu.hridasov;

/*
@autrhor Дима
@project YakistPzLab4
@class RomanConverterTest
@version 1.0.0
@sinc 01.04.2025 - 22 - 54
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RomanConverterTest {

    @Test
    void shouldConvertOneToRoman() {
        assertEquals("I", RomanConverter.intToRoman(1));
    }

    @Test
    void shouldConvertFiveToRoman() {
        assertEquals("V", RomanConverter.intToRoman(5));
    }

    @Test
    void shouldConvertTenToRoman() {
        assertEquals("X", RomanConverter.intToRoman(10));
    }

    @Test
    void shouldConvertFiftyToRoman() {
        assertEquals("L", RomanConverter.intToRoman(50));
    }

    @Test
    void shouldConvertHundredToRoman() {
        assertEquals("C", RomanConverter.intToRoman(100));
    }

    @Test
    void shouldConvertFiveHundredToRoman() {
        assertEquals("D", RomanConverter.intToRoman(500));
    }

    @Test
    void shouldConvertThousandToRoman() {
        assertEquals("M", RomanConverter.intToRoman(1000));
    }

    @Test
    void shouldConvertFourToRoman() {
        assertEquals("IV", RomanConverter.intToRoman(4));
    }

    @Test
    void shouldConvertNineToRoman() {
        assertEquals("IX", RomanConverter.intToRoman(9));
    }

    @Test
    void shouldConvertFortyToRoman() {
        assertEquals("XL", RomanConverter.intToRoman(40));
    }

    @Test
    void shouldConvertNinetyToRoman() {
        assertEquals("XC", RomanConverter.intToRoman(90));
    }

    @Test
    void shouldConvertFourHundredToRoman() {
        assertEquals("CD", RomanConverter.intToRoman(400));
    }

    @Test
    void shouldConvertNineHundredToRoman() {
        assertEquals("CM", RomanConverter.intToRoman(900));
    }

    @Test
    void shouldConvertTwentyToRoman() {
        assertEquals("XX", RomanConverter.intToRoman(20));
    }

    @Test
    void shouldConvertFortyFiveToRoman() {
        assertEquals("XLV", RomanConverter.intToRoman(45));
    }

    @Test
    void shouldConvertNinetyNineToRoman() {
        assertEquals("XCIX", RomanConverter.intToRoman(99));
    }

    @Test
    void shouldConvertTwoHundredFiftyToRoman() {
        assertEquals("CCL", RomanConverter.intToRoman(250));
    }

    @Test
    void shouldConvertSevenHundredNinetyToRoman() {
        assertEquals("DCCXC", RomanConverter.intToRoman(790));
    }

    @Test
    void shouldConvertNineteenHundredToRoman() {
        assertEquals("MCM", RomanConverter.intToRoman(1900));
    }

    @Test
    void shouldConvertTwoThousandFourHundredFiftyToRoman() {
        assertEquals("MMCDL", RomanConverter.intToRoman(2450));
    }

    @Test
    void shouldConvertThreeThousandToRoman() {
        assertEquals("MMM", RomanConverter.intToRoman(3000));
    }

    @Test
    void shouldConvertThreeThousandThreeHundredThirtyThreeToRoman() {
        assertEquals("MMMCCCXXXIII", RomanConverter.intToRoman(3333));
    }

    @Test
    void shouldConvertFourThousandToRoman() {
        assertEquals("MMMM", RomanConverter.intToRoman(4000));
    }

    @Test
    void shouldConvertFiveThousandToRoman() {
        assertEquals("MMMMM", RomanConverter.intToRoman(5000));
    }

    @Test
    void shouldConvertSixThousandToRoman() {
        assertEquals("MMMMMM", RomanConverter.intToRoman(6000));
    }

    @Test
    void shouldConvertSevenThousandToRoman() {
        assertEquals("MMMMMMM", RomanConverter.intToRoman(7000));
    }

    @Test
    void shouldConvertEightThousandToRoman() {
        assertEquals("MMMMMMMM", RomanConverter.intToRoman(8000));
    }

    @Test
    void shouldConvertNineThousandToRoman() {
        assertEquals("MMMMMMMMM", RomanConverter.intToRoman(9000));
    }

    @Test
    void shouldConvertEdgeCases() {
        assertEquals("MMMCM", RomanConverter.intToRoman(3900));  // 3900
        assertEquals("MMMCMXC", RomanConverter.intToRoman(3990)); // 3990
        assertEquals("MMMCMXCIX", RomanConverter.intToRoman(3999)); // 3999 (максимально возможное)
        assertEquals("MDCCLXXVI", RomanConverter.intToRoman(1776)); // 1776 (год США)
        assertEquals("MMXXV", RomanConverter.intToRoman(2025)); // 2025 (текущий год +1)
    }
}
