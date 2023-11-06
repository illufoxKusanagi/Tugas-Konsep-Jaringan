```Copy Code
Nama   : Muhammad Arief Satria Wibawa
NRP    : 3122600015
Kelas  : D4 IT A
```

**<h1 style="font-family:bahnschrift;">DYNAMIC ROUTING</h1>**

**<h2 style="font-family:bahnschrift;">1. Pendahuluan</h2>**
<div class ="isi" style="font-family:bahnschrift;"> Dynamic routing ialah routing yang dengan cara membuat jalur komunikasi data secara otomatis sesuai dengan konfigurasi yang dibuat. Jika ada perubahan topologi di dalam jaringan, router akan otomatis membuat jalur routing yang baru. Routing dynamic lebih mudah dilakukan dibandingkan routing static dan default. Routing dynamic berada pada lapisan network layer jaringan komputer dalam  TCP/IP Protocol Suites, serta merupakan routing protocol yang  digunakan untuk menemukan network dan untuk melakukan update routing table pada  router. Meskipun begitu, routing jenis ini terdapat perbedaan dalam pemrosesan data di  CPU router dan penggunaan bandwith dari link jaringan. 

**<h2 style="font-family:bahnschrift;">2. Pembahasan</h2>**
    
**<h4 style="font-family:bahnschrift;">2.1. Cara Kerja</h4>**
<div class ="isi" style="font-family:bahnschrift;">
Protokol Routing mengatur tiap Router untuk dapat berkomunikasi antar Router satu dengan yang lainnya dan saling memberikan informasi, serta informasi Routing yang dapat mengubah isi dari routing  table, yang mana dilakukan secara otomatis. Secara khusus, dynamic routing merupakan jenis routing yang  paling mudah dikonfigurasikan dan lebih efektif dalam memiliki rute terbaik untuk  sebuah tujuan jaringan serta dapat menemukan jaringan terluar.

**<h4 style="font-family:bahnschrift;">2.2. Macam-macam protokol Dynamic Routing</h4>**
1. <div class ="isi" style="font-family:bahnschrift;"> RIP (Routing Information Protocol)
   
    Merupakan protokol yang memberikan routing  table berdasarkan router yang terhubung langsung. Lalu, router selanjutnya akan  memberikan informasi ke router berikutnya yang terhubung langsung dengan router  tersebut. 
2. IGRP (Interior Gateway Routing Protocol) 
   
    Merupakan sebuah routing protocol yang dikembangkan pada pertengahan tahun  1980-an oleh Cisco Systems Inc yang bertujuan untuk  menyediakan protokol yang kuat untuk routing dalam sistem otonomi. IGRP  menggunakan bandwith dan garis menunda secara default untuk menentukan rute  terbaik dalam sebuah internetwork (Composite Metrik). 
3. OSPF (Open Short Path First) 

    Merupakan sebuah routing protocol standar terbuka yang telah diaplikasikan oleh  sejumlah vendor jaringan. Jika jaringan yang dikelola adalah jaringan besar, maka  OSPF adalah pilihan satu-satunya. OSPF ini adalah sesuatu yang disebut route  redistribution, yaitu sebuah layanan penerjemah antar routing protocol. OSPF  hanya mendukung routing IP saja, update routing akan dilakukan secara floaded  saat terjadi perubahan topologi jaringan. 
4. EIGRP (Enhanced Interior Gateway Routing Protocol) 

    Merupakan Routing Protocol yang menggunakan algoritma advanced distance vector dan  menggunakan cost load balancing yang tidak sama. Algoritma yang dipakai adalah  kombinasi antara distance vector dan link-state, serta menggunakan Diffusing. Update Algorithm (DUAL) untuk menghitung jalur terpendek. Broadcast-broadcast  EIGRP di update setiap 90 detik ke semua router EIGRP yang berdekatan. Setiap  update hanya memasukkan perubahan jaringan, sehingga Dynamic Routing ini sangat cocok untuk diterapkan pada jaringan komputer yang besar.
5. BGP (Border Gateway Protocol) 

    Merupakan Routing Protocol yang memiliki kemampuan untuk melakukan  pengumpulan rute, pertukaran rute dan menentukan rute terbaik menuju ke sebuah  lokasi dalam sebuah jaringan. BGP termasuk ke dalam kategori routing protocol jenis Exterior Gateway  Protocol (EGP). BGP merupakan <i>distance vector exterior gateway protocol</i> yang  bekerja secara cerdas untuk merawat path-path ke jaringan lainnya. 

**<h4 style="font-family:bahnschrift;">2.3. Keuntungan Dynamic Routing</h4>**
- <div class ="isi" style="font-family:bahnschrift;">Hanya mengenalkan alamat yang terhubung langsung dengan routernya (jaringan  yang berada di bawah kendali router tersebut). 

- <div class ="isi" style="font-family:bahnschrift;">Tidak perlu mengetahui semua alamat network yang ada. 

- <div class ="isi" style="font-family:bahnschrift;">Jika terdapat penambahan suatu network baru, maka semua router tidak perlu  mengkonfigurasi. Hanya router-router yang berkaitan yang akan mengkonfigurasi  ulang. 

**<h4 style="font-family:bahnschrift;">2.4. Kekurangan Dynamic Routing</h4>**
- <div class ="isi" style="font-family:bahnschrift;">Kecepatan pengenalan dan kelengkapan IP table memakan waktu lama karena  router akan melakukan broadcast ke semua router sampai ada IP table yang cocok.  Setelah konfigurasi selesai, router harus menunggu beberapa saat agar setiap router  mendapat semua alamat IP yang tersedia.

- <div class ="isi" style="font-family:bahnschrift;"> Beban kerja router menjadi lebih berat karena selalu memperbarui IP table pada  setiap waktu tertentu. 

**<h2 style="font-family:bahnschrift;">3. Kesimpulan</h2>**
<div class ="isi" style="font-family:bahnschrift;">
<div class ="isi" style="font-family:bahnschrift;">Dari pembahasan yang sudah dipaparkan, maka dapat disimpulkan bahwa Dynamic Routing merupakan routing yang dikonfigurasi secara otomatis. Dibandingkan Static Routing, Dynamic Routing memiliki kelebihan, karena lebih efisien. Namun, untuk Dynamic Routing lebih cocok untuk digunakan oleh jaringan besar, dan akan memangkas waktu jauh lebih banyak dibandingkan Static Routing. 