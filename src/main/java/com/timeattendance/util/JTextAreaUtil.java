/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.timeattendance.util;

import javax.swing.JTextArea;

/**
 *
 * @author pool13433
 */
public class JTextAreaUtil {
     public static void setCursorPosition(JTextArea textArea){
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
}
