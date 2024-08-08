/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Email;
import Modelo.Notificacion;
import Modelo.SMS;
import Modelo.Servicio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    private JTextField messageField;
    private JComboBox<String> notificationTypeComboBox;
    private JButton sendButton;

    public Interfaz() {
        setTitle("Centro de notificaciones");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        JLabel messageLabel = new JLabel("Mensaje:");
        messageField = new JTextField();

        JLabel notificationTypeLabel = new JLabel("Tipo de medio:");
        notificationTypeComboBox = new JComboBox<>(new String[]{"Email", "SMS"});

        sendButton = new JButton("Enviar");

        add(messageLabel);
        add(messageField);
        add(notificationTypeLabel);
        add(notificationTypeComboBox);
        add(sendButton);

        sendButton.addActionListener(new SendButtonListener());
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = messageField.getText();
            String notificationType = (String) notificationTypeComboBox.getSelectedItem();

            Notificacion notificacion;
            if ("Email".equals(notificationType)) {
                notificacion = new Email();
            } else {
                notificacion = new SMS();
            }

            Servicio servicio = new Servicio(notificacion);
            servicio.UsuarioNotificado(message);

            JOptionPane.showMessageDialog(Interfaz.this, "Mensaje enviado: " + message);
        }
    }
}
