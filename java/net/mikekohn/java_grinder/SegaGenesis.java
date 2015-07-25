/**
 *  Java Grinder
 *  Author: Michael Kohn
 *   Email: mike@mikekohn.net
 *     Web: http://www.naken.cc/
 * License: GPL
 *
 * Copyright 2014-2015 by Michael Kohn
 *
 */

package net.mikekohn.java_grinder;

abstract public class SegaGenesis
{
  protected SegaGenesis() { }

  /** Set a the palette pointer.  Sets the palette pointer to the next
      palette color to change.  Must be called directly before calling
      setPaletteColor.  The index must be between 0 and 63 otherwise
      the behavior is unknown. */
  public static void setPalettePointer(int index) { }

  /** Set a palette color.  Can only be called after setPalettePointer is
      called.  After setting a color, the palette pointer is incremented
      by 1 so if the palette colors 0 to 3 need to be updated, first call
      setPalettePointer(0), and then call setPaletteColor() 4 times.  The
      color takes a binary format of 0000 BBB0 GGG0 RRR0. */
  public static void setPaletteColor(int color) { }

  /** Setup pattern table and display area for plotting pixels. */
  public static void initBitmap() { }

  /** Clear pattern table (called after initBitmap to set entire display
      to palette color 0). */
  public static void clearBitmap() { }

  /** Set a pixel in the 128x128 bitmap */
  public static void plot(int x, int y, int color) { }

  /** Set the VDP bitmap pointer to point to the next pattern address. */
  public static void setPlotAddress(int address) { }

  /** Set the next 4 pixels at the next word in the pattern table. */
  public static void fastPlot(int color0, int color1, int color2, int color3) { }

  /** Load fonts. */
  public static void loadFonts() { }

  /** Move the text cursor to where the next character will be printed. */
  public static void setCursor(int x, int y) { }

  /** Print a character to the screen.  Must call setCursor() first.
      The cursor will increment for every character printed. */
  public static void printChar(char c) { }

  /** Print a string of characters to the screen.  Must call
      setCursor() first.  The cursor will increment for every
      character printed. */
  public static void print(String text) { }

  /** Set horizontal scroll value. */
  public static void setHorizontalScroll(int value) { }

  /** Set vertical scroll value. */
  public static void setVerticalScroll(int value) { }

  /** Set pattern table. */
  public static void setPatternTable(int[] patterns) { }

  /** Set image data. */
  public static void setImageData(short[] image) { }

  /** Set palette colors. */
  public static void setPaletteColors(short[] palette) { }

  /** Load code up to 8k in size into the Z80 process space.  Z80 will
      be reset by the API and code will start running. */
  public static void loadZ80(byte[] code) { }

  /** Reset the Z80. */
  public static void resetZ80() { }

  /** Pause Z80.  Needed so 68k can access something in Z80 space along
      with just pausing the thing. */
  public static void pauseZ80() { }

  /** Start Z80.  Let the Z80 run again. */
  public static void startZ80() { }
}

