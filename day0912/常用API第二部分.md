#### 常用API第二部分

**Object类的toString方法**

- toString方法默认打印的是对象的地址值，除非重写了这个方法；有的类java中已经重写了toString方法，还有的类则没有，需要自己重写

**Object类中的equals方法**

- equals方法默认比较的是对象的地址值，除非重写了这个方法；有的类java中已经重写了equals方法，还有的类则没有，需要自己重写

- 问题：隐含着一个多态问题

   多态的弊端：无法使用子类特有的内容（属性和方法）

   解决：可以使用向下转型（强转）把obj类型转换为Person

   ```java
   @Override
   public boolean equals(Object obj) {
       // 增加一个判断，传递的参数如果是this本身，直接返回true，提高程序效率
       if(obj == this) {
           return true;
       }
       // 增加一个判断，传递的参数obj如果是null，直接返回false，提高程序效率
       if(obj == null) {
           return false;
       }
       // 增加一个判断，防止类型转换异常ClassCastException
       if(obj instanceof Person) {
           // 使用向下转型，把obj转换为Person类型
           Person p = (Person)obj;
           // 比较两个对象的属性，一个对象是this(p1)，一个对象是p(obj->p2)
           boolean b = this.name.equals(p.name) && this.age == p.age;
           return b;
       }
       //  不是Person类型直接放回false
       return false;
   }
   ```

**Objects类中的equals方法**

- 在JDK7添加了一个Objects工具类，它提供了一些方法来操作对象，它由一些静态的实用方法组成，这些方法是null-save（空指针安全的）或null-tolerant（容忍空指针的），用于计算对象的hascode、返回对象的字符串表示形式、比较两个对象
- Objects类的equals方法：对两个对象进行比较，防止空指针异常

------

**Date类概述**

- java.util.Date类表示日期和时间的类

- 类Date表示特定的瞬间，精确到毫秒，毫秒：千分之一秒，1000毫秒 = 1秒

- 毫秒值的作用：可以对时间和日期进行计算

   2099-01-03到2088-01-01中间一共多少天，可以日期转换为毫秒进行计算，计算完毕，再把毫秒转换为日期

- 把日期转换为毫秒：

   当前日期： 2088 - 01 - 01

   时间原点（0毫秒）：1970年1月1日 00：00：00（英国格林威治时间）

   就是计算当前日期到时间原点之间一共经历了多少毫秒

   注意：

   ​		中国属于东八区，会把时间增加8个小时，1970年1月1日 08：00：00

- 把毫秒转换为日期：

   1天 = 24 * 60 *60 = 86400秒 = 86400 * 1000 = 86400000毫秒

**Date类的构造方法和成员方法**

- 两个常用构造方法

   - Date()：获取当前系统的日期和时间
   - Date(long date)：传递毫秒值，把毫秒值转换为Date日期

- 一个常用的成员方法

   - long getTime()：把日期转换为毫秒值（相当于System.currentTimeMillis()方法）

      返回自1970年1月1日00：00：00 GMT以来此Date对象标识的毫秒数

**DateFormat类和SimpleDateFormat类介绍**

- Java.text.DateFormat：是日期/时间格式化子类的抽象类

   作用：

   ​		格式化（也就是日期 -> 文本）、解析（文本->日期）

- 使用format方法和parse方法完成格式化和解析

------

**Calendar类概述**

- Java.util.Calendar是日历类，在Date后出现，替换掉了许多Date的方法

------

**System类概述**

- Java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中常用的方法由：

**StringBuilder类概述**

- 字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）

- 底层也是一个数组，但是没有被final修饰，可以改变长度 

- 常用的两个方法：append方法和toString()方法

   StringBuilder和String可以相互转换

   String->StringBuilder：可以使用StringBuilder的构造方法

   ​			StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容

   StringBuilder->String：可以使用StringBuilder的toString方法

   ​			public String toString()：将当前StringBuilder对象转换为String对象

------

**包装类概念**

- 使用一个类，把基本数据类型包装起来，在类中定义一些方法，这个类叫做包装类

**装箱和拆箱**

- 装箱：从基本类型转换为对应的包装类对象
- 拆箱：从包装类对象转换为对应的基本类型
- JDk1.5之后出现的新特性：支持自动装箱和自动拆箱
- 自动装箱：直接把int类型的整数赋值包装类
- 自动拆箱：包装类自动转换为基本数据类型

**基本类型和字符串类型之间的相互转换**
