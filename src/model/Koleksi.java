
package model;

/**
 *
 * @author gwace
 */

// [Atribusi AI]: Class Koleksi (atribut, konstruktor, method abstract
// layakDipinjam(), deskripsi(), dan getter) dibantu AI untuk merancang kelas
// induk abstract bagi seluruh jenis koleksi.
public abstract class Koleksi {

    protected String kodeKoleksi;
    protected String judul;
    protected int tahunTerbit;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    // Method abstract: setiap turunan wajib mengisinya sesuai aturannya sendiri
    public abstract boolean layakDipinjam();

    public String deskripsi() {
        return kodeKoleksi + " - " + judul + " (" + tahunTerbit + ")";
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}