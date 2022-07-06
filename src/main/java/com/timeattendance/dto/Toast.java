/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.timeattendance.dto;

/**
 *
 * @author pool13433
 */
public class Toast {

    private ToastText folderPathNotFound;

    public ToastText getFolderPathNotFound() {
        return folderPathNotFound;
    }

    public void setFolderPathNotFound(ToastText folderPathNotFound) {
        this.folderPathNotFound = folderPathNotFound;
    }

    @Override
    public String toString() {
        return "Toast{" + "folderPathNotFound=" + folderPathNotFound + '}';
    }
    
    

}
