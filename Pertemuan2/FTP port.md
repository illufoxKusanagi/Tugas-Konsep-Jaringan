<p>Nama : Muhammad Arief Satria Wibawa</p>
<p>NRP : 3122600015</p>
<p>Kelas : D4 IT A</p>

**<h1 style="font-family:bahnschrift;">Apa itu FTP, TCP, dan UDP?</h1>**



**<h3 style="font-family:bahnschrift;">FTP</h3>**

>FTP (File Transfer Protocol) ialah protokol komunikasi standar yang digunakan untuk transfer file dari satu komputer ke komputer lain melalui jaringan. FTP dibangun pada arsitektur model client-server menggunakan kontrol terpisah dan koneksi data antara client dan server. FTP memungkinkan user untuk mengirimkan data dengan mudah dan aman.

**<h3 style="font-family:bahnschrift;">TCP</h3>**
>TCP (Transmission Connection Protocol) ialah protokol transport yang berbasis koneksi, yang berarti TCP akan membuat koneksi terlebih dahulu sebelum memulai transfer data. Koneksi ini akan dijaga selama pengirima data berlangsung.

**<h3 style="font-family:bahnschrift;">UDP</h3>**
>UDP (User Datagram Protocol) adalah protokol transport yang tidak berbasis koneksi, yang berarti UDP tidak akan membuat koneksi terlebih dahulu sebelum memulai transfer data. UDP akan mengirimkan paket data secara langsung tanpa perlu menunggu koneksi dibuat. Hal ini membuat UDP lebih cepat dan efisien untuk transfer data yang kecil dan tidak penting.

**<h1 style="font-family:bahnschrift;">Mengapa FTP bisa menggunakan TCP atau UDP?</h1>**

><div class ="isi" style="font-family:bahnschrift;">FTP dapat menggunakan TPC dan UDP karena keduanya adalah protokol transport yang dapat digunakan untuk transfer data, dengan kelebihan dan kekurangannya masing-masing. Selain itu, FTP dapat menggunakan TCP atau UDP dengan tujuan yang berbeda.
><div class ="isi" style="font-family:bahnschrift;">TCP digunakan untuk mentranfer data berupa file tertentu. Sedangkan UDP digunakan untuk mentransfer data yang biasanya berupa transfer data konfigurasi. 

<img src="assets/TCP UDP.webp" alt="TCP and UDP">

**<h3 style="font-family:bahnschrift;">Kelebihan dan keruangan TCP dan UDP</h3>**

<table style="font-family:bahnschrift;">
<tr>
    <th>Fitur</th>
    <th>TCP</th>
    <th>UDP</th>
</tr>
<tr>
    <td>Membutuhkan Koneksi Internet</td>
    <td>Ya</td>
    <td>Tidak</td>
</tr>
<tr>
    <td>Membutuhkan Handshaking</td>
    <td>Ya</td>
    <td>Tidak</td>
</tr>
<tr>
    <td>Reliability/Keandalan</td>
    <td>Tinggi</td>
    <td>Rendah</td>
</tr>
<tr>
    <td>Efisiensi</td>
    <td>Rendah</td>
    <td>Tinggi</td>
</tr>
<tr>
    <td>Waiting Time</td>
    <td>Tinggi</td>
    <td>Rendah</td>
</tr>
</table>
<br>

**<h3 style="font-family:bahnschrift;">TCP vs UDP</h3>**

<img src="assets/tcpUdp2.png" alt="TCP vs UDP">

><div class ="isi" style="font-family:bahnschrift;">FTP menggunakan TCP untuk transfer data berupa file, yang mana besar dan penting, karena TCP lebih handal untuk mengirim data tersebut. Dta yang dikirim menggunakan TCP tidak akan hilang dan terkirim ke alamat yang benar. Sedangkan FTP akan menggunakan UDP untuk mengirim data kecil yang tidak penting, karena lebih cepat dan efisien untuk transfer data tersebut, walaupun UDP tidak akan memastikan semua data terkirim dengan benar.
