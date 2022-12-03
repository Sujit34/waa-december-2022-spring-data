insert into address (id, city, street, zip)
values(1, 'Fairfield', '1000 N 4th St', 52557,1),
      (2, 'Fairfield', '1020 N 4th St', 52557,2);

insert into category (id, name)
values(1, 'Laptop'),
      (2, 'Phone');

insert into product (id, name, price, rating, category_id)
values (1, 'Macbook', 1200, 4.5, 1),
       (2,'Iphone 12', 900, 4.8, 2);

insert into users (id, email, first_name, last_name, password)
values (1, 'sujit.chanda@miu.com', 'Sujit', 'Chanda', 'pass'),
       (2, 'kumar.chanda@miu.com', 'Kumar', 'Chanda', 'word');

insert into review (id, review_comment, product_id, user_id)
values (1, 'Average Product', 1, 1),
       (2, 'Good Product', 2, 2);