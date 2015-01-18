package de.pi3g.pi.rcswitch;

import org.junit.Ignore;
import org.junit.Test;

import com.pi4j.io.gpio.RaspiPin;

/**
 * Remove @Ignore and change GPIO Number to launch test
 *
 */
public class RCSwitchTest {

    RCSwitch transmitter = new RCSwitch(RaspiPin.GPIO_00);

    @Test
    @Ignore
    public void testLoop() throws InterruptedException {
        while (true) {
                switchOn();
                Thread.sleep(1000);
                switchOff();
                Thread.sleep(1000);
        }
    }

    private void switchOn() {
        for (int i = 0; i < 10; i++) {
                transmitter.switchOn(1, 1);
        }
    }

    private void switchOff() {
        for (int i = 0; i < 10; i++) {
                transmitter.switchOff(1, 1);
        }
    }

}
