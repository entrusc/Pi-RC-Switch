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
public class Waveform {

    public Waveform(int low, int high) {
        this.low = low;
        this.high = high;
    }

    private final int low;
    private final int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

}
