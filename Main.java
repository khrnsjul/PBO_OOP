public class Main {
    public static void main(String[] args) {
        TiketPesawat pesawat = new TiketPesawat("Ekonomi", 1500000, "Garuda Indonesia");
        TiketHotel hotel = new TiketHotel("Deluxe", 800000, "Hotel Indonesia");
        
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.pesanTiket(pesawat);
        pemesanan.pesanTiket(hotel);
        pemesanan.pesanTiket(pesawat, 2);
        pemesanan.pesanTiket(hotel, 3);
    }
}
