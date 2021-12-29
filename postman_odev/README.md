# CicekSepeti-Postman-Odevi
ÇiçekSepeti Ekibinin Verdiği Ödev

Çiçeksepeti'nde comment işleminde kullanılan API  için;

* https://www.getpostman.com/collections/b668e69a73698144c1ca  POSTMAN collection'ında bulunan API için cityName parametresine göre dönen response'da,

* cityName değerlerinin kontrolü için entegrasyon testi yazılması,

Params

| Key | Value	| |
|---------------|------------------|--------------------|
| cityName|Ankara    |	=> Ankara ili için yapılan yorumlar listesi|
| cityName|İstanbul |=> İstanbul ili için yapılan yorumlar listesi|
| cityName|Van	     |=> status is 404|
| cityName|Null	   |=> status is 400|
