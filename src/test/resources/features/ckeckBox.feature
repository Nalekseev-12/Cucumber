# language: ru

Функционал: Проверка корректности работы чек-бокса фильтрации по брэнду

  Предыстория:
    * задаем стандартное время ожидания 20 секунд

  Сценарий:
    * переходим на страницу "https://www.tsum.ru/"
    * закрываем поп-ап выбора города
    * нажимаем на вкладку Новинки
    * нажимаем на кнопку брэнд
    * нажимаем на чек-бокс  Alexander McQueen
    * ожидаем исчезновения элемента загрузки страницы
    * проверяем что на странице только товары Alexander McQueen