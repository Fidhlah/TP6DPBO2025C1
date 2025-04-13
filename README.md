# TP6DPBO2025C1 - Janji
Saya Muhammad Hafidh Fadhilah dengan NIM 2305672 mengerjakan Tugas Praktikum 6 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
### 1. Class `App`
- **Fungsi**: Entry point dari aplikasi. Menjalankan start menu terlebih dahulu sebelum game dimulai.
- **Method Utama**:
  - `main(String[] args)`: Menjalankan `StartMenu.showStartMenu()`.
  - `startGame()`: Menjalankan JFrame game utama dan memuat class `FlappyBird`.

### 2. Class `StartMenu`
- **Fungsi**: Menampilkan menu awal game dengan tombol "Start Game".
- **Komponen**:
  - `JButton startGameButton`: Tombol untuk memulai game.
  - `JLabel Title`: Judul game.
  - `JPanel mainPanel`: Panel utama form GUI.

### 3. Class `FlappyBird` (extends JPanel, implements ActionListener, KeyListener)
- **Fungsi**: Inti dari game Flappy Bird. Menangani logika permainan, gambar, input keyboard, dan tampilan skor.
- **Atribut**:
  - `Player player`: Objek burung (karakter utama).
  - `ArrayList<Pipe> pipes`: Menyimpan semua pipa yang sedang aktif di layar.
  - `Timer gameLoop`: Untuk update frame setiap 60 FPS.
  - `Timer pipesCooldown`: Timer untuk menambahkan pipa setiap beberapa detik.
  - `Image backgroundImage, birdImage, upperPipeImage, lowerPipeImage`: Gambar-gambar yang digunakan.
  - `JLabel scoreLabel`: Menampilkan skor saat ini.
  - `boolean isGameOver`: Penanda apakah game sudah berakhir.

- **Method Penting**:
  - `move()`: Menggerakkan player dan pipa.
  - `placePipes()`: Menambahkan pasangan pipa atas dan bawah.
  - `checkCollision()`: Mengecek tabrakan antara player dan pipa atau jatuh ke bawah.
  - `resetGame()`: Mereset posisi, skor, dan pipa ketika game di-restart.
  - `draw(Graphics g)`: Menggambar semua komponen game di panel.
  - `paintComponent(Graphics g)`: Override dari JPanel untuk menggambar ulang.

### 4. Class `Pipe`
- **Fungsi**: Representasi dari objek pipa.
- **Atribut**:
  - `int posX, posY, width, height`: Posisi dan ukuran pipa.
  - `Image image`: Gambar pipa.
  - `int velocityX`: Kecepatan gerak horizontal pipa.
  - `boolean passed`: Penanda apakah player sudah melewati pipa ini (untuk tambah skor).

### 5. Class `Player`
- **Fungsi**: Representasi burung (pemain).
- **Atribut**:
  - `int posX, posY, width, height`: Posisi dan ukuran burung.
  - `Image image`: Gambar burung.
  - `int velocityY`: Kecepatan vertikal (naik/turun) burung.

# Alur Program Floppy Bird
## 1. Program Dimulai
- User menjalankan program melalui `App.java`.
- Di dalam `main` method pada `App.java`, method `StartMenu.showStartMenu()` dipanggil.
- Method ini menampilkan **Start Menu GUI** berisi judul dan tombol “Start Game”.

## 2. User Menekan Tombol "Start Game"
- Ketika tombol "Start Game" ditekan:
  - Window Start Menu akan ditutup (`dispose()`).
  - Jendela baru untuk game akan dibuat (`JFrame` berjudul “Floppy Bird”).
  - Komponen utama game yaitu `FlappyBird` (yang merupakan `JPanel`) ditambahkan ke window.
  - Game window ditampilkan ke layar.

## 3. Game Dimulai (`FlappyBird.java`)
- Di dalam konstruktor `FlappyBird`:
  - Ukuran dan layout panel diatur.
  - Key listener ditambahkan agar panel bisa menangkap input keyboard.
  - Objek `Player` (burung) dibuat dan diposisikan.
  - Gambar latar belakang, burung, dan pipa di-load dari file.
  - Timer `pipesCooldown` berjalan tiap 6 detik untuk menambahkan pasangan pipa (atas dan bawah).
  - Timer `gameLoop` berjalan 60 kali per detik untuk mengupdate dan me-render ulang game.

## 4. Selama Game Berjalan
- Setiap tick dari `gameLoop`:
  - Method `actionPerformed()` dipanggil → `move()` dan `checkCollision()` dipanggil jika game belum game over.
  - `move()` menggerakkan player (terkena gravitasi) dan memindahkan posisi semua pipa ke kiri.
  - Jika burung melewati pipa atas yang belum pernah dilewati → skor bertambah.
  - `checkCollision()` mengecek apakah burung menabrak pipa atau jatuh ke tanah.
  - Jika terjadi tabrakan → `isGameOver = true`.

## 5. Saat Game Over
- Layar akan menampilkan pesan “Game Over” dan “Press R to Restart”.
- Program akan tetap berjalan tapi tidak memproses input Space.

## 6. Restart Game
- Jika pemain menekan tombol **R**, maka method `resetGame()` dipanggil:
  - Posisi dan kecepatan player di-reset.
  - Semua pipa dihapus.
  - Skor di-reset ke 0.
  - Game kembali berjalan seperti awal.

# Dokumentasi
## Menu Utama
![Menu utama](https://github.com/user-attachments/assets/52829644-4595-47c3-9371-22630a894088)

## Gameplay
![game over-restart-skor](https://github.com/user-attachments/assets/1f9fd930-971d-43cf-a6d4-304f7f46f35e)

## Gameplay Video
https://github.com/user-attachments/assets/6029cb74-ead5-43d2-b469-40766048fd2d

