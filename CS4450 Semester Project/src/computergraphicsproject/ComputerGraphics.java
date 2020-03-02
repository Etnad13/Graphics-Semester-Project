/** *************************************************************
 * file: CheckpointOne.java
 * author: D. Martinez
 * class: CS 4450 – Computer Graphics
 *
 * assignment: Program 2
 * date last modified: 2/23/2020
 *
 * purpose: This program will read coordinates from a text file aptly
 * 
 * 
 * 
 *
 *************************************************************** */
package computergraphicsproject;

import org.lwjgl.LWJGLException;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


public class ComputerGraphics {

    public static final int DISPLAY_HEIGHT = 480;
    public static final int DISPLAY_WIDTH = 640;
    public static final Logger LOGGER = Logger.getLogger(ComputerGraphics.class.getName());


    public static void main(String[] args) {
        ComputerGraphics main = null;
        try {
            System.out.println("To exit the program, click on the Close Button on top right");
            System.out.println("Or press ESC on keyboard to exit");
            main = new ComputerGraphics();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.toString(), ex);
        } finally {
            if (main != null) {
            }
        }
    }

}
