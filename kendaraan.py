# Superclass
class Kendaraan:
    def __init__(self, merk, tahun):
        self.merk = merk
        self.tahun = tahun
    
    def info(self):
        return f"Kendaraan {self.merk}, tahun produksi {self.tahun}"
    
    def kecepatan_maksimum(self):
        return "Kecepatan maksimum bervariasi berdasarkan tipe kendaraan."
    
    # Method overloading dalam Python dilakukan dengan parameter default
    def deskripsi(self, tipe=None):
        if tipe:
            return f"Kendaraan ini adalah {tipe} merek {self.merk}."
        else:
            return f"Ini adalah kendaraan merek {self.merk}."

# Subclass 1: Mobil
class Mobil(Kendaraan):
    def __init__(self, merk, tahun, jumlah_pintu):
        super().__init__(merk, tahun)
        self.jumlah_pintu = jumlah_pintu
    
    # Overriding method
    def kecepatan_maksimum(self):
        return "Kecepatan maksimum mobil sekitar 200 km/jam."

# Subclass 2: Motor
class Motor(Kendaraan):
    def __init__(self, merk, tahun, tipe_motor):
        super().__init__(merk, tahun)
        self.tipe_motor = tipe_motor
    
    # Overriding method
    def kecepatan_maksimum(self):
        return "Kecepatan maksimum motor sekitar 150 km/jam."

# Main program
def main():
    kendaraan1 = Kendaraan("Toyota", 2015)
    mobil1 = Mobil("Honda", 2020, 4)
    motor1 = Motor("Yamaha", 2018, "Sport")
    
    # Demonstrasi Inheritance
    print(kendaraan1.info())
    print(mobil1.info())  # Menggunakan method dari superclass
    print(motor1.info())
    
    # Demonstrasi Overriding
    print(kendaraan1.kecepatan_maksimum())
    print(mobil1.kecepatan_maksimum())  # Method overridden di subclass
    print(motor1.kecepatan_maksimum())
    
    # Demonstrasi Overloading
    print(kendaraan1.deskripsi())
    print(kendaraan1.deskripsi("SUV"))

if __name__ == "__main__":
    main()