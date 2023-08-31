<p>Nama : Muhammad Arief Satria Wibawa</p>
<p>NRP : 3122600015</p>
<p>Kelas : D4 IT A</p>

**<h1 style="font-family:bahnschrift;">Three Way Handshaking</h1>**
<img src="assets/3 way handshake.webp" alt="Three way handshake">


***<h3 style="font-family:bahnschrift;">Pengertian</h3>***
><div class ="isi" style="font-family:bahnschrift;">Three Way Handshake ialah metode yang digunakan dalam jaringan TCP/IP untuk membuat koneksi antara host/klien dan local server. Three Way Handshake dirancang untuk memungkinkan client dan server berkomunikasi untuk menegosiasikan parameter koneksi soket TCP jaringan secara bersamaan sebelum data seperti HTTP dan SSH ditransmisikan.
<br>

***<h3 style="font-family:bahnschrift;">Langkah-langkah</h3>***
<img src="assets/three way handshake.webp" alt="Three way handshake">

* SYN(Synchronazion) 
 Client mengirimkan paket SYN ke server yang berisi sequence number yang di-generate oleh client
* SYN+ACK(Synchronazion Acknowledge)
 Server menerima paket SYN dari client dan mengirimkan paket SYN-ACK ke client yang berisi sequence number yang di-generate secara acak oleh server dan sequence number ACK yang merupakan 1 lebih besar dari sequence number SYN dari klien.
* ACK(Acknowledge)
 Klien menerima paket SYN-ACK dari server dan mengirimkan paket ACK ke server. Paket ACK berisi nomor urut ACK yang merupakan 1 lebih besar dari nomor urut SYN-ACK dari server.

***<h3 style="font-family:bahnschrift;">Manfaat</h3>***
* <div class ="isi" style="font-family:bahnschrift;">Memastikan bahwa kedua perangkat telah menyetujui parameter koneksi, seperti sequence number dan ukuran jendela transmisi.
* <div class ="isi" style="font-family:bahnschrift;">Membantu untuk mencegah serangan Denial-of-Service (DoS), yang merupakan serangan yang dilakukan untuk membanjiri server dengan permintaan sehingga server tidak dapat melayani permintaan yang sah, sampai koneksi TCP sudah dibuat
* <div class ="isi" style="font-family:bahnschrift;">Meningkatkan keandalan dan efisiensi transfer data, dengan cara memastikan bahwa kedua perangkat telah siap untuk memulai transfer data, yang dapat membantu untuk mengurangi waktu yang diperlukan untuk memulai transfer data dan mengurangi kemungkinan data hilang.