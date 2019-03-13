## 使用说明
  
  在老版本的kafka中，需要配置各种参数来实现手动提交offset，非常繁琐。而在最新版本的kafka中，通过注解，极大的简化了消息处理的过程。
  配置application.yml后，就可以直接在方法上添加@KafkaListener注解  ，便可以直接监听并提交offset。
  在本示例项目中，只有两个service： 生产者和消费者。  
  生产者循环生成消息，消费者批量接收消息。在这个过程当中，需要注意的是，我们批量发送消息的size 
  不要太大，否则会存在buffer中，除非调用flush方法，强制刷新缓存。
  另外，由于本项目添加了lombok, 所以，在没有安装该插件的机器上，会报错。安装该插件即可。  
  相关测试用例在test包下面。
  
  使用非常简单，如果有问题的朋友，可以[email联系我](liuyunpeng788@163.com)