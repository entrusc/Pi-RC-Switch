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


how to build?
=============

The entire project is build with maven. Just clone the master branch, open the directory in NetBeans and hit run. Or if
you prefer the command line: 

    mvn install

should build everything correctly. 
