Pi RC-Switch
============

A Java library to control remote switch units using a RC Transmitter (like
this one: http://www.watterott.com/de/RF-Link-Sender-434MHz) connected to the
Raspberry Pi.

how to build / use?
===================

The entire project is build with maven. Just clone the master branch, open the directory in NetBeans and hit run. Or if
you prefer the command line: 

    mvn install

should build everything correctly. 

You can then use the library in your Projects like this:

    <dependency>
        <groupId>com.pi3g.pi</groupId>
        <artifactId>pi-rcswitch</artifactId>
        <version>1.0</version>
    </dependency>
