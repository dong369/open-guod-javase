## 1. 技术目标
> * 目标01：面向对象的设计思想
> * 目标02：明白对象的多态关系
> * 目标03：熟悉使用常用的设计模式

## 2. 环境配置
#### 2.1 开发配置
> * JDK
> * Eclipse
> * Maven

## 3. 技术介绍
#### 3.1 XX介绍
> 本篇文章引导你通过

##### 3.2 关键字

> 面向对象、多态、设计模式

##### 3.3 技术栈
> * Java SE


## 4. 技术实践
### 4.1 设计模式热身OO

##### 4.1.1 代码场景

> **老张开车去东北**

##### 4.1.2 实现步骤

> 抽取名词
>
> 老张：Driver
>
> 车：Car
>
> 东北：Address

4.1.2 属性

> 不可脱离具体的应用环境，面向对象的一条普通原就是属性一般是private的，所以不能直接通过对象.来使用，而是通过方法去调用，因为这样可以在方法中做一些判断，例如权限，这样更安全，才能把数据封装起来。

4.1.3 方法

> 封装谁站在谁那边考虑；比如封装Driver（老张）

4.1.4 类之间的关系

> 组合、聚合、关联、依赖、继承、实现、多态

4.1.5 隐藏（封装）

> 降低耦合度（但是耦合度不可能为0，耦合到合适即可 ）；添加新的功能，不影响现有的结构。

4.1.6 继承

> 降低耦合度

4.1.7 多态

> 可扩展性，面向对象的核心中的核心

4.1.8 注意

1. 设计没有绝对的对与错
2. over design也是一种罪过，不要老是想着用继承，多态。记住简单问题简单解决。
3. 现在对于问题想得太多的话，就等于没想一样。不用在写代码前老是考虑用什么设计模式好，用不用继承呢，该不该使用多态。因为那些人为规定的设计模式也是从实际的代码中总结出来的，所以当你代码写多了，就自然而然知道该用哪种设计模式了。

4.1.9 接口与抽象类的区别

> **事物作为抽象类，事物的特性行为作为接口**
>
> 确实确实脑子里有这个东西（交通工具），但是没有具体的这个东西，这种一般设计成抽象类。
>
> 如果只是考虑一类事物或几类事物的共同特征（会飞的、会跑的），这种一般设计成接口。

4.1.10 总结

> 先学脉络，再考虑细节！
>
> **ＯＯ思想慢慢来**
>
> **封装继承和多态**
>
> **设计层层无止境**
>
> **适可而止乐开怀**

### 4.2 行为型模式（11种）
> 责任链模式、策略模式、模板方法模式、观察者模式、迭代子模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式

#### 4.2.1 责任链设计模式

##### 4.2.1.1 代码场景

> 过滤一段话中的特殊字符：Java是一门语言，

##### 4.2.1.2 实践步骤



### 4.3 创建型模式（5种）

> 单例模式、工厂方法模式、抽象工厂模式、建造者模式、原型模式

#### 4.3.1 单（多）例设计模式

##### 4.3.1.1 代码场景

> **老张开车去东北，但是只给老张一辆车**

##### 4.3.1.2 实践步骤

1. 只能拥有一辆车，那就不能通过客户端去new了，那样就可以出现任意多个车

   车类：

   ```java
   public class Car {
   	public void go() {
   		System.out.println("车的go方法");
   	}
   }
   ```

   客户端：

   ```java
   public class MainTest {
   	public static void main(String[] args) {
   		Car c = new Car();
   		c.go();
   	}
   }
   ```

   ​

2. 进行单例的设计

   车类：

   ```java
   public class Car {

   	private static Car car = new Car();

   	private Car() {
   	}

   	public static Car getInstance() {
   		return car;
   	}

   	public void go() {
   		System.out.println("车的go方法");
   	}
       
   }
   ```

   客户端：

   ```java
   public class MainTest {
   	public static void main(String[] args) {
   		Car c = Car.getInstance();
   		c.go();
   	}
   }
   ```

   ​

3. 进行多例的设计

   车类：

   ```java
   public class Car {

   	private static List<Car> cars = new ArrayList<>();

   	private Car() {
   	}

   	public static List<Car> getInstance() {
   		cars.add(new Car());
   		return cars;
   	}

   	public void go() {
   		System.out.println("车的go方法");
   	}
       
   }
   ```

   客户类：

   ```java
   public class MainTest {
   	public static void main(String[] args) {
   		Car c = Car.getInstance().get(0);
   		c.go();
   	}
   }
   ```

   ​

