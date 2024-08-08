/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class SMS implements Notificacion {
    @Override
    public void send(String mensaje) {
        System.out.println("Enviando SMS... " + mensaje);
    }
}
