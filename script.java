document.getElementById('registrationForm').addEventListener('submit', function(event) {
  event.preventDefault(); // Mencegah form dari submit otomatis
  
  // Validasi Nama
  var studentName = document.getElementById('studentName').value;
  if (!studentName) {
    alert('Nama lengkap wajib diisi.');
    return false;
  }
  
  // Validasi ID Siswa
  var studentId = document.getElementById('studentId').value;
  if (!studentId) {
    alert('ID Siswa wajib diisi.');
    return false;
  }
  
  // Validasi Email
  var email = document.getElementById('email').value;
  if (!email || !/^\S+@\S+\.\S+$/.test(email)) {
    alert('Format email tidak valid.');
    return false;
  }
  
  // Validasi Password
  var password = document.getElementById('password').value;
  // verifikasi menggunakan REGEX
  if (password.length < 14 || !/[a-zA-Z]/.test(password) || !/[0-9]/.test(password) || !/[^a-zA-Z0-9]/.test(password)) {
    alert('Password harus minimal 14 karakter dan mengandung huruf, angka, serta simbol.');
    return false;
  }
  
  // Validasi Tanggal Lahir
  var birthDate = document.getElementById('birthDate').value;
  if (!birthDate) {
    alert('Tanggal lahir wajib diisi.');
    return false;
  }
  
  // Jika semua validasi terpenuhi, proses form submission dilanjutkan.
  // Gantilah dengan kode untuk mengirim data atau informasi selanjutnya.
  alert('Pendaftaran berhasil!');
});