package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTests
{
    @Test
    public void getColor_shouldReturnRed_forHearts(){
        //arrange
        Card card = new Card("Hearts", "Q");

        //act
        String color = card.getColor();

        //assert
        String expectedColor = "Red";
        assertEquals(expectedColor, color, "Because the card is queen of HEarts")
    }

}