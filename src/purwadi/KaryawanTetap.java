/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purwadi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author purwadi
 */
public class KaryawanTetap extends Karyawan {

    private double tanak;

    public KaryawanTetap() {
    }

    public void KaryawanTetap(String noid, String nama, String alamat, String tglLahir, String jenisKelamin, String status, int jmlAnak, String gol, double gapok) {
        super.setNoid(noid);
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setTglLahir(tglLahir);
        super.setJenisKelamin(jenisKelamin);
        super.setJmlAnak(jmlAnak);
        super.setStatus(status);
    }

    public double tunjanganKesehatan() {
        return 0.2 * super.getGapok();
    }

    public double tunjanganIstri() {
        if ((super.getStatus().equals("S") || super.getStatus().equals("s")) && (super.getJenisKelamin().equals("L") || super.getJenisKelamin().equals("l"))) {
            return 0.4 * super.getGapok();
        } else {
            return 0.0;
        }

    }

    public double tunjanganAnak() {
        if (super.getJmlAnak() <= 3) {
            tanak = 0.2 * super.getJmlAnak() * super.getGapok();
        } else if (super.getJmlAnak() > 3) {
            tanak = 0.2 * 3 * super.getGapok();
        } else {
            tanak = 0.0 * super.getGapok();
        }
        return tanak;
    }

    public double totalpenghasilan() {
        return super.gajipokok() + tunjanganKesehatan() + tunjanganIstri() + tunjanganAnak();
    }
    
}
