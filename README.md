# BootcampTekrarHepsiburada


Bootcampta işlenen konuların tekrar edilmesi 

### val ve var nedir ? Arasındaki farklar nelerdir ? 
Değişken tanımlamak istediğimizde val veya var anahtar kelimelerine ihtiyacımız vardır. var anahtar kelimesi değiştirilebilir. Örneğin ; 
````
var age = 16 
age = 18 
````
olarak değiştirebiliriz.Ancak val anahtar kelimesi ise değiştirilemez.Örneğin ;
````
var myName = "Sahra"
myName = "Merve"
````
yazarsak hata almış oluruz.

### null-safety Nedir ? (?,!! arasındaki farklar nelerdir ? Ne işe yararlar ?)
Öncelikle null boş demektir.Biz kendi değişkenlerimizi tanımlarken null durumunu kontrol edebiliriz.Çökme durumlarının olmaması için kotlin bu tip durumları engellemek için
null-safety ? (null kontrolü) denmektedir.
Not null assertion : !! Operator
Bu operatör null olabilen bir değişkenin null kontrolü yapılmadan çağrılmasını sağlar. Hatalı kullanımda NullPointerException hatası almamız olasıdır. 

### kalıtım-inheritance nedir ? 
Sınıf -> Nesnelerin özellikleri ve davranışları ile ilgili ayrıntıları tutmak için kullanılan yapıdır. class A 
Nesne(object) -> Nesneler sınıfların somutlaştırılmış halidir.Sınıflar ve nesneler arasında bir bağ vardır. val system = MySystem() burada MySystem() sınıfından system adında bir nesne 
oluşturuldu.Örneğin ; system.goster() kullanılabilir.
Kalıtım -> Mevcut sınıftan başka bir sınıf türetilmesi için kullanılır.Kodun tekrar kulllanılabilirliğini arttırır. open anahtar kelimesi sınıfın başına yazılır.
````
open class MySystem() 
open class addSystem: MySystem()

open class MySystem(var isim:String,var kod:Int,var adres:String) {
}
open class addSystem(isim:String,kod:Int,adres:String,var system:String):MySystem(isim,kod,adres){
}
class Notlar(isim:String,kod:Int,adres:String,system:String,var puan:Int):addSystem(isim,kod,adres,puan){
}

fun main(){
    var my = Notlar("Sahra",21457822,"Tekirdağ","Elektrik Devreleri",87)
}
````
### polimorfizm nedir ?
Inheritance ettiğimiz class’daki bir metodu ovveride etmemize verilen isimdir. Böylelikle o metodun içeriğini istediğimiz gibi değiştirebiliriz.
````
open class Picture(){
          open fun draw(){println("Picture Class")}
}
class Papper : Picture(){
   //super ile Picture daki draw metodunun çalıştırılması sağlanıyor.
    fun test() { super.draw()}
    override fun draw() {println("Papper Class")}
}
````

### abstruct class nedir ? Interface Nedir ?
Abstract Class ve interface’lerden objeler türetilemez. Class’lara implement edilirler.Abstract, tüm classlarda kullanılacak yapıları içerirken Interface’ler nitelik bazlıdır. Bu yüzden spesifik bir özellik içeriliyorsa bu yapıyı Interface’lerde tanımlamalıyız. Şablon yapıları kurgularken de Abstract class’ları tercih etmeliyiz.
Abstract
Birden fazla Abstract Class bir sınıfa implement edilemez. Abstract Class içerisinde fonksiyonların abstract olacağını belirtirsek body’siz fonksiyon tanımlayabiliriz aksi halde body’siz fonksiyon tanımlamasına izin verilmeyecektir. Değişken tanımı yapılırken initialize etmemiz gerekmektedir.
`````
fun main(args: Array<String>) {
    val jack = Engineer("Recep Yeşilkaya")
    jack.displayJob("Computer Engineering")
    jack.personAge(22)
}
 
abstract class Person(name: String) {
    init {
        println("Name : $name")
    }
    fun personAge(age: Int) {
        println("Age : $age")
    }

   abstract fun displayJob(description: String)
}
class Engineer(name: String): Person(name) {
    override fun displayJob(description: String) {
        println("Description : $description")
    }
}
`````
### android:exported="true" nedir ? 
 Diğer uygulamaların gösterilen activity'i kullanmasına izin vermek demek.Ancak kullanmak istemiyorsak android:exported="false" olarak ayarlanır.Bu işlem AndroidManifest.xml 
 dosyasında yer almaktadır.

### data class nedir ?
Data Class nedir
Data class bir class tanımlamasıdır , aşağıdaki fonksiyoneliteleri çok kısa bir şekilde içine alır (otomatik tanımlar):
constructor
Fields-alan
Getter ve setter fonksiyonları
hashCode(), equals() ve toString() fonksiyonları
Class tanımalamızda data keywordünü kullandığımızda Kotlin otomatik olarak fieldlara ulaşılabilcek getter setterları ,hashCode(), equals(), toString(), copy() ve componentN() fonksiyonlarını yaratır.

`````
data class Book(val name: String, val author: String, var page: Int)

`````
### Recyclerview vw listview arasındaki fark nedir ?
Öncelikle iki yapı arasındaki fark performans farkıdır.Bu performans farkının recyclerview>listview olduğunu söylebilirim.Nedeni ise listview belirtilen listenin tamamanını ekranda çizdirmeye çalışır.Ancak recyclerview ekrana sığacak kadar veri sağlar.Bu ise ayırt edici bir performans özelliği sağlamaktadır.
#### Viewholder-LayoutManager
ViewHolder basitçe liste elemanlarını öğe üzerinde tutan yapıdır diyebiliriz. Bu yapı Listviewde isteğe bağlı kullanılırken; Recyclerviewde kullanımı zorunludur. 
LayoutManager, adapter ve recyclerview arasındaki bir katman yada bir düzenleyici yapıdır. Elemanlarımızın ekranda nasıl konumlandırılacağı ile ilgilenir.
ListView kullanımında elemanlar dikey olarak hizalanırken; RecylerView ile karşımıza 3 seçenek çıkmaktadır:
![recylerview](https://user-images.githubusercontent.com/63001162/137274766-8d524e3a-7e9d-4cd3-8142-dfc8dcac6979.png)
LinearLayoutManager: Elemanlarımızı yatayda veya dikeyde hizalar.
GridLayoutManager: Elemanları belirlediğimiz satır ve sütunda aynı boyutta hizalar
StaggeredGridLayoutManager: Elemanlarımızı bizim belirlediğimiz sınırlarda farklı boyutlarda hizalar.
#### Adapter 
Adapter bir veri kaynağıyla, veriye ihtiyacı olan nesneyi birbirine bağlamaya yarayan yapılardır. ListView gibi bir dizi veriyi içinde bulunduran yapılara, bu verileri adapter aracılığıyla veririz. Adapter bir veri kaynağındaki verileri (kısaca, veri modelini) görsel öğelerde kullanmaya uygun hale getirir.
### Lifecycle
Bir aktivite yeni bir duruma girerken sistem bu geri aramaların her birini çağırır.
![activity_lifecycle](https://user-images.githubusercontent.com/63001162/137275085-d9666c18-aa88-4b2f-b2eb-721c0f9d3591.png)
### Firebase Nedir ?
Google tarafından yeni özelliklerin eklenmesiyle gelişen Firebase, bütün bu ihtiyaçları karşılayabilme iddiasında bulunan ücretsiz bir kullanım sunan platform
![image-firebase0002](https://user-images.githubusercontent.com/63001162/137275586-a61cfa47-1d99-49db-9f56-3335d9206f41.png)

