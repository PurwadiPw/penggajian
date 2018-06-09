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
public class Karyawan {

    private String noid;
    private String nama;
    private String alamat;
    private String tglLahir;
    private String jenisKelamin;
    private String status;
    private int jmlAnak;
    private String gol;
    private int hariKerja;
    private int jamLembur;
    private double gajiLembur;
    private double gapok;

    public Karyawan() {
    }

    public Karyawan(String noid, String nama, String alamat, String tglLahir, String jenisKelamin, String status, int jmlAnak, String gol, int hariKerja, int jamLembur, double gajiLembur, double gapok) {
        this.noid = noid;
        this.nama = nama;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.jmlAnak = jmlAnak;
        this.gol = gol;
        this.hariKerja = hariKerja;
        this.jamLembur = jamLembur;
        this.gajiLembur = gajiLembur;
        this.gapok = gapok;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getGapok() {
        return gapok;
    }
    public void setGapok(double gapok) {
        this.gapok = gapok;
    }
    public String getGol() {
        return gol;
    }
    public void setGol(String gol) {
        this.gol = gol;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getJmlAnak() {
        return jmlAnak;
    }

    public void setJmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(int gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double gajipokok() {
        if (gol.equals("A")) {
            gapok = 2000000;
        } else if (gol.equals("B")) {
            gapok = 3000000;
        }else if (gol.equals("C")) {
            gapok = 4000000;
        }else if (gol.equals("D")) {
            gapok = 5000000;
        }
        return gapok;
    }

    public double gajipokokHarian() {
        if (gol.equals("A")) {
            gapok = 66000;
        } else if (gol.equals("B")) {
            gapok = 100000;
        }else if (gol.equals("C")) {
            gapok = 133000;
        }else if (gol.equals("D")) {
            gapok = 166000;
        }
        return gapok;
    }
}
