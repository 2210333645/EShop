# EShop
huawei-cloud

ls/ls2 path 			列出当前目录下的全部子目录，ls2包含更多信息
create path data		创建持久Znode，并存放数据。
create -e path data		创建临时Znode，并存数据data
create -s -e path date	在Znode下创建临时顺序节点。
get path 				获取Znode存储的数据
set path data 			给Znode赋值
delete path 			删除Znode

stat path watch 		注册监听Znode，如果Znode不存在，通知删除。
get	 path watch			注册监听Znode保存数据的变化。
ls path watch			注册监听Znode下子节点的变化


zookeeper集群配置
1.进入conf目录，拷贝zoo_sample.cfg zoo.cfg
2.vim zoo.cfg
3.server.A=B:C:D
4.创建myid文件

Zab协议详情（写操作）
1.Zookeeper follower server 收到client的写请求
2.转发给leader处理
3.leader将更新持久化到本地
4.然后将此次更新提议（propose)给follers
5.follower收到请求后，成功将修改持久化到本地，然后发送一个ack给leader
6.leader接收到半数以上的请求后，leader将广播commit消息并在本地提交该消息
7.当收到leader发来commit消息时，follow也会提交该请求。

选举规则（刚开机，leader宕机）
follow参与选举
投票超半数
observer不参与选举

选举指标
serverid：服务器id，值越大权重越大
zxid：全局事务id，值越大权重越大，优先级大于serverid
epoch：逻辑始终，投票周期，优先级大于zxid
选举参数（epoch，serverid，zxid）

正常启动
zkserver1		zkserver2		zkserver3
（1，1，0）		（1，2，0）		（1，3，0）
（1，3，0）		（1，3，0）		（1，3，0）
follower		follower		leader	

leader宕机
zkserver1		zkserver2		zkserver3
（1，1，253）	（1，2，254）	
（1，3，254）	（1，3，254）		
follower		leader		





