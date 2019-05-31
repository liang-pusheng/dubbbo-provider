drop table if exists dubbo;
create table dubbo (
	id int(11) not null auto_increment comment '自增ID',
	good_name varchar(64) not null comment '商品名称',
  good_price decimal(8,3) not null comment '商品价格',
  good_stock int(11) not null comment '库存量',
	primary key(id)
);

INSERT INTO dubbo (good_name, good_price, good_stock)
values ('cherry机械键盘', 888.99, 33),
('dell显示器', 3899, 100),
('iPhone X', 5999, 80),
('雷蛇鼠标', 78.99, 77),
('佳能80D', 8799, 39);