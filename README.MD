# 结构

- 创建型模式 (Niyredra)
  1. 工厂模式
    1. [简单工厂模式](./demo/niyredra/factory/simple/SimpleFactoryApplication.java)
    2. 工厂方法模式
    3. 抽象工厂模式
  2. 单例模式
  3. 原型模式
  4. 建造者模式
- 结构型模式 (Calarasas)
  1. 适配器模式
  2. 桥接模式
  3. 组合模式
  4. 装饰模式
  5. 代理模式
  6. 外观模式
  7. 亨元模式
- 行为型模式 (phiplouwxz)
  1. 职责链模式
  2. 命令模式
  3. 解释器模式
  4. 迭代器模式
  5. 中介者模式
  6. 备忘录模式
  7. 观察者模式
  8. 状态模式
    9. 策略模式
    10. 模版方法模式
    11. 访问者模式

# 使用

如何运行：

每一个目录下都会有一个Application类，直接编译执行即可。

# 测试

测试部分其实设计不是很好，原预期准备写类似Junit那种直接调用的，但是我印象里那个直接执行还是靠IDE的插件，所以丢到后期了；

测试类有一个专门的方法，TestApplication，执行则将所有的demo结果都运行出来awa

抽象出父级貌似就是只能干这事...(理论上用注解也可以把Class标注进去，就不用写extends了...)

## 后续

protobuf是个好东西，在最终的example中我会用到它的

内容参考：https://blog.csdn.net/LoveLion/article/details/17517213

