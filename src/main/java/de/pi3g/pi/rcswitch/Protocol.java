/*
 * Copyright (C) 2018 Christoph Stiefel.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package de.pi3g.pi.rcswitch;

/**
 *
 * @author Christoph Stiefel
 */
public class Protocol {

    public static final Protocol PROTOCOL_01 = new Protocol(350, new Waveform(1, 31), new Waveform(1, 3), new Waveform(3, 1), false);   // protocol 1
    public static final Protocol PROTOCOL_02 = new Protocol(650, new Waveform(1, 10), new Waveform(1, 2), new Waveform(2, 1), false);   // protocol 2
    public static final Protocol PROTOCOL_03 = new Protocol(100, new Waveform(30, 71), new Waveform(4, 11), new Waveform(9, 6), false); // protocol 3
    public static final Protocol PROTOCOL_04 = new Protocol(380, new Waveform(1, 6), new Waveform(1, 3), new Waveform(3, 1), false);    // protocol 4
    public static final Protocol PROTOCOL_05 = new Protocol(500, new Waveform(6, 14), new Waveform(1, 2), new Waveform(2, 1), false);   // protocol 5
    public static final Protocol PROTOCOL_06 = new Protocol(450, new Waveform(23, 1), new Waveform(1, 2), new Waveform(2, 1), true);    // protocol 6 (HT6P20B)
    public static final Protocol PROTOCOL_07 = new Protocol(150, new Waveform(2, 62), new Waveform(1, 6), new Waveform(6, 1), false);   // protocol 7 (HS2303-PT, i. e. used in AUKEY Remote)

    public Protocol(int pulseLength, Waveform syncBit, Waveform zeroBit, Waveform oneBit, boolean invertedSignal) {
        this.pulseLength = pulseLength;
        this.syncBit = syncBit;
        this.zeroBit = zeroBit;
        this.oneBit = oneBit;
        this.invertedSignal = invertedSignal;
    }

    private final int pulseLength;
    private final Waveform syncBit;
    private final Waveform zeroBit;
    private final Waveform oneBit;
    private final boolean invertedSignal;

    public int getPulseLength() {
        return pulseLength;
    }

    public Waveform getSyncBit() {
        return syncBit;
    }

    public Waveform getZeroBit() {
        return zeroBit;
    }

    public Waveform getOneBit() {
        return oneBit;
    }

    public boolean isInvertedSignal() {
        return invertedSignal;
    }

}
