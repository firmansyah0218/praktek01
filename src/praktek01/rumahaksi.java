/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Firman
 */
public class rumahaksi {
    public static void main(String[] args) {
        rumah pintu = new rumah ();
        pintu.warna="coklat";
        pintu.bahan="alumunium";
        pintu.model="minimalis";
        pintu.harga="110.000";
        pintu.merk="ALEXINDO ";
        
        rumah jendela = new rumah ();
        pintu.warna="hitam";
        pintu.bahan="besi";
        pintu.model="minimasi";
        pintu.harga="220.000";
        pintu.merk="ykk";
        
        rumah atap = new rumah ();
        pintu.warna="merah";
        pintu.bahan="baja";
        pintu.model="multi roof";
        pintu.harga="70.000";
        pintu.merk="sakura roof";
        
     pintu.cetakinfo();
        jendela.cetakinfo();
        atap.cetakinfo();
    }
   
}
