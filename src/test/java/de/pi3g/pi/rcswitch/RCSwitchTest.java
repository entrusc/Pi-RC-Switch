package de.pi3g.pi.rcswitch;

import org.junit.Test;

import com.pi4j.io.gpio.RaspiPin;

public class RCSwitchTest {

	@Test
	public void testLoop() throws InterruptedException {
		RCSwitch transmitter = new RCSwitch(RaspiPin.GPIO_00);

		int it = 0;
		while (it < 10) {
			transmitter.switchOn(1, 1);
			Thread.sleep(1000);
			transmitter.switchOff(1, 1);
			it++;
		}

	}

}
