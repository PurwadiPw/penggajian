/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purwadi;

/**
 *
 * @author purwadi
 */
public class KaryawanKontrak extends Karyawan {
    
    private int gajiLembur;
    
    public KaryawanKontrak() {
    }

    public void KaryawanKontrak(String noid, String nama, String alamat, String tglLahir, String jenisKelamin, String status, int jmlAnak, String gol, int hariKerja, int jamLembur, double gajiLembur, double gapok) {
        super.setNoid(noid);
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setTglLahir(tglLahir);
        super.setJenisKelamin(jenisKelamin);
        super.setJamLembur(jamLembur);
    }
    
    public double gajiLembur(){        
        if(super.getJamLembur() <= 2) {
            gajiLembur = super.getJamLembur() * 1000;
        } else if(super.getJamLembur() <= 5) {
            gajiLembur = super.getJamLembur() * 500;
        } else {
            gajiLembur = super.getJamLembur() * 300;
        }
        return gajiLembur;
    }

    public double totalpenghasilan() {
        return super.gajipokok() + gajiLembur();
    }
}
