<p style="font-family:bahnschrift;">Nama : Muhammad Arief Satria Wibawa</p>
<p style="font-family:bahnschrift;">NRP : 3122600015</p>
<p style="font-family:bahnschrift;">Kelas : D4 IT A</p>


**<h1 style="font-family:bahnschrift;">Pengertian HTTP</h1>**
<div class ="isi" style="font-family:bahnschrift;"> HTTP (Hypertext Transfer Protocol) adalah protokol yang digunakan untuk mentransfer data di World Wide Web. HTTP pertama kali dikembangkan oleh Tim Berners-Lee pada tahun 1989 dan telah mengalami beberapa evolusi sejak saat itu.

**<h1 style="font-family:bahnschrift;">Perkembangan Versi HTTP</h1>**
<img src="assets/http evo.jpeg" alt="HTTP evo">
***<h3 style="font-family:bahnschrift;">1. HTTP 0.9</h3>***
    <div class ="isi" style="font-family:bahnschrift;">HTTP 0.9 adalah versi pertama HTTP, yang dirilis pada tahun 1991. Versi ini sangat sederhana dan hanya mendukung metode GET untuk meminta sumber daya. HTTP 0.9 tidak mendukung header, yang merupakan informasi tambahan yang dapat digunakan untuk mengontrol perilaku permintaan dan respons.
<br>

***<h3 style="font-family:bahnschrift;">2. HTTP 1.0</h3>***
    <div class ="isi" style="font-family:bahnschrift;"> HTTP 1.0 adalah versi kedua HTTP, yang dirilis pada tahun 1996. Versi ini menambahkan dukungan untuk header, yang memungkinkannya untuk lebih mengontrol perilaku permintaan dan respons. HTTP 1.0 juga menambahkan dukungan untuk caching, yang memungkinkan klien untuk menyimpan salinan sumber daya lokal untuk akses yang lebih cepat di masa mendatang.
    
***<h3 style="font-family:bahnschrift;">3. HTTP 1.1</h3>***
    <div class ="isi" style="font-family:bahnschrift;"> HTTP 1.1 adalah versi ketiga HTTP, yang dirilis pada tahun 1997. Versi ini menambahkan beberapa fitur baru yang meningkatkan kinerja dan skalabilitas HTTP. Fitur-fitur ini termasuk:
- <div class ="isi" style="font-family:bahnschrift;"> Keep-Alive: HTTP 1.1 memungkinkan koneksi untuk tetap terbuka setelah satu permintaan dan respons selesai. Hal ini memungkinkan klien untuk mengirimkan beberapa permintaan melalui koneksi yang sama, yang dapat meningkatkan kinerja.
- <div class ="isi" style="font-family:bahnschrift;"> Pipelining: HTTP 1.1 memungkinkan klien untuk mengirimkan beberapa permintaan melalui koneksi yang sama secara bersamaan. Hal ini dapat meningkatkan kinerja dengan memungkinkan server untuk memproses permintaan secara paralel.
- <div class ="isi" style="font-family:bahnschrift;"> Caching: HTTP 1.1 menambahkan dukungan untuk caching di sisi server, yang memungkinkan server untuk menyimpan salinan sumber daya untuk akses yang lebih cepat di masa mendatang.
***<h3 style="font-family:bahnschrift;">4. HTTP 2.0</h3>***
    HTTP 2 adalah versi keempat HTTP, yang dirilis pada tahun 2015. Versi ini menambahkan beberapa fitur baru yang meningkatkan kinerja dan efisiensi HTTP. Fitur-fitur ini termasuk:
- <div class ="isi" style="font-family:bahnschrift;">Header compression: HTTP 2 menggunakan kompresi header untuk mengurangi ukuran header, yang dapat meningkatkan kinerja.
- <div class ="isi" style="font-family:bahnschrift;"> Server push: HTTP 2 memungkinkan server untuk mendorong sumber daya ke klien sebelum klien memintanya. Hal ini dapat meningkatkan kinerja dengan memungkinkan klien untuk mulai merender halaman web lebih cepat.
- <div class ="isi" style="font-family:bahnschrift;"> Framed communication: HTTP 2 menggunakan komunikasi berbasis frame, yang lebih efisien daripada komunikasi berbasis teks yang digunakan oleh HTTP 1.1.
***<h3 style="font-family:bahnschrift;">5. HTTP 3.0</h3>***
    HTTP 3 adalah versi terbaru HTTP, yang dirilis pada tahun 2018. Versi ini menggunakan protokol QUIC (Quick UDP Internet Connection) untuk meningkatkan kinerja dan keamanan. QUIC adalah protokol transport yang lebih efisien daripada TCP, yang digunakan oleh HTTP 1.1 dan HTTP 2. QUIC juga lebih aman daripada TCP, karena menggunakan enkripsi secara default.

**<h1 style="font-family:bahnschrift;">Perbedaan Versi HTTP</h1>**
<table style="font-family:bahnschrift;">
    <tr>
        <td>Fitur</td>
        <td>HTTP 0.9</td>
        <td>HTTP 1.0</td>
        <td>HTTP 1.1</td>
        <td>HTTP 2</td>
        <td>HTTP 3</td>
    </tr>
    <tr>
        <td>Metode</td>
        <td>GET</td>
        <td>GET</td>
        <td>GET, POST, HEAD, PUT, DELETE, OPTIONS, TRACE</td>
        <td>GET, POST, HEAD, PUT, DELETE, OPTIONS, TRACE, CONNECT, PATCH</td>
        <td>GET, POST, HEAD, PUT, DELETE, OPTIONS, TRACE, CONNECT, PATCH</td>
    </tr>
    <tr>
        <td>Header</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Caching</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Keep-Alive</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Pipelining</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Kompresi Header</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Server Push</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Framed Communication</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
    <tr>
        <td>Protocol Transport</td>
        <td>TCP</td>
        <td>TCP</td>
        <td>TCP</td>
        <td>TCP</td>
        <td>QUIC</td>
    </tr>
    <tr>
        <td>Keamanan</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Tidak Ada</td>
        <td>Ada</td>
        <td>Ada</td>
    </tr>
  </table>