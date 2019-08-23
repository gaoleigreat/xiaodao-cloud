## 平台简介

### 文档 http://doc.rycloud.zmrit.com

### 源码
- [Github](https://github.com/zhangmrit/xiaodao-cloud)
- [Gitee](https://gitee.com/zhangmrit/xiaodao-cloud)

#### 分支说明

- **master** spring原生方式，使用eureka做注册中心和spring config做配置中心
- **nacos** 集成spring-cloud-alibaba 使用nacos做注册中心和配置中心

本项目FORK自  [小刀/xiaodao](https://gitee.com/y_project/xiaodao)

蓝本是[zhangmrit/xiaodao](https://gitee.com/zhangmrit/xiaodao)

依次绑定host：

127.0.0.1 eureka7001.com

127.0.0.1 gateway.com

如果要使用eureka集群，请依次绑定eureka7002.com,eureka7003.com后修改各项目中的注释部分

```
xiaodao-cloud
|
├──xiaodao-common --通用包
|  |
|  ├──xiaodao-common-core --核心工具包
|  |
|  ├──xiaodao-common-redis --redis工具包
|  |
|  ├──xiaodao-common-log --日志工具包
|  |
|  ├──xiaodao-common-auth --权限工具包
|
├──xiaodao-config --cloud统一配置中心
|
├──xiaodao-eureka --注册中心
|
├──xiaodao-gateway --网关
|
├──xiaodao-service-api --服务api模块
|  |
|  ├──xiaodao-system-api --系统业务api
|
├──xiaodao-service --微服务
|  |
|  ├──xiaodao-system --系统业务
|  |
|  ├──xiaodao-auth --授权中心
|
├──xiaodao-tool --工具
|  |
|  ├──xiaodao-monitor --监控中心
|  |
|  ├──xiaodao-generator --代码生成工具
|
├──xiaodao-ant --前端 使用ant design框架

```



启动顺序：
- eureka
- config
- gateway
- system
- auth

菜单sql有增加字段，以上传到sql文件
该分支是ant分支，前端使用ant-design-vue 项目地址 [xiaodao-ant](https://gitee.com/zhangmrit/xiaodao-ant)

monitor使用springadmin完成,目前只是最简单的用法,[详戳](http://doc.rycloud.zmrit.com/#/extra?id=%e7%9b%91%e6%8e%a7)

## xiaodao Cloud交流群

QQ群：  [![加入QQ群](https://img.shields.io/badge/755109875-blue.svg)](https://jq.qq.com/?_wv=1027&k=5JGXHPD)  点击按钮入群。

欢迎pr或者加入，给个star是最好的鞭策

##  请作者喝杯咖啡或者建设演示服务器

###### 微信 or 支付宝
<img src="https://gitee.com/zhangmrit/img/raw/master/contribute/wechat.png"/>
<img src="https://gitee.com/zhangmrit/img/raw/master/contribute/alipay.png"/>

