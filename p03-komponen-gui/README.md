## G. Pertanyaan Refleksi

### 1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing satu contoh.

Top-level container adalah wadah utama yang menjadi jendela aplikasi. Contohnya adalah JFrame.

Intermediate container adalah wadah yang digunakan untuk mengelompokkan atau menampung komponen lain. Contohnya adalah JPanel atau JScrollPane.

Atomic component adalah komponen yang berinteraksi langsung dengan pengguna. Contohnya adalah JLabel, JTextField, dan JButton.

### 2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?

Karena JRadioButton yang berada dalam ButtonGroup yang sama hanya dapat memilih satu pilihan. Pada FormTiketTravel, pilihan kelas Ekonomi, Bisnis, dan Eksekutif menggunakan ButtonGroup yang sama agar pengguna hanya dapat memilih satu kelas tiket.

### 3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?

JComboBox dipilih ketika terdapat beberapa pilihan tetapi pengguna hanya perlu memilih satu pilihan dan ingin menghemat ruang pada form. JRadioButton lebih cocok ketika pilihan hanya sedikit dan semua pilihan ingin langsung terlihat oleh pengguna.

Pada FormTiketTravel, JComboBox digunakan untuk memilih kota tujuan karena terdapat beberapa pilihan kota.

### 4. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan seharusnya ditulis?

Kode di dalam initComponents() dibuat secara otomatis oleh NetBeans GUI Builder dan dapat dibuat ulang ketika tampilan pada tab Design diubah. Oleh karena itu, kode tersebut tidak boleh diedit langsung.

Kode tambahan seperti event handler, method bantu, dan pengaturan tambahan ditulis di luar blok initComponents(). Contohnya pada konstruktor setelah initComponents(), method tampilkanRingkasan(), dan method gantiTema().

### 5. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?

FlatLightLaf.setup() digunakan untuk memasang tema FlatLaf sebelum form dibuat. Dengan memasangnya terlebih dahulu, komponen GUI yang dibuat setelahnya menggunakan tampilan FlatLaf sehingga form memiliki tampilan yang lebih modern dan sesuai dengan tema yang digunakan.