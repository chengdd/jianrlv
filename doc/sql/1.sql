CREATE TABLE address(
  address_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  user_id INT COMMENT '用户 id',
  address_code VARCHAR(50) COMMENT '地址编码',
  address_detail VARCHAR(1024) COMMENT '详细地址',
  receiver VARCHAR(255) COMMENT '收货人',
  phone VARCHAR(50) COMMENT '手机号',
  post_code VARCHAR(50) COMMENT '邮编',
  sender VARCHAR(50) COMMENT '发件人',
  type VARCHAR(20) COMMENT '类型',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '地址';

CREATE TABLE dw(
 productId INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
 total INT COMMENT '总量',
 sold INT COMMENT '销量',
 create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
 update_time DATETIME DEFAULT current_timestamp ON UPDATE  current_timestamp COMMENT '更新时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '仓库';

CREATE  TABLE `order`(
  order_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  order_no VARCHAR(255) COMMENT '订单号',
  user_id int COMMENT '用户 id',
  order_time DATETIME COMMENT '订单时间',
  pay_time DATETIME COMMENT '支付时间',
  status VARCHAR(50) COMMENT '订单状态',
  product_id int COMMENT '产品 id',
  amount INT COMMENT '数量',
  price INT COMMENT '价格',
  orderMoney INT COMMENT '订单金额',
  payMoney INT COMMENT  '支付金额',
  address VARCHAR(1024) COMMENT '地址',
  pay_id DATETIME COMMENT '支付 id',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  update_time DATETIME DEFAULT current_timestamp ON UPDATE  current_timestamp COMMENT '更新时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '订单';

CREATE TABLE pay(
  pay_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  pay_no VARCHAR(255) COMMENT '支付单号',
  pay_type VARCHAR(50) COMMENT '支付类型',
  third_pay_no VARCHAR(512) COMMENT '第三方支付号',
  pay_money int COMMENT '支付金额',
  pay_time DATETIME COMMENT '支付时间',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '支付';

CREATE TABLE product(
  product_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  name VARCHAR(255) COMMENT '产品代号',
  name_cn VARCHAR(512) COMMENT '产品名称',
  description MEDIUMTEXT COMMENT '描述',
  price INT COMMENT '价格',
  up_time DATETIME COMMENT '上架时间',
  down_time DATETIME COMMENT '下架时间',
  unit VARCHAR(50) COMMENT '单位',
  status VARCHAR(50) COMMENT '状态',
  addresses MEDIUMTEXT COMMENT '产地',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '支付';

CREATE TABLE user(
  user_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  phone VARCHAR(50) COMMENT '手机号',
  username VARCHAR(255) COMMENT '用户名',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDb DEFAULT CHARSET = utf8 COMMENT '支付';

