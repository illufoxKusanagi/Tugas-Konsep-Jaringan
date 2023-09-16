```Copy Code
Nama   : Muhammad Arief Satria Wibawa</p>
NRP    : 3122600015</p>
Kelas  : D4 IT A</p>
```

**<h1 style="font-family:bahnschrift;">CONNECTION TERMINATION</h1>**
***

***<h2 style="font-family:bahnschrift;">Pengertian</h2>***
 <div class ="isi" style="font-family:bahnschrift;"> Connection termination adalah proses penghentian koneksi antara dua perangkat jaringan. Proses ini dapat diinisiasi oleh salah satu perangkat atau oleh keduanya. 
 
 <div class ="isi" style="font-family:bahnschrift;">Connection termination biasanya dilakukan dengan cara mengirimkan pesan khusus, seperti pesan FIN (Finish) dalam protokol TCP. Pesan FIN akan memberitahukan perangkat lain bahwa perangkat yang mengirimkan pesan FIN tidak akan mengirimkan data lagi. Perangkat penerima pesan FIN akan membalas dengan pesan ACK (Acknowledgment) untuk mengonfirmasi bahwa pesan FIN telah diterima. 
 
 <div class ="isi" style="font-family:bahnschrift;">Connection termination terbagi menjadi 2, yakni full closed dan half closed

***<h4 style="font-family:bahnschrift;">1. Full Closed</h4>***
 <div class ="isi" style="font-family:bahnschrift;">Connection yang telah ditutup sepenuhnya. yang mana kedua host tidak lagi dapat berkomunikasi satu sama lain. Connection full closed biasanya terjadi ketika salah satu host atau perangkat jaringan mengirimkan pesan close. Pesan close ini akan diterima oleh host atau perangkat jaringan lain, dan kemudian connection akan ditutup.

 ***<h4 style="font-family:bahnschrift;">2. Half Closed</h4>***
 <div class ="isi" style="font-family:bahnschrift;">Connection yang hanya ditutup dari satu sisi. Hal ini berarti bahwa satu host atau perangkat jaringan dapat berkomunikasi dengan host atau perangkat jaringan lain, tetapi host atau perangkat jaringan lain tidak dapat berkomunikasi dengan host atau perangkat jaringan pertama. Connection half closed biasanya terjadi ketika salah satu host atau perangkat jaringan mengirimkan pesan close, tetapi host atau perangkat jaringan lain belum siap untuk menutup connection.

 ***<h2 style="font-family:bahnschrift;">Perbedaan</h2>***
<table style="font-family:bahnschrift;">
<tr>
    <th>Karakteristik</th>
    <th>Full Closed</th>
    <th>Half Closed</th>
</tr>
<tr>
<td>Status</td>
<td>Tertutup sepenuhnya</td>
<td>Tertutup sebagian</td>
</tr>
<tr>
    <td>Kemampuan Komunikasi</td>
    <td>Tidak ada</td>
    <td>Satu arah</td>
</tr>
<tr>
    <td>Cara menutup</td>
    <td>Pesan close dari kedua host atau perangkat jaringan</td>
    <td>Pesan close dari satu host atau perangkat jaringan</td>
</tr>
<tr>
    <td>Contoh</td>
    <td>Menghentikan koneksi ke server web</td>
    <td>Menghentikan pengiriman data ke server web, tetapi masih dapat menerima data dari server web</td>
</tr>
</table>

***

**<h2 style="font-family:bahnschrift;">CONNECTION TERMINATION YANG DIGUNAKAN PADA TUGAS SEBELUMNYA</h2>**
<div class ="isi" style="font-family:bahnschrift;"> listing program pada tugas sebelumnya menggunakan fungsi seperti berikut
```Copy Code
close(server_fd);
```
maka dapat disimpulkan program tersebut menggunakan connection termination Full Closed.