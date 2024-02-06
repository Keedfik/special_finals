use `humans_friends_db`;
-- таблица с котами
create table cat (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица с хомяками
create table hamster (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица с собаками
create table dog (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица с лошадями
create table horse (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица с верблюдами
create table camel (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица с ослами
create table donkey (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица домашних животных
create table pet (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица вьючных животных
create table pack_animals (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth DATE
);
-- таблица животных
create table humans_friends(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    commands VARCHAR(45),
    day_of_birth Date
);
-- ввод значений во все таблицы и проверка
insert into
    cat (Name, commands, day_of_birth)
values
    ('Рыжик', 'Есть', '2023-11-01'),
    ('Олег', 'Спать', '2016-02-16'),
    ('Киса', 'Есть', '2023-12-13'),
    ('Маруся', 'Спать', '2020-03-07');

select
    *
from
    cat;

insert into
    dog (Name, commands, day_of_birth)
values
    ('Песа', 'Сидеть', '2023-11-01'),
    ('Бим', 'Лежать', '2016-02-16'),
    ('Сергей', 'Сидеть', '2023-12-13'),
    ('Сиреневое', 'Лежать', '2020-03-07');

select
    *
from
    dog;

insert into
    hamster (Name, commands, day_of_birth)
values
    ('Мася', 'Есть', '2023-11-01'),
    ('Бася', 'Спать', '2016-02-16'),
    ('Вася', 'Бежать', '2023-12-13'),
    ('Геннадий', 'Бежать', '2020-03-07');

select
    *
from
    hamster;

insert into
    camel (
        camelName,
        camelcommands,
        camelLiftWeight,
        camelday_of_birth
    )
values
    ('Махмуд', 'Поднять', 110, '2023-11-01'),
    ('Мехди', 'Поднять', 120, '2016-02-16'),
    ('Бахруз', 'Поднять', 330, '2023-12-13'),
    ('Джабраил', 'Поднять', 420, '2020-03-07');

select
    *
from
    camel;

insert into
    horse (Name, commands, liftWeight, day_of_birth)
values
    ('Яблочко', 'Галоп', 150, '2023-11-01'),
    ('Солнышко', 'Рысь', 120, '2016-02-16'),
    ('Пинкипай', 'Галоп', 330, '2023-12-13'),
    ('Апплджек', 'Рысь', 420, '2020-03-07');

select
    *
from
    horse;

insert into
    donkey (Name, commands, liftWeight, day_of_birth)
values
    ('ОселизШрека', 'Жевать', 35, '2023-11-01'),
    ('Хуан', 'Отдыхать', 70, '2016-02-16'),
    ('Перрито', 'Жевать', 28, '2023-12-13'),
    ('Сигмаер', 'Отдыхать', 34, '2020-03-07');

select
    *
from
    donkey;
-- удаление ослов
delete from
    camel
where
    id > 0;

select
    *
from
    camel;
-- группировка вьючных животных
create table pack_animalsNew (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select
    Name,
    commands,
    day_of_birth
from
    horse
union
select
    Name,
    commands,
    day_of_birth
from
    donkey;

select
    *
from
    pack_animalsNew;
-- объединение домашних животных
INSERT into
    pet (Name, commands, day_of_birth)
select
    Name,
    commands,
    day_of_birth
from
    cat
union
select
    Name,
    commands,
    day_of_birth
from
    dog
union
select
    Name,
    commands,
    day_of_birth
from
    hamster;

select
    *
from
    pet;
-- объединение всех животных
INSERT into
    humanFriend (Name, commands, day_of_birth)
select
    Name,
    commands,
    day_of_birth
from
    pet
union
select
    Name,
    commands,
    day_of_birth
from
    pack_animalsNew;

select
    *
from
    humanFriend;
-- таблица для молодых животных
create table young_animals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select
    Name,
    commands,
    day_of_birth,
    Round(
        (year(current_date()) - year(day_of_birth)) + (month(current_date() - month(day_of_birth))) / 10,
        2
    ) as age
from
    humanFriend
where
    Round(
        (year(current_date()) - year(day_of_birth)) + (month(current_date() - month(day_of_birth))) / 10,
        2
    ) > 1
    and Round(
        (year(current_date()) - year(day_of_birth)) + (month(current_date() - month(day_of_birth))) / 10,
        2
    ) < 3;

select
    *
from
    young_animals;
-- объединение таблиц в одну
create table newhumanFriend (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select
    Name,
    commands,
    day_of_birth,
    'cat' as oldTable
from
    cat
union
select
    Name,
    commands,
    day_of_birth,
    'dog' as oldTable
from
    dog
union
select
    Name,
    commands,
    day_of_birth,
    'hamster' as oldTable
from
    hamster
union
select
    Name,
    commands,
    day_of_birth,
    'horse' as oldTable
from
    horse
union
select
    Name,
    commands,
    day_of_birth,
    'donkey' as oldTable
from
    donkey;

select
    *
from
    newhumanFriend;