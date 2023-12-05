```Copy Code
Nama             : Muhammad Arief Satria Wibawa
NRP              : 3122600015
Kelas            : D4 IT A
Dosen Pembimbing : Dr. Ferry Astika Saputra S.T., M.Sc
```
    
**<h1 style="font-family:bahnschrift;">DNS Server</h1>**
<div class ="isi" style="font-family:bahnschrift;"> DNS atau Domain Name System adalah sistem yang digunakan untuk menerjemahkan nama domain yang simpel diingat menjadi alamat IP numerik yang unik untuk mengidentifikasi alamat tujuan di internet (resolusi nama domain). <br> Jika diibaratkan seperti buku telepon internet. Bayangkan jika internet adalah kota besar dan setiap situs web atau alamat IP adalah nomor telepon. Namun, akan sulit jika menghafal nomor-nomor telepon tersebut, maka kita menggunakan buku telepon, dan DNS server berfungsi sebagai buku telepon ini di dunia internet.
 <br>

**<h2 style="font-family:bahnschrift;">Cara Kerja</h2>**
<img src="assets/dns.jpg"><br><br>

- Permintaan:
    <div class ="isi" style="font-family:bahnschrift;">Client memasukkan nama domain (misalnya, www.wikipedia.com) ke dalam peramban web, komputer akan mengirim permintaan ke server DNS.

- Lokal DNS Server:
    <div class ="isi" style="font-family:bahnschrift;">Server DNS lokal pertama kali memeriksa cache lokalnya untuk melihat apakah alamat IP untuk nama domain tersebut sudah disimpan. Jika iya, maka alamat IP tersebut dikembalikan tanpa harus melakukan pencarian lebih lanjut.

- Recursive DNS Server:
    <div class ="isi" style="font-family:bahnschrift;">Jika alamat IP tidak ada dalam cache lokal, server DNS lokal akan melakukan pencarian rekursif. Server tersebut akan bertanya ke server DNS lainnya hingga menemukan alamat IP yang sesuai. Setelah ditemukan, alamat IP tersebut akan disimpan dalam cache lokal untuk penggunaan selanjutnya.

- Authority DNS Server:
    <div class ="isi" style="font-family:bahnschrift;">Server DNS otoritatif adalah server yang menyimpan catatan DNS asli untuk domain tersebut. Jika server rekursif tidak memiliki informasi dalam cache, ia akan menghubungi server DNS otoritatif untuk mendapatkan alamat IP yang benar.

- Resolusi Nama Domain:
    <div class ="isi" style="font-family:bahnschrift;">Setelah alamat IP ditemukan, server DNS lokal mengirimkannya kembali ke komputer client, dan browser kemudian menggunakan alamat IP tersebut untuk membuat koneksi ke server web yang diinginkan pengguna.
     

**<h1 style="font-family:bahnschrift;">Email Server</h1>**

<div class ="isi" style="font-family:bahnschrift;"> Email server adalah server komputer yang bertanggung jawab untuk mengelola pengiriman, penerimaan, dan penyimpanan email. Ada dua jenis server email utama: server pengiriman (SMTP) dan server penerima (POP3 atau IMAP). <br> Jika diibaratkan email server seperti kantor pos untuk internet, jika ingin mengirim surat kepada teman atau keluarga, maka kita akan membawanya ke kantor pos lokal lalu surat akan dikirimkan ke penerima. Email server berfungsi serupa di dunia internet.
 <br>

**<h2 style="font-family:bahnschrift;">Cara Kerja</h2>**
<img src="assets/mail.jpg"><br><br>

- Mengirim Email (SMTP):
    <div class ="isi" style="font-family:bahnschrift;">Ketika mengirim email, client email akan menghubungi server SMTP untuk mengirim pesan. Server SMTP ini mengambil pesan dan mengirimkannya ke server penerima.
     
- Menerima Email (POP3/IMAP):
    <div class ="isi" style="font-family:bahnschrift;">Saat ingin membaca email, client email akan terhubung ke server penerima menggunakan protokol POP3 atau IMAP. POP3 mengunduh email ke perangkat lokal, sementara IMAP bertugas untuk menyinkronkan email antara server dan perangkat lokal.
     
- Menyimpan Email:
    <div class ="isi" style="font-family:bahnschrift;">Email server menyimpan email di kotak surat pengguna. Ini termasuk pesan yang dikirim dan diterima serta lampiran yang terkait.

- Send & Recieve:
    <div class ="isi" style="font-family:bahnschrift;">Server SMTP dan server penerima bekerja bersama untuk menyampaikan pesan dari pengirim ke penerima. Mereka menggunakan protokol khusus untuk berkomunikasi dan memastikan bahwa email sampai pada tujuan dengan aman.

- Autentikasi Keamanan:
    <div class ="isi" style="font-family:bahnschrift;">Hingga saat ini penggunaan email semakin aman, server email mengimplementasikan berbagai mekanisme autentikasi dan keamanan, seperti SSL/TLS, untuk melindungi komunikasi email dari akses yang tidak sah atau peretasan.
    