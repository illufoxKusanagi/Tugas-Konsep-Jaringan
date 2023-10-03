```Copy Code
Nama   : Muhammad Arief Satria Wibawa
NRP    : 3122600015
Kelas  : D4 IT A
```


**<h1 style="font-family:bahnschrift;">SIMULASI JARINGAN MENGGUNAKAN CISCO PACKET TRACER</h1>**
   
   <div class ="isi" style="font-family:bahnschrift;"> Menghubungkan perangkat yang berbeda router menggunakan Cisco Packet Tracer dengan design mendesain beberapa perangkat seperti router, switch, dan PC, yang nantinya di tes koneksinya menggunakan terminal yang ada pada Cisco Packet Tracer.

***<h2 style="font-family:bahnschrift;">Langkah-langkah</h2>***

***<h3 style="font-family:bahnschrift;">1. Membuat desain router</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Tambahkan router menggunakan model router 1841<br>
   <img src="assets/step 1.png">
   <br>

***<h3 style="font-family:bahnschrift;">2. Membuat desain switch</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Tambahkan router menggunakan model switch 2950-24<br>
   <img src="assets/step 2.png">
   <br>

***<h3 style="font-family:bahnschrift;">3. Membuat desain PC</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Tambahkan End Devices menggunakan model PC<br>
   <img src="assets/step 3.png">
   <br>

***<h3 style="font-family:bahnschrift;">4. Menambahkan kabel koneksi antar perangkat router</h3>***


   <div class ="isi" style="font-family:bahnschrift;"> Tambahkan kabel antar router berupa Copper Cross-Over dengan FastEthernet 0/1<br>
   <img src="assets/step 4.png">
   <br>


***<h3 style="font-family:bahnschrift;">5. Menambahkan kabel koneksi antara router dengan Switch</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Tambahkan Copper Straight-Through dari perangkat router ke perangkat switch<br>
   <img src="assets/step 6.png">
   <img src="assets/step 5.png">
   <br>


***<h3 style="font-family:bahnschrift;">6. Menambahkan kabel koneksi antara switch dengan perangkat PC</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Copper Straight-Through dari perangkat switch ke perangkat PC, sehingga menjadi seperti berikut :<br>
   <img src="assets/step 7.png">
   <br>

***<h3 style="font-family:bahnschrift;">7. Mengubah config dari router0 </h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Mengubah IP address untuk FastEthernet0/1 dan FastEthernet0/0 serta menambahkan RIP routing<br>
   <img src="assets/step 8.png">
   <img src="assets/step 9.png">
   <img src="assets/step 13.png">
   <br>

***<h3 style="font-family:bahnschrift;">8. Mengubah config dari router1 dan</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Mengubah IP address untuk FastEthernet0/1 dan FastEthernet0/0<br>
   <img src="assets/step 10.png">
   <img src="assets/step 11.png">
   <br>
   
***<h3 style="font-family:bahnschrift;">9. Mengubah config dari PC0</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Menambahkan IPv4 address, dan default gateway address<br>
   <img src="assets/step 12.png">
   <br>

***<h3 style="font-family:bahnschrift;">10.  Mengubah config dari PC1</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Menambahkan IPv4 address, dan default gateway address<br>
   <img src="assets/step 14.png">
   <br>
   
***<h3 style="font-family:bahnschrift;">11.  Mengubah config dari PC2</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Menambahkan IPv4 address, dan default gateway address<br>
   <img src="assets/step 15.png">
   <br>  

***<h3 style="font-family:bahnschrift;">12.  Mengubah config dari PC3</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Menambahkan IPv4 address, dan default gateway address<br>
   <img src="assets/step 16.png">
   <br>

***<h3 style="font-family:bahnschrift;">13.  Melakukan ping untuk sesama router</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Dengan membuka command prompt pada PC0<br>
   <img src="assets/step 20.png">
   <div class ="isi" style="font-family:bahnschrift;"> ketikkan <i>ping 192.168.1.20</i><br>
   <img src="assets/step 17.png">
   
   <div class ="isi" style="font-family:bahnschrift;"> Perintah ini digunakan untuk melakukan ping pada PC1, yang mana masih berada dalam router yang sama
   <br>

***<h3 style="font-family:bahnschrift;">14. Melakukan ping untuk router yang berbeda</h3>***

   <div class ="isi" style="font-family:bahnschrift;"> Dengan membuka command prompt pada PC0<br>
   <img src="assets/step 20.png">
   <div class ="isi" style="font-family:bahnschrift;"> ketikkan <i>ping 192.168.2.10</i><br>
   <img src="assets/step 18.png">
   <div class ="isi" style="font-family:bahnschrift;"> Perintah ini digunakan untuk melakukan ping pada PC3, yang mana berada dalam router yang berbeda