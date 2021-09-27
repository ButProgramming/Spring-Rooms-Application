# Spring-Rooms-Application
Данное приложение создано в результате выполнения тестового задания для компании ITS Partner

## Important to start the application
1) Для работы приложения Вам нужен интернет
2) Проверьте, что порт :3306 перед установкой MySql Workbench и порт :8080 перед запуском приложения через консоль на Вашем компьютере не заняты

## How to install and run
1) для работы приложения нам необходимо установить MySql Workbench (доступно для Windows, Linux, Mac). В случае в Windows установщик на дату написания данного readme находился [тут](https://dev.mysql.com/downloads/windows/installer/)

Выбираем тип установки - Developer default.
Все дальнейшие шаги оставляем по умолчанию. Когда нам будет предложено ввести пароль для root-пользователя - используем pass (не перепутать :) ) .
Когда нам будет предложено ввести пароль для тестирования соединения - вводим pass (опять же, не перепутать :) ).

2) Для запуска приложения Вам необходим Java development kit 17 версии. Загрузить его на момент написания данного руководства можно было [тут](https://www.oracle.com/java/technologies/downloads/)
https://www.oracle.com/java/technologies/downloads/
Для windows необходимо настроить переменные среды окружения. Более подробно например [здесь](https://www.oracle.com/java/technologies/downloads/https://java.com/ru/download/help/path_ru.html)

3) Разархивируем проект в отдельную папку, заходим в нее с помощью консоли, например в моем случае путь к папке выглядит так:
```bash
C:\Users\Admin\Desktop\MyWebProjects\Spring-Rooms-Application
```
Следовательно команда должна выглятель так
```bash
cd C:\Users\Admin\Desktop\MyWebProjects\Spring-Rooms-Application
```

4) В консоль вводим (чтобы открыть консоль в windows нужно нажать win+r и ввести cmd, нажать enter) 
```bash
java -jar target\MyWebApp-0.0.1-SNAPSHOT.jar
```

5) Доступ к приложению доступен по ссылке  [http://localhost:8080/](http://localhost:8080/) после сообщения в консоли 
```bash
...Started MyWebAppApplication in xx.xxx seconds
```

## Potential errors
1) Незапущен сервер MySql	
2) Ошибочно установлен пароль для root пользователя во время установки
3) Не прописаны или неправильно заданы переменные окружения для java
4) Вы зашли в неправильную папку (пункт 3 в "Этапы установки необходимого окружения и запуск приложения")

## Others
1) В среде Mac OS, Linux установка MySql WorkBench, Java development kit может отличаться
2) Первые 2 пункта можно ( и нужно :) ) пропустить, если данное программное обеспечение у Вас уже установленно
3) Можно ввести сразу полный путь в 4-ом пункте ("Этапы установки необходимого окружения и запуск приложения") не заходя предварительно в папку, 
если вы знаете точный путь к MyWebApp-0.0.1-SNAPSHOT.jar. То есть
```bash
java -jar C:\Users\Admin\Desktop\MyWebProjects\MyWebAppMainProject\target\MyWebApp-0.0.1-SNAPSHOT.jar
```

## PS
Приятного Вам пользования данным приложением!