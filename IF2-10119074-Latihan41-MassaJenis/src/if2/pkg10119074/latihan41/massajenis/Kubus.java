/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan41.massajenis;

/**
 *
 * @author Acer
 * NAMA     : HANDRIAN RIVALDI
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi :
 */
public class Kubus {
    private int sisi, massa;

    public int getSisi() {
        return this.sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return this.massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        return parSisi * parSisi * parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }
    
}
