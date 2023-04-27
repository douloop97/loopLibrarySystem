# loopLibrarySystem

Bir kitap kütüphane yönetim sistemi oluşturma:

Bir kütüphane yönetim sistemi oluşturacağız. Yeni üye, yeni kitap, kitap ödünç alma gibi işlemlerin yapılması isteniyor. Özellikleri kendiniz belirleyebilir, aklınıza takılan noktaları kendiniz tamamlayabilirsiniz:

Gereklilikler:
1. Üyelerin sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği ortamı simüle ediniz. Üye bilgilerinin doğruluğunu e-devlet mernis sistemi kullanarak kontrol eden bir simülasyon oluşturunuz.(E devlet sisteminde doğrulama Ad Soyad, TcNo, Doğum yılı ile yapılmaktadır. Bu durumu simüle etmeniz yeterli.)

2. Kitapları sisteme ekleme, silme, güncelleme gibi sistemleri simüle ediniz.

3. Kitap ödünç verme sistemi simüle ediniz. Üyeyi parametre olarak gönderiniz. Kitap teslim etme tarihi, kitap ödünç alma tarihininden 7 gün sonra olacak şekilde ortamı simüle ediniz. 
    örn çıktı: "Furkan isimli üye 22.03.2023 tarihinde xyz adlı kitabı teslim aldı. Geri teslim tarihi: 29.03.2023". Tarih sistemi çalışmak zorunda değil simüle ediniz.

4. Sistemde 2 farklı loglama yöntemi kullanılması talep ediliyor. Üye kayıtlarında MySql ile loglama yapılması gerekirken, kitap işlemlerinde PostegreSql ile loglama yapılması isteniyor. Dependency Injection kullanarak simüle ediniz.
Sınıflar için örnek özellikler.
Kitap sınıfı (ISBN, Başlık, Yazar, Yayınevi, BasımTarihi)
Kullanıcı sınıfı (Ad, Soyad, TcNo, Dogum Yılı)
