/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author alejo
 */
import java.time.LocalTime;

/**
 *
 * @author alejo
 */
public class NotaAlarma extends Nota {
    private LocalTime horaAlarma;

    public NotaAlarma(int id, String texto, LocalTime horaAlarma) {
        super(id, texto);
        this.horaAlarma = horaAlarma;
    }

    public LocalTime getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(LocalTime horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public String toString() {
        return "NotaAlarma{" +
                "id=" + super.getId() +
                ", texto='" + super.getTexto() + '\'' +
                ", horaAlarma=" + horaAlarma +
                '}';
    }
}

