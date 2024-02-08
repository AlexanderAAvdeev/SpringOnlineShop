# SpringOnlineShop

программа представляет онлайн магазин для продажи товаров  широкого ассортимента различными продавцами.

## Технологии

- **Java 17**
- **HTML 5**
- **CSS 3**
- **Spring**
- **PostgreSQL** 

   Целью настоящей работы является разработка приложения на языке Java- аналога популярных интернет магазинов и торговых площадок. 
   При разработке программы использовался фреймворк Spring.

   В программе реализован алгоритм авторизации пользователей. По результатам авторизации пользователь получает доступ к одной из следующих категорий, 
   с разными функциональными возможностями:
**1) Неавторизованный пользователь** – доступен просмотр списка товаров  а также карточка описание товара.
**2) Авторизованный пользователь** – добавлена возможность делать покупки (администрировать корзину товаров), просматривать заказы.
**3) Администратор** – администрирует работу магазина (добавляет, редактирует, удаляет товары, магазины и т.д.)

   

## Модули (зависимости) фреймворка Spring:

 - **spring-boot-web** – включает все необходимое для создания web-приложений, в том числе сервер приложений Tomcat, Spring MVC, Jackson  для работы с json и т.д.
- **spring-boot-devtools** – инструменты для упрощения и ускорения разработки (автоматическая перезагрузка приложения и т.д.)
- **spring-boot-thymeleaf** – шаблонизатор Thymeleaf для создания веб-приложений, позволяет создавать динамические веб-страницы, используя HTML-шаблоны.
- **spring-security-test** - набор инструментов для тестирования безопасности веб-приложений на Spring (авторизация, аутентификация и т.д.)
- **spring-boot-validation** – позволяет использовать валидацию (проверку) данных на соответствие определенным правилам.
- **postgresql** – модуль для взаимодействия с базой данных Postgres SQL.

  

## ER –модель

 В рамках данного приложения в БД PostgresSQL сформировано 6 таблиц:
1) category – для хранения категорий товаров
2) image – для хранения данных о фотографиях товаров
3) orders – для хранения заказов
4) person – для хранения данных о пользователях
5) product – для хранения данных о товарах
6) product_cart – для хранения данных корзины покупок

   

## Элементы программы (экраны)

  
- Страница авторизации
- Личный кабинет администратора
- Личный кабинет пользователя
- Главная страница магазина, доступна для неавторизованного пользователя
- Карточка товара (полное описание товара)
- Корзина пользователя