#### 4.3.2 工厂系列设计模式

> 方法控制了对象产生的逻辑，都可以称之为工厂方法。

##### 4.3.2.1 代码场景

> **老张开车去东北，但是只给老张一辆车**
>
> **任意定制交通工具的类型（开车、飞机、火车）和生产过程**
>
> **拥有系列的产品（车、武器、食品补给）**

##### 4.3.2.2 实践步骤

###### 4.3.2.2.1 静态工厂方法

车类：

```java
public class Car {

	private static Car car = new Car();

	private Car() {
	}

	public static Car getInstance() {
		return car;
	}

	public void go() {
		System.out.println("车的go方法");
	}
    
}
```

客户端：

```java
public class MainTest {
	public static void main(String[] args) {
		Car c = Car.getInstance();
		c.go();
	}
}
```

​

###### 4.3.2.2.2 普通工厂

> 任意定制交通工具的类型（开车、飞机、火车）和生产过程

1. 任意交通工具

   定义一个接口：作为任意交通工具的实现接口

   ```java
   public interface Moveable {
   	public void run();
   }
   ```

   Car交通工具的实现

   ```java
   public class Car implements Moveable {
   	@Override
   	public void run() {
   		System.out.println("车的go方法");
   	}
   }
   ```

   ​

2. 生产过程

   定义一个抽象类

   ```java
   public abstract class VehicleFactory {
   	abstract Moveable create();
   }
   ```

   Car工厂的继承

   ```java
   public class CarFactory extends VehicleFactory{
   	public Moveable create() {
   		return new Car();
   	}
   }
   ```

   ​

###### 4.3.2.2.3 抽象工厂

> 拥有**系列**的产品（车、武器、食品补给）







> 总结：普通工厂只能扩展产品，而不能产生新的系列，容易产生工厂泛滥；
>
> ​            抽象工厂可以产生新的产品系列，但是不能扩展产品。



###### 4.3.2.2.4 基于bean的工厂



### 4.4 创建型模式（5种）

> 适配器模式，装饰器模式，代理模式，外观模式，桥接模式，组合模式，享元模式

#### 4.4.1代理模式

##### 4.4.1.1 代码场景 

> **记录坦克的移动方法的时间**



##### 4.4.1.2 实践步骤 

###### 4.4.1.2.1 静态代理

实现方式一：通过继承的方式实现

```java

```



实现方式二：通过聚合的方式实现

```java

```

###### 4.4.1.2.2 动态代理

> 动态编译对象：JDK1.6、Complier API、CGLib、ASM

1. 获取当前文件的路径

   ```java
   public class MainTest {
   	public static void main(String[] args) throws Exception {
   		String src = "test";
   		String dir = System.getProperty("user.dir") + "/src/main/java/cn/Test.java";
   		File f = new File(dir);
   		FileWriter w = new FileWriter(f);
   		w.write(src);
   		w.flush();
   		w.close();
   	}
   }
   ```
   ​

2. 编译（compile）

   ```java
   JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
   StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
   Iterable<? extends JavaFileObject> javaFileObjects = manager.getJavaFileObjects(dir);
   CompilationTask task = compiler.getTask(null, manager, null, null, null, javaFileObjects);
   task.call();
   manager.close();
   ```

   ​

3. load到内存中（Classload、URLClassload）

   ```java
   URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir")+"/src") };
   URLClassLoader classLoader = new URLClassLoader(urls);
   Class<?> loadClass = ul.loadClass("");
   Constructor<?> constructor = loadClass.getConstructor(Move.class);
   Move m = (Move) constructor.newInstance(new Tank());
   ```

   ​

4. 实现动态代理

   ```java

   ```

   ​

5. 灵活指定

   > **handler处理器**

6. ​


#### 4.4.2 桥接模式

> 两个维度的排列组合使用桥接模式！使用组合代替继承方法！

#### 4.4.3 适配器模式



## 5. 技术总结
##### 5.1


## 6. 代码下载
本章以及后续章节的源码地址我都会分享出来，请大家自行下载以及git clone。
SpringBoot相关系列文章请访问：目录：SpringBoot学习目录

代替if/else