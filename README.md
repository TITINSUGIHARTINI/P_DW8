# P_DW8
Mata Kuliah Desain Web 

##1.	document.getElementById('registrationForm').addEventListener('submit', function(event)##
{ Ini adalah bagian pertama dari kode yang berarti Anda menambahkan event listener untuk mengawasi saat formulir diajukan (submitted). Ketika pengguna mengklik tombol "Daftar" pada formulir (dengan id "registrationForm"), kode dalam fungsi ini akan dieksekusi.
2.	event.preventDefault(); Ini adalah perintah pertama dalam fungsi event listener. Ini mencegah formulir dari pengiriman otomatis (refresh halaman) saat tombol "Daftar" ditekan. Sebagai gantinya, kode JavaScript akan menangani validasi dan pengiriman data.
3.	Validasi Nama:
-	Mendapatkan nilai dari input dengan id "studentName" (nama siswa).
-	Memeriksa apakah nilai tersebut kosong. Jika kosong, menampilkan pesan kesalahan "Nama lengkap wajib diisi" dan menghentikan proses pengiriman.
  
4.	Validasi ID Siswa:
- Mendapatkan nilai dari input dengan id "studentId" (ID siswa).
- Memeriksa apakah nilai tersebut kosong. Jika kosong, menampilkan pesan kesalahan "ID Siswa wajib diisi" dan menghentikan proses pengiriman.
6.	Validasi Email:
-	Mendapatkan nilai dari input dengan id "email".
-	Memeriksa apakah nilai tersebut kosong atau tidak sesuai dengan format email yang benar (menggunakan ekspresi reguler). Jika tidak sesuai, menampilkan pesan kesalahan "Format email tidak valid" dan menghentikan proses pengiriman.
7.	Validasi Password:
-	Mendapatkan nilai dari input dengan id "password" (kata sandi).
-	Memeriksa apakah kata sandi memiliki panjang minimal 14 karakter dan mengandung setidaknya satu huruf, satu angka, dan satu simbol (menggunakan ekspresi reguler). Jika tidak memenuhi syarat, menampilkan pesan kesalahan "Password harus minimal 14 karakter dan mengandung huruf, angka, serta simbol" dan menghentikan proses pengiriman.
8.	Validasi Tanggal Lahir:
-	Mendapatkan nilai dari input dengan id "birthDate" (tanggal lahir).
-	Memeriksa apakah tanggal lahir sudah diisi. Jika tidak, menampilkan pesan kesalahan "Tanggal lahir wajib diisi" dan menghentikan proses pengiriman.
9.	Jika semua validasi telah selesai dan tidak ada kesalahan, maka akan muncul pesan "Pendaftaran berhasil!" sebagai tanda bahwa formulir telah berhasil diisi. Anda dapat mengganti pesan ini dengan kode untuk mengirim data atau informasi selanjutnya ke server atau tujuan yang sesuai.
