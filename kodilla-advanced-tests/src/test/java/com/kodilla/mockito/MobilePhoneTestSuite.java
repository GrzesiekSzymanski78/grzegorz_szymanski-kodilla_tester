package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {

    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needCharging());
        Mockito.when(myPhone.needCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }
}