/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purwadi;

import java.util.Scanner;

/**
 *
 * @author purwadi
 */
public class Purwadi {

    /**
     * @param args the command line arguments
     */
    public void showKaryawan(String nik, String nama, String tglL, String gol, int anak, String jk, String stat) {
        Karyawan objK = new Karyawan();
        objK.setNoid(nik);
        objK.setNama(nama);
        objK.setTglLahir(tglL);
        objK.setGol(gol);
        objK.setJmlAnak(anak);
        objK.setJenisKelamin(jk);
        objK.setStatus(stat);

        System.out.println();
        System.out.println("============ DATA KARYAWAN =============");
        System.out.println("N I K         : " + objK.getNoid());
        System.out.println("Nama Karyawan : " + objK.getNama());
        System.out.println("Tgl. Lahir    : " + objK.getTglLahir());
        System.out.println("Golongan      : " + objK.getGol());
        System.out.println("Jenis Kelamin : " + objK.getJenisKelamin());
        System.out.println("Status        : " + objK.getStatus());
        System.out.println("Jumlah Anak   : " + objK.getJmlAnak());
    }
    
    public void showTetap(String nama, String gol, int anak, String jk, String stat){
        KaryawanTetap objKT = new KaryawanTetap();
        objKT.setNama(nama);
        objKT.setGol(gol);
        objKT.setJmlAnak(anak);
        objKT.setJenisKelamin(jk);
        objKT.setStatus(stat);

        System.out.println();
        System.out.println("====== DETAIL GAJI KARYAWAN TETAP ======");
        System.out.println("Nama Karyawan    : " + objKT.getNama());
        System.out.println("Gaji Pokok       : Rp "+Math.round(objKT.gajipokok()));
        System.out.println("Tunjangan Kshtn  : Ro "+Math.round(objKT.tunjanganKesehatan()));
        System.out.println("Tunjangan Istri  : Rp "+Math.round(objKT.tunjanganIstri()));
        System.out.println("Tunjangan Anak   : Rp "+Math.round(objKT.tunjanganAnak()));
        System.out.println("Total Penghasiln : Rp "+Math.round(objKT.totalpenghasilan()));
    }
    
    public void showKontrak(String nama, String gol, int anak, String jk, String stat){
        KaryawanTetap objKT = new KaryawanTetap();
        objKT.setNama(nama);
        objKT.setGol(gol);
        objKT.setJmlAnak(anak);
        objKT.setJenisKelamin(jk);
        objKT.setStatus(stat);

        System.out.println();
        System.out.println("====== DETAIL GAJI KARYAWAN KONTRAK ======");
        System.out.println("Nama Karyawan    : " + objKT.getNama());
        System.out.println("Gaji Pokok       : Rp "+Math.round(objKT.gajipokok()));
        System.out.println("Tunjangan Kshtn  : Ro "+Math.round(objKT.tunjanganKesehatan()));
        System.out.println("Tunjangan Istri  : Rp "+Math.round(objKT.tunjanganIstri()));
        System.out.println("Tunjangan Anak   : Rp "+Math.round(objKT.tunjanganAnak()));
        System.out.println("Total Penghasiln : Rp "+Math.round(objKT.totalpenghasilan()));
    }
    
    public void showHarian(String nama, String gol, int anak, String jk, String stat){
        KaryawanTetap objKT = new KaryawanTetap();
        objKT.setNama(nama);
        objKT.setGol(gol);
        objKT.setJmlAnak(anak);
        objKT.setJenisKelamin(jk);
        objKT.setStatus(stat);

        System.out.println();
        System.out.println("====== DETAIL GAJI KARYAWAN HARIAN ======");
        System.out.println("Nama Karyawan    : " + objKT.getNama());
        System.out.println("Gaji Pokok       : Rp "+Math.round(objKT.gajipokok()));
        System.out.println("Tunjangan Kshtn  : Ro "+Math.round(objKT.tunjanganKesehatan()));
        System.out.println("Tunjangan Istri  : Rp "+Math.round(objKT.tunjanganIstri()));
        System.out.println("Tunjangan Anak   : Rp "+Math.round(objKT.tunjanganAnak()));
        System.out.println("Total Penghasiln : Rp "+Math.round(objKT.totalpenghasilan()));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("N I K                : ");
        String nik = input.next();
        System.out.print("Nama Karyawan        : ");
        String nama = input.next();
        System.out.print("Tangga Lahir         : ");
        String tgl = input.next();
        System.out.print("Golongan (A/B/C/D)   : ");
        String gol = input.next();
        System.out.print("Jumlah Anak          : ");
        int anak = input.nextInt();
        System.out.print("Jenis Kelamin (L/P)  : ");
        String jk = input.next();
        System.out.print("Status Menikah (S/B) : ");
        String stat = input.next();
        System.out.println("Jenis Karyawan       : ");
        System.out.println(" 1. Karyawan Tetap");
        System.out.println(" 2. Karyawan Tidak Tetap");
        System.out.println(" 3. Karyawan Harian");
        System.out.print("Pilih Jenis Karyawan : ");
        int jnsKaryawan = input.nextInt();

        Purwadi objC = new Purwadi();
        objC.showKaryawan(nik, nama, tgl, gol, anak, jk, stat);
        
        if (jnsKaryawan == 1) {
            objC.showTetap(nama, gol, anak, jk, stat);
        } else if(jnsKaryawan == 2) {
            objC.showKontrak(nama, gol, anak, jk, stat);           
        } else if(jnsKaryawan == 3) {
            objC.showHarian(nama, gol, anak, jk, stat);
        }
    }
    
}
