class Tiket {
    protected String jenis;
    protected double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Tiket: " + jenis + " | Harga: " + harga);
    }
}

class TiketPesawat extends Tiket {
    private String maskapai;

    public TiketPesawat(String jenis, double harga, String maskapai) {
        super(jenis, harga);
        this.maskapai = maskapai;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Tiket Pesawat: " + jenis + " | Maskapai: " + maskapai + " | Harga: " + harga);
    }
}

class TiketHotel extends Tiket {
    private String namaHotel;
    
    public TiketHotel(String jenis, double harga, String namaHotel) {
        super(jenis, harga);
        this.namaHotel = namaHotel;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Tiket Hotel: " + jenis + " | Hotel: " + namaHotel + " | Harga: " + harga);
    }
}

class Pemesanan {
    public void pesanTiket(Tiket tiket) {
        tiket.tampilkanInfo();
    }
    
    public void pesanTiket(TiketPesawat tiket, int jumlah) { // Overloading
        System.out.println("Memesan " + jumlah + " tiket pesawat.");
        tiket.tampilkanInfo();
    }
    
    public void pesanTiket(TiketHotel tiket, int jumlah) { // Overloading
        System.out.println("Memesan " + jumlah + " kamar hotel.");
        tiket.tampilkanInfo();
    }
}
    

