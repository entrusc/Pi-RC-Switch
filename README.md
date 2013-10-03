Pi RC-Switch
============

A Java library to control remote switch units using a RC Transmitter (like
this one: http://www.watterott.com/de/RF-Link-Sender-434MHz) connected to the
Raspberry Pi.

This is basically a port of Suat Özgür's RC Transmitter library for Ardunio
which you can find here: https://code.google.com/p/rc-switch/

how to use?
===========
You can then use the library in your maven projects like this:

    <dependency>
        <groupId>de.pi3g.pi</groupId>
        <artifactId>pi-rcswitch</artifactId>
        <version>1.0</version>
    </dependency>

The hardware RF-Link-Sender must be connected like this

* DATA IN to any GPIO-Data-Pin on the Pi. This pin is then provided to the constructor.
* VCC to +5V on the Pi (PIN2)
* GND with a ground pin (PIN6 for example)

Then you can use the RF-Link-Sender like this:

    //our switching group address is 01011 (marked with 1 to 5 on the DIP switch
    //on the switching unit itself)
    BitSet address = RCSwitch.getSwitchGroupAddress("01011");

    RCSwitch transmitter = new RCSwitch(RaspiPin.GPIO_00);
    transmitter.switchOn(address, 1); //switches the switch unit A (A = 1, B = 2, ...) on
    Thread.sleep(5000); //wait 5 sec.
    transmitter.switchOff(address, 1); //switches the switch unit A off

In this example the DATA IN is connected to GPIO Pin 0, the group address (which can
be set on the switch unit) is 01011 and the switch unit to trigger is
unit A.

how to build?
=============

The entire project is build with maven. Just clone the master branch, open the directory in NetBeans and hit run. Or if
you prefer the command line: 

    mvn install

should build everything correctly. 
