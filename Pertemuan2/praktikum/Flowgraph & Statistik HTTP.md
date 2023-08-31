<p>Nama : Muhammad Arief Satria Wibawa</p>
<p>NRP : 3122600015</p>
<p>Kelas : D4 IT A</p>

**<h1 style="font-family:bahnschrift;">Analisis Flowgraph dari Request HTTP dan Statistik Pada HTTP</h1>**


**<h2 style="font-family:bahnschrift;">1. Flowgraph dari Request HTTP</h2>**

<img src="assets/flowgraph1.png" alt="flow1">

**<h3 style="font-family:bahnschrift;">Detik 0 - 1: Permulaan Permintaan HTTP</h3>**

* <div class ="isi" style="font-family:bahnschrift;">Detik 0: User memasukkan URL situs web di Client dan menekan "Enter".
* <div class ="isi" style="font-family:bahnschrift;">Detik 1: Client User menginisiasi koneksi dengan server tujuan menggunakan protokol TCP/IP. Proses ini melibatkan tiga langkah, yaitu perancangan koneksi, sinkronisasi urutan nomor urut, dan pertukaran informasi tentang ukuran jendela.

**<h3 style="font-family:bahnschrift;">Detik 2 - 3: Permintaan HTTP</h3>**

* Detik 2: Setelah koneksi terbentuk, Client mengirimkan pesan SYN (synchronize) ke alamat IP server yang sesuai dan port 80 (port default untuk HTTP). Ini merupakan langkah pertama dalam proses TCP handshake.
* Detik 3: User Client menerima pesan SYN-ACK dari server dan mengirimkan pesan ACK (acknowledge) sebagai tanggapan. Tahap ini menyelesaikan proses TCP handshake dan membuka koneksi TCP yang stabil antara peramban Anda dan server di port 80.


<img src="assets/flowgraph2.png" alt="flow2">

**<h3 style="font-family:bahnschrift;">Detik 4 - 8: Proses Server</h3>**
*  Detik 4: Setelah koneksi terbuka, User Client mengirimkan permintaan HTTP GET ke server untuk alamat URL yang diminta. Permintaan ini mencakup informasi seperti alamat URL lengkap dan header permintaan HTTP.

*  Detik 5: Jika sumber daya adalah halaman statis, server akan mengambil berkas tersebut dari sistem file atau memori cache, dan kemudian mempersiapkannya untuk pengiriman.

* Detik 6-7: Jika sumber daya adalah halaman dinamis (misalnya, halaman web yang dihasilkan secara dinamis dari database), server akan menjalankan skrip atau program yang diperlukan untuk menghasilkan konten yang sesuai.

* Detik 8: Server memasukkan konten yang dihasilkan ke dalam pesan respons HTTP, termasuk status kode (misalnya, 200 OK jika berhasil) dan header respons (seperti jenis konten dan panjang konten).

**<h3 style="font-family:bahnschrift;">Detik 9 - 12: Pengiriman Respons HTTP</h3>**
* Detik 9: Respons HTTP, yang berisi konten yang diminta, dikirimkan kembali ke Client User melalui koneksi TCP yang sama.

* Detik 10: Client User menerima respons HTTP dan memulai penguraian respons.

* Detik 11: Jika respons berisi halaman HTML, Client User mulai memproses kode HTML, menampilkan teks, gambar, dan elemen lainnya secara bertahap.

* Detik 12: Selama proses penguraian, Client User juga akan mengambil sumber daya tambahan yang diperlukan, seperti gambar, CSS, atau JavaScript yang disebutkan dalam kode HTML. Ini mungkin melibatkan permintaan tambahan ke server untuk mengunduh sumber daya ini.

**<h3 style="font-family:bahnschrift;">Detik 17 - 30: Menampilkan Halaman Web</h3>**
* Detik 17-30: Selama Tahap ini, peramban Anda terus memuat dan menampilkan konten halaman web yang dihasilkan oleh server. Ini mencakup tindakan seperti memuat gambar, CSS, JavaScript, dan sumber daya lain yang diperlukan untuk menampilkan halaman dengan benar. Jika ada permintaan tambahan, mereka akan terjadi melalui koneksi TCP yang sama pada port 80.
<br>

**<h2 style="font-family:bahnschrift;">2. Statistik HTTP dengan Packet Counter</h2>**

**<h4 style="font-family:bahnschrift;">Apa itu Packet Counter?</h4>**
> <div class ="isi" style="font-family:bahnschrift;">Packet Counter merupakan alat yang membantu memahami apa yang sedang terjadi di jaringan internet dengan menghitung dan menampilkan paket atau frame dalam sebuah capture atau sesi pemantauan jaringan. Adapun informasi penting terkait lalu lintas jaringan yang diberikan yaitu jumlah total packet, laju masuk paket, distribusi paket, burst rate, waktu awal burst.

<img src="assets/packetcounter.png">

> <div class ="isi" style="font-family:bahnschrift;">Dari capture Packet Counter di atas, dapat disimpulkan bahwa ada 4 paket HTTP yang direkam, semuanya terkait dengan lalu lintas HTTP. Dari 4 paket ini, 2 adalah permintaan (request) HTTP yang semuanya menggunakan metode GET. 
> <div class ="isi" style="font-family:bahnschrift;">Sisanya adalah respon dari server web, dengan semua respon memiliki kode status HTTP dalam kategori 2xx (keberhasilan), khususnya "200 OK". 
> <div class ="isi" style="font-family:bahnschrift;">Burst rate untuk baik permintaan GET maupun respon adalah 0.0100 paket per detik, dengan burst rate pertama kali dimulai pada saat yang berbeda (0.911 detik untuk permintaan GET dan 3.956 detik untuk respon). 
> <div class ="isi" style="font-family:bahnschrift;">Laju masuk rata-rata adalah 0.0005 paket per milidetik. Jadi, capture ini menunjukkan bahwa terdapat pertukaran data HTTP yang terutama terdiri dari permintaan GET dan respon 200 OK yang berhasil.