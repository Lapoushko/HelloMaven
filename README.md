<h1 align="center">Гит для профессионалов

### Здесь выполнение первого задания: https://github.com/Sosmunk/git-naumen/branches
Результат работы был проверен ещё на паре преподавателем.

## Ответ на доп. задание:
**Доп. вопрос: какие операции нужно совершить, если не использовать Pull Request (полный
набор команд от начала и до конца)?**
<br/>git checkout main
<br/>git pull origin main
<br/>git merge task1-dovgiy
<br/>git push origin main

### Выполнение второго задания:
  1 - создали файлы ![2023-10-11_19-28-58](https://github.com/Lapoushko/HelloMaven/assets/45125347/64922e44-3ed2-4ec1-a840-ce00ca2fb43f)
  2 - сделал rebase ![2023-10-11_19-29-35](https://github.com/Lapoushko/HelloMaven/assets/45125347/6e86a779-a17e-4da6-8e6f-2216adc56b20)
  3 - получились такие ветки ![2023-10-11_19-30-46](https://github.com/Lapoushko/HelloMaven/assets/45125347/7b9aa0f6-f5a6-422b-83cf-58a430ad8ef7)
  4 - не смог запушить ![2023-10-11_19-31-19](https://github.com/Lapoushko/HelloMaven/assets/45125347/a7b03e6c-51bd-40a4-80d5-112d953b3000)
  5 - Смог выполнить задание с помощью push force(вместо него можно было использовать rebase) ![2023-10-11_19-31-39](https://github.com/Lapoushko/HelloMaven/assets/45125347/a7326944-2814-49df-a579-52e285636e59)
  6 - так выглядит конечный результат ![2023-10-11_20-20-08](https://github.com/Lapoushko/HelloMaven/assets/45125347/9c3698fd-c3c5-4260-8c72-eedf710570f4)
  Репозиторий на гитхабе: https://github.com/Sosmunk/git-naumen-2
## Ответы на вопросы:
**Объяснить почему не удалось запушить ветку**
<br/>Нельзя сделать push после rebase, потому что rebase создаёт новые коммиты и команда push не может отправить коммиты на удалённый репозиторий.


### Выполнение третьего задания:
  1 - создал коммиты ![2023-10-11_19-41-11](https://github.com/Lapoushko/HelloMaven/assets/45125347/94ade565-3d72-41f9-85c1-f9bc035fed83)
  2 - с помощью операции squash их объединил ![2023-10-11_19-42-22](https://github.com/Lapoushko/HelloMaven/assets/45125347/a2d8ff78-cd03-4e49-842c-79825228f429)
  Доп. задание:
  3 - пользуюсь Rebase Interactive ![2023-10-11_19-43-42](https://github.com/Lapoushko/HelloMaven/assets/45125347/8bcba4c5-6f91-43e5-ae7d-7a31208a7027)
  4 - Получил такой же результат ![2023-10-11_19-44-15](https://github.com/Lapoushko/HelloMaven/assets/45125347/b08db79e-5214-48ac-b180-a3cea869fad8)
