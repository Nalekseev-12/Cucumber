# language: ru

Функционал: Проверка корректности работы поисковой строки

  Предыстория:
    * задаем стандартное время ожидания 20 секунд

  Сценарий:
    * переходим на страницу "https://www.tsum.ru/"
    * закрываем поп-ап выбора города
    * нажимаем на кнопку Поиск
    * вводим в поле поиска DOLCE
    * проверяем корректность отображения брэнда