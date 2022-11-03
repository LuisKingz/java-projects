/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import java.util.ArrayList;
import java.util.List;

enum form {WAV, MP3, MIDI, AVI, MOV, MPG, CDAUDIO, DVD;
  
};

public class TiendaDiscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Disco> disco = new ArrayList<>();
        disco.add(new Disco("Given Up", "Linkin Park", form.AVI.toString(), 3.5));
        disco.add(new Disco("Vete Ya", "Valentín Elizalde", form.CDAUDIO.toString(), 4.5));
        disco.add(new Disco("In The End", "Linkin Park", form.MOV.toString(), 2.5));
        disco.add(new Disco("En Las Danzas y En Los Sueños", "HTTYD", form.WAV.toString(), 1.5));
        disco.add(new Disco("Sorry", "Justin Beber", form.MIDI.toString(), 7.5));
        
        for (Disco disco1 : disco) {
            System.out.println("Cancion --> " + disco1);
        }
    }

}
