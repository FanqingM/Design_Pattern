### 雇工模式：

为游客提供不同服务（如清洁服务、餐饮服务、医疗服务）的雇工可以集合成一个整体Servant类，每一项服务作为一个类（Serviced1、Serviced...）并implements一个接口IServieced,雇工通过接口访问不同类型的服务。

### 关于采用雇工模式而不采用命令模式的原因

对于雇工模式和命令模式的区别，维基百科上是这样写的：

Design patterns [Command](https://en.wikipedia.org/wiki/Command_pattern) and Servant are very similar and implementations of them are often virtually the same. The difference between them is the approach to the problem.

- For the Servant pattern we have some objects to which we want to offer some functionality. We create a class whose instances offer that functionality and which defines an interface that serviced objects must implement. Serviced instances are then passed as parameters to the servant.
- For the Command pattern we have some objects that we want to modify with some functionality. So, we define an interface which commands which desired functionality must be implemented. Instances of those commands are then passed to original objects as parameters of their methods.

简单来说就是雇工模式是给对象提供一些功能，而命令模式是用一些功能来改变对象。在这个场景中游客的不同需求被满足，更符合前一种场景。而只需要一个雇工类来执行不同的操作，简化了不同的工作人员提供不同服务的这一环节，降低了系统的复杂度。

### 脏标记模式：

游乐园里设有自助咖啡机，咖啡机中咖啡豆的容量有限，每次制作咖啡需要消耗一定量的咖啡豆。当咖啡豆用完时，脏标记empty置为true。管理员维护咖啡机时，需要查看脏标记是否为真，若为假则只需要维护并上报维护的基本费用；若为真则需要添加咖啡豆并在基本费用基础上加上咖啡豆的费用作为维护费用。
