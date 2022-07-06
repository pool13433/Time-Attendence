/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.timeattendance.util;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author pool13433
 */
public class Fonts {

    public static Font fontSarabun() {
        try {
            InputStream input = Fonts.class.getResource("D:\\Freelance\\TimeIn-Out\\NetBeansProjects\\TimeAttendance\\src\\resources\\fonts\\Sarabun.ttf").openStream();
            return Font.createFont(Font.TRUETYPE_FONT,input );
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException("Error loading resource:", e);
        }
    }
}
