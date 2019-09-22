# 触发器 trigger：
# 需求
# 商品表： goods
# 订单表：ord
# 当下1个订单时，对应的商品要相应减少（买几个商品就少几个库存）
# 分析
# 监视谁：ord
# 监视动作： insert
# 触发时间： after
# 触发事件： update