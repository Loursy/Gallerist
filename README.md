# 🚗 Gallerist - Güvenli Araç Galerisi REST API

Gallerist, araç galerileri için geliştirilmiş kapsamlı, ölçeklenebilir ve güvenli bir backend yönetim sistemidir. Temel e-ticaret ve stok yönetimi dinamiklerini barındıran bu sistem, JWT entegrasyonu ile uç noktalarını (endpoints) güvence altına alırken, dış sistem entegrasyonlarıyla (TCMB) gerçek dünya finansal verilerini işler.

## ✨ Öne Çıkan Özellikler

* **Stateless Kimlik Doğrulama (JWT):** Kullanıcı girişleri ve yetkilendirme işlemleri JSON Web Token (JWT) ve Spring Security kullanılarak tamamen güvenli ve durumsuz (stateless) bir mimaride kurgulanmıştır.
* **TCMB Kur Entegrasyonu:** Türkiye Cumhuriyet Merkez Bankası (TCMB) API'si üzerinden canlı olarak güncel döviz kurlarını çekebilme yeteneği. Finansal hesaplamalar anlık kur üzerinden dönüştürülebilir.
* **Kapsamlı CRUD Operasyonları:** Araçların, kategorilerin ve galeri envanterinin sisteme eklenmesi, güncellenmesi, silinmesi ve listelenmesi.
* **RESTful Mimari & Exception Handling:** Tamamen REST prensiplerine uygun mimari ve global hata yönetimi (Global Exception Handling) ile standartlaştırılmış API yanıtları.

## 🚀 Teknolojiler ve Araçlar

* **Dil & Çatı:** Java 17, Spring Boot 3.x
* **Güvenlik:** Spring Security, JWT (JSON Web Token)
* **Veri Erişimi:** Spring Data JPA, Hibernate
* **Entegrasyon:** REST Template / WebClient (TCMB API iletişimi)
* **Bağımlılık Yönetimi:** Maven
