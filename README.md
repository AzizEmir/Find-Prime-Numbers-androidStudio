Kodlarımda ilk olarak EditTextlerden gelen sayi1 ve sayi2  viewlerin’den gelen verinin boş olup  olmadığını kontrol ediyor.

Eğer herhangi biri boş ise kullanıcıya Toast aracılığıyla “Alanlar Boş Bırakılamaz !” mesajı verir.

Değilse her iki alanda doldurulmuş demektir ve ardından hesaplama işlemleri gerçekleşir.

İlk olarak “numaralar.clear();”  listenin temizlemesinin sebebi tekrar tekrar kullanıldıktan sonra hesaplanan sayıların üst üste eklemesinin istenmediğidir.

Ardından sayi1 ve sayi2 viewlerin’den gelen string tipinde veriler int tipine dönüştürülerek gelensayi1 ve gelensayi2 değişkenlerine atanır.

Bu hesaplama işleminde iç içe for döngüsü kullanılmaktadır. 

Dış döngünün kullanılma amacı gelensayi2’nin kendinden önceki sayılara bölünüp bölünmediğidir. Bu kontrolü iç döngü ile yapar. 

İç döngünün kullanılma amacı gelensayi1’e eşit olan sayi değişkeni’nin asal olup olmadığını kontrol etmektir. Bunu içerisindeki if bloğu ile yapar.

sayi değişkeni i değerine bölünüp bölünmediği içerisinde bulunan bir if bloğu ile kontrol edilir eğer herhangi bir i değişkenine sayıya bölünüyorsa, asal olmadığı anlaşılmıştır.

Başlangıçta 0 olan kontrol değişkeni’ni 1 artırır ve sonraki sayıları kontrol etmeye gerek kalmadığı için döngüden break komutu ile çıkılır.

Ardından kontrol değişkeni if bloğu ile kontrol edilir kontrol değeri 0 ise sayı asaldır ve global’de tanımlanan numaralar ArrayList’e eklenir. Kontrol değeri 1 ise sayı asal değil demektir.If bloğu içerisinde false değeri döneceğinden içerdeki işlemleri yapmayacaktır.

Ardından gelensayi1 değişkeri 1 artırılarak bu işlemler tekrardan yapılacaktır.
Bu işlemler dış döngüde bulunan gelensayi1 değişkeni, gelensayi2 değişkeni’nin değeri’nin 1 fazlası olana kadar devam edecektir.1 fazlası olduğu taktirde döngü içerisine girmeyecek ve hesaplama işlemi tamamlanmış olup, dış döngüden çıkılmıştır.
String tipinde  tanımlanan asallar değişkenine numaralar ArrayList’i atanacaktır.
Son adım olarak sonuc TextView’ine asallar yazdırılacaktır.