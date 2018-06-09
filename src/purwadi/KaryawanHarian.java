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
public class KaryawanHarian extends Karyawan {
    
    private int gajiHarian;
    
    public KaryawanHarian() {
    }

    public void KaryawanHarian(String noid, String nama, String alamat, String tglLahir, String jenisKelamin, String status, int jmlAnak, String gol, int hariKerja, int jamLembur, double gajiLembur, double gapok) {
        super.setNoid(noid);
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setTglLahir(tglLahir);
        super.setJenisKelamin(jenisKelamin);
        super.setHariKerja(hariKerja);
    }
    
    public double gajiHarian(){        
        return super.gajipokokHarian();
    }

    public double totalpenghasilan() {
        return gajiHarian() * super.getHariKerja();
    }
}
