/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Email;
import Modelo.Notificacion;
import Modelo.SMS;
import Modelo.Servicio;
import Vista.Interfaz;
import javax.swing.SwingUtilities;

public class Control {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
        Notificacion emailNotificacion = new Email();
        Notificacion smsNotificacion = new SMS();
        
        Servicio emailServicio = new Servicio(emailNotificacion);
        Servicio smsServicio = new Servicio(smsNotificacion);
     
        emailServicio.UsuarioNotificado("email");
        smsServicio.UsuarioNotificado("SMS");
    }
}
