/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Servicio {
    private Notificacion notificacion;

    public Servicio(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void UsuarioNotificado(String mensaje) {
        notificacion.send(mensaje);
    }
}
