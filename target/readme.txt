Важная информация для запуска
1) Для работы приложения Вам нужен интернет
2) Проверьте, что порт :3306 перед установкой MySql Workbench и порт :8080 перед запуском приложения через консоль на Вашем компьютере не заняты
------------------------------------------------------------------------------------------------------------------------
Этапы установки необходимого окружения и запуск приложения

1) для работы приложения нам необходимо установить MySql Workbench (доступно для Windows, Linux, Mac). В случае в Windows установщик на дату написания данного readme находился тут:
https://dev.mysql.com/downloads/windows/installer/
Выбираем тип установки - Developer default.
Все дальнейшие шаги оставляем по умолчанию. Когда нам будет предложено ввести пароль для root-пользователя - используем pass (не перепутать :) ) .
Когда нам будет предложено ввести пароль для тестирования соединения - вводим pass (опять же, не перепутать :) ).

2) Для запуска приложения Вам необходим Java development kit 17 версии. Загрузить его на момент написания данного руководства можно было тут:
https://www.oracle.com/java/technologies/downloads/
Для windows необходимо настроить переменные среды окружения. https://java.com/ru/download/help/path_ru.html

3) Разархивируем проект в отдельную папку, заходим в нее с помощью консоли, например в моем случае путь к папке выглядит так:
C:\Users\Admin\Desktop\MyWebProjects\MyWebAppApplication
Следовательно команда должна выглятель так:
cd C:\Users\Admin\Desktop\MyWebProjects\MyWebAppApplication

4) В консоль вводим (чтобы открыть консоль в windows нужно нажать win+r и ввести cmd, нажать enter) 
java -jar target\MyWebApp-0.0.1-SNAPSHOT.jar

5) Доступ к приложению доступен по ссылке http://localhost:8080/ после сообщения в консоли Started MyWebAppApplication in xx.xxx seconds

------------------------------------------------------------------------------------------------------------------------
Возможные ошибки:
1) Незапущен сервер MySql	
2) Ошибочно установлен пароль для root пользователя во время установки
3) Не прописаны или неправильно заданы переменные окружения для java
4) Вы зашли в неправильную папку (пункт 3 в "Этапы установки необходимого окружения и запуск приложения")
------------------------------------------------------------------------------------------------------------------------
Примечания:
1) В среде Mac OS, Linux установка MySql WorkBench, Java development kit может отличаться
2) Первые 2 пункта можно ( и нужно :) ) пропустить, если данное программное обеспечение у Вас уже установленно
3) Можно ввести сразу полный путь в 4-ом пункте ("Этапы установки необходимого окружения и запуск приложения") не заходя предварительно в папку, 
если вы знаете точный путь к MyWebApp-0.0.1-SNAPSHOT.jar. То есть
java -jar C:\Users\Admin\Desktop\MyWebProjects\MyWebAppMainProject\target\MyWebApp-0.0.1-SNAPSHOT.jar
------------------------------------------------------------------------------------------------------------------------
Приятного Вам пользования данным приложением!